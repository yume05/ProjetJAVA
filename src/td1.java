import java.util.Scanner;
import java.util.*;

public class td1 {
	
	public static void main (String[] args){
		/*
		 * Méthode main
		 */
		// Somme de deux entiers saisis par l'utilisateur
		Scanner sc = new Scanner(System.in);
		/*System.out.println ("Veuillez saisir deux nombres :");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int R = A + B;
		System.out.println("Résultat de la somme de "+A+" et de "+B+" est "+R);*/

		//Permutation
		/*float A, B, Z;
		System.out.println("Saisir A :");
		A = sc.nextFloat();
		System.out.println("Saisir B :");
		B = sc.nextFloat();
		A = B - A;
		B = B - A;
		A = A + B;
		System.out.println("A et B ont permuté !! A = "+A+" B = "+B);*/
		
		//Tarifs
		/*double prix;
		int age;
		System.out.println ("Saisir le prix du billet :");
		prix = sc.nextInt();
		System.out.println ("Saisir votre âge :");
		age = sc.nextInt();
		
		if (age <= 2){
			prix = 0;
			System.out.println("Gratuit !");
		} else {
			if (age <= 10){
				prix = prix/2;
				System.out.println("Le nouveau prix est de :"+prix);
			}else{
				if (age <=27 | age>= 70){
					prix = prix*0.9;
					System.out.println("Le nouveau prix est de :"+prix);;
				}else{
					System.out.println("Aucune réduction ! Dommage, vous payerez le prix fort !");
				}
			}
		}*/
		
		//Minimum
		/*float a, min;
		float myTab[] = new float[10];
		System.out.println("Saisir le 1er nombre :");
		min = sc.nextFloat();
		myTab[0] = min;
		for (int i = 2;i <= 10;i++)
		{
			System.out.println("Saisir le "+i+"eme nombre");
			a = sc.nextFloat();
			myTab[i-1] = a;
			if(a<min){
				min=a;
			}
		}
		System.out.println("Le nombre minimum de votre liste est donc :"+min);
		System.out.println("La liste des nombres : ");
		for (int i=0; i<=9;i++){
			System.out.println(myTab[i]);
		}*/
		
		
		//Changement de Base A FAIRE
		/*System.out.println("Saisir un nombre");
		int a = sc.nextInt();
		
		if(a=1){
			System.out.println("1");
		}else{
			int b;
			b = a/2
					
		}*/
		
		//Monnayeur
		int nb500, nb200, nb100, nb50, nb20, nb10, nb5, nb2, nb1= 0;
		System.out.println("Entrez un nombre entier :");
		int montant = sc.nextInt();
		
		while (montant >= 500){
		    montant = montant - 500;
		    nb500 = nb500 + 1;
		}

		while (montant >= 200){
		    montant = montant - 200;
		    nb200 = nb200 + 1;
		}

		while (montant >= 100){
		    montant = montant - 100;
		    nb100 = nb100 + 1;
		}
		while (montant >= 50){
		    montant = montant - 50;
		    nb50 = nb50 + 1;
		}
		while (montant >= 20){
		    montant = montant - 20;
		    nb20 = nb20 + 1;
		}
		while (montant >= 10){
		    montant = montant - 10;
		    nb10 = nb10 + 1;
		}
		while (montant >= 5){
		    montant = montant - 5;
		    nb5 = nb5 + 1;
		}
		while (montant >= 2){
		    montant = montant - 2;
		    nb2 = nb2 + 1;
		}
		while (montant >= 1){
		    montant = montant - 1;
		    nb1 = nb1 + 1;
		}

		System.out.println("Il faudra " + nb500 + " billets de 500, " + nb200 + " billets de 200, " + nb100 + " billets de 100, " + nb50 + " billets de 50, "
		+ nb20 + " billets de 20, " + nb10 + " billets de 10, " + nb5 + " billets de 5, " + nb2 + " pièces de 2, et " + nb1 + " pièces de 1.");
	
	}
	
}
