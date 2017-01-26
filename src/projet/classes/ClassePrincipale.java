package projet.classes;

import java.util.*;

/**
 *@authors: AMINE EL KHOUMISSI, YOUSSEF LOUKILI, YASSIR HADDAD
 * @exam's numbers: 734, 394, 586
 *@version: 1.0
 */

public class ClassePrincipale {

	public static void main(String[] args) {
		
		// Attribut pour stocker le choix de l'utilisateur:
		
		int choix = 0;
		
		// Instanciation de l'entree standard:
		
		Scanner sc = new Scanner(System.in);
		
		// Crearion d'une compagnie proposant cinq vols:
		
		// Creation du Vol 1:
		
		// Escales du vol 1: la collection des escales est vide (pas d'escale pour le vol 1):
		
	    ArrayList<Escale> e1 = new ArrayList<Escale>();
	    
	    // Ville de depart du vol 1:
	    
	    Ville v11 = new Ville ("Paris");
	    ArrayList<Ville> villes11 = new ArrayList<Ville>();
	    villes11.add(v11);
	    
	    // Aeroport de depart du vol 1:
	    
	    Aeroport a11 = new Aeroport( "Charles De Gaule", villes11);
	    
	    // Ville d'arrivee du vol 1:
	    
	    Ville v12 = new Ville ("Saint-Martin");
	    ArrayList<Ville> villes12 = new ArrayList<Ville>();
	    villes12.add(v12);
	    
	    // Aeroport d'arrivee du vol 1:
	    
	    Aeroport a12 = new Aeroport( "Aeroport de Saint-Martin", villes12);
	    
	    // Instanciation du vol 1:
	    
	    Vol vol1 = new Vol( 01, a11, e1, a12, "20/12/2016-10:30", "20/12/2016-13:20", 617.00, 50, 170 );
	    
	    // Creation du vol 2:
	    
	    // Escales du vol 2: pas d'escales (collection d'escales vide):
	    
	    ArrayList<Escale> e2 = new ArrayList<Escale>();
	    
	    // Ville de depart du vol 2:
	    
	    Ville v21 = new Ville ("Doha");
	    ArrayList<Ville> villes21 = new ArrayList<Ville>();
	    villes21.add(v21);
	    
	    // Aeroport de depart du vol 2:
	    
	    Aeroport a21 = new Aeroport( "Doha International Airport", villes21);
	    
	    // Ville d'arrivee du vol 2:
	    
	    Ville v22 = new Ville ("Tokyo");
	    ArrayList<Ville> villes22 = new ArrayList<Ville>();
	    villes22.add(v22);
	    
	    // A�roport d'arrivee du vol 2:
	    
	    Aeroport a22 = new Aeroport( "Tokyo International Airport", villes22);
	    
	    // Instanciation du vol 2:
	    
	    Vol vol2 = new Vol( 02, a21, e2, a22, "14/12/2016-22:30", "15/12/2016-10:50", 799.00, 120, 740 );
	    
	    // Creation du vol 3:
	    
	    // Escales du Vol 3: une seule escale a "Londres":
	    
	    Ville villeEscal3 = new Ville("Londres");
	    ArrayList<Ville> villesEscal3 = new ArrayList<Ville>();
	    villesEscal3.add(villeEscal3);
	    
	    // Aeroport de l'escale:
	    
	    Aeroport aeroportEscal3 = new Aeroport ("Heathrow Airport", villesEscal3);
	    
	    // Instanciation de l'escale et son ajout a la liste des escales du vol 3:
	    
	    Escale escal3 = new Escale ("24/12/2016-05:20", "24/12/2016-06:20", aeroportEscal3);
	    ArrayList<Escale> e3 = new ArrayList<Escale>();
	    e3.add(escal3);
	    
	    // Ville de depart du vol 3: c'est la premiere ville dans la liste des villes desservies par l'aeroport( Casa dans ce cas):
	    
	    Ville v31 = new Ville ("Casablanca");
	    Ville v311 = new Ville ("Mohammedai");
	    ArrayList<Ville> villes31 = new ArrayList<Ville>();
	    villes31.add(v31);
	    villes31.add(v311);
	    
	    // Aeroport de depart du vol 3:
	    
	    Aeroport a31 = new Aeroport( "Aeroport International de Casablanca", villes31);
	    
	    // Ville d'arrivee du vol 3:
	    
	    Ville v32 = new Ville ("Honolulu");
	    ArrayList<Ville> villes32 = new ArrayList<Ville>();
	    villes32.add(v32);
	    
	    // Aeroport d'arrivee du vol 3:
	    
	    Aeroport a32 = new Aeroport( "Honolulu International Airport", villes32);
	    
	    // Instanciation du vol 3:
	    
	    Vol vol3 = new Vol( 03, a31, e3, a32, "24/12/2016-02:20", "15/12/2016-18:34", 1524.00, 220, 974 );
	    
	    // Creation du vol 4:
	    
	    // Escales du Vol 4: une seule escale a "Dubai":
	    
	    Ville villeEscal4 = new Ville("Dubai");
	    ArrayList<Ville> villesEscal4 = new ArrayList<Ville>();
	    villesEscal4.add(villeEscal4);
	    
	    // Aeroport d'escale:
	    
	    Aeroport aeroportEscal4 = new Aeroport ("Dubai International Airport", villesEscal4);
	    
	    // Instanciation de l'escale et son ajout a la liste des escale du vol 4:
	    
	    Escale escal4 = new Escale ("30/12/2016-12:20", "30/12/2016-13:50", aeroportEscal4);
	    ArrayList<Escale> e4 = new ArrayList<Escale>();
	    e4.add(escal4);
	    
	    // Ville de deprart du vol 4:
	    
	    Ville v41 = new Ville ("Berne");
	    ArrayList<Ville> villes41 = new ArrayList<Ville>();
	    villes41.add(v41);
	    
	    // A�roport de depart du vol 4: 
	    
	    Aeroport a41 = new Aeroport( "Berne International Airport", villes41);
	    
	    // Ville d'arrivee du vol 4:
	    
	    Ville v42 = new Ville ("Sydney");
	    ArrayList<Ville> villes42 = new ArrayList<Ville>();
	    villes42.add(v42);
	    
	    // A�roport d'arrivee du vol 4:
	    
	    Aeroport a42 = new Aeroport( "Sydeny International Airport", villes42);
	    
	    // Instanciation du vol 4:
	    
	    Vol vol4 = new Vol( 04, a41, e4, a42, "30/12/2016-06:50", "15/12/2016-20:05", 1472.00, 180, 795 );
	    
	    // Creation du vol 5:
	    
	    // Escales du Vol 5: pas d'escale (liste d'escales vide):
	    
	    ArrayList<Escale> e5 = new ArrayList<Escale>();
	    
	    // Ville de depart du vol 5:
	    
	    Ville v51 = new Ville ("Otawa");
	    ArrayList<Ville> villes51 = new ArrayList<Ville>();
	    villes51.add(v51);
	    
	    // Aeroport de depart du vol 5:
	    
	    Aeroport a51 = new Aeroport( "Otawa International Airport", villes51);
	    
	    // Ville d'arrivee du vol 5:
	    
	    Ville v52 = new Ville ("Washington");
	    ArrayList<Ville> villes52 = new ArrayList<Ville>();
	    villes52.add(v52);
	    
	    // A�roport d'arrivee du vol 5:
	    
	    Aeroport a52 = new Aeroport( "Washington International Airport", villes52);
	    
	    // Instanciation du vol 5:
	    
	    Vol vol5 = new Vol( 05, a51, e5, a52, "01/01/2017-12:40", "01/01/2017-19:34", 600.00, 120, 414 );
	    
	    // Ajout des cinq vols crees a la liste des vols de la compagnie que l'on veut creer:
	    
	    ArrayList<Vol> vols = new ArrayList<Vol>(5);
	    vols.add(vol1);
	    vols.add(vol2);
	    vols.add(vol3);
	    vols.add(vol4);
	    vols.add(vol5);
	    
	    // Instanciation de la compagnie:
	    
	    CompagnieAerienne comp = new CompagnieAerienne ( "Fly-Morroco", "http://www.fly-Morocco.ma",
	    "06-01-02-03-04", vols);
	    
	   
	    // Affichage de la fenetre principale de l'application tant que l'utilisateur ne la ferme pas:

		do {
			
			Menu.principale();
		
			// Stckage de la valeur saisie par l'utilisateur dans la variable choix:
			
			choix = sc.nextInt();
			
			
		    switch ( choix) {
		    
		    // Premier cas: acces a la fen�tre "Accueil":
		    
		    case 1:
		    	
			    do {
			    	
		    		Menu.accueil();
			    	
					choix = sc.nextInt();
			    	
		    	switch ( choix) {	
		    	
		    	// Premier cas de la fenetre "Accueil": afficher la fenetre d'accueil
		    	
		    	case 11 :
		    	   System.out.println("______________________________________________________________________________________________");
		    	 
		    	   System.out.println("                               \" Accueil \"                       ");
		    	 
		    	   System.out.println("                                 Bienvenue                         ");
		    	
		    	   System.out.println("                              Fly-Morocco 2017                     ");
		    	 
		    	   System.out.println("______________________________________________________________________________________________");
		           break;
		        default :
		        	System.out.println("Retour au menu precedent");
		    	}
			    }while(choix != 16); // Sortir de la fenetre "Accueil" et retour a la fenetre principale
		    	
			    break;
			 
		   // Deuxieme cas: acces a la fenetre "Vols programmes":
			    
		   case 2:
			  
		        do {
		        	
		    		Menu.volsProgrammes();
		        	 
		    		
					choix = sc.nextInt();
		        	 
		    		
		        switch ( choix){
		        
		        // Premier cas de la fenetre "Vols programmes": afficher les vols programmes par la compagnie:
		        
		        case 21:
		        	
		             for( int i = 0; i < comp.getVols().size(); i++)
		    	           comp.getVols().get(i).afficheVol();
		             break;
		        default:
		        	System.out.println("Retour au menu precedent");
		        }
		        }while(choix != 26); // Sortir de la fenetre "Vols programmes" et retour a la fenetre principale
			   
		        break;
		   
		   // Troisieme cas : acces a la fenetre "Reservation de vols":
		        
	       case 3:
	    	   
		        do {
		        	
		    		Menu.reservationVols();
		        	 
		    		
					choix = sc.nextInt();
		    		
		    	      
		            switch ( choix) {
		            
		            // Confirmer des reservations:
		            
		            case 31:
		            	
		              // Craation de trois reservations:
		            	
		              // Creation de cinq passagers:
		            	
		    	      Passager p1 = new Passager("EL KHOUMISSI", "AMINE", "01/01/1995","06-01-01-01-01", 1111);
		    	      Passager p2 = new Passager("LOUKILI", "YOUSSEF", "02/01/1995","06-02-02-02-02", 1112);
		    	      Passager p3 = new Passager("HADDAD", "YASSIR", "03/01/1995","06-03-03-03-03", 1113);
		    	      
		    	      // Craation d'une liste de passagers:
		    	      
		    	      ArrayList<Passager> passagers = new ArrayList<Passager>();
		    	      
		    	      // Instanciation des cinq reservations:
		    	
		    	      Reservation r1 = new Reservation (01, "14/12/2016-10:05", p1, vols.get(0), passagers, comp);
		    	      Reservation r2 = new Reservation (02, "12/12/2016-14:15", p3, vols.get(1), passagers, comp);
		    	      Reservation r3 = new Reservation (03, "20/12/2016-09:05", p2, vols.get(2), passagers, comp);
		    	      Reservation r4 = new Reservation (04, "29/12/2016-11:05", p3, vols.get(3), passagers, comp);
		    	      Reservation r5 = new Reservation (05, "14/12/2016-10:05", p1, vols.get(4), passagers, comp);
		    	      
		    	      // Confirmer reservation r1:
		    	      
		    	      r1.confirmer();
		    	      
		    	      // Afficher reservaton r1:
		    	      
		    	      r1.afficheReservation();
		    	      
		    	      // Confirmer r�servation r2:
		    	      
		    	      r2.confirmer();
		    	      
		    	      // Afficher reservaton r2:
		    	      
		    	      r2.afficheReservation();
		    	      
		    	      // Confirmer reservation r3:
		    	      
		    	      r3.confirmer();
		    	      
		    	      // Afficher reservaton r3:
		    	      
		    	      r3.afficheReservation();
		    	      
		    	      // Confirmer reservation r4:
		    	      
		    	      r4.confirmer();
		    	      
		    	      // Afficher reservaton r4:
		    	      
		    	      r4.afficheReservation();
		    	      
		    	      // Confirmer reservation r5:
		    	      
		    	      r5.confirmer();
		    	      
		    	      // Afficher reservaton r5:
		    	      
		    	      r5.afficheReservation();
		              break;
		         default:
		    	     System.out.println("Retour au menu precedent");
		            }
		    }while(choix != 36); // Sortir de la fenetre "Reservation de vols" et retour a la fenetre principale
	    	    
		    break;
		
	   // Quatri�me cas: acces a la fenetre "Annulation de reservations":
		    
	   case 4 :
		  
		   do {
			   
	    		Menu.annulationReservation();
			   
	    		
	    		
				choix = sc.nextInt();
			   
	    	
	            switch ( choix) {
	            
	            // Annuler des reservations:
	            
	            case 41:
	        	    
	            	// Annulation de deux reservations effectuees:
	            	
	            	// Creation de deux passagers:
	            	
	                Passager p1 = new Passager("El khoumissi", "Amine", "01/01/1995","06-01-01-01-01", 1111);
	                Passager p3 = new Passager("Haddad", "Yassir", "03/01/1995","06-03-03-03-03", 1113);
	                
	                // Cr�ation d'une liste de passagers:
	                
	    	        ArrayList<Passager> passagers = new ArrayList<Passager>();
	    	        
	    	        // Cr�ation de deux r�servations:
	    	        
	    	        Reservation r1 = new Reservation (01, "14/12/2016-10:05", p1, vols.get(0), passagers, comp);
		    	    Reservation r2 = new Reservation (02, "12/12/2016-14:15", p3, vols.get(1), passagers, comp);
		    	    
		    	     // Afficher le nombre de reservation avant leurs confirmations :
		    	    
		    	      System.out.println("Nombre de reservations au debut:"  + r1.nombrePassagers() + "\n");
		    	      
		    	    // Confirmer reservation r1:
		    	      
		    	      r1.confirmer();
		    	      
		    	    // Afficher reservaton r1:
		    	      
		    	      r1.afficheReservation();
		    	      
		    	    // Confirmer reservation r2:
		    	      
		    	      r2.confirmer();
		    	      
		    	    // Afficher reservaton r2:
		    	       
		    	      r2.afficheReservation();
		    	      
		    	   // Afficher le nombre de reservation apres leurs confirmations :
		    	      
		    	      System.out.println("\nNombre de reservations confirmees : " + r2.nombrePassagers() + "\n");
		    	      
		    	    // Annuler reservation r1:
		    	    
		    	      r1.annuler();
		    	      
		    	    // Annuler reservation r2:
		    	    
		    	      r2.annuler();
		    	    
		    	    // Afficher le nombre de reservations apres leurs annulations:
		    	      
		    	      System.out.println("\nNombre de reservations apres annulation : " + r2.nombrePassagers()  + "\n");
		    	     
		    	    break;
		        default:
		    	    System.out.println(" Retour au menu precedent");
	            }
	        }while(choix != 46); // Sortir de la fen�tre "Annulation de r�servations"
		  
		   break;
	        
		   // Cinqui�me cas : acc�s � la fen�tre "D�veloppeurs"
		   
		   case 5 :
			   
			   do {
				 
		    		Menu.developpeurs();
				   
		    		
					choix = sc.nextInt(); 
				   
					
		            switch ( choix) {
		            
		            // Premier cas: affichage des developpeurs de l'application
		            
		            case 51:
		        	     System.out.println("______________________________________________________________________________________________");
		    		 
		    		     System.out.println("                          \" Developpeurs \"                       ");
		    		     System.out.println("         Prenom       |          Nom        |       Num d'examen    ");
		    		     System.out.println("          AMINE       |     EL KHOUMISSI    |            734       ");
		    		     System.out.println("         YOUSSEF      |        LOUKILI      |            394       ");
		    		     System.out.println("         YASSIR       |        HADDAD       |            586       ");
		    	         System.out.println("______________________________________________________________________________________________");
		                 break;
			        default:
			    	     System.out.println(" Retour au menu precedent");
		            }
		        }while( choix != 56); // Soritr de la fenetre "Developpeurs" et retour a la fenetre principale
			   
		    
			    break;
			 default: 
				 System.out.println("Au revoir");
		    }      
		}while(choix != 6); // Sortir de l'application
	
	}
}
