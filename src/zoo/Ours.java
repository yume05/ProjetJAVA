package zoo;

public class Ours extends Animal implements Terrestre, Mammifere {

	public Ours() {
		// TODO Auto-generated constructor stub
	}
	
	public Ours (String nom, Boolean sexe, int poids, int taille, int age){
		this.nom = nom;
		this.sexe = sexe;
		this.poids = poids;
		this.taille = taille;
		this.age = age;
	}
	
	protected void mangerVrai(){
		System.out.println("Je mange du miel ! Mmmmh");
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
	
	public void accouplement(Animal l1, Animal l2){
		if(l1.isSexe()==true && l2.isSexe() == false){
			
		}
		else if(l2.isSexe()==true && l1.isSexe() == false){
			
		}
}
	public void mettreBas(){
		
	}
}
