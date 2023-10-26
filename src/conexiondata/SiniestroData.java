
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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


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
       
    }
    
    
    
    
    
    
    
    
    


