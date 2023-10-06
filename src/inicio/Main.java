package inicio;

import conexiondata.Conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        try {

            Class.forName("org.mariadb.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost/bomberos", "root", "");
            //String sql=  "INSERT INTO `bomberos`(`id_bombero`, `dni`, `nombre_ape`, `fecha_nac`, `celular`, `codBrigada`) VALUES ('','12345678','Tomas Sanchez','2000-4-5','564736','1')";
            //String sql= "INSERT INTO `brigada`(`codBrigada`, `nombre_br`, `especialidad`, `libre`, `nro_cuartel`) VALUES ('1','Omega','Incendio en viviendas e Industrias','1','2')";
            // String sql = "INSERT INTO `cuartel`(`codCuartel`, `nombre_cuartel`, `direccion`, `coord_X`, `coord_Y`, `telefono`, `correo`) VALUES ('','Pocito','Indepencia','4','8','475436','Pocito@bomberos')";
            // String sql= "INSERT INTO `siniestro`(`codigo`, `tipo`, `fecha_siniestro`, `coord_X`, `coord_Y`, `detalles`, `fecha_resol`, `puntuacion`, `codBrigada`) VALUES ('','Incendio en viviendas e Industria','2023-10-22','6','2','Se origino por una falla electrica','2023-10-22 22:15:05.000','8','1')";

            //String sql= "UPDATE `bomberos` SET `id_bombero`='1',`dni`='[value-2]',`nombre_ape`='[value-3]',`fecha_nac`='[value-4]',`celular`='[value-5]',`codBrigada`='1' WHERE 5";
            String sql = "DELETE FROM `cuartel` WHERE codCuartel='4'";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet res = ps.executeQuery();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Debe agregar los Driver al proyecto");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos" + ex);
        }
    }
}
