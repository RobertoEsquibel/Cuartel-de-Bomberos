package inicio;

import conexiondata.BomberoData;
import entidades.Bombero;
import java.time.LocalDate;
import java.time.ZoneId;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JRadioButton;

public class BomberoVista extends javax.swing.JInternalFrame {

    SimpleDateFormat calend = new SimpleDateFormat("yyyy-MM-dd");

    public BomberoVista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtid_bombero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtdni = new javax.swing.JTextField();
        jtnombre_ape = new javax.swing.JTextField();
        jtcelular = new javax.swing.JTextField();
        jtcodigo = new javax.swing.JTextField();
        jagregar = new javax.swing.JButton();
        jmodificar = new javax.swing.JButton();
        jeliminar = new javax.swing.JButton();
        fNacimiento = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setText("BOMBERO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 137, -1));

        jLabel2.setText("Id Bombero");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 58, 79, -1));
        getContentPane().add(jtid_bombero, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 55, 150, -1));

        jLabel3.setText("DNI");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 96, 99, -1));

        jLabel4.setText("Nombre y Apellido");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 122, 95, -1));

        jLabel5.setText("Fecha de Nacimiento");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel6.setText("Celular");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 49, -1));

        jLabel7.setText("Codigo de Brigada");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));
        getContentPane().add(jtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 93, 150, -1));
        getContentPane().add(jtnombre_ape, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 119, 150, -1));

        jtcelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtcelularActionPerformed(evt);
            }
        });
        getContentPane().add(jtcelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 140, -1));

        jtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtcodigoActionPerformed(evt);
            }
        });
        getContentPane().add(jtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 140, -1));

        jagregar.setText("AGREGAR");
        jagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jagregarActionPerformed(evt);
            }
        });
        getContentPane().add(jagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 282, -1, -1));

        jmodificar.setText("MODIFICAR");
        jmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(jmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 282, -1, -1));

        jeliminar.setText("ELIMINAR");
        jeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jeliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 282, -1, -1));
        getContentPane().add(fNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeliminarActionPerformed
        BomberoData b = new BomberoData();
        b.eliminarBombero(Integer.parseInt(jtid_bombero.getText()));
    }//GEN-LAST:event_jeliminarActionPerformed

    private void jagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jagregarActionPerformed
        int dni = Integer.parseInt(jtdni.getText());

        int celular = Integer.parseInt(jtcelular.getText());
        int codBrigada = Integer.parseInt(jtcodigo.getText());
        String fecha = calend.format(fNacimiento.getDate());

        System.out.println(fecha);
        Bombero b = new Bombero(dni, jtnombre_ape.getText(), fecha, celular, codBrigada);
        BomberoData bd = new BomberoData();
        bd.guadarBombero(b);
    }//GEN-LAST:event_jagregarActionPerformed

    private void jmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmodificarActionPerformed
        int dni = Integer.parseInt(jtdni.getText());
        int id_bombero = Integer.parseInt(jtid_bombero.getText());
        int celular = Integer.parseInt(jtcelular.getText());
        int codBrigada = Integer.parseInt(jtcodigo.getText());
        String fecha = calend.format(fNacimiento.getDate());
        Bombero b = new Bombero(id_bombero, dni, jtnombre_ape.getText(), fecha, celular, codBrigada);
        BomberoData bd = new BomberoData();
        bd.modificarBombero(b);
    }//GEN-LAST:event_jmodificarActionPerformed

    private void jtcelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtcelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtcelularActionPerformed

    private void jtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtcodigoActionPerformed
//(int dni, String nombre_ape, LocalDate fecha_nac, int celular, int codBrigada)

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser fNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jagregar;
    private javax.swing.JButton jeliminar;
    private javax.swing.JButton jmodificar;
    private javax.swing.JTextField jtcelular;
    private javax.swing.JTextField jtcodigo;
    private javax.swing.JTextField jtdni;
    private javax.swing.JTextField jtid_bombero;
    private javax.swing.JTextField jtnombre_ape;
    // End of variables declaration//GEN-END:variables
}
