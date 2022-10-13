package esprit.tp1;

public class test {

	public static void main(String[] args) {

		// Compte P1=new Compte(12345,2000.0);
		// System.out.println(P1);
		// Compte P2=new Compte(P1);
		// boolean T1=P1.equals(P2);
		// System.out.println(T1);
		//
		//
		// Client C1=new Client("Med Ben Salah",P1);
		// System.out.println(C1);
		// Client C2=new Client(C1);
		// boolean T2=C1.equals(C2);
		// System.out.println(T2);

		Compte P1 = new Compte(12345, 2000.0);
		Compte P2 = new Compte(12346, 3000.0);
		Compte P3 = new Compte(12347, 4000.0);
		ClientPlus cl = new ClientPlus("sami");
		cl.setComptes(P1);
		cl.setComptes(P2);
		cl.setComptes(P3);

		cl.AfficherSoldes();

	}

}
