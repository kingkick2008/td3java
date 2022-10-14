package esprit.tp3;

import java.util.Arrays;

class ClientPlus {
	private String nomClient;
	private Compte[] cptClient ;
	private  int nbCompte=0;
	public static int nbmaxcompte=10;
	
	public ClientPlus() {
		this.nomClient="inconnu";
		this.cptClient=new Compte[nbmaxcompte];
	}
	
	public ClientPlus(String nom) {
		this.nomClient=nom;
		setNom(nom);// ou bien
		this.cptClient=new Compte[nbmaxcompte];
	}
	public ClientPlus(String nom,ClientPlus c) {
		this.nomClient=nom;
		setNom(nom);//ou bien
		this.cptClient=c.cptClient;
	}
	public ClientPlus(String nomClient, int numCompte) {
		this.nomClient=nomClient;
		setNom(nomClient);//ou bien
		this.cptClient=new Compte[nbmaxcompte];
		}

	
	public void setNom(String nom) {
		 this.nomClient=nom;
	}
	
	public String getNom() {
		return this.nomClient;
	}
	public double [] getSolde() {
		
		double[] tableSolde = new double [nbCompte];
		for(int i =0;i<nbCompte;i++) {
			tableSolde[i]=cptClient[i].getSolde();
		}
		return tableSolde;
	}
	
	public void setComptes(Compte c) {
		cptClient[nbCompte] = new Compte(c);
		this.nbCompte++;

	}
	
	public void afficherSolde() {

		for(int i =0;i<nbCompte;i++) {
		cptClient[i].afficherSolde();
		}
	}
	

	
	public String toString() {
		String [] afficheInfoCompte=new String[nbCompte];
		for (int i=0; i<nbCompte;i++) {
			afficheInfoCompte[i]=cptClient[i].toString();
		}
		return "Le client: "+ this.nomClient+ " Ses comptes:\n"+Arrays.toString(afficheInfoCompte);
	}
	
}
