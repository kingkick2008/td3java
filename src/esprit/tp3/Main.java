package esprit.tp3;

public class Main {

	public static void main(String[] args) {
		//test class Compte
		
		Compte c1=new Compte(12345);
		c1.setSolde(2000);
		System.out.println(c1);
		c1.depot(500);
		System.out.println(c1);
		c1.retrait(1000);
		System.out.println(c1);
		Compte c2=new Compte(12346);
		c2.setSolde(4000);
		System.out.println(c2);
		
		
		c1.virer(300, c2);
		System.out.println(c1);//affiche new solde de c1
		System.out.println(c2);//affiche new solde de c2
		System.out.println(Compte.nbCompte);//test nb de compte cree
		System.out.println(Compte.plusSolde(c1, c2));//test le compte qu'a plus de solde
		
		System.out.println(c1.equals(c2));//test d'egalite
		System.out.println(c1.equals(new Compte(12345,1200)));//test d'egalite
		
		
		// test classe Client
		
		Client cl1=new Client("Alexandre", 1234);
		System.out.println(cl1);
		cl1.setSolde(5000);
		cl1.afficherSolde();
		System.out.println(cl1);
		Client cl2 =new Client("ali",c1);
		cl2.afficherSolde();
		System.out.println(cl2);
		
		System.out.println(cl1.equals(new Client("ali",new Compte(12345,1200))));//false
		System.out.println(cl2.equals(new Client("ali",new Compte(12345,1200))));//true
		
		// test classe ClientPlus
		ClientPlus clP1=new ClientPlus("moussa");
		clP1.setComptes(c1);
		clP1.setComptes(c2);
		System.out.println(clP1);
		clP1.afficherSolde();
		
		
		
		
		
		
		

	}

}
