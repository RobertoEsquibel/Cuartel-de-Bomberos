package conexiondata;

import entidades.Cuartel;
import java.sql.Connection;
import java.awt.Point;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CuartelData {

    private Connection con = null;

    public CuartelData() {
        con = Conexion.getConexion();
        this.con = Conexion.getConexion();

    }

    public List<Cuartel> cuartelesCercanos() {

        ArrayList<Cuartel> cercanos = new ArrayList<>();

        String sql = "SELECT * FROM cuartel WHERE nombre_cuartel=?";
        return cercanos;

    }

    public void guadarCuartel(Cuartel cuartel) {

        String sql = "INSERT INTO cuartel (codCuartel,nombre_cuartel,direccion,coord_X,coord_Y,telefono,correo) VALUES (?, ?, ?, ?, ?,?,?)";
        try {
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql);
            // ps.setInt(1, 0);
            ps.setInt(1, cuartel.getCodCuartel());
            ps.setString(2, cuartel.getNombre_cuartel());
            ps.setString(3, cuartel.getDireccion());
            ps.setInt(4, cuartel.getCoord_X());
            ps.setInt(5, cuartel.getCoord_Y());
            ps.setInt(6, cuartel.getTelefono());
            ps.setString(7, cuartel.getCorreo());
            ps.executeUpdate();

            ps.close();
            JOptionPane.showMessageDialog(null, "Cuartel registrado exitosamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Cuartel" + ex.getMessage());
        }

    }

    public void modificarCuartel(Cuartel cuartel) {

        String sql = "UPDATE cuartel SET codCuartel = ? , nombre_cuartel = ?, direccion = ?,coord_X=?, coord_Y = ?,telefono = ?, correo = ? WHERE codCuartel= '" + cuartel.getCodCuartel() + "'";
        PreparedStatement ps = null;

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);

            ps.setInt(1, cuartel.getCodCuartel());
            ps.setString(2, cuartel.getNombre_cuartel());
            ps.setString(3, cuartel.getDireccion());
            ps.setInt(4, cuartel.getCoord_X());
            ps.setInt(5, cuartel.getCoord_Y());
            ps.setInt(6, cuartel.getTelefono());
            ps.setString(7, cuartel.getCorreo());
            ps.executeUpdate();
            con.close();

            JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");

        } catch (SQLException ex) {
            System.out.println("Error al actualizar " + ex);
        }

    }

    public void eliminarCuartel(int parseInt) {

        try {
            con = Conexion.getConexion();
            String sql = "DELETE FROM cuartel WHERE codCuartel = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, parseInt);
            ps.executeUpdate();
            ps.close();

            JOptionPane.showMessageDialog(null, " Se eliminó el cuartel.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla cuartel");
        }

    }

    public List BuscarCuartel(int codCuartel) {

        Cuartel cuartel = null;
        ArrayList<Cuartel> cod = new ArrayList();
        String sql = "SELECT * FROM cuartel WHERE codCuartel ='" + codCuartel + "'";
        PreparedStatement ps = null;

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codCuartel);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                cuartel = new Cuartel();

                cuartel.setCodCuartel(rs.getInt("codCuartel"));

                cod.add(cuartel);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla brigada " + ex.getMessage());

        }
        return cod;

    }
}
