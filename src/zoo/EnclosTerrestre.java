package zoo;

public class EnclosTerrestre <T extends Animal & Terrestre> extends Enclos<T> {

	public EnclosTerrestre(String nom, double superficie, int maxAnimaux) {
		// TODO Auto-generated constructor stub
		super(nom, superficie, maxAnimaux);
		super.setNbrAnimaux(0);
	}
	
	public String toString() {
		return("Mon enclos s'appelle \"" + this.getNom() + "\", il a une superficie de " + this.getSuperficie()+ ", il peut posséder pas plus de " + this.getMaxAnimaux() + " animaux, son etat d'entretien est à " + this.getProprete() + " et son nombre d'animaux actuelle est de "+this.getNbrAnimaux()+"animaux.");	
	}
	public void salirEnclos(){
		super.deterioreEnclos();
	}
	
	public void ajoutAnimal(T animal){
		super.ajoutAnimal(animal);
	}
	@Override
	public Enclos creerEnclosTemporaire() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void entretenirEnclos(){
		super.entretenirEnclos();
	}

}
