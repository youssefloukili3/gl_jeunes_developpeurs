package projet.classes;

import java.util.*;
/**
 *@authors: AMINE EL KHOUMISSI, YOUSSEF LOUKILI, YASSIR HADDAD
 * @exam's numbers: 734, 394, 586
 *@version: 1.0
 */

public class Vol {
 
// Attributs de la classe Vol:
	
   private int numVol;
   private Aeroport aeroportDepart;
   private ArrayList<Escale>  escale;;
   private Aeroport aeroportArrivee;
   private String dateDepart;
   private String dateArrivee;
   private double tarif;
   private int nbPlaces;
   private int duree;
   
   // Constructeur sans parametes:
   
   public Vol() {}
   
   // Constructeur avec parametes:
   
   public Vol ( int numVol, Aeroport aeroportDepart, ArrayList<Escale> escale,
		    Aeroport aeroportArrivee, String dateDepart, String dateArrivee,  
		   double tarif, int nbPlaces, int duree) {
	   this.numVol = numVol;
	   this.aeroportDepart = aeroportDepart;
	   this.escale = escale;
	   this.aeroportArrivee = aeroportArrivee;
	   this.dateDepart = dateDepart;
	   this.dateArrivee = dateArrivee;
	   this.tarif = tarif;
	   this.nbPlaces = nbPlaces;
	   this.duree = duree;
	   
   }
   
   
   
   // ouvrirReservation(): autorise d'effectuer des reservations:
   
   public boolean  ouvrirReservation ( Vol v) {
      // TODO: implement
	   if( v != null )
		   return true;
	return false; 
   }
   
   // refermerReservation(): n'autorise pas d'effectuer des reservations:
   
   public boolean refermerReservation( ArrayList<Passager> p) {
      // TODO: implement
	   if( p.size() >= nbPlaces)
		   return true;
	   return false;
	   
   }
   
   // afficheVol(): affiche les informations d'un vol:
   public void afficheVol () {
	   System.out.println("______________________________________________________________________________________________");
	   System.out.println( "Vol numero        : " + numVol);
	   System.out.println( "Ville de depart   : " + aeroportDepart.getVilles().get(0).getNomVille() );
       System.out.println( "Aeroport de depart: " + aeroportDepart.getNomAeroport() );
       int i = 0;
       while ( i < escale.size()) {
    	   
    	   System.out.println( "Escale ["+ (i+1)+"]        :");
    	   System.out.println( "Ville d'escale    : " + escale.get(i).getAeroportEscale().getVilles().get(i).getNomVille() );
    	   System.out.println( "Aeroport d'escale : " + escale.get(i).getAeroportEscale().getNomAeroport() );
    	   System.out.println( "Heure d'arrivee   : " + escale.get(i).getHeureArrivee() );
    	   System.out.println( "Heure de depart   : " + escale.get(i).getHeureDepart() );
    	   i++;
       
       }
       System.out.println( "Ville d'arrivee   : " + aeroportArrivee.getVilles().get(0).getNomVille() );
       System.out.println( "A�roport d'arrivee: " + aeroportArrivee.getNomAeroport() );
       System.out.println( "Date de depart    : " + dateDepart );
       System.out.println( "Date d'arrivee    : " + dateArrivee );
       System.out.println( "Dur�e du vol      : " + duree + " mn");
       System.out.println( "Tarif du vol      : " + tarif + " $");
       System.out.println( "Nombre de places du vol      : " + nbPlaces + " places");
       System.out.println("______________________________________________________________________________________________");
       
   }

    // Accesseurs et modificateurs des attributs de la classe Vol:
   
    public int getNumVol() {
	    return numVol;
   }

    public void setNumVol(int numVol) {
	    this.numVol = numVol;
   }

    public Aeroport getAeroportDepart() {
	    return aeroportDepart;
   }

    public void setAeroportDepart(Aeroport aeroportDepart) {
	    this.aeroportDepart = aeroportDepart;
   }

    public ArrayList<Escale> getEscale() {
	    return escale;
   }

    public void setEscale(ArrayList<Escale> escale) {
	    this.escale = escale;
   }

    public Aeroport getAeroportArrivee() {
	    return aeroportArrivee;
   }

    public void setAeroportArrivee(Aeroport aeroportArrivee) {
	    this.aeroportArrivee = aeroportArrivee;
   }

    public String getDateDepart() {
	    return dateDepart;
   }

    public void setDateDepart(String dateDepart) {
	    this.dateDepart = dateDepart;
   }

    public String getDateArrivee() {
	    return dateArrivee;
   }

    public void setDateArrivee(String dateArrivee) {
	    this.dateArrivee = dateArrivee;
   }

    public double getTarif() {
	    return tarif;
   }

    public void setTarif(double tarif) {
	    this.tarif = tarif;
   }


    public  int getNbPlaces() {
	    return nbPlaces;
   }

    public  void setNbPlaces(int nbPlaces) {
	    this.nbPlaces = nbPlaces;
   }
           
}
   
    
   
   
   
   
   
 