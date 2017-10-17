package zoo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import zoo.Animal;
import zoo.AnimalInterface;

public class MonEnclos <Animal extends AnimalInterface> {

	public MonEnclos() {
		// TODO Auto-generated constructor stub
	}
	public static final String PROPRETE1 = "Bon";
	public static final String PROPRETE2 = "Correct";
	public static final String PROPRETE3 = "Mauvais";
	  
	public MonEnclos(String nom, double superficie, int maxAnimaux){
		this.nom = nom;
		this.superficie = superficie;
		this.maxAnimaux = maxAnimaux;
		this.proprete = PROPRETE1;
		this.setNbrAnimaux(0);
		
	}
	
	protected String nom;
	protected double superficie;
	protected int maxAnimaux;
	protected int nbrAnimaux;
	protected String proprete;
	List<Animal> listeAnimaux =  new ArrayList<Animal>();
	List<Animal> listeAnimauxTemporaire =  new ArrayList<Animal>();
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getSuperficie() {
		return superficie;
	}
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	public int getMaxAnimaux() {
		return maxAnimaux;
	}
	public void setMaxAnimaux(int maxAnimaux) {
		this.maxAnimaux = maxAnimaux;
	}
	public int getNbrAnimaux() {
		return nbrAnimaux;
	}
	public void setNbrAnimaux(int animaux) {
		this.nbrAnimaux = nbrAnimaux;
	}
	public String getProprete() {
		return proprete;
	}
	public void setProprete(String proprete) {
		this.proprete = proprete;
	}
	@Override
	/**
	 * Affiche les caractéristiques de l'enclos, et les animaux dedans.
	 */
	public String toString() {
		System.out.println("Mon enclos : \n" +
				"[Nom=" + this.getNom() + ",\n" +
				" Superficie=" + this.getSuperficie()+ ", \n" +
				" Max Animaux=" + this.getMaxAnimaux() + ", \n " +
				" Proprete=" + this.getProprete() + ", \n" +
				" Nombre d'animaux : "+this.getNbrAnimaux()+"]");
		for (Animal a : this.listeAnimaux) {
			 System.out.println(a);
		   
		 }
		 return "";
		
	}
	/**
	 * deteriore Enclos
	 */
	public void deterioreEnclos(){
		if(this.getProprete() == PROPRETE1){
			this.setProprete(PROPRETE2);
		}else if(this.getProprete() == PROPRETE2){
			this.setProprete(PROPRETE3);
		}
	}

	/**
	 * Enlever animal
	 */
	public void enleverAnimal (Animal animal){
		if(this.getNbrAnimaux() > 0){
			this.listeAnimaux.remove(animal);
			this.nbrAnimaux--;
		}else{
			System.out.println("Impossible d'enlever des animaux.");
		}
	}

	/**
	 * Ajoute Animal
	 */
	public void ajoutAnimal(Animal animal){
		 // ajout d'éléments à cette liste
		if(this.getNbrAnimaux() <= this.getMaxAnimaux()){
			this.listeAnimaux.add(animal);
			this.nbrAnimaux++;
		}else{
			System.out.println("Le nombre maximum d'animaux à été atteint.");
		}
	}
	
	/**
	 * Nourir les animaux dans l'enclos
	 */
	public void nourirAnimaux(){
		for(Animal a : this.listeAnimaux){
			a.manger();
		}
	}
	/**
	 * Création d'un enclos temporaire
	 * @return
	 */
	  public MonEnclos creerEnclosTemporaire() {
	        return new MonEnclos ("Enclos temporaire pour ",this.getSuperficie(), this.getMaxAnimaux());
	}
	/**
	 * Entretenir Enclos
	 * Vider les animaux d'abord
	 * Et ensuite les rajouter
	 */
	public void entretenirEnclos(){
		if(this.getNbrAnimaux() > 0){
			if(this.getProprete() == PROPRETE3){
				System.out.println("Il faut entretenir l'enclos !");
				MonEnclos temporaireEnclos = this.creerEnclosTemporaire();
				listeAnimauxTemporaire =  this.listeAnimaux ;
				//On transfere les animaux
				for(Animal a : listeAnimauxTemporaire){
					temporaireEnclos.ajoutAnimal(a);
					System.out.println(a);
				}
				this.setNbrAnimaux(0);
				this.listeAnimaux.clear();
				
				this.setProprete(PROPRETE1);
				System.out.println("Enclos bien nettoyé !");
				
				this.listeAnimaux = listeAnimauxTemporaire;
				//On retransfère les animaux
				for(Animal a : listeAnimauxTemporaire){
					temporaireEnclos.enleverAnimal(a);
				}
				listeAnimauxTemporaire.clear();
			}else{
					System.out.println("L'enclos n'a pas besoin d'être nettoyer !");
			}
		}else{
			System.out.println("L'enclos n'a pas d'animaux.");
		}
	}
}
