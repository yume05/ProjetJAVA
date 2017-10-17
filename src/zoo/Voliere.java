package zoo;
import zoo.Volant;
public class Voliere <Animal extends Volant> extends MonEnclos{

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
		super.salirEnclos();
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
		return("Ma Volière : \n " +
				"[Nom=" + this.getNom() + ", " +"\n" +
				"Superficie=" + this.getSuperficie()+ ", \n" +
				"Maximum Animaux=" + this.getMaxAnimaux() + ", \n " +
				"Nombre animaux=" + this.getNbrAnimaux()+ ",\n " +
				"Hauteur = "+this.getHauteur()+ ",\n" +
				"Etat du toit = "+this.getEtatToit()+ "]"
				);
	}


}
