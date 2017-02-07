package projet.classes;
import java.util.*;

/**
 *@authors: AMINE EL KHOUMISSI, YOUSSEF LOUKILI, YASSIR HADDAD
 * @exams numbers: 734, 394, 586
 *@version: 1.0
 */



public class Aeroport {
   
   // Attributs de la classe Aeroport:
	
   private String nomAeroport;
   private ArrayList<Ville> villes = new ArrayList<Ville>();
   
   // Constructeur avec un parametes:
   
   public Aeroport ( String nomAeroport) {
	   
	   this.nomAeroport = nomAeroport;
   }
   
   // Constructeur avec deux parametes:
   
   public Aeroport ( String nomAeroport, ArrayList<Ville> villes) {
	   
	   this.nomAeroport = nomAeroport;
	   this.villes = villes;
   }

   // Accesseurs et modificateurs de la classe Aeroport:
   
    public String getNomAeroport() {
	    return nomAeroport;
   }

    public void setNomAeroport(String nomAeroport) {
	    this.nomAeroport = nomAeroport;
   }

    public ArrayList<Ville> getVilles() {
	    return villes;
   }

    public void setVilles(ArrayList<Ville> villes) {
	this.villes = villes;
   }
}
   
   
   
   
   
   