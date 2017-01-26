package projet.classes;


/**
 *@authors: AMINE EL KHOUMISSI, YOUSSEF LOUKILI, YASSIR HADDAD
 * @exam's numbers: 734, 394, 586
 *@version: 1.0
 */

public class Escale {
   
   // Attributs de la classe Escale:
	
   private String heureDepart;
   private String heureArrivee;
   private Aeroport aeroportEscale;
   
   // Constucteur avec parametes de la classe Escale:
   
   public Escale ( String heureDepart, String heureArrivee, Aeroport aeroportEscale) {
	   
	   this.heureDepart = heureDepart;
	   this.heureArrivee = heureArrivee;
	   this.aeroportEscale = aeroportEscale;
   }

    
   // Accesseurs et modificateurs des attributs de la classe Escale:
   
    public String getHeureDepart() {
	    return heureDepart;
   }

    public void setHeureDepart(String heureDepart) {
	    this.heureDepart = heureDepart;
   }

    public String getHeureArrivee() {
	    return heureArrivee;
   }

    public void setHeureArrivee(String heureArrivee) {
	    this.heureArrivee = heureArrivee;
   }

    public Aeroport getAeroportEscale() {
	    return aeroportEscale;
   }

    public void setAeroportEscale(Aeroport aeroportEscale) {
	    this.aeroportEscale = aeroportEscale;
   }
   
   
}