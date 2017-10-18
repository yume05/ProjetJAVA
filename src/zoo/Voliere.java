package zoo;
import zoo.Volant;
public class Voliere <T extends Animal & Volant> extends Enclos<T>{

	public Voliere(String nom, double superficie, int maxAnimaux, double hauteur) {
		// TODO Auto-generated constructor stub
		super(nom, superficie, maxAnimaux);
		this.hauteur = hauteur;
		this.setEtatToit(true);
		this.setNbrAnimaux(0);
	}
	
	protected double hauteur;
	protected Boolean etatToit;

	public Boolean getEtatToit() {
		return etatToit;
	}

	public void setEtatToit(Boolean etatToit) {
		this.etatToit = etatToit;
	}

	public double getHauteur() {
		return hauteur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}
	
	public void salirEnclos(){
		if(this.getEtatToit()){
			this.setEtatToit(false);
		}
	}
	
	public void entretenirEnclos(){
		super.entretenirEnclos();
		if(!this.getEtatToit()){
			this.setEtatToit(true);
		}
	}
	
	/**
	 * Affiche les caractéristiques de l'enclos, et les animaux dedans.
	 */
	public String toString() {
		String etatToits;
		if(this.etatToit == false){
			etatToits = "mauvais";
		}else{
			etatToits = "bon";
		}
		return("Ma Volière s'appelle \"" + this.getNom() + "\", possède une superficie de " + this.getSuperficie()+ ", peut contenir maximum " + this.getMaxAnimaux() + " animaux volants, contient actuellement " + this.getNbrAnimaux()+ " animaux, sa hauteur est de "+this.getHauteur()+ " et le toit est en "+etatToits+" etat.");
	}

	public void ajoutAnimal(T animal){
		super.ajoutAnimal(animal);
	}
	@Override
	public Enclos creerEnclosTemporaire() {
		Voliere<T> enclosTemporaire = new Voliere<T>(this.getNom(), this.getSuperficie(), this.getMaxAnimaux(), this.getHauteur());
		return enclosTemporaire;
	}


}
