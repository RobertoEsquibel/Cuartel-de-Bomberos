/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;

/**
 *
 * @author ELIANA
 */
public class Usuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form Usuario
     */
    public Usuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jBListar = new javax.swing.JButton();
        jBCargarSiniestro = new javax.swing.JButton();
        jBIncidenteResuelto = new javax.swing.JButton();
        jBConsultas = new javax.swing.JButton();
        jBDiarios = new javax.swing.JButton();
        jBCuartelesCercanos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jBListar.setText("Listar Brigadas libres o asignadas a un siniestro");
        jBListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListarActionPerformed(evt);
            }
        });

        jBCargarSiniestro.setText("Cargar siniestros");
        jBCargarSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCargarSiniestroActionPerformed(evt);
            }
        });

        jBIncidenteResuelto.setText("Incidentes resueltos");
        jBIncidenteResuelto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIncidenteResueltoActionPerformed(evt);
            }
        });

        jBConsultas.setText("Consultas");
        jBConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultasActionPerformed(evt);
            }
        });

        jBDiarios.setText("Incidentes o siniestros diarios");
        jBDiarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDiariosActionPerformed(evt);
            }
        });

        jBCuartelesCercanos.setText("Cuarteles cercanos a siniestros o incidentes");
        jBCuartelesCercanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCuartelesCercanosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        jLabel1.setText("PANEL DE USUARIO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBIncidenteResuelto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBDiarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCargarSiniestro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBListar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                    .addComponent(jBConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCuartelesCercanos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jBListar)
                .addGap(18, 18, 18)
                .addComponent(jBCuartelesCercanos)
                .addGap(18, 18, 18)
                .addComponent(jBDiarios)
                .addGap(16, 16, 16)
                .addComponent(jBIncidenteResuelto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBCargarSiniestro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBConsultas)
                .addContainerGap(56, Short.MAX_VALUE))
        );

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

    private void jBIncidenteResueltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIncidenteResueltoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBIncidenteResueltoActionPerformed

    private void jBListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListarActionPerformed

        login.Escritorio.removeAll();
        login.Escritorio.repaint();
        BrigadasLibres bl = new BrigadasLibres();
        bl.setVisible(true);
        login.Escritorio.add(bl);
        login.Escritorio.moveToFront(bl);
        // TODO add your handling code here:
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCargarSiniestro;
    private javax.swing.JButton jBConsultas;
    private javax.swing.JButton jBCuartelesCercanos;
    private javax.swing.JButton jBDiarios;
    private javax.swing.JButton jBIncidenteResuelto;
    private javax.swing.JButton jBListar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
