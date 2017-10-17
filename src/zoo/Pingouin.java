package zoo;

public class Pingouin extends Animal implements Marin, Terrestre, Ovipare {

	public Pingouin() {
		// TODO Auto-generated constructor stub
	}
	
	public Pingouin (String nom, Boolean sexe, int poids, int taille, int age){
		this.nom = nom;
		this.sexe = sexe;
		this.poids = poids;
		this.taille = taille;
		this.age = age;
	}

	protected void mangerVrai(){
		System.out.println("Je mange du poisson frais !");
	}
	
	public void crier (){
		System.out.println("Glou Glou");
	}

	/**
	 * L'animal se déplace dans son habitat
	 */
	public void nager (){
		System.out.println("Je nage dans l'eau comme un pingouin ! ");
	}
	
	public void deplacement (){
		System.out.println("Je marche sur la baquise ! ");
	}
	public void accouplement(Animal l1, Animal l2){
		if(l1.isSexe()==true && l2.isSexe() == false){
			
		}
		else if(l2.isSexe()==true && l1.isSexe() == false){
			
		}
}
	
	public void pondreOeuf(){
		
	}
}
