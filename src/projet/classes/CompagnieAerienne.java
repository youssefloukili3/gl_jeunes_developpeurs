package projet.classes;

import java.util.*;
/**
 *@authors: AMINE EL KHOUMISSI, YOUSSEF LOUKILI, YASSIR HADDAD
 * @exam's numbers: 734, 394, 586
 *@version: 1.0
 */
 
public class CompagnieAerienne {
   
   // Attributs de la classe CompagnieAerienne:
	
   private String nomCompagnie;
   private String siteWeb;
   private String telephoneCompagnie;
   private ArrayList<Vol> vols = new ArrayList<Vol>();
   
   
   // Constructeur avec parametes de la classe CompagnieAerienne:
   
   public CompagnieAerienne( String nomCompagnie, String siteWeb, String telephoneCompagnie,
		   ArrayList<Vol> vols ) {
	   
	   this.nomCompagnie = nomCompagnie;
	   this.siteWeb = siteWeb;
	   this.telephoneCompagnie = telephoneCompagnie;
	   this.vols = vols;
   }
   
   // afficheCompagnie(): affiche les informations d'une compagnie:
   
   public void afficheCompagnie() {
	   System.out.println("______________________________________________________________________________________________");
	   
	   System.out.println("Nom de la compagnie: " + nomCompagnie);
	   System.out.println("SiteWeb            : " + siteWeb);
	   System.out.println("Telepone           : " + telephoneCompagnie);
	   System.out.println("______________________________________________________________________________________________");
	   
   }

   // Accesseurs et modificateurs des attributs de la classe CompagnieAerienne:
   
    public String getNomCompagnie() {
	    return nomCompagnie;
   }

    public void setNomCompagnie(String nomCompagnie) {
	    this.nomCompagnie = nomCompagnie;
   }

    public String getSiteWeb() {
	    return siteWeb;
   }

    public void setSiteWeb(String siteWeb) {
	    this.siteWeb = siteWeb;
   }

    public String getTelephoneCompagnie() {
	    return telephoneCompagnie;
   }

    public void setTelephoneCompagnie(String telephoneCompagnie) {
	    this.telephoneCompagnie = telephoneCompagnie;
   }

    public ArrayList<Vol> getVols() {
	    return vols;
   }

    public void setVols(ArrayList<Vol> vols) {
	    this.vols = vols;
   }
   	   
 }