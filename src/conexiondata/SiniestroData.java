
package conexiondata;
import entidades.Siniestro;
import java.sql.Connection;
import entidades.Brigada;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class SiniestroData {
    


    private Connection con = null;

    public SiniestroData() {
        con = Conexion.getConexion();
    }
    
    public  void CargarSiniestro( Siniestro siniestro){

        String sql = "INSERT INTO siniestro (codigo,tipo,fecha_siniestro,coord_X,coord_Y,detalles,fecha_resol,puntuacion,codBrigada) VALUES (?, ?, ?, ?, ?,?,?,?,?)";
        try {
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql);
            
             ps.setInt(1, siniestro.getCodigo());
            ps.setString(2, siniestro.getTipo());
           ps.setDate(3, Date.valueOf(siniestro.getFecha_siniestro()));
            ps.setInt(4, siniestro.getCoord_X());
            ps.setInt(5, siniestro.getCoord_Y());
            ps.setString(6,siniestro.getDetalles());
             ps.setDate(7, Date.valueOf(siniestro.getFecha_resol()));
            ps.setInt(8, siniestro.getPuntuacion());
            ps.setInt(9,siniestro.getCodBrigada());
            
            ps.executeUpdate();

            ps.close();
            JOptionPane.showMessageDialog(null, "Siniestro registrado exitosamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Siniestro" + ex.getMessage());
        }
    }
      
    
    public DefaultTableModel SiniestrosDiarios() {

        LocalDate n = LocalDate.now();
        n = n.minusDays(2);

        Object[] sin = new Object[4];
        DefaultTableModel modelo;
        modelo = new DefaultTableModel();

        String sql = "SELECT codigo,tipo,detalles,puntuacion FROM siniestro WHERE fecha_siniestro BETWEEN '" + n + "' and '" + LocalDate.now() + "';";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            //DefaultTableModel modelo;
            //modelo = new DefaultTableModel();
            modelo.addColumn("codigo");
            modelo.addColumn("tipo");
            modelo.addColumn("detalles");
            modelo.addColumn("puntuacion");

            while (rs.next()) {

                // Object[] sin = new Object[4];
                sin[0] = rs.getString("codigo");
                sin[1] = rs.getString("tipo");
                sin[2] = rs.getString("detalles");
                sin[3] = rs.getString("puntuacion");
                modelo.addRow(sin);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al ingresar a la tabla Brigada");

        }return modelo;

    } 

    
    }
    
    
    
    
    
    
    
    
    


