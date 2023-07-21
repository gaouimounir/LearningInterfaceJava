package cours_apprentissage;

public class Chat extends Animal implements ICrier {

		public Chat(String nom, String race, int age) {
			super(nom, race, age);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void crier() {
			// TODO Auto-generated method stub
			System.out.println("meow");
		}

	}

