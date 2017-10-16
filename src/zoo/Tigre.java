package zoo;

public class Tigre extends Animal implements Terrestre {

	public Tigre() {
		// TODO Auto-generated constructor stub
	}
	
	public Tigre (String nom, Boolean sexe, int poids, int taille, int age){
		this.nom = nom;
		this.sexe = sexe;
		this.poids = poids;
		this.taille = taille;
		this.age = age;
	} 
	
	protected void mangerVrai(){
		System.out.println("Je mange les gazelles.. Sauf si elles sont trop rapide..");
	}
	
	/**
	 * L'animal emet un son
	 */
	public void crier(){
		System.out.println("Grrr Grrr");
	}

	/**
	 * L'animal se déplace dans son habitat
	 */
	public void deplacement (){
		System.out.println("Je vagabonde dans les champs !");
	}
	
	public void accouplement(){
		
	}
	
	public void mettreBas (){
		
	}
	
	

}
