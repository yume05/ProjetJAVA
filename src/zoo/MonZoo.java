package zoo;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MonZoo {

	public MonZoo(String nom, Employe employer, int maxEnclos) {
		// TODO Auto-generated constructor stub
		this.nom = nom;
		this.employer = employer;
		this.maxEnclos = maxEnclos;
		this.setListeEnclos(new ArrayList<MonEnclos>());
	}
	
	protected String nom;
	protected Employe employer;
	protected int maxEnclos;
	protected List<MonEnclos> listeEnclos =  new ArrayList<MonEnclos>();
	
	public List<MonEnclos> getListeEnclos() {
		return listeEnclos;
	}

	public void setListeEnclos(List<MonEnclos> listeEnclos) {
		this.listeEnclos = listeEnclos;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Employe getEmployer() {
		return employer;
	}

	public void setEmployer(Employe employer) {
		this.employer = employer;
	}

	public int getMaxEnclos() {
		return maxEnclos;
	}

	public void setMaxEnclos(int maxEnclos) {
		this.maxEnclos = maxEnclos;
	}

	public void creerAnimal(int enclos){
		Scanner scan = new Scanner(System.in);
		System.out.println("VOTRE ANIMAL :");
		System.out.println("Entrer son nom :");
		String nomAnimal = scan.next();
		System.out.println("Entrer son sexe (F/M) :");
		String sexeAnimal = scan.next();
		Boolean sexeA = false;
		if(sexeAnimal == "F"){
			sexeA = true;
		}
		System.out.println("Entrer son poids :");
		int poidsAnimal = scan.nextInt();
		System.out.println("Entrer sa taille :");
		int tailleAnimal = scan.nextInt();
		System.out.println("Entrer son age :");
		int ageAnimal = scan.nextInt();
		System.out.println("Choisir l'espèce :");
		System.out.println("1 - Baleine");
		System.out.println("2 - Requin");
		System.out.println("3 - Pingouin");
		System.out.println("4 - Poisson Rouge");
		System.out.println("5 - Aigle");
		System.out.println("6 - Loup");
		System.out.println("7 - Ours");
		System.out.println("8 - Tigre");
		int espece = scan.nextInt();
		
		switch(espece){
		case 1:
			Baleine b = new Baleine(nomAnimal, sexeA, poidsAnimal, tailleAnimal, ageAnimal);
			this.getListeEnclos().get(enclos).ajoutAnimal(b);
			System.out.println("Bienvenue à toi dans notre zoo !");
			break;
		case 2:
			Requin r = new Requin(nomAnimal, sexeA, poidsAnimal, tailleAnimal, ageAnimal);
			this.getListeEnclos().get(enclos).ajoutAnimal(r);
			System.out.println("Bienvenue à toi dans notre zoo !");
			break;
		case 3:
			Pingouin p = new Pingouin(nomAnimal, sexeA, poidsAnimal, tailleAnimal, ageAnimal);
			this.getListeEnclos().get(enclos).ajoutAnimal(p);
			System.out.println("Bienvenue à toi dans notre zoo !");
			break;
		case 4:
			PoissonRouge pr = new PoissonRouge(nomAnimal, sexeA, poidsAnimal, tailleAnimal, ageAnimal);
			this.getListeEnclos().get(enclos).ajoutAnimal(pr);
			System.out.println("Bienvenue à toi dans notre zoo !");
			break;
		case 5:
			Aigle a = new Aigle(nomAnimal, sexeA, poidsAnimal, tailleAnimal, ageAnimal);
			this.getListeEnclos().get(enclos).ajoutAnimal(a);
			System.out.println("Bienvenue à toi dans notre zoo !");
			break;
		case 6:
			Loup l = new Loup(nomAnimal, sexeA, poidsAnimal, tailleAnimal, ageAnimal);
			this.getListeEnclos().get(enclos).ajoutAnimal(l);
			System.out.println("Bienvenue à toi dans notre zoo !");
			break;
		case 7:
			Ours o = new Ours(nomAnimal, sexeA, poidsAnimal, tailleAnimal, ageAnimal);
			this.getListeEnclos().get(enclos).ajoutAnimal(o);
			System.out.println("Bienvenue à toi dans notre zoo !");
			break;
		case 8:
			Tigre t = new Tigre(nomAnimal, sexeA, poidsAnimal, tailleAnimal, ageAnimal);
			this.getListeEnclos().get(enclos).ajoutAnimal(t);
			System.out.println("Bienvenue à toi dans notre zoo !");
			break;
		}
	}
	public void enleverEnclos(MonEnclos enclos){
		if (this.getListeEnclos().size() < this.getMaxEnclos()) {
            this.getListeEnclos().remove(enclos);
        } else {
            // TODO : throw exception
            System.out.println("Erreur, aucun enclos trouvé.");
        }
	}
	
	public void afficheNbreAnimaux (){
		int nbrAnimaux = 0;
		for (MonEnclos enclos : listeEnclos){
			nbrAnimaux += enclos.getNbrAnimaux();
		}
		System.out.println("Le nombre d'animaux dans le zoo est de : "+nbrAnimaux);
	}
	
	public void afficheAnimauxEnclos(){
		for (MonEnclos enclos : listeEnclos){
			System.out.println(enclos.getNom());
			List<Animal> a = enclos.listeAnimaux;
			for(Animal animal : a){
				System.out.println(animal);
			}
		}
	}
	
	public void supprimerEnclos(){
		System.out.println("CHOISIR ENCLOS A SUPPRIMER");
		int i = 0;
		int choice;
		Scanner scan = new Scanner(System.in);
		for(MonEnclos a : listeEnclos){
			System.out.println("--- "+i);
			System.out.println(a.getNom());
			i++;
		}
		
		choice = scan.nextInt();
		System.out.println("Cet enclos va etre supprimer avec ces animaux ! Sur ? y/n");
		String choix = scan.nextLine();
		if(choix =="y"){
			System.out.println("Suppression...");
			this.enleverEnclos(listeEnclos.get(choice));
			listeEnclos.get(choice).listeAnimaux.clear();
		}
	}
	public static void main(String[] args) {
		
		// création d'une liste de String
		
		Employe employer = new Employe("Lisa", false, 20);
		MonZoo zoo = new MonZoo("Le zoo !", employer, 10);

		Scanner scan = new Scanner(System.in);
		int choice = 0;
		int choiceIndex2;
		int choiceIndexAnimal;
		Boolean loop = true;
		
		do{
				System.out.println("\n\n          MENU");
		        System.out.println("--------------------------------------");
		        System.out.println("1 - Créer enclos");
		        System.out.println("2 - Supprimer enclos");
		        System.out.println("3 - Créer animal");
		        System.out.println("4 - Afficher les enclos et leurs animaux");
		        System.out.println("5 - Afficher le nombre d'enclos existant");
		        System.out.println("9 - Quitter");
		        System.out.print("\nSelect a Menu Option: ");
		        choice = scan.nextInt();
			switch (choice){
				case 1:
					int i = 0;
					System.out.println("1 - ENCLOS");
				    System.out.println("2 - VOLIERE");
				    System.out.println("3 - AQUARIUM");
				    choice = scan.nextInt();
				    switch(choice){
				    case 1 :
				    	System.out.println("Entrer un nom d'enclos :");
						String nomEnclos = scan.next();
				    	System.out.println("Entrer une superficie d'enclos :");
						int superficieEnclos;
						superficieEnclos = scan.nextInt();
						System.out.println("Entrer un nombre maximum d'animaux :");
						int nbrMaxEnclos;
						nbrMaxEnclos= scan.nextInt();
						MonEnclos a = new MonEnclos(nomEnclos, superficieEnclos, nbrMaxEnclos);
						if (zoo.getListeEnclos().size() < zoo.getMaxEnclos()) {
				            zoo.getListeEnclos().add(a);
				        } else {
				            // TODO : throw exception
				            System.out.println("Erreur, vous avez dépassé le nombre maximum d'enclos créer.");
				            break;
				        }
						System.out.println("Enclos créé !");
				    break;
	
				    case 2:
				    	System.out.println("Entrer un nom de volière :");
						String nomV = scan.next();
						System.out.println("Entrer une superficie d'enclos :");
						int superficieV = scan.nextInt();
						System.out.println("Entrer un nombre maximum d'animaux :");
						int nbrMaxV = scan.nextInt();
						System.out.println("Entrer l'hauteur de la volière :");
						int hauteurV = scan.nextInt();
						Voliere v = new Voliere(nomV, superficieV, nbrMaxV, hauteurV);
						if (zoo.getListeEnclos().size() < zoo.getMaxEnclos()) {
				            zoo.getListeEnclos().add(v);
				        } else {
				            // TODO : throw exception
				            System.out.println("Erreur, vous avez dépassé le nombre maximum d'enclos créer.");
				        }
						System.out.println("Volière créé !");
				    	break;
				    case 3:
				    	
						System.out.println("Entrer un nom d'aquarium :");
						String nomA = scan.next();
						System.out.println("Entrer une superficie d'enclos :");
						int superficieA = scan.nextInt();
						System.out.println("Entrer un nombre maximum d'animaux :");
						int nbrMaxA = scan.nextInt();
						System.out.println("Entrer une profondeur :");
						int profondeurA = scan.nextInt();
						Aquarium c = new Aquarium(nomA, superficieA, nbrMaxA, profondeurA);
						if (zoo.getListeEnclos().size() < zoo.getMaxEnclos()) {
				            zoo.getListeEnclos().add(c);
				        } else {
				            // TODO : throw exception
				            System.out.println("Erreur, vous avez dépassé le nombre maximum d'enclos créer.");
				        }
						System.out.println("Aquarium créé !");
						break;
				    }
					break;
				case 2:
					if(zoo.listeEnclos.size() ==0){
						System.out.println("Creer d'abord un enclos !!");
						break;
					}
						zoo.supprimerEnclos();
						break;
					
				case 3:
					System.out.println("CREER ANIMAL");
					if(zoo.listeEnclos.size() ==0){
						System.out.println("Creer d'abord un enclos !!");
						break;
					}
						System.out.println("Choisir un enclos");
						int indice = 0;
						for(MonEnclos a : zoo.listeEnclos){
							System.out.println("--- "+indice);
							System.out.println(a.getNom());
							indice++;
						}
						int enclos = scan.nextInt();
						
						zoo.creerAnimal(enclos);
						
						break;
					
				case 4:
					if(zoo.listeEnclos.size() ==0){
						System.out.println("Creer d'abord un enclos !!");
						break;
					}
						zoo.afficheAnimauxEnclos();
						break;
					
				case 5:
					if(zoo.listeEnclos.size() ==0){
						System.out.println("Creer d'abord un enclos !!");
						break;
					}
						zoo.afficheNbreAnimaux();
						break;
					
			}
		}while(loop == true);
		/*do{
			int i=0;
			System.out.println("Liste des enclos :");
			for(MonEnclos a : listeEnclos){
				System.out.println("--- "+i);
				System.out.println(a.getNom());
				i++;
			}
			System.out.println("*********** MENU ***********");
			System.out.println("Que voulez vous faire :"+" \n"+
					"a: Examiner un enclos"+"\n"+
					"b: Nettoyer un enclos"+" \n"+
					"c: Nourir un enclos"+" \n"+
					"d: Transferer un animal"+" \n"+
					"q: Quit"+"\n");
			choice = scan.nextLine();
		switch (choice){
			case "a":
					System.out.println("-----EXAMINER ENCLOS--------");
					System.out.println("Choisir un enclos :");
					choiceIndex = scan.nextInt();
					employer.examinerEnclos(listeEnclos.get(choiceIndex));
				break;

		    case "b":
		    		i = 0;
			    	System.out.println("---------NETTOYER UN ENCLOS------");
			    	System.out.println("Choisir un enclos :");
					choiceIndex = scan.nextInt();
					employer.nettoyerEnclos(listeEnclos.get(choiceIndex));
		        break;
		        
		    case "c":
		    		i = 0;
			    	System.out.println("---------NOURIR UN ENCLOS------");
			    	System.out.println("Choisir un enclos :");
					choiceIndex = scan.nextInt();
					employer.nourirAnimauxEnclos(listeEnclos.get(choiceIndex));
		       
		        break;
		    case "d":
		    		i = 0;
			    	System.out.println("---------TRANSFERER ANIMAL------");
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
		       /* break;
		    case "q":
		    	System.out.println("Bye !");
		    	loop = false;
		    	break;
		    } 
		}while(loop == true);*/
	}


}
