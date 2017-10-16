package Biblio;

public class Library {

	private static final int MAX_BOOKS =20;
	private String name;
	private String address;
	private int max;
	int tableauBook[][][][] = new int[MAX_BOOKS][MAX_BOOKS][MAX_BOOKS][MAX_BOOKS];@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public void setTableauBook(int[][][][] tableauBook) {
		this.tableauBook = tableauBook;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
	

	/**
	 * Affiche tous les livres de la bibliothèque
	 */
	public void afficheBiblio (){
		for(int i = 0; i < tableauBook.length; i++)
		{
		  System.out.println("À l'emplacement " + i +" du tableau nous avons = " + tableauBook[i][i][i][i]);
		}
	}
	
	/**
	 * Ajoute un livre à la bibliothèque
	 * @param title
	 * @param author
	 * @param editor
	 * @param pageNb
	 */
	public void ajouteLivre(){
		int nb = tableauBook.length;
		nb++;
		System.out.println(nb);
		tableauBook[nb][nb][nb][nb]= this.title, this.author, this.editor, this.pageNb;
	}
	public Library() {
		// TODO Auto-generated constructor stub
	}
	
	
	


}
