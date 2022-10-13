package esprit.tp1;

public class ClientPlus {
	private String nomClient;
	private int nbComptes = 0;// A ajouter nombre de compte pour chaque client, initialiser par 0
	static final int nbmaxcompte = 10;
	public Compte[] cptClient;

	public ClientPlus() {
		this.nomClient = "inconnu";
		this.cptClient = new Compte[nbmaxcompte];

	}

	public ClientPlus(String nom) {
		this.nomClient = nom;
		setNom(nom);
		this.cptClient = new Compte[nbmaxcompte];
	}

	public ClientPlus(ClientPlus c) {
		this.nomClient = c.nomClient;
		this.cptClient = c.cptClient;

	}

	private void setNom(String n) {
		this.nomClient = n;
	}

	public String getNom() {
		return this.nomClient;
	}

	public double[] getSoldes() {

		double[] tabSoldes = new double[nbComptes];// changer nbmaxcompte par nbComptes
		for (int i = 0; i < nbComptes; i++) { // la même chose changer nbmaxcompte par nbComptes
			tabSoldes[i] = cptClient[i].getSolde();
		}
		return tabSoldes;
	}

	// Ajouter cette méthode pour créer un nouveau compte
	public void setComptes(Compte c) {
		cptClient[nbComptes] = new Compte(c);
		this.nbComptes++;// Incrémenter nbComptes par 1

	}

	public void AfficherSoldes() {
		for (int i = 0; i < nbComptes; i++) {// changer nbmaxcompte par nbComptes
			// Provoque un Exception cpt Client[id]" is null tout a fait normal
			// parceque le nombre max de comptes plus grand que nombre de comptes qu'on a
			// créé
			System.out.println(
					"le compte numero " + cptClient[i].getNumCompte() + " a un solde = " + cptClient[i].getSolde());
			// changer "cptClient[i].Client.getNom()+" par "cptClient[i].getNumCompte()"
		}

	}

}
