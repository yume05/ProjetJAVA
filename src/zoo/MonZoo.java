package zoo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.lang.reflect.*;;

public class MonZoo {

	public MonZoo(String nom, Employe employer, int maxEnclos) {
		// TODO Auto-generated constructor stub
		this.nom = nom;
		this.employer = employer;
		this.maxEnclos = maxEnclos;
		this.setListeEnclos(new ArrayList<Enclos>());
	}
	
	protected String nom;
	protected Employe employer;
	protected int maxEnclos;
	protected List<Enclos> listeEnclos =  new ArrayList<Enclos>();
	
	public List<Enclos> getListeEnclos() {
		return listeEnclos;
	}

	public void setListeEnclos(List<Enclos> listeEnclos) {
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
		/*System.out.println("Choisir l'enclos d'origine");
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
		}*/
		
	}
	
	public void creerAnimal(int enclos){
		//CREER METHODE AJOUT ANIMAL DANS ENCLOS
		//CHOIX ANIMAL
		//AFFICHE ENCLOS EN FONCTION DU TYPE DE LANIMAL
		//PUIS AJOUT
		//BIBLIOTHEQUE D'ANIMAUX PRE EXISTANT
		//RETIRER LAJOUT D'ANIMAUX
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
		Enclos enclos1  = this.listeEnclos.get(enclos);
		String mot = enclos1.recupClass();
		switch(mot){
		case "Baleine":
			Baleine b = new Baleine(nomAnimal, sexeA, poidsAnimal, tailleAnimal, ageAnimal);
			enclos1.ajoutAnimal(b);
			System.out.println("Bienvenue à toi dans notre zoo !");
			break;
		case "Requin":
			Requin r = new Requin(nomAnimal, sexeA, poidsAnimal, tailleAnimal, ageAnimal);
			enclos1.ajoutAnimal(r);
			System.out.println("Bienvenue à toi dans notre zoo !");
			break;
		case "Pingouin":
			Pingouin p = new Pingouin(nomAnimal, sexeA, poidsAnimal, tailleAnimal, ageAnimal);
			enclos1.ajoutAnimal(p);
			System.out.println("Bienvenue à toi dans notre zoo !");
			break;
		case "PoissonRouge":
			PoissonRouge pr = new PoissonRouge(nomAnimal, sexeA, poidsAnimal, tailleAnimal, ageAnimal);
			enclos1.ajoutAnimal(pr);
			System.out.println("Bienvenue à toi dans notre zoo !");
			break;
		case "Aigle":
			Aigle a = new Aigle(nomAnimal, sexeA, poidsAnimal, tailleAnimal, ageAnimal);
			enclos1.ajoutAnimal(a);
			System.out.println("Bienvenue à toi dans notre zoo !");
			break;
		case "Loup":
			Loup l = new Loup(nomAnimal, sexeA, poidsAnimal, tailleAnimal, ageAnimal);
			enclos1.ajoutAnimal(l);
			System.out.println("Bienvenue à toi dans notre zoo !");
			break;
		case "Ours":
			Ours o = new Ours(nomAnimal, sexeA, poidsAnimal, tailleAnimal, ageAnimal);
			enclos1.ajoutAnimal(o);
			System.out.println("Bienvenue à toi dans notre zoo !");
			break;
		case "Tigre":
			Tigre t = new Tigre(nomAnimal, sexeA, poidsAnimal, tailleAnimal, ageAnimal);
			enclos1.ajoutAnimal(t);
			System.out.println("Bienvenue à toi dans notre zoo !");
			break;
		}

		
		//monEnclos b = new monEnclos(nomAnimal, sexeA, poidsAnimal, tailleAnimal, ageAnimal);
		//	this.getListeEnclos().get(enclos).ajoutAnimal(b);
		//	System.out.println("Bienvenue à toi dans notre zoo !");
	}
	public void enleverEnclos(Enclos enclos){
		if (this.getListeEnclos().size() < this.getMaxEnclos()) {
            this.getListeEnclos().remove(enclos);
        } else {
            // TODO : throw exception
            System.out.println("Erreur, aucun enclos trouvé.");
        }
	}
	
	public void afficheNbreAnimaux (){
		int nbrAnimaux = 0;
		for (Enclos enclos : listeEnclos){
			nbrAnimaux += enclos.getNbrAnimaux();
		}
		System.out.println("Le nombre d'animaux dans le zoo est de : "+nbrAnimaux);
		System.out.println("Le nombre d'enclos dans le zoo est de : "+this.listeEnclos.size());
	}
	
	public void afficheAnimauxEnclos(){
		for (Enclos enclos : listeEnclos){
			System.out.println("\n -- "+enclos+"\n");
			ArrayList<Animal> a = enclos.listeAnimaux;
			for(Animal animal : a){
				System.out.println("	-- "+animal);
			}
		}
	}
	
	public void supprimerEnclos(){
		System.out.println("CHOISIR ENCLOS A SUPPRIMER");
		int i = 0;
		int choice;
		Scanner scan = new Scanner(System.in);
		for(Enclos a : listeEnclos){
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
		if(listeEnclos.size() > 0){
	        for (Enclos enclos : this.getListeEnclos()) {
	            enclos.deterioreEnclos();
	        }
	        System.out.println("Message de la voix du zoo : \"Les enclos sont détériorés, il faut les entretenir !\"\n");
		}
	}
	
	public void randomAll(){
		this.deteriorerEnclos();
		for(Enclos enclos : this.listeEnclos){
			enclos.randomAnimaux();
		}
	}
	public static void main(String[] args) {
		
		// création d'une liste de String
		Employe employer = new Employe("Lisa", false, 20);
		MonZoo zoo = new MonZoo("Aux pays des Nanimaux !", employer, 20);
		Baleine b1 = new Baleine("Petite bleue", false, 5000, 5, 3);
		Baleine b2 = new Baleine("Petite blanche", false, 6000, 5, 2);
		Loup l1 = new Loup("Lilou", true, 40, 30, 2);
		Loup l2 = new Loup("Lou", false, 40, 20, 3);
		Aquarium<Baleine> a1 = new Aquarium<Baleine>("Les Baleines", 32, 5, 9);
		EnclosTerrestre<Loup> loup = new EnclosTerrestre<Loup>("Les Loup", 32, 5);
		zoo.getListeEnclos().add(a1);
		zoo.getListeEnclos().add(loup);
		loup.ajoutAnimal(l2);
		loup.ajoutAnimal(l1);
		a1.ajoutAnimal(b1);
		Scanner scan = new Scanner(System.in);
		int choiceEnclos = 0;
		int choiceFutur = 0;
		int choiceAnimal = 0;
		int i = 0;
		String especeEnclos;
		int choice = 0;
		Boolean loop = true;
		int indice;
		System.out.println("Bienvenue dans le zoo  \""+zoo.getNom()+"\"");
		System.out.println("___________________________________________\n");
		do{
				System.out.println("\n\n          QUE VOULEZ VOUS FAIRE ? \n");
		        System.out.println("********************************************");
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
					i = 0;
					System.out.println("1 - ENCLOS Terrestre");
				    System.out.println("2 - VOLIERE");
				    System.out.println("3 - AQUARIUM");
				    choice = scan.nextInt();
				    switch(choice){
				    case 1 :
				    	System.out.println("Entrer un nom d'enclos :");
						String nomEnclos = scan.next();
						scan.nextLine();
				    	System.out.println("Entrer une superficie d'enclos :");
						int superficieEnclos = scan.nextInt();
						System.out.println("Entrer un nombre maximum d'animaux :");
						int nbrMaxEnclos= scan.nextInt();
						System.out.println("Choississez l'espèce d'animal qu'aura cet enclos :");
						System.out.println("T pour tigre, O pour ours, L pour loup...");
						especeEnclos = scan.next();
						scan.nextLine();
						if (zoo.getListeEnclos().size() < zoo.getMaxEnclos()) {
							//EnclosTerrestre<Tigre> 
							if(especeEnclos == "T"){
								EnclosTerrestre<Tigre> a = new EnclosTerrestre<Tigre>(nomEnclos, superficieEnclos, nbrMaxEnclos);
					            zoo.getListeEnclos().add(a);
					            System.out.println("Enclos créé !");
					            break;
							}else
								if(especeEnclos == "O"){
									EnclosTerrestre<Ours> a = new EnclosTerrestre<Ours>(nomEnclos, superficieEnclos, nbrMaxEnclos);
						            zoo.getListeEnclos().add(a);
						            System.out.println("Enclos créé !");
						            break;
								}else
									if(especeEnclos == "L"){
										EnclosTerrestre<Loup> a = new EnclosTerrestre<Loup>(nomEnclos, superficieEnclos, nbrMaxEnclos);
							            zoo.getListeEnclos().add(a);
							            System.out.println("Enclos créé !");
							            break;
									}
								
							
							System.out.println("Erreur !!");
							break;
							
				        } else {
				            // TODO : throw exception
				            System.out.println("Erreur, vous avez dépassé le nombre maximum d'enclos créer.");
				            break;
				        }
	
				    case 2:
				    	System.out.println("Entrer un nom de volière :");
						String nomV = scan.next();
						scan.nextLine();
						System.out.println("Entrer une superficie d'enclos :");
						int superficieV = scan.nextInt();
						System.out.println("Entrer un nombre maximum d'animaux :");
						int nbrMaxV = scan.nextInt();
						System.out.println("Entrer l'hauteur de la volière :");
						int hauteurV = scan.nextInt();
						System.out.println("Choississez l'espèce d'animal qu'aura cet enclos :");
						System.out.println("A pour aigle...");

						especeEnclos = scan.nextLine();
						System.out.println(especeEnclos);
						if (zoo.getListeEnclos().size() < zoo.getMaxEnclos()) {
							
							if(especeEnclos == "A"){
								Voliere<Aigle> v = new Voliere<Aigle>(nomV, superficieV, nbrMaxV, hauteurV);
					            zoo.getListeEnclos().add(v);
					            System.out.println("Volière créé !");
					            break;
							}else{
								System.out.println("Erreur !!");
								break;
							}
							
				        } else {
				            // TODO : throw exception
				            System.out.println("Erreur, vous avez dépassé le nombre maximum d'enclos créer.");
				        }
				    	break;
				    case 3:
						System.out.println("Entrer un nom d'aquarium :");
						String nomA = scan.next();
						System.out.println("Entrer une superficie d'enclos :");
						scan.nextLine();
						int superficieA = scan.nextInt();
						System.out.println("Entrer un nombre maximum d'animaux :");
						int nbrMaxA = scan.nextInt();
						System.out.println("Entrer une profondeur :");
						int profondeurA = scan.nextInt();
						System.out.println("Choississez l'espèce d'animal qu'aura cet enclos :");
						System.out.println("B pour baleine, P pour pingouin, E pour poisson rouge, R pour requin...");
						scan.nextLine();
						especeEnclos = scan.next();
						if (zoo.getListeEnclos().size() < zoo.getMaxEnclos()) {
							if(especeEnclos == "B"){
								Aquarium<Baleine> c = new Aquarium<Baleine>(nomA, superficieA, nbrMaxA, profondeurA);
					            zoo.getListeEnclos().add(c);        
					            System.out.println("Aquarium créé !");
					            break;
							} else if(especeEnclos == "P"){
								Aquarium<Pingouin> c = new Aquarium<Pingouin>(nomA, superficieA, nbrMaxA, profondeurA);
					            zoo.getListeEnclos().add(c);        
					            System.out.println("Aquarium créé !");
					            break;
							} else if(especeEnclos == "E"){
								Aquarium<PoissonRouge> c = new Aquarium<PoissonRouge>(nomA, superficieA, nbrMaxA, profondeurA);
					            zoo.getListeEnclos().add(c);        
					            System.out.println("Aquarium créé !");
					            break;
							} else if(especeEnclos == "R"){
								Aquarium<Requin> c = new Aquarium<Requin>(nomA, superficieA, nbrMaxA, profondeurA);
					            zoo.getListeEnclos().add(c);        
					            System.out.println("Aquarium créé !");
					            break;
							}else{
								System.out.println("Erreur !!");
								break;
							}
							
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
						for(Enclos a : zoo.listeEnclos){
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
					
					
					choiceEnclos = 0;
					String choiceEmployer;
					Boolean loop1 = true;
					do{
						indice = 0;
						for(Enclos a : zoo.listeEnclos){
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
									if(zoo.listeEnclos.size() == 0){
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
			System.out.println("\n\n");
			zoo.randomAll();
		}while(loop == true);
	}

}
