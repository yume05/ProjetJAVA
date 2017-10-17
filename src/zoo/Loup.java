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
	
	public void accouplement(Animal l1, Animal l2){
			if(l1.isSexe()==true && l2.isSexe() == false){
				
			}
			else if(l2.isSexe()==true && l1.isSexe() == false){
				
			}
	}
	
	public void mettreBas(){

	}
}
