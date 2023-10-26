package conexiondata;

import entidades.Bombero;
import entidades.Cuartel;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import javax.swing.JOptionPane;

public class BomberoData {

    private Connection con = null;

    public BomberoData() {
        con = Conexion.getConexion();
    }

    public void guadarBombero(Bombero bom) {

        String sql = "INSERT INTO bomberos (id_bombero,dni,nombre_ape,fecha_nac,celular,codBrigada) VALUES (?, ?, ?, ?, ?,?)";
        try {
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 0);
            ps.setInt(2, bom.getDni());
            ps.setString(3, bom.getNombre_ape());
            ps.setString(4, bom.getFecha_nac());
            ps.setInt(5, bom.getCelular());
            ps.setInt(6, bom.getCodBrigada());
            ps.executeUpdate();

            ps.close();
            JOptionPane.showMessageDialog(null, "Bombero registrado exitosamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Bomberos" + ex.getMessage());
        }
    }

    public void modificarBombero(Bombero bombero) {

        String sql = "UPDATE bomberos SET dni = ? , nombre_ape = ?, fecha_nac = ?,celular=?,codBrigada=? WHERE id_Bombero = '" + bombero.getId_bombero() + "'";
        PreparedStatement ps = null;

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);

            ps.setInt(1, bombero.getDni());
            ps.setString(2, bombero.getNombre_ape());
            ps.setString(3, bombero.getFecha_nac());
            ps.setInt(4, bombero.getCelular());
            ps.setInt(5, bombero.getCodBrigada());
            ps.executeUpdate();
            con.close();

            JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");

        } catch (SQLException ex) {
            System.out.println("Error al actualizar " + ex);
        }
    }

    public void eliminarBombero(int id) {

        try {
            con = Conexion.getConexion();
            String sql = "DELETE FROM bomberos WHERE id_bombero = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();

            JOptionPane.showMessageDialog(null, " Se eliminó el bombero.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Bombero");
        }

    }

    public List BuscarBombero(int codigo) {

        Bombero bombero = null;
        ArrayList<Bombero> listar = new ArrayList();
        String sql = "SELECT * FROM bomberos WHERE codBrigada='" + codigo + "'";
        PreparedStatement ps = null;

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                bombero = new Bombero();

                bombero.setId_bombero(rs.getInt("id_bombero"));
                bombero.setDni(rs.getInt("dni"));
                bombero.setNombre_ape(rs.getString("nombre_ape"));
                bombero.setFecha_nac(rs.getString("fecha_nac"));
                bombero.setCelular(rs.getInt("celular"));
                bombero.setCodBrigada(rs.getInt("codBrigada"));
                listar.add(bombero);

            }
        } catch (SQLException ex) {
            System.out.println("Error al actualizar " + ex);
        }
        return listar;
    }
    
    
    public List<Bombero> listarBombero() {

        ArrayList<Bombero> listar = new ArrayList<>();
        String sql = "SELECT * FROM bomberos ";
        Bombero bombero;
        try {

            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                bombero = new Bombero();

                bombero.setId_bombero(rs.getInt("id_bombero"));
                bombero.setDni(rs.getInt("dni"));
                bombero.setNombre_ape(rs.getString("nombre_ape"));
                bombero.setFecha_nac(rs.getString("fecha_nac"));
                bombero.setCelular(rs.getInt("celular"));
                bombero.setCodBrigada(rs.getInt("codBrigada"));
                listar.add(bombero);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al ingresar a la tabla Bombero");

        }
        return listar;

    }
    
    
    
    
}
