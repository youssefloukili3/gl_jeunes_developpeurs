package projet.classes;

import java.util.*;
/**
 *@authors: AMINE EL KHOUMISSI, YOUSSEF LOUKILI, YASSIR HADDAD
 * @exam's numbers: 734, 394, 586
 *@version: 1.0
 */

public class Reservation {
  
   // Attributs de la classe Reservation:
	
   private int numReservation;
   private String dateReservation;
   private  Passager passager;
   private Vol vol = new Vol();
   private ArrayList<Passager> passagers;
   private CompagnieAerienne comp;
  
   
   // Constructeur avec parametes de la classe Reservation:
   
   public Reservation( int numReservation, String dateReservation, Passager passager, Vol vol,
		   ArrayList<Passager> passagers, CompagnieAerienne comp) {
	   
	   this.numReservation = numReservation;
	   this.dateReservation = dateReservation;
	   this.passager = passager;
	   this.vol = vol;
	   this.passagers = passagers;
	   this.comp = comp;
	   
   }
   
   // confirmer(): permet d'effectuer une reservation:
   
   public  void  confirmer() {
      // TODO: implement
	  
	   if ( vol.ouvrirReservation( vol ) && !vol.refermerReservation( passagers))
		   passagers.add(passager);
	      
   }
   
  // annuler(): permet d'annuler une reservation:
   
   public  void annuler() {
      // TODO: implement
	   passagers.remove(passager);
	   
   }
   
   // afficheReservation(): permet d'afficher les informations d'une reservation:
   public void afficheReservation() {
	   
	   
	   System.out.println("Numero de reservation : " + numReservation);
	   System.out.println("Date de reservation   : " + dateReservation);
	   passager.affichePassager();
	   vol.afficheVol();
	   comp.afficheCompagnie();
	   
   }
   
   // nombrePassagers(): affiche le nombre de reservations effetu�es:
   
   public  int nombrePassagers () {
	   
	   if( passagers == null)
		   return 0;
	   return passagers.size();
   }
    
    // Accesseurs et modificateur des attributs de la classe Reservation:
   
    public int getNumReservation() {
	    return numReservation;
   }

    public void setNumReservation(int numReservation) {
	    this.numReservation = numReservation;
   }

    public String getDateReservation() {
	    return dateReservation;
   }

    public void setDateReservation(String dateReservation) {
	    this.dateReservation = dateReservation;
   }

    public Passager getPassager() {
	    return passager;
   }

    public void setPassager(Passager passager) {
	    this.passager = passager;
   }

    public Vol getVol() {
	    return vol;
   }

    public void setVol(Vol vol) {
	    this.vol = vol;
   }

    public  ArrayList<Passager> getPassagers() {
	    return passagers;
   }

    public  void setPassagers(ArrayList<Passager> passagers) {
	    this.passagers = passagers;
   }

   
}