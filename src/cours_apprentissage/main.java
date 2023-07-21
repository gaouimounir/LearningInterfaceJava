package cours_apprentissage;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chat minouche = new Chat("minouche", "3arbi",8);
		minouche.crier();
		minouche.vieillir();
		
		System.out.println(minouche.getAge());
		minouche.vieillir(4);
		
		System.out.println(minouche.getAge());
		
		}
		
	}