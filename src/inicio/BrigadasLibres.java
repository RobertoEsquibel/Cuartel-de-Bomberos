package inicio;

import conexiondata.BrigadaData;
import conexiondata.Conexion;
import entidades.Brigada;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BrigadasLibres extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();

    private Connection con = null;

    public BrigadasLibres() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setText("Lista de Brigadas libres o asignadas");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Brigadas libres", "Brigadas asignadas" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo de Brigada", "Nombre de Brigada", "Especialidad", "Numero de Cuartel"
            }
        ));
        jScrollPane1.setViewportView(jTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {

            String bgs = " ";

            String brigada = jComboBox1.getSelectedItem().toString();
            if (brigada.equals("Brigadas libres")) {
                bgs = "1";
                BrigadaData bd = new BrigadaData();
                bd.listarBrigadasLibres();
            } else if (brigada.equals("Brigadas asignadas")) {
                bgs = "0";
                BrigadaData bd = new BrigadaData();
                bd.listarBrigadasAsignadas();
            }
            limpiartabla();
            armarCabecera(bgs);

        }

    }//GEN-LAST:event_jComboBox1ItemStateChanged
    public List Buscar(String nombre) {

        Brigada brigada = null;
        ArrayList<Brigada> lista = new ArrayList();
        String sql = "SELECT * FROM brigada WHERE libre=? ";
        PreparedStatement ps = null;

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                brigada = new Brigada();

                brigada.setCodBrigada(rs.getInt("codBrigada"));
                brigada.setespecialidad(rs.getString("especialidad"));
                brigada.setNro_cuartel(rs.getInt("nro_cuartel"));
                brigada.setNombre_br(rs.getString("nombre_br"));
                lista.add(brigada);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla brigada " + ex.getMessage());

        }
        return lista;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    // End of variables declaration//GEN-END:variables
public void armarCabecera(String Nombre) {

        modelo.addColumn("Codigo Brigada");
        modelo.addColumn("Nombre de Brigada");
        modelo.addColumn("especialidad");
        modelo.addColumn("Numero de Cuartel");
        jTabla.setModel(modelo);

        List<Brigada> lista = Buscar(Nombre);
        Object[] objeto = new Object[4];
        for (int i = 0; i < lista.size(); i++) {

            objeto[0] = lista.get(i).getCodBrigada();
            objeto[1] = lista.get(i).getNombre_br();
            objeto[2] = lista.get(i).getespecialidad();
            objeto[3] = lista.get(i).getNro_cuartel();
            modelo.addRow(objeto);

        }

    }

    public void limpiartabla() {

        DefaultTableModel model = (DefaultTableModel) jTabla.getModel();
        model.setRowCount(0);
        model.setColumnCount(0);
    }
}
