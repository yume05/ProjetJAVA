package zoo;

public class Aquarium <T extends Animal & Marin> extends Enclos<T>{

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
		return("Mon aquarium s'appelle \"" + this.getNom() + "\", sa superficie est de " + this.getSuperficie()+ ", il ne peut contenir pas plus de " + this.getMaxAnimaux() + " animaux, il en possède déjà " + this.getNbrAnimaux()+ ", sa profondeur autorisée est de "+this.getProfondeur()+ ", son taux de salinité est à "+this.getTauxSalinite()+"% et son niveau d'eau "+this.getHauteurEau()+".");
	}
	@Override
	public Enclos creerEnclosTemporaire() {
		Aquarium<T> enclosTemporaire = new Aquarium<T>(this.getNom(), this.getSuperficie(), this.getMaxAnimaux(), this.getProfondeur());
		return enclosTemporaire;
	}
	
}
