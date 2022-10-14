package esprit.tp3;

public class Client {
	private String nomClient;
	private Compte cptClient ;
	
	public Client() {
		this.nomClient="inconnu";
		this.cptClient=new Compte();
	}
	
	public Client(String nom) {
		this.nomClient=nom;
		setNom(nom);// ou bien
		this.cptClient=new Compte();
	}
	public Client(String nom,Compte c) {
		this.nomClient=nom;
		setNom(nom);//ou bien
		this.cptClient=c;
	}
	public Client(String nomClient, int numCompte) {
		this.nomClient=nomClient;
		setNom(nomClient);//ou bien
		this.cptClient=new Compte(numCompte);
		}

	
	public void setNom(String nom) {
		 this.nomClient=nom;
	}
	
	public String getNom() {
		return this.nomClient;
	}
	public double getSolde() {
		return this.cptClient.getSolde();
	}
	
	public void setSolde(double s) {
		 this.cptClient.setSolde(s);
	}
	
	public void afficherSolde() {
		this.cptClient.afficherSolde();
		
	}
	
	public boolean equals(Client c) {
		return this.nomClient==c.nomClient && this.cptClient.equals(c.cptClient)==true?true:false;
	}
	
	public String toString() {
		return "Le client: "+ this.nomClient+",son numero de compte est: "+this.cptClient.getNumCompte()+ " a pour solde: "+ this.getSolde();
	}
	
	
	
	

}
