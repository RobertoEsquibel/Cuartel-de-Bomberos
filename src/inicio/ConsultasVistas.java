package inicio;

import conexiondata.BomberoData;
import conexiondata.BrigadaData;
import conexiondata.Conexion;
import entidades.Bombero;
import entidades.Brigada;
import static inicio.login.Escritorio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ConsultasVistas extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel tabla = new DefaultTableModel();
    private Connection con = null;

    public ConsultasVistas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        buscar2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtabla2 = new javax.swing.JTable();
        jCodBrigada = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jNro_cuartel = new javax.swing.JTextField();
        jBSalir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel1.setText("CONSULTAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Ingrese una Brigada y a continuacion se mostrara los Bomberos de la misma");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 440, 30));

        jTabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Bombero", "DNI", "Nombre y Apellido", "Fecha de Nacimiento", "Celular", "Codigo de Brigada"
            }
        ));
        jScrollPane1.setViewportView(jTabla1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 680, 90));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Ingrese el numero de cuartel y se mostrara las Brigadas del mismo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        buscar2.setText("BUSCAR");
        buscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar2ActionPerformed(evt);
            }
        });
        getContentPane().add(buscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, -1, -1));

        jtabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo de Brigada", "Nombre de Brigada", "Especialidad", "Estado", "Numero de Cuartel"
            }
        ));
        jScrollPane2.setViewportView(jtabla2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 670, 90));

        jCodBrigada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCodBrigadaActionPerformed(evt);
            }
        });
        getContentPane().add(jCodBrigada, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 50, -1));

        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, -1, -1));
        getContentPane().add(jNro_cuartel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 50, -1));

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar2ActionPerformed
        LimpiarTabla2();
        armarCabecera2(jtabla2);
    }//GEN-LAST:event_buscar2ActionPerformed

    private void jCodBrigadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCodBrigadaActionPerformed

        int codBrigada = Integer.parseInt(jCodBrigada.getText());

        BrigadaData bd = new BrigadaData(codBrigada);
        bd.BuscarBrigada(codBrigada);


    }//GEN-LAST:event_jCodBrigadaActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        BomberoData b = new BomberoData();
        b.listarBombero();
        LimpiarTabla();
        armarCabecera(jTabla1);


    }//GEN-LAST:event_buscarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        Usuario us = new Usuario();
        us.setVisible(true);
        Escritorio.add(us);
        Escritorio.moveToFront(us);
    }//GEN-LAST:event_jBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JButton buscar2;
    private javax.swing.JButton jBSalir;
    private javax.swing.JTextField jCodBrigada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jNro_cuartel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabla1;
    private javax.swing.JTable jtabla2;
    // End of variables declaration//GEN-END:variables

    public void armarCabecera(JTable jTabla1) {
        int codigo = Integer.parseInt(jCodBrigada.getText());
        jTabla1.setModel(modelo);
        modelo.addColumn("Id Bombero");
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre y Apellido");
        modelo.addColumn("Fecha de Nacimiento");
        modelo.addColumn("Celular");
        modelo.addColumn("Codigo de Brigada");

        List<Bombero> lista = new BomberoData().BuscarBombero(codigo);
        Object[] objeto = new Object[6];
        System.out.println(lista.size());
        for (int i = 0; i < lista.size(); i++) {

            objeto[0] = lista.get(i).getId_bombero();
            objeto[1] = lista.get(i).getDni();
            objeto[2] = lista.get(i).getNombre_ape();
            objeto[3] = lista.get(i).getFecha_nac();
            objeto[4] = lista.get(i).getCelular();
            objeto[5] = lista.get(i).getCodBrigada();

            modelo.addRow(objeto);

        }

    }

    public void LimpiarTabla() {

        DefaultTableModel model = (DefaultTableModel) jTabla1.getModel();
        model.setColumnCount(0);
        model.setRowCount(0);

    }

    public void armarCabecera2(JTable jtabla2) {
        int codCuartel = Integer.parseInt(jNro_cuartel.getText());
        jtabla2.setModel(tabla);
        tabla.addColumn("Codigo de Brigada");
        tabla.addColumn("Nombre de Brigada");
        tabla.addColumn("Especialidad");
        tabla.addColumn("Libre");
        tabla.addColumn("Numero de Cuartel");

        List<Brigada> lista = new BrigadaData().Buscar(codCuartel);
        Object[] objeto = new Object[5];
        System.out.println(lista.size());
        for (int i = 0; i < lista.size(); i++) {

            objeto[0] = lista.get(i).getCodBrigada();
            objeto[1] = lista.get(i).getNombre_br();
            objeto[2] = lista.get(i).getespecialidad();
            objeto[3] = lista.get(i).getLibre();
            objeto[4] = lista.get(i).getNro_cuartel();

            tabla.addRow(objeto);

        }

    }

    public void LimpiarTabla2() {

        DefaultTableModel model = (DefaultTableModel) jtabla2.getModel();
        model.setColumnCount(0);
        model.setRowCount(0);

    }

}
