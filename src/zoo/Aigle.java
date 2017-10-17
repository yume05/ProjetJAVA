package zoo;

public class Aigle extends Animal implements Volant, Ovipare{

	public Aigle() {
		// TODO Auto-generated constructor stub
	}
	
	public Aigle (String nom, Boolean sexe, int poids, int taille, int age){
		this.nom = nom;
		this.sexe = sexe;
		this.poids = poids;
		this.taille = taille;
		this.age = age;
	}
	
	protected void mangerVrai(){
		System.out.println("Je mange de petits lapins qui n'ont pas eu le temps de se cacher de moi !");
	}
	
	/**
	 * L'animal emet un son
	 */
	public void crier (){
		System.out.println("Couaw Couaw");
	}

	/**
	 * L'animal se déplace dans son habitat
	 */
	public void voler(){
		System.out.println("Je vole dans le ciel !");
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
