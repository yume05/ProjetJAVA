package Biblio;

public class Book {

	//Variables d'instances
	private String title;
	private String author;
	private String editor;
	private int pageNb;
	
	public Book(){
		
	}
	
	/**
	 * Constructeur avec paramètres
	 */
	public Book(String title, String author, String editor, int pageNb) {
		this.title = title;
		this.author = author;
		this.editor = editor;
		this.pageNb = pageNb;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public int getPageNb() {
		return pageNb;
	}

	public void setPageNb(int pageNb) {
		this.pageNb = pageNb;
	}

	/**
	 * Méthode permettant d'afficher le livre
	 */
	public void affiche(){
		System.out.println("Titre du livre : "+title);
		System.out.println("Auteur du livre : "+author);
		System.out.println("Editeur du livre : "+editor);
		System.out.println("Nombre de pages : "+pageNb);
	}
	
	/**
	 * Permet de vérifier si deux instances de Book sont égales
	 */
	/*public boolean equals(String a, String b){
		if(this..equals(a.getCenter()) && (this.radius == a.getRadius())){
			return true;
		}
		return false;
	}*/

}
