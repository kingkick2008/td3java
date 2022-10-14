package esprit.tp3;

public class Compte {
	private int numCompte;
	private double solde;
	public static int nbCompte=0;
	
	public Compte() {
		this.numCompte=0;
		this.solde=0;
		nbCompte++;
	};
	
	public Compte(int n) {
		this.numCompte=n;
		this.solde=0;
		nbCompte++;
	};
	public Compte(int n,double s) {
		this.numCompte=n;
		this.solde=s;
		nbCompte++;
	}
	public Compte(Compte c) {
		this.numCompte=c.numCompte;
		this.solde=c.solde;
		nbCompte++;
	}
	
	
	public double getSolde() {
		return this.solde;
	}
	public void setSolde(double s) {
		if(s>0)
		this.solde=s;
	}
	
	public void depot(double m) {
		if(m>0)
		this.solde+=m;
	}
	public void retrait(double m) {
		if(solde>=m)
			this.solde-=m;
	}
	
	public void virer(double montantdeplacer, Compte cptdest) {
		if(this.solde>=montantdeplacer) {
			cptdest.solde+=montantdeplacer;
			this.solde-=montantdeplacer;
		}
	}
	
	public static Compte plusSolde(Compte c1,Compte c2) {
		return c1.solde>c2.solde?c1:c2;
	}
	
	public boolean equals(Compte c) {
		return this.solde==c.solde && this.numCompte==c.numCompte?true:false;
	}
	public String toString() {
		return "Le compte numero: "+ this.numCompte+ " a pour solde: "+this.solde;
	}
	
	public void afficherSolde() {
		System.out.println("Solde: "+ this.solde);
	}
	public int getNumCompte() {
		return this.numCompte;
	}
	

}
