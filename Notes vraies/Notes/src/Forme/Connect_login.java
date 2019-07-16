/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Forme;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Forme.login;
//import java.sql.Statement;

/**
 *
 * @author razaf
 */
public class Connect_login {
        public static void main(String[] args) {
		 try{
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection connexion=DriverManager.getConnection("jdbc:mysql://localhost/etablissement","root","");
	            Statement instruction=connexion.createStatement();
	            ResultSet r = instruction.executeQuery("select * from login");
while (r.next()) {
String LoginRecup = r.getString("user_name");
String log = txt_utilisateur.getText();
char[] pssw = jPasswordField1.getPassword();
String pw = new String(pssw);
String MPRecup = r.getString("Password");
if (LoginRecup.equals(log)& MPRecup.equals(pw) ) {

verif = true;
principale N = new principale();
N.setVisible(true);
this.dispose();


}
}
if (!verif) {
JOptionPane.showMessageDialog(null, "Verifier Login / Mot de passe", "Message d'erreur:", JOptionPane.ERROR_MESSAGE);
jTextField1.setText("");
jPasswordField1.setText("");
}
c.close();
} catch (Exception a) {
System.out.println(a);
}


}
