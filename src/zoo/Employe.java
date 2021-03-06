package zoo;
import zoo.Enclos;
import zoo.AnimalInterface;

import java.util.ArrayList;
import java.util.List;

public class Employe implements EmployeInterface {

	public Employe(String nom, Boolean sexe, int age) {
		// TODO Auto-generated constructor stub
		this.nom = nom;
		this.sexe = sexe;
		this.age = age;
	}

	protected String nom;
	protected Boolean sexe;
	protected int age;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Boolean getSexe() {
		return sexe;
	}
	public void setSexe(Boolean sexe) {
		this.sexe = sexe;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	public void examinerEnclos(Enclos enclos) {
		// TODO Auto-generated method stub
		System.out.println(enclos.toString());
	}

	@Override
	public void nettoyerEnclos(Enclos enclos) {
		// TODO Auto-generated method stub
		enclos.entretenirEnclos();
		
	}
	@Override
	public void nourirAnimauxEnclos(Enclos enclos) {
		// TODO Auto-generated method stub
		enclos.nourirAnimaux();
	}
	
	@Override
	public void transferAnimalEnclos(Enclos enclosOriginal, Enclos enclosFutur, Animal monAnimal) {
		// TODO Auto-generated method stub
		if(enclosFutur.getNbrAnimaux() < enclosFutur.getMaxAnimaux()){
			if(enclosFutur.getClass() == enclosOriginal.getClass()){
				enclosFutur.ajoutAnimal(monAnimal);
				enclosOriginal.enleverAnimal(monAnimal);
				System.out.println("Le transfère s'est bien passé !");
			}else{
				System.out.println("Vous ne pouvez pas transférer cet animal dans cette enclos ci !!");
			}
			
		}else{
			System.out.println("Impossible de transferer l'animal dans cette enclos");
		}
	}
	
	

}
