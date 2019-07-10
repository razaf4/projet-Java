/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Forme;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

/**
 *
 * @author razaf
 */
public class Connect_login {
        Connection cnx=null;
        ResultSet Rs=null;
        PreparedStatement Ps=null;
    //creation de methode pour la connection au BD
        
        public static Connection ConnectDB() throws SQLException{
              try{
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost/etablissement","root","");
	            return cnx;
	           }
         catch(ClassNotFoundException ex){System.err.println("Erreur Driver");}
            return null;
        
        }
       
       
}
