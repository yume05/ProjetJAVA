package zoo;

public class Baleine extends Animal implements Marin, Mammifere {

	public Baleine() {
		// TODO Auto-generated constructor stub
	}
	
	public Baleine (String nom, Boolean sexe, int poids, int taille, int age){
		this.nom = nom;
		this.sexe = sexe;
		this.poids = poids;
		this.taille = taille;
		this.age = age;
	}

	protected void mangerVrai(){
		System.out.println("Je mange du plancton !");
	}

	public void crier (){
		System.out.println("Glou Glou");
	}

	/**
	 * L'animal se déplace dans son habitat
	 */
	public void deplacement (){
		System.out.println("Je nage dans l'eau !");
	}
	
	public void accouplement(Animal animal){
		
	}
	
	public void mettreBas(){
		
	}
}
