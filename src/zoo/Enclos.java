package zoo;
import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.concurrent.*;
import zoo.Animal;
import zoo.AnimalInterface;

public abstract class Enclos<T extends Animal> {
	public Enclos() {
		// TODO Auto-generated constructor stub
	}
	public static final String PROPRETE1 = "bon";
	public static final String PROPRETE2 = "correct";
	public static final String PROPRETE3 = "mauvais";
	  
	public Enclos(String nom, double superficie, int maxAnimaux){
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
	ArrayList<T> listeAnimaux =  new ArrayList<T>();
	ArrayList<T> listeAnimauxTemporaire =  new ArrayList<T>();
	ArrayList<T> listeAnimauxInvisible =  new ArrayList<T>();
	
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

	
	public void randomAnimaux(){
		for(Animal a : this.listeAnimaux){
			a.setIndiceFaim(a.getRandomBoolean());
			a.setIndiceSante(a.getRandomBoolean());
			a.setIndiceSommeil(a.getRandomBoolean());
		}
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
	public void enleverAnimal (T animal){
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
	public void ajoutAnimal(T animal){
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
	 public abstract Enclos creerEnclosTemporaire();
	 public abstract void salirEnclos();
	/**
	 * Entretenir Enclos
	 * Vider les animaux d'abord
	 * Et ensuite les rajouter
	 */
	public void entretenirEnclos(){
		if(this.getNbrAnimaux() > 0){
			if(this.getProprete() == PROPRETE3){
				System.out.println("Il faut entretenir l'enclos !");
				Enclos<T> temporaireEnclos = this.creerEnclosTemporaire();
				listeAnimauxTemporaire =  this.listeAnimaux ;
				//On transfere les animaux
				for(T a : listeAnimauxTemporaire){
					temporaireEnclos.ajoutAnimal(a);
				}
				this.setNbrAnimaux(0);
				this.listeAnimaux.clear();
				
				this.setProprete(PROPRETE1);
				System.out.println("Enclos bien nettoyé !");
				
				this.listeAnimaux = listeAnimauxTemporaire;
				//On retransfère les animaux
				for(T a : listeAnimauxTemporaire){
					temporaireEnclos.enleverAnimal(a);
				}
				listeAnimauxTemporaire.clear();
			}else if(this.getProprete() == PROPRETE2){
				System.out.println("Il faut entretenir l'enclos !");
				Enclos<T> temporaireEnclos = this.creerEnclosTemporaire();
				listeAnimauxTemporaire =  this.listeAnimaux;
				//On transfere les animaux
				for(T a : listeAnimauxTemporaire){
					temporaireEnclos.ajoutAnimal(a);
				}
				this.setNbrAnimaux(0);
				this.listeAnimaux.clear();
				
				this.setProprete(PROPRETE1);
				System.out.println("Enclos bien nettoyé !");
				
				this.listeAnimaux = listeAnimauxTemporaire;
				//On retransfère les animaux
				for(T a : listeAnimauxTemporaire){
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
	public String recupClass(){
		//ArrayList<T> a = this.listeAnimaux;
		ArrayList<T> a = this.listeAnimauxInvisible;
		String enclos1 = "";
		for(Animal b : a){
			enclos1 = b.getClass().toString();	
		}
		String[]mots = enclos1.split (" "); 
		String mot = mots[1];
		String[]mo = mot.split ("\\."); 
		String m = mo[1];
		return m;
		
		
	}
}
