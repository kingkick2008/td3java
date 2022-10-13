package esprit.tp1;

public class Compte {
	private int numCompte;
	private double solde;
	public static int nbCpt = 0;

	public Compte() {
		this.numCompte = 0;
		this.solde = 0;
		nbCpt++;
	}

	public Compte(int n, double s) {
		this.numCompte = n;
		this.solde = s;
		nbCpt++;
	}

	public Compte(Compte p) {
		this.numCompte = p.numCompte;
		this.solde = p.solde;
		nbCpt++;
	}

	public double getSolde() {
		return this.solde;
	}

	public void setSolde(double s) {
		this.solde = s;
	}

	public void setNumCompte(int n) {
		this.numCompte = n;
	}

	public int getNumCompte() {
		return this.numCompte;
	}

	public void depot(double montantdep) {
		this.solde += montantdep;
	}

	public void retrait(double montantretrait) {
		if (solde >= montantretrait)
			this.solde -= montantretrait;
	}

	public String toString() {
		return "Compte num: " + numCompte + ", a comme solde:" + solde;
	}

	public void afficheSolde() {
		System.out.println("Solde: " + solde);
	}

	public void virer(double montantdeplacer, Compte cptdest) {
		if (this.solde >= montantdeplacer) {// changer "if(montantdeplacer>this.Solde)"
			this.solde -= montantdeplacer;
			cptdest.solde += montantdeplacer;
		}
	}

	public static Compte plusSolde(Compte c1, Compte c2) {
		return c1.solde > c2.solde ? c1 : c2;
	}

	public boolean equal(Compte c) {
		return this.numCompte == c.numCompte && this.solde == c.solde ? true : false;
	}

}
