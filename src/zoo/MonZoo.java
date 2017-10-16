package zoo;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MonZoo {

	public MonZoo() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		//String nom, String sexe, int poids, int taille, int age

		Loup loup1 = new Loup("Lou", true, 30, 70, 6);
		Loup loup2 = new Loup("LouLou", false, 36, 80, 8);
		Loup loup3 = new Loup("Lilou", true, 28, 68, 5);
		Aigle aigle1 = new Aigle("Aiglon", true, 30, 70, 6);
		Aigle aigle2 = new Aigle("Aiglou", false, 36, 80, 8);
		Aigle aigle3 = new Aigle("Eglou", true, 28, 68, 5);
		Pingouin pingouin1 = new Pingouin("Pingiuw", true, 25, 40, 3);
		Pingouin pingouin2 = new Pingouin("Pingouw", false, 29, 50, 2);
		Baleine baleine1 = new Baleine("Blue", true, 10000, 700, 6);
		Baleine baleine2 = new Baleine("Iris", false, 8000, 800, 8);
		//System.out.println(loup1.toString());
		/*loup1.crier();
		loup1.deplacement();
		loup1.dormir();
		loup1.seReveiller();	
		loup1.seReveiller();
		loup1.manger();
		loup1.manger();
		loup1.dormir();
		loup1.seReveiller();
		loup1.manger();
		
		
		Aigle aigle1 = new Aigle("Cocaw", "Mâle", 5, 70, 3);
		System.out.println(aigle1.toString());
		aigle1.crier();
		aigle1.deplacement();
		aigle1.dormir();
		aigle1.seReveiller();
		aigle1.manger();
		aigle1.manger();
		aigle1.seReveiller();*/
		
		// création d'une liste de String
		MonEnclos enclos1 = new MonEnclos ("L'enclos des loups", 20.2, 10, 0);
		/*enclos1.ajoutAnimal(loup1);
		
		System.out.println(enclos1.toString());
		
		enclos1.ajoutAnimal(loup2);
		enclos1.ajoutAnimal(loup3);
		
		
		System.out.println(enclos1.toString());
		
		MonEnclos enclos2 = new MonEnclos ("L'enclos des pingouin", 10.5, 15, 0);
		enclos2.ajoutAnimal(pingouin1);
		
		System.out.println(enclos2.toString());
		
		enclos2.ajoutAnimal(pingouin2);
		
		System.out.println(enclos2.toString());
		enclos2.nourirAnimaux();*/
		
		Voliere enclos3 = new Voliere ("L'enclos des aigles", 30, 10, 0, 30, false);
		/*enclos3.ajoutAnimal(aigle1);
		
		System.out.println(enclos3.toString());
		
		enclos3.ajoutAnimal(aigle2);
		enclos3.ajoutAnimal(aigle3);
		
		
		System.out.println(enclos3.toString());
		enclos3.salirEnclos();
		enclos3.salirEnclos();
		System.out.println(enclos3.toString());
		enclos3.entretenirEnclos();
		System.out.println(enclos3.toString());*/
		
		/*MonEnclos enclos4 = new MonEnclos ("L'enclos des pingouin", 10.5, 15, 0);
		enclos4.ajoutAnimal(pingouin1);
		
		System.out.println(enclos4.toString());
		
		enclos4.ajoutAnimal(pingouin2);
		
		System.out.println(enclos4.toString());
		enclos4.nourirAnimaux();*/
		
		Aquarium enclos4 = new Aquarium ("L'aquarium des baleines", 50, 3, 0, 30);
		
		
		/*System.out.println(enclos4.toString());
		//System.out.println("Salir enclos");
		enclos4.salirEnclos();
		enclos4.ajoutAnimal(baleine2);
		//System.out.println("Nourir 1 animal");
		enclos4.nourirAnimaux();
		
		//System.out.println(enclos4.toString());
		//System.out.println("Enlever animal");
		enclos4.enleverAnimal(baleine2);
		//System.out.println(enclos4.toString());
		//System.out.println("Ajout animal");
		enclos4.ajoutAnimal(baleine1);
		enclos4.ajoutAnimal(baleine2);
		
		enclos4.salirEnclos();
		enclos4.salirEnclos();
		//System.out.println(enclos4.toString());
		enclos4.entretenirEnclos();
		//System.out.println(enclos4.toString());*/
		List<MonEnclos> listeEnclos =  new ArrayList<MonEnclos>();
		Employe employer = new Employe("Lisa", false, 20);
		Aquarium enclos5 = new Aquarium ("L'aquarium des baleines blanche", 50, 3, 0, 30);
		listeEnclos.add(enclos5);
		listeEnclos.add(enclos4);
		listeEnclos.add(enclos3);
		listeEnclos.add(enclos1);
		
		String mainMenu = "Que voulez vous faire :"+" \n"+
		"a: Examiner un enclos"+"\n"+
		"b: Nettoyer un enclos"+" \n"+
		"c: Nourir un enclos"+" \n"+
		"d: Transferer un animal"+" \n"+
		"q: Quit"+"\n";
		
		int i=0;
		String sousMenu = "Choisir son enclos :"+"\n";  
		for(MonEnclos a : listeEnclos){
			sousMenu += i+" : "+"\n";
			sousMenu += a+"\n";
			i++;
		}
		
		Scanner scan = new Scanner(System.in);
		int choiceIndex;
		int choiceIndex2;
		int choiceIndexAnimal;
		String choice;
		boolean loop = true;
		while(loop){
			System.out.println(mainMenu);
			choice = scan.nextLine();
		switch (choice){
			case "a":
					System.out.println("-----EXAMINER ENCLOS--------");
					System.out.println(sousMenu);
					choiceIndex = scan.nextInt();
					employer.examinerEnclos(listeEnclos.get(choiceIndex));
				break;

		    case "b":
		    		i = 0;
			    	System.out.println("---------NETTOYER UN ENCLOS------");
			    	System.out.println(sousMenu);
					choiceIndex = scan.nextInt();
					employer.nettoyerEnclos(listeEnclos.get(choiceIndex));
		        break;
		        
		    case "c":
		    		i = 0;
			    	System.out.println("---------NOURIR UN ENCLOS------");
			    	System.out.println(sousMenu);
					choiceIndex = scan.nextInt();
					employer.nourirAnimauxEnclos(listeEnclos.get(choiceIndex));
		       
		        break;
		    case "d":
		    		i = 0;
			    	System.out.println("---------TRANSFERER ANIMAL------");
			    	System.out.println(sousMenu);
					System.out.println("Choisir l'enclos d'origine");
					choiceIndex = scan.nextInt();
					System.out.println("Choisir l'enclos vers qui transferer");
					choiceIndex2 = scan.nextInt();
					System.out.println("Les animaux de l'enclos :");
					/*for(Animal a : listeEnclos.get(choiceIndex).listeAnimaux){
						System.out.println("-----------------"+i+" : ");
						System.out.println(a);
						i++;
					}
					System.out.println("Choisir l'animal :");
					choiceIndexAnimal = scan.nextInt();
					employer.transferAnimalEnclos(listeEnclos.get(choiceIndex),listeEnclos.get(choiceIndex2), listeAnimal.get(choiceIndexAnimal));*/
		        break;
		    case "q":
		    	loop = false;
		    	System.out.println("Bye !");
		    	break;
		    } 
		}


	}

}
