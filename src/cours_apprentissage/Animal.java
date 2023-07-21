package cours_apprentissage;

public class Animal {
	
	private String nom;
	private String race;
	private int age;
	
	public Animal(String nom, String race, int age) {
		super();
		this.nom = nom;
		this.race = race;
		this.age = age;
	}

	public void vieillir() {
		age++;
	}
	public void vieillir(int age) {
		this.age+= age;
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", race=" + race + ", age=" + age + "]";
	}
	
	

}
