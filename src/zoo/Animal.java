package zoo;

abstract class Animal extends MonEnclos implements AnimalInterface{

	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	//Variables d'instance
	protected String nom;
	protected Boolean sexe;
	protected String typeSexe;
	protected int poids;
	protected int taille;
	protected int age;
	//True == les indices sont tous à 100 % donc pas besoin de manger, dormir, ou être soigné
	private Boolean indiceFaim = true;
	private Boolean indiceSommeil = true;
	private Boolean indiceSante = true;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setSexe(Boolean sexe) {
		this.sexe = sexe;
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}
	public boolean isSexe(){
		return sexe;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	@Override
	public String toString() {
		if(this.isSexe()){
			typeSexe = "femelle";
		}else{
			typeSexe = "mâle";
		}
		String str = "Animal de la "+this.getClass() + "; sexe = "+typeSexe+"; nom ="+this.getNom()+"; age= "+this.getAge()+" ans; pèse ="+this.getPoids()+"kg; taille= "+this.getTaille()+"cm.";
		return str;
	}

	protected abstract void mangerVrai();
	protected abstract void deplacement();
	protected abstract void crier();
	
	/**
	 * L'animal peu être soigné si ca santé est à 0
	 */
	public void soigner(){
		if(this.indiceSante){
			System.out.println("Je suis malade !");
			this.indiceSante = false;
			System.out.println("Merci, je suis soigné !");
		}else{
			System.out.println("Je suis déjà soigné !");
		}
			
	}
	
	/**
	 * L'animal dort si il est réveiller
	 */
	public void dormir(){
		if(this.indiceSommeil){
			System.out.println("J'ai besoin de dormir, je m'endors !");
			this.indiceSommeil = false;
		} else {
			System.out.println("Je dors déjà...");
		}
	}
	
	/**
	 * L'animal se réveille si il dort
	 */
	public void seReveiller(){
		if(this.indiceSommeil == true){
			System.out.println("Je ne peux pas me réveiller, je ne suis pas entrain de dormir !");
		} else {
			System.out.println("Je me réveille...");
			this.indiceSommeil = true;
			this.indiceFaim = false;
		}
	}
	
	/**
	 * L'animal mange s'il à faim
	 */
	public void manger(){
		if(this.indiceFaim == true){
			System.out.println("Je ne veux pas manger, je n'ai pas faim ...");
		}else if(this.indiceSommeil == false){
			mangerVrai();
			this.indiceFaim = true;
		}
	}
	

}
