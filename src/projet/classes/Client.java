package projet.classes;

import java.util.*;

/**
 *@authors: AMINE EL KHOUMISSI, YOUSSEF LOUKILI, YASSIR HADDAD
 * @exam's numbers: 734, 394, 586
 *@version: 1.0
 */

public class Client {
   
   // Attributs de la classe Client:
	
   protected String nom;
   protected String prenom;
   protected String dateNaissance;
   protected String telephone;
   protected ArrayList<Reservation> reservations = new ArrayList<Reservation>();
  
   // Constructeur sans parametes:
   
   public Client () {}
   
   // Constructeur avec parametes:
   
   public Client ( String nom, String prenom, String dateNaissance, String telephone) {
	   
	   this.nom = nom;
	   this.prenom = prenom;
	   this.dateNaissance = dateNaissance;
	   this.telephone = telephone;
	   
   }
   
   // Affiche(): affiche les informations d'un client:
   
   public void afficheClient() {
	   
	   System.out.println( "Nom                   : " + nom );
	   System.out.println( "Prenom                : " + prenom );
	   System.out.println( "Date de naissance     : " + dateNaissance );
	   System.out.println( "Telephone             : " + telephone );
   }
   
   // Accesseurs et modificateurs des attributs de la classe Client:
   

	public String getNom() {
	    return nom;
   }

    public void setNom(String nom) {
	    this.nom = nom;
   }

    public String getPrenom() {
	    return prenom;
   }

    public void setPrenom(String prenom) {
	    this.prenom = prenom;
   }

    public String getDateNaissance() {
	    return dateNaissance;
   }

    public void setDateNaissance(String dateNaissance) {
	    this.dateNaissance = dateNaissance;
   }

    public String getTelephone() {
	    return telephone;
   }

    public void setTelephone(String telephone) {
	    this.telephone = telephone;
   }

    public ArrayList<Reservation> getReservations() {
	    return reservations;
   }

    public void setReservations(ArrayList<Reservation> reservations) {
	    this.reservations = reservations;
   }
   
   
}
   
   
  