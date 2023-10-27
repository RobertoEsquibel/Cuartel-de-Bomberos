package inicio;

import conexiondata.SiniestroData;
import static inicio.login.Escritorio;

public class IncidentesDiarios extends javax.swing.JInternalFrame {

    public IncidentesDiarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jBSalir = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel1.setText("Incidentes o Siniestros Diarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        jLabel2.setText("Mostrar los Incidentes o Siniestros");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 170, -1));

        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 120, -1));

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Coordenad X", "Coordenada Y", "Detalles", "Puntuacion", "Codigo de Brigada"
            }
        ));
        jScrollPane1.setViewportView(jTabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 650, 90));

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

        SiniestroData sd = new SiniestroData();
        jTabla.setModel(sd.SiniestrosDiarios());

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
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    // End of variables declaration//GEN-END:variables
}
