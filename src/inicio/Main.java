package inicio;

import conexiondata.BomberoData;
import conexiondata.BrigadaData;
import conexiondata.Conexion;
//import conexiondata.CuartelData;
//import conexiondata.CuartelData.Coordenada;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;



import java.lang.Math;
import javax.swing.*;

public class Main {
  //ListarBrigadasLibres bd= new ListarBrigadaLibres();
    
    
    
         


    public static void main(String[] args) {
      

    
        //int X1 = 1, Y1 = 10; // Coord del primer punto
        //int X2 = 4, Y2 = 15; // Coord del segundo punto

      //  int distancia = (int) Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));

       // System.out.println("La distancia entre los dos puntos es: " + distancia + " metros.");
    
      
        try {

            Class.forName("org.mariadb.jdbc.Driver");

           Connection con = DriverManager.getConnection("jdbc:mariadb://localhost/bomberos", "root", "");
            //String sql=  "INSERT INTO `bomberos`(`id_bombero`, `dni`, `nombre_ape`, `fecha_nac`, `celular`, `codBrigada`) VALUES ('','12345678','Tomas Sanchez','2000-4-5','564736','1')";
            //String sql= "INSERT INTO `brigada`(`codBrigada`, `nombre_br`, `especialidad`, `libre`, `nro_cuartel`) VALUES ('1','Omega','Incendio en viviendas e Industrias','1','2')";
            // String sql = "INSERT INTO `cuartel`(`codCuartel`, `nombre_cuartel`, `direccion`, `coord_X`, `coord_Y`, `telefono`, `correo`) VALUES ('','Pocito','Indepencia','4','8','475436','Pocito@bomberos')";
            // String sql= "INSERT INTO `siniestro`(`codigo`, `tipo`, `fecha_siniestro`, `coord_X`, `coord_Y`, `detalles`, `fecha_resol`, `puntuacion`, `codBrigada`) VALUES ('','Incendio en viviendas e Industria','2023-10-22','6','2','Se origino por una falla electrica','2023-10-22 22:15:05.000','8','1')";

            //String sql= "UPDATE `bomberos` SET `id_bombero`='1',`dni`='[value-2]',`nombre_ape`='[value-3]',`fecha_nac`='[value-4]',`celular`='[value-5]',`codBrigada`='1' WHERE 5";
           // String sql = "DELETE FROM `cuartel` WHERE codCuartel='4'";
           String sql = "SELECT * FROM brigada WHERE libre=1" ;
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet res = ps.executeQuery();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Debe agregar los Driver al proyecto");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos" + ex);
        }
    
  // BomberoData bd=new BomberoData(); 
    // bd.BuscarBombero(0).forEach(b->System.out.println(b));
} 
    //CuartelData CD= new CuartelData();
        
       // Coordenada coord = new Coordenada(5, 10);
      //  System.out.println("X: " + coord.getX() + ", Y: " + coord.getY());

 
    
    
    
    }
     
