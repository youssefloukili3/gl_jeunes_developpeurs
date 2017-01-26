package projet.classes;

/**
 *@authors: AMINE EL KHOUMISSI, YOUSSEF LOUKILI, YASSIR HADDAD
 * @exam's numbers: 734, 394, 586
 *@version: 1.0
 */

public class Ville {
   
   // Attribut de la classe Ville:
	
   private String nomVille;
   
   
   
   // Constructeur avec paramete de la classe Ville:
   
   public Ville ( String nomVille) {
	   
	   this.nomVille = nomVille;
   }


   // Accesseur et modificateur de l'attribut de la classe Ville:

    public  String getNomVille() {
	    return nomVille;
   }

    public void setNomVille(String nomVille) {
	    this.nomVille = nomVille;
   }

}