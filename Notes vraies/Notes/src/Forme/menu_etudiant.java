
package Forme;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Forme.Ajout_etudiant;



/**
 *
 * @author razaf
 */
public class menu_etudiant extends javax.swing.JPanel {

    
    public menu_etudiant() {
        initComponents();
        liste_table();
    }
    public void theQuery(String query){
        Connection con=null;
        Statement st=null;
         try{
            // Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost/etablissement","root","");
            st=con.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(this,"suppression effectuée","",JOptionPane.INFORMATION_MESSAGE);
            
            
             //JOptionPane.showMessageDialog(null,"Query excuted");
        }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_etudiant = new javax.swing.JTable();
        btn_ajouter = new javax.swing.JButton();
        btn_supprimer = new javax.swing.JButton();
        btn_modifier = new javax.swing.JButton();
        btn_rechercher = new javax.swing.JButton();
        Panel_rechercher = new javax.swing.JPanel();
        icone_rechercher = new javax.swing.JLabel();
        btn_jour = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(32, 429));

        jPanel1.setBackground(new java.awt.Color(246, 241, 241));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel1.setText("LISTE DES ETUDIANTS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        table_etudiant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Inscription", "Nom", "Adresse", "Sexe", "Année"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_etudiant);

        btn_ajouter.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        btn_ajouter.setText("Ajouter");
        btn_ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ajouterActionPerformed(evt);
            }
        });

        btn_supprimer.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        btn_supprimer.setText("Supprimer");
        btn_supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_supprimerActionPerformed(evt);
            }
        });

        btn_modifier.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        btn_modifier.setText("Modifier");

        btn_rechercher.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        btn_rechercher.setText("Rechercher");
        btn_rechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rechercherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_rechercherLayout = new javax.swing.GroupLayout(Panel_rechercher);
        Panel_rechercher.setLayout(Panel_rechercherLayout);
        Panel_rechercherLayout.setHorizontalGroup(
            Panel_rechercherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_rechercherLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icone_rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Panel_rechercherLayout.setVerticalGroup(
            Panel_rechercherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_rechercherLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(icone_rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        btn_jour.setText("Mis à jour");
        btn_jour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jourActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Panel_rechercher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_jour, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_rechercher)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_jour)
                            .addComponent(btn_supprimer))
                        .addGap(18, 18, 18)
                        .addComponent(Panel_rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_modifier)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public final void liste_table(){
        String[][] tableau_etudiant;
        String[] table_titre={"N° Inscription", "Nom", "Adresse","Date_naissance", "Sexe", "Année"};
        int nbLigne,nbColonne;
        nbLigne=nbColonne=0;
        
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection connexion=DriverManager.getConnection("jdbc:mysql://localhost/etablissement","root","");
           Statement instruction=connexion.createStatement();
	   ResultSet resultat=instruction.executeQuery("SELECT * FROM etudiant");
           
           while(resultat.next())
               nbLigne++;
               nbColonne=6;
           while(resultat.previous());
           
           tableau_etudiant=new String[nbLigne][nbColonne];
           int i,j;
           i=0;
           while(resultat.next()){
                    j=0;
                    while(j<nbColonne){
                    tableau_etudiant[i][j]=resultat.getString(j+1);
                    j++;}
                    i++;
           }
          table_etudiant.setModel(new javax.swing.table.DefaultTableModel(tableau_etudiant,table_titre));
          jScrollPane1.setViewportView(table_etudiant);
        }catch(Exception e){}
    }
    
    private void btn_ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ajouterActionPerformed
        Ajout_etudiant ajouter=new Ajout_etudiant();
        ajouter.setVisible(true);
    }//GEN-LAST:event_btn_ajouterActionPerformed

    private void btn_rechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rechercherActionPerformed
        rechercher recherche=new rechercher();
        recherche.setVisible(true);
       
        
        
    }//GEN-LAST:event_btn_rechercherActionPerformed

    private void btn_jourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jourActionPerformed
       try{ 
           theQuery("SELECT * FROM etudiant");
       }catch(Exception ex){}
    }//GEN-LAST:event_btn_jourActionPerformed

    private void btn_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supprimerActionPerformed
       try{ 
           theQuery("DELETE FROM etudiant WHERE Num_inscription="+table_etudiant.getSelectedRows());
       }catch(Exception ex){}
    }//GEN-LAST:event_btn_supprimerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_rechercher;
    private javax.swing.JButton btn_ajouter;
    private javax.swing.JButton btn_jour;
    private javax.swing.JButton btn_modifier;
    private javax.swing.JButton btn_rechercher;
    private javax.swing.JButton btn_supprimer;
    private javax.swing.JLabel icone_rechercher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_etudiant;
    // End of variables declaration//GEN-END:variables
}
