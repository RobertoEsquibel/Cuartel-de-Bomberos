package inicio;

import conexiondata.Conexion;
import entidades.Brigada;
import entidades.Cuartel;
import static inicio.login.Escritorio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CuartelesCercanos extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    private Connection con = null;

    public CuartelesCercanos() {

        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jX = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jY = new javax.swing.JTextField();
        jbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabla = new javax.swing.JTable();
        jListar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel1.setText("Cuarteles cercanos a siniestro o incidente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 354, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Ingrese las coordenadas del siniestro o incidente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        jX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXActionPerformed(evt);
            }
        });
        getContentPane().add(jX, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 68, -1));

        jLabel3.setText("Coordenada X");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel4.setText("Coordenada Y");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, -1));

        jY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jYActionPerformed(evt);
            }
        });
        getContentPane().add(jY, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 68, 30));

        jbuscar.setText("Buscar Cuarteles cercanos");
        jbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 200, 40));

        jtabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre de Cuartel", "Direccion", "Telefono", "Correo", "Distancia"
            }
        ));
        jScrollPane1.setViewportView(jtabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 531, 93));

        jListar.setText("Listar");
        jListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListarActionPerformed(evt);
            }
        });
        getContentPane().add(jListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 80, -1));

        jLabel5.setText("Presione el Boton 'Listar', para ver los Cuarteles");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 270, 20));

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuscarActionPerformed
        int X = Integer.parseInt(jX.getText());
        int Y = Integer.parseInt(jY.getText());

        for (int i = 0; i < jtabla.getRowCount(); i++) {
            int X2 = (int) jtabla.getValueAt(i, 4);
            int Y2 = (int) jtabla.getValueAt(i, 5);

            int distancia = (int) Math.sqrt(Math.pow(X2 - X, 2) + Math.pow(Y2 - Y, 2));
            System.out.println(distancia);
            jtabla.setValueAt(distancia, i, 6);
        }


    }//GEN-LAST:event_jbuscarActionPerformed

    private void jListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListarActionPerformed
        LimpiarTabla();
        armarCabecera(jtabla);
    }//GEN-LAST:event_jListarActionPerformed

    private void jYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jYActionPerformed

    }//GEN-LAST:event_jYActionPerformed

    private void jXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXActionPerformed

    }//GEN-LAST:event_jXActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        Usuario us = new Usuario();
        us.setVisible(true);
        Escritorio.add(us);
        Escritorio.moveToFront(us);
    }//GEN-LAST:event_jBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jListar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jX;
    private javax.swing.JTextField jY;
    private javax.swing.JButton jbuscar;
    private javax.swing.JTable jtabla;
    // End of variables declaration//GEN-END:variables

    public void armarCabecera(JTable tabla) {
        tabla.setModel(modelo);
        modelo.addColumn("Nombre de Cuartel");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("Correo");
        modelo.addColumn("X");
        modelo.addColumn("Y");
        modelo.addColumn("Distancia");

        List<Cuartel> lista = ListarCuarteles();
        Object[] objeto = new Object[6];
        System.out.println(lista.size());
        for (int i = 0; i < lista.size(); i++) {

            objeto[0] = lista.get(i).getNombre_cuartel();
            objeto[1] = lista.get(i).getDireccion();
            objeto[2] = lista.get(i).getTelefono();
            objeto[3] = lista.get(i).getCorreo();
            objeto[4] = lista.get(i).getCoord_X();
            objeto[5] = lista.get(i).getCoord_Y();

            modelo.addRow(objeto);

        }

    }

    public void LimpiarTabla() {

        DefaultTableModel model = (DefaultTableModel) jtabla.getModel();
        model.setColumnCount(0);
        model.setRowCount(0);

    }

    public List ListarCuarteles() {

        Cuartel cuartel = null;
        ArrayList<Cuartel> lista = new ArrayList();
        String sql = "SELECT * FROM cuartel";
        PreparedStatement ps = null;

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                cuartel = new Cuartel();

                cuartel.setNombre_cuartel(rs.getString("nombre_cuartel"));
                cuartel.setDireccion(rs.getString("direccion"));
                cuartel.setTelefono(rs.getInt("telefono"));
                cuartel.setCorreo(rs.getString("correo"));
                cuartel.setCoord_X(rs.getInt("coord_X"));
                cuartel.setCoord_Y(rs.getInt("coord_Y"));

                lista.add(cuartel);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cuartel " + ex.getMessage());

        }
        return lista;
    }

}
