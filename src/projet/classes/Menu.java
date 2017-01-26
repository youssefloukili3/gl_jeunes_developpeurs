package projet.classes;

/**
 *@authors: AMINE EL KHOUMISSI, YOUSSEF LOUKILI, YASSIR HADDAD
 * @exam's numbers: 734, 394, 586
 *@version: 1.0
 */

public class Menu {

  // Fen�tre principale avec ses onglets:
	
  public static void principale() {
    System.out.println("______________________________________________________________________________________________");
    
	System.out.println("                     _________Menu Principal_________                                         ");
	
	System.out.println("(1)Accueil(2)Vols Programmes(3)Reservation de vols(4)Annulation de reservations(5)Developpeurs");
	System.out.println("                               (6) Quitter                                                    ");
	System.out.println("                ******* Veuillez saisir votre choix *******                                   ");
	
	System.out.println("______________________________________________________________________________________________");
  } 
  
  // Fen�tre "Accueil":
  
  public static void accueil () {
	 System.out.println("______________________________________________________________________________________________");
	 
	 System.out.println("                               \" Accueil \"                                                 ");
	 
	 System.out.println("                      (11) afficher la page d'accueil                                        ");
	 System.out.println("                               (16) Quitter                                                  ");
	 System.out.println("                 ******* Veuillez saisir votre choix *******                                 ");
	 
	 System.out.println("______________________________________________________________________________________________");
  }
  
  // Fen�tre "Vols Programm�s":
  
  public static void volsProgrammes () {
	
	  System.out.println("______________________________________________________________________________________________");
		 
	  System.out.println("                          \" Vols Programmes \"                                          ");
		 
	  System.out.println("                 (21) afficher les vols de chaque compagnie                              ");
	  System.out.println("                               (26) Quitter                                              ");
	  System.out.println("                  ******* Veuillez saisir votre choix *******                            ");
		 
	  System.out.println("______________________________________________________________________________________________");
  } 
  
  // Fen�tre "R�servation de vols":
  
  public static void reservationVols () {
		 
	  System.out.println("______________________________________________________________________________________________");
		 
	  System.out.println("                         \" Reservation de Vols \"                                       ");
		 
	  System.out.println("      (31) confirmer des reservation de vols afficher leurs informations                 ");
	  System.out.println("                               (36) Quitter                                              ");
	  System.out.println("                 ******* Veuillez saisir votre choix *******                             ");
		 
	  System.out.println("______________________________________________________________________________________________");
  }
  
  // Fen�tre " Annulation de r�servations":
  
  public static void annulationReservation  () {
		 
	  System.out.println("______________________________________________________________________________________________");
		 
	  System.out.println("                    \" Annulation de reservation d'un vol \"                             ");
		 
	  System.out.println("                      (41) annuler la reservation d'un vol                               ");
	  System.out.println("                               (46) Quitter                                              ");
	  System.out.println("                  ******* Veuillez saisir votre choix *******                            ");
		 
	  System.out.println("______________________________________________________________________________________________");
  } 
  
  // Fen�tre " D�veloppeurs":
  
  public static void developpeurs  () {
		
	  System.out.println("______________________________________________________________________________________________");
		 
	  System.out.println("                                \" Developpeurs \"                                       ");
		 
	  System.out.println("                    (51) afficher les developpeurs de l'application                      ");
	  System.out.println("                               (56) Quitter                                              ");
	  System.out.println("                     ******* Veuillez saisir votre choix *******                         ");
		 
	  System.out.println("______________________________________________________________________________________________");
  } 


}
