package zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Thread;

public class Loup extends Animal implements Terrestre, Mammifere {

	public Loup() {
		// TODO Auto-generated constructor stub
	}

	public Loup (String nom, Boolean sexe, int poids, int taille, int age){
		this.nom = nom;
		this.sexe = sexe;
		this.poids = poids;
		this.taille = taille;
		this.age = age;
	}
	
	protected Boolean gestation;
	protected void mangerVrai(){
		System.out.println("Je mange de la viande ! Grr Grr");
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
	
	public void accouplement(Animal animal){
		//Si femelle
		/*CREER UN CLASSE QUI PERMET DE S OCCUPER DE LA NAISSANCE DU LOUP
		 * UNE CLASSE QUI POSSÈDE, LE NOM DE L'ENCLOS, ET L'ANIMAL
		 * if(this.isSexe()){
			System.out.println("L'animal est une femelle, il faut donc lui trouver un mâle");
			System.out.println("La femelle s'accouplera avec "+animal.getNom());
			System.out.println("Début de la gestation");
			this.gestation = true;
		}*/
	}
	
	public void mettreBas(){
		/*if(this.gestation){
			try{
				Thread.sleep(62000);
				System.out.println("Un bébé loup est né !");
				Scanner sc = new Scanner(System.in);
				System.out.println("Saisissez son nouveau nom :");
				String str = sc.nextLine();
				Loup loup1 = new Loup(str, true, 7, 20, 1);
				this.
			}catch(Exception e){
				
			}
		}*/
	}
}
