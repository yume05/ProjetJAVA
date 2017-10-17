package zoo;

public class Aquarium <Animal extends Marin> extends MonEnclos{

	public Aquarium(String nom, double superficie, int maxAnimaux, int profondeur) {
		// TODO Auto-generated constructor stub
		super(nom, superficie, maxAnimaux);
		this.profondeur = profondeur;
		this.setTauxSalinite(100);
		this.hauteurEau = profondeur;
		this.setNbrAnimaux(0);
	}
	
	protected int profondeur;
	protected double tauxSalinite;
	protected int hauteurEau;

	public int getHauteurEau() {
		return hauteurEau;
	}
	public void setHauteurEau(int hauteurEau) {
		this.hauteurEau = hauteurEau;
	}
	public int getProfondeur() {
		return profondeur;
	}
	public void setProfondeur(int profondeur) {
		if(hauteurEau >= 0 && hauteurEau <= this.getProfondeur()){
			this.profondeur = profondeur;
		}else{
			System.out.println("L'eau ne peut être plus haute que la profondeur de l'eau autorisé.");
		}

	}
	public double getTauxSalinite() {
		return tauxSalinite;
	}
	public void setTauxSalinite(double tauxSalinite) {
		if(tauxSalinite >= 0 && tauxSalinite <= 100){
			this.tauxSalinite = tauxSalinite;
		}
	}

	public void salirEnclos(){
		super.salirEnclos();
		this.setHauteurEau(this.getHauteurEau() - 1);
		this.setTauxSalinite(this.getTauxSalinite() - 10);
	}
	/**
	 * Entretien nécéssitant la vérif de ces deux caractéristiques
	 */
	public void entretenirEnclos(){
		System.out.println("Niveau de l'eau "+this.getHauteurEau()+" mètres de profondeur.");
		if(this.getHauteurEau() < this.getProfondeur()){
			System.out.println("Ajout de l'eau manquante..");
			System.out.println("Bloup...");
			this.setHauteurEau(this.getProfondeur());
			System.out.println("Le niveau de l'eau à bien été corrigé !");
		}
		System.out.println("Le taux de salinité est de "+this.getTauxSalinite() +"%");
		if(this.getTauxSalinite() < 100){
			System.out.println("Et on rajoute du sel !");
			System.out.println("Bloup...");
			this.setTauxSalinite(100);
			System.out.println("Tout est ok !");
		}
	}
	
	public String toString() {
		return("Mon Aquarium : \n " +
				"[Nom=" + this.getNom() + ", " +"\n" +
				"Superficie=" + this.getSuperficie()+ ", \n" +
				"Maximum Animaux=" + this.getMaxAnimaux() + ", \n " +
				"Nombre animaux=" + this.getNbrAnimaux()+ ",\n " +
				"Profondeur autorisée = "+this.getProfondeur()+ ",\n" +
				"Taux de salinité = "+this.getTauxSalinite()+ ", \n"+
				"Niveau de l'eau = "+this.getHauteurEau()+" ]"
				);
	}
	
}
