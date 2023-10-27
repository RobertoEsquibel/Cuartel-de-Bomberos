package conexiondata;

import entidades.Brigada;
import inicio.BrigadaVistas;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BrigadaData {

    private Connection con = null;

    public BrigadaData() {
        con = Conexion.getConexion();
        this.con = Conexion.getConexion();

    }

    public BrigadaData(int codBrigada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List listarBrigadasLibres() {
        ArrayList<Brigada> libres = new ArrayList<>();
        String sql = "SELECT * FROM brigada WHERE libre=1";
        con = Conexion.getConexion();
        Brigada brigada;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                brigada = new Brigada();

                brigada.setCodBrigada(rs.getInt("codBrigada"));
                brigada.setespecialidad(rs.getString("especialidad"));
                brigada.setNro_cuartel(rs.getInt("nro_cuartel"));
                brigada.setNombre_br(rs.getString("nombre_br"));
                libres.add(brigada);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al ingresar a la tabla Brigada");

        }
        return libres;
    }

    public List listarBrigadasAsignadas() {
        ArrayList<Brigada> asignadas = new ArrayList<>();
        String sql = "SELECT * FROM brigada WHERE libre=0";
        Brigada brigada;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                brigada = new Brigada();

                brigada.setCodBrigada(rs.getInt("codBrigada"));
                brigada.setespecialidad(rs.getString("especialidad"));
                brigada.setNro_cuartel(rs.getInt("nro_cuartel"));
                brigada.setNombre_br(rs.getString("nombre_br"));
                asignadas.add(brigada);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al ingresar a la tabla Brigada");

        }
        return asignadas;
    }

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

    public void guadarBrigada(Brigada brigada) {
        String sql = "INSERT INTO brigada (codBrigada,nombre_br,especialidad,libre,nro_cuartel) VALUES (?, ?, ?, ?, ?)";
        try {
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 0);

            ps.setString(2, brigada.getNombre_br());
            ps.setString(3, brigada.getespecialidad());
            ps.setBoolean(4, brigada.getLibre());
            ps.setInt(5, brigada.getNro_cuartel());
            ps.executeUpdate();

            ps.close();
            JOptionPane.showMessageDialog(null, "Brigada registrada exitosamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Brigada" + ex.getMessage());
        }
    }

    public void modificarBrigada(Brigada brigada) {

        String sql = "UPDATE brigada SET codBrigada = ? , nombre_br = ?, especialidad= ?,libre=?, nro_cuartel= ? WHERE codBrigada = '" + brigada.getCodBrigada() + "'";
        PreparedStatement ps = null;

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);

            ps.setInt(1, brigada.getCodBrigada());
            ps.setString(2, brigada.getNombre_br());
            ps.setString(3, brigada.getespecialidad());
            ps.setBoolean(4, brigada.getLibre());
            ps.setInt(5, brigada.getNro_cuartel());
            ps.executeUpdate();
            ps.close();

            JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");

        } catch (SQLException ex) {
            System.out.println("Error al actualizar " + ex);
        }

    }

    public void eliminarBrigada(int parseInt) {

        try {
            con = Conexion.getConexion();
            String sql = "DELETE FROM brigada WHERE codBrigada = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, parseInt);
            ps.executeUpdate();
            ps.close();

            JOptionPane.showMessageDialog(null, " Se eliminó el brigada.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Brigada");
        }
    }

    public List BuscarBrigada(int codBrigada) {

        Brigada brigada = null;
        ArrayList<Brigada> cod = new ArrayList();
        String sql = "SELECT id_bombero,dni,nombre_ape,fecha_nac,celular,codBrigada FROM brigada JOIN bomberos ON (brigada.codBrigada = bomberos.codBrigada); ";
        PreparedStatement ps = null;

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codBrigada);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                brigada = new Brigada();

                brigada.setCodBrigada(rs.getInt("codBrigada"));

                cod.add(brigada);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla brigada " + ex.getMessage());

        }
        return cod;

    }

    public List Buscar(int codigo) {

        Brigada brigada = null;
        ArrayList<Brigada> listar = new ArrayList();
        String sql = "SELECT * FROM brigada WHERE codBrigada='" + codigo + "'";
        PreparedStatement ps = null;

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                brigada = new Brigada();

                brigada.setCodBrigada(rs.getInt("codBrigada"));
                brigada.setNombre_br(rs.getString("nombre_br"));
                brigada.setespecialidad(rs.getString("especialidad"));
                brigada.setLibre(rs.getBoolean("libre"));
                brigada.setNro_cuartel(rs.getInt("nro_cuartel"));
                listar.add(brigada);

            }
        } catch (SQLException ex) {
            System.out.println("Error al actualizar " + ex);
        }
        return listar;
    }
}
