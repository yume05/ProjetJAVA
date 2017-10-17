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
	Scanner scan = new Scanner(System.in);
	int choiceEnclos = 0;
	int choiceFutur = 0;
	int choiceAnimal = 0;
	int i = 0;
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
	
	public void transfererAnimal(){
		System.out.println("Choisir l'enclos d'origine");
		choiceEnclos = scan.nextInt();
		System.out.println("Choisir l'enclos vers qui transferer");
		choiceFutur = scan.nextInt();
		System.out.println("Les animaux de l'enclos :");
		List<Animal> liste= this.listeEnclos.get(choiceEnclos).listeAnimaux;
		for(Animal a : liste){
			System.out.println("-----------------"+i+" : ");
			System.out.println(a);
			i++;
		}
		if(this.listeEnclos.get(choiceEnclos).listeAnimaux.size() > 0 || this.listeEnclos.get(choiceEnclos).getNbrAnimaux()<=this.listeEnclos.get(choiceEnclos).getMaxAnimaux()){
			System.out.println("Il n'y à pas d'animaux !");
		}else{
			System.out.println("Choisir l'animal :");
			choiceAnimal = scan.nextInt();
			employer.transferAnimalEnclos(this.listeEnclos.get(choiceEnclos), this.listeEnclos.get(choiceFutur), liste.get(choiceAnimal));
		}
		
	}
	
	public void creerAnimal(int enclos){
		
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
	
	public void deteriorerEnclos(){
        for (MonEnclos enclos : this.getListeEnclos()) {
            enclos.deterioreEnclos();
        }
        System.out.println("Les enclos sont détériorer, il faut les entretenir !");
	}
	
	public static void main(String[] args) {
		
		// création d'une liste de String
		
		Employe employer = new Employe("Lisa", false, 20);
		MonZoo zoo = new MonZoo("Le zoo !", employer, 10);

		Scanner scan = new Scanner(System.in);
		int choice = 0;
		Boolean loop = true;
		int indice;
		
		do{
				System.out.println("\n\n          MENU");
		        System.out.println("--------------------------------------");
		        System.out.println("1 - Créer enclos");
		        System.out.println("2 - Supprimer enclos");
		        System.out.println("3 - Créer animal");
		        System.out.println("4 - Afficher les enclos et leurs animaux");
		        System.out.println("5 - Afficher le nombre d'enclos existant");
		        System.out.println("6 - Passez la main à l'employé !");
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
						
						if (zoo.getListeEnclos().size() < zoo.getMaxEnclos()) {
							MonEnclos a = new MonEnclos(nomEnclos, superficieEnclos, nbrMaxEnclos);
				            zoo.getListeEnclos().add(a);
				            System.out.println("Enclos créé !");
				        } else {
				            // TODO : throw exception
				            System.out.println("Erreur, vous avez dépassé le nombre maximum d'enclos créer.");
				            break;
				        }
						
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
						
						if (zoo.getListeEnclos().size() < zoo.getMaxEnclos()) {
							Voliere v = new Voliere(nomV, superficieV, nbrMaxV, hauteurV);
				            zoo.getListeEnclos().add(v);
				            System.out.println("Volière créé !");
				        } else {
				            // TODO : throw exception
				            System.out.println("Erreur, vous avez dépassé le nombre maximum d'enclos créer.");
				        }
						
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
						if (zoo.getListeEnclos().size() < zoo.getMaxEnclos()) {
							Aquarium c = new Aquarium(nomA, superficieA, nbrMaxA, profondeurA);
				            zoo.getListeEnclos().add(c);        
				            System.out.println("Aquarium créé !");
				        } else {
				            // TODO : throw exception
				            System.out.println("Erreur, vous avez dépassé le nombre maximum d'enclos créer.");
				        }
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
						indice = 0;
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
				case 6:
					System.out.println("VOUS ETES L'EMPLOYER");
					
					
					int choiceEnclos = 0;
					String choiceEmployer;
					Boolean loop1 = true;
					do{
						indice = 0;
						for(MonEnclos a : zoo.listeEnclos){
							System.out.println("--- "+indice+" "+a.getNom());
							indice++;
						}
						System.out.println("\n Que voulez vous faire ? :"+" \n"+
								"a: Examiner un enclos"+"\n"+
								"b: Nettoyer un enclos"+" \n"+
								"c: Nourir un enclos"+" \n"+
								"d: Transferer un animal"+" \n"+
								"q: Quit"+"\n");
						choiceEmployer = scan.next();
						switch (choiceEmployer){
							case "a":
									System.out.println("-----EXAMINER ENCLOS--------");
									if(zoo.listeEnclos.size() ==0){
										System.out.println("Creer d'abord un enclos !!");
										break;
									}
									System.out.println("Choisir un enclos :");
									choiceEnclos = scan.nextInt();
									employer.examinerEnclos(zoo.listeEnclos.get(choiceEnclos));
								break;
		
						    case "b":
						    		i = 0;
							    	System.out.println("---------NETTOYER UN ENCLOS------");
									if(zoo.listeEnclos.size() ==0){
										System.out.println("Creer d'abord un enclos !!");
										break;
									}
							    	System.out.println("Choisir un enclos :");
									choiceEnclos = scan.nextInt();
									employer.nettoyerEnclos(zoo.listeEnclos.get(choiceEnclos));
						        break;
						        
						    case "c":
						    		i = 0;
							    	System.out.println("---------NOURIR UN ENCLOS------");
									if(zoo.listeEnclos.size() ==0){
										System.out.println("Creer d'abord un enclos !!");
										break;
									}
							    	System.out.println("Choisir un enclos :");
									choiceEnclos = scan.nextInt();
									employer.nourirAnimauxEnclos(zoo.listeEnclos.get(choiceEnclos));
						        break;
						    case "d":
						    		i = 0;
							    	System.out.println("---------TRANSFERER ANIMAL------");
									if(zoo.listeEnclos.size()==0){
										System.out.println("Creer d'abord un enclos !!");
										break;
									}
							    	zoo.transfererAnimal();
									break;
						    case "q":
						    	System.out.println("Bye !");
						    	loop1 = true;
						    	break;
					    }
					}while(loop1 = true);
					break;
				case 9:
					System.out.println("Bye");
					loop = true;
				break;
					
			}
		}while(loop == true);
	}

}
