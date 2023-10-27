package inicio;

import conexiondata.BrigadaData;
import entidades.Brigada;
import static inicio.login.Escritorio;

public class BrigadaVistas extends javax.swing.JInternalFrame {

    public BrigadaVistas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcodigo = new javax.swing.JTextField();
        jnombre = new javax.swing.JTextField();
        jespecialidad = new javax.swing.JTextField();
        estado = new javax.swing.JCheckBox();
        jnumero = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel1.setText("BRIGADA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 11, -1, -1));

        jLabel2.setText("Codigo de Brigada");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel3.setText("Nombre de Brigada");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel4.setText("Especialidades");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel5.setText("Estado");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel6.setText("Numero de cuartel");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));
        getContentPane().add(jcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 110, -1));
        getContentPane().add(jnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 110, -1));
        getContentPane().add(jespecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 110, -1));
        getContentPane().add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));
        getContentPane().add(jnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 110, -1));

        agregar.setText("AGREGAR");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        modificar.setText("MODIFICAR");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        getContentPane().add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        eliminar.setText("ELIMINAR");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        int codBrigada = Integer.parseInt(jcodigo.getText());
        boolean libre = estado.isSelected();
        int nro_cuartel = Integer.parseInt(jnumero.getText());

        Brigada br = new Brigada(codBrigada, jnombre.getText(), jespecialidad.getText(), libre, nro_cuartel);
        BrigadaData bd = new BrigadaData();
        bd.guadarBrigada(br);
    }//GEN-LAST:event_agregarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        int codBrigada = Integer.parseInt(jcodigo.getText());
        boolean libre = estado.isSelected();
        int nro_cuartel = Integer.parseInt(jnumero.getText());

        Brigada br = new Brigada(codBrigada, jnombre.getText(), jespecialidad.getText(), libre, nro_cuartel);
        BrigadaData bd = new BrigadaData();
        bd.modificarBrigada(br);

    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        BrigadaData bd = new BrigadaData();
        bd.eliminarBrigada(Integer.parseInt(jcodigo.getText()));
    }//GEN-LAST:event_eliminarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        Admin ad = new Admin();
        ad.setVisible(true);
        Escritorio.add(ad);
        Escritorio.moveToFront(ad);
    }//GEN-LAST:event_jBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton eliminar;
    private javax.swing.JCheckBox estado;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jcodigo;
    private javax.swing.JTextField jespecialidad;
    private javax.swing.JTextField jnombre;
    private javax.swing.JTextField jnumero;
    private javax.swing.JButton modificar;
    // End of variables declaration//GEN-END:variables
}
