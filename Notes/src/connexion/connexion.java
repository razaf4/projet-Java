package connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author razaf
 */
public class connexion {
    
    public static void main(String[] args) {
		 try{
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection connexion=DriverManager.getConnection("jdbc:mysql://localhost/etablissement","root","");
	            Statement instruction=connexion.createStatement();
	            ResultSet resultat=instruction.executeQuery("SELECT * FROM personne");
	            
	            while(resultat.next()){
	                System.out.println("----------------------------");
	                System.out.println("Nom:"+resultat.getString("Nom"));
	                System.out.println("Prenom:"+resultat.getString("Prenom"));
	                System.out.println("Civilité:"+resultat.getString("Civilite"));
	                System.out.println("Age:"+resultat.getString("age"));
	            }
	        }
	        catch(ClassNotFoundException ex){System.err.println("Erreur Driver");}
	        catch(SQLException ex){System.err.println("Erreur Localisation BD");}

	}
    
}
