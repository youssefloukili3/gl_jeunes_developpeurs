package projet.classes;

/**
 *@authors: AMINE EL KHOUMISSI, YOUSSEF LOUKILI, YASSIR HADDAD
 * @exam's numbers: 734, 394, 586
 *@version: 1.0
 */

public class Passager extends Client {
    
	// Attribut de la classe Passager:
	
	private int numPassport;
	
	
	// Constructeur sans parametes de la classe Passager:
	
	public Passager() {}
	
	// Constructeur avec parametes de la classe Passager:
	
	public Passager ( String nom, String prenom, String dateNaissance, String telephone, int numPassport) {
		
		super( nom, prenom, dateNaissance, telephone);
		this.numPassport = numPassport;
			
	}
	
	// affichePassager(): permet d'afficher les informations d'un passager:
	
	public void affichePassager() {
		
		super.afficheClient();
		System.out.println( "Numero de passport    : " + numPassport );
	}
	
	// equals(): permet de verifier si deux objets de type Passager sont egaux on non:
	
	
	
	// Accesseur et modificateur de l'attribut de la classe Passager:
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		boolean reponse = false;
		
		if( obj instanceof Passager) {
			
			Passager p = (Passager) obj;
			if( numPassport == p.getNumPassport() )
				reponse = true;
			
		}
		return reponse;
	}

	public int getNumPassport() {
		return numPassport;
	}
	
	public void setNumPassport(int numPassport) {
		this.numPassport = numPassport;
	}

}