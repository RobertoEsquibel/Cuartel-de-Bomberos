package inicio;

import conexiondata.SiniestroData;
import entidades.Siniestro;
import static inicio.login.Escritorio;
import java.time.LocalDate;
import java.time.ZoneId;

public class CargaSiniestro extends javax.swing.JInternalFrame {

    public CargaSiniestro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jDCInicio = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jX = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jY = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jDetalles = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jDCResolucion = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jCPuntuacion = new javax.swing.JComboBox<>();
        agregar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Panel de cargas de Siniestro o Incidente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setText("Tipo de Siniestro");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Incendio de Viviendas o Industrias", "Salvamento en Derrumbes", "Rescate en ambito de montaña", "Rescate de personas atrapadas en accidente de transito", "Socorrer en inundaciones", "Operativos de prevencion", " " }));
        getContentPane().add(jcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 160, -1));

        jLabel3.setText("Inicio de siniestro o incidente");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        getContentPane().add(jDCInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 150, -1));

        jLabel4.setText("Coordenada X de incidente");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 140, -1));
        getContentPane().add(jX, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 70, -1));

        jLabel5.setText("Coordenada Y de incidente");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 140, -1));
        getContentPane().add(jY, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 70, -1));

        jLabel6.setText("Detalles:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDetallesActionPerformed(evt);
            }
        });
        getContentPane().add(jDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 320, -1));

        jLabel7.setText("Fecha de resolucion");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 150, -1));
        getContentPane().add(jDCResolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 270, 190, -1));

        jLabel8.setText("Puntuacion");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 80, -1));

        jCPuntuacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jCPuntuacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCPuntuacionActionPerformed(evt);
            }
        });
        getContentPane().add(jCPuntuacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 70, -1));

        agregar.setText("CARGAR");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 140, 30));

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed

        int X = Integer.parseInt(jX.getText());
        int Y = Integer.parseInt(jY.getText());
        LocalDate finicio;
        LocalDate fresol;
        finicio = jDCInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        fresol = jDCResolucion.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        Siniestro ns = new Siniestro(jcombo.getSelectedItem().toString(), finicio, X, Y, jDetalles.getText(), fresol, jCPuntuacion.getSelectedIndex(), 2);

        SiniestroData nsd = new SiniestroData();
        nsd.CargarSiniestro(ns);


    }//GEN-LAST:event_agregarActionPerformed

    private void jDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDetallesActionPerformed

    }//GEN-LAST:event_jDetallesActionPerformed

    private void jCPuntuacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCPuntuacionActionPerformed

    }//GEN-LAST:event_jCPuntuacionActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        Usuario us = new Usuario();
        us.setVisible(true);
        Escritorio.add(us);
        Escritorio.moveToFront(us);
    }//GEN-LAST:event_jBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCPuntuacion;
    private com.toedter.calendar.JDateChooser jDCInicio;
    private com.toedter.calendar.JDateChooser jDCResolucion;
    private javax.swing.JTextField jDetalles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jX;
    private javax.swing.JTextField jY;
    private javax.swing.JComboBox<String> jcombo;
    // End of variables declaration//GEN-END:variables
}
