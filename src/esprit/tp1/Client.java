package esprit.tp1;

public class Client {
	private String nomClient;
	private Compte cptClient;

	public Client() {
		this.cptClient = new Compte();
		this.nomClient = "inconnu";
	}

	public Client(String n, Compte c) {
		this.cptClient = c;
		this.nomClient = n;
	}

	public Client(Client c) {
		this.cptClient = c.cptClient;
		this.nomClient = c.nomClient;
	}

	public Client(String n, int nbc) {
		setNom(n);
		this.cptClient.setNumCompte(nbc);
	}

	public String getNom() {
		return this.nomClient;
	}

	public double getSolde() {
		return cptClient.getSolde();
	}

	public int getNumCompte() {
		return cptClient.getNumCompte();
	}

	public void afficheSolde() {
		cptClient.afficheSolde();
	}

	public String toString() {
		return "Client: " + nomClient + ", " + cptClient.toString();
	}

	public boolean equals(Client c) {
		// return cptClient.equal(c.cptClient);
		return this.nomClient == c.nomClient && cptClient.equal(c.cptClient) == true ? true : false;

	}

	private void setNom(String n) {
		this.nomClient = n;
	}

}
