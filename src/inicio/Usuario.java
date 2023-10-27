package inicio;

public class Usuario extends javax.swing.JInternalFrame {

    public Usuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jBListar = new javax.swing.JButton();
        jBCargarSiniestro = new javax.swing.JButton();
        jBConsultas = new javax.swing.JButton();
        jBDiarios = new javax.swing.JButton();
        jBCuartelesCercanos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();

        jButton2.setText("jButton2");

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBListar.setText("Listar Brigadas libres o asignadas a un siniestro");
        jBListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListarActionPerformed(evt);
            }
        });
        getContentPane().add(jBListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 241, -1));

        jBCargarSiniestro.setText("Cargar siniestros");
        jBCargarSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCargarSiniestroActionPerformed(evt);
            }
        });
        getContentPane().add(jBCargarSiniestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 241, -1));

        jBConsultas.setText("Consultas");
        jBConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultasActionPerformed(evt);
            }
        });
        getContentPane().add(jBConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 241, -1));

        jBDiarios.setText("Incidentes o siniestros diarios");
        jBDiarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDiariosActionPerformed(evt);
            }
        });
        getContentPane().add(jBDiarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 241, -1));

        jBCuartelesCercanos.setText("Cuarteles cercanos a siniestros o incidentes");
        jBCuartelesCercanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCuartelesCercanosActionPerformed(evt);
            }
        });
        getContentPane().add(jBCuartelesCercanos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        jLabel1.setText("PANEL DE USUARIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 25, 178, -1));

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 320, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCuartelesCercanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCuartelesCercanosActionPerformed
        login.Escritorio.removeAll();
        login.Escritorio.repaint();
        CuartelesCercanos cc = new CuartelesCercanos();
        cc.setVisible(true);
        login.Escritorio.add(cc);
        login.Escritorio.moveToFront(cc);
    }//GEN-LAST:event_jBCuartelesCercanosActionPerformed

    private void jBListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListarActionPerformed

        login.Escritorio.removeAll();
        login.Escritorio.repaint();
        BrigadasLibres bl = new BrigadasLibres();
        bl.setVisible(true);
        login.Escritorio.add(bl);
        login.Escritorio.moveToFront(bl);

    }//GEN-LAST:event_jBListarActionPerformed

    private void jBDiariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDiariosActionPerformed
        login.Escritorio.removeAll();
        login.Escritorio.repaint();
        IncidentesDiarios id = new IncidentesDiarios();
        id.setVisible(true);
        login.Escritorio.add(id);
        login.Escritorio.moveToFront(id);
    }//GEN-LAST:event_jBDiariosActionPerformed

    private void jBCargarSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCargarSiniestroActionPerformed
        login.Escritorio.removeAll();
        login.Escritorio.repaint();
        CargaSiniestro cs = new CargaSiniestro();
        cs.setVisible(true);
        login.Escritorio.add(cs);
        login.Escritorio.moveToFront(cs);
    }//GEN-LAST:event_jBCargarSiniestroActionPerformed

    private void jBConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultasActionPerformed
        login.Escritorio.removeAll();
        login.Escritorio.repaint();
        ConsultasVistas cv = new ConsultasVistas();
        cv.setVisible(true);
        login.Escritorio.add(cv);
        login.Escritorio.moveToFront(cv);
    }//GEN-LAST:event_jBConsultasActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        new login().setVisible(true);
    }//GEN-LAST:event_jBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCargarSiniestro;
    private javax.swing.JButton jBConsultas;
    private javax.swing.JButton jBCuartelesCercanos;
    private javax.swing.JButton jBDiarios;
    private javax.swing.JButton jBListar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
