/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//importo las galerias y las clases que necesito.



package conexiondata;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "bomberos";
    private static final String USUARIO = "root";
    private static String PASSWORD = "";
    private static Connection connection;
    
    private Conexion(){}
    public static Connection getConexion();
    
    
   
        
    
        
}
