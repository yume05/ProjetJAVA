package zoo;

public class Requin extends Animal implements Marin, Ovipare{

	public Requin() {
		// TODO Auto-generated constructor stub
	}
	
	public Requin(String nom, Boolean sexe, int poids, int taille, int age){
		this.nom = nom;
		this.sexe = sexe;
		this.poids = poids;
		this.taille = taille;
		this.age = age;
	}
	
	protected void mangerVrai(){
		System.out.println("Je mange les humains qui s'approchent trop de moi ! Raah !");
	}
	
	public void crier (){
		System.out.println("Glou Glou");
	}

	/**
	 * L'animal se déplace dans son habitat
	 */
	public void nager(){
		System.out.println("Je nage dans l'eau !");
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
