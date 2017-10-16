package TD3;
/**
 * Classe permettant de manipuler un point
 * @author camille
 *
 */
public class Point {
	
	//Coordonnées par défaut
	private static final double DFL_X = 0.0;
	private static final double DFL_Y = 0.0;

	//Variables d'instances coordonnées x et y
	private double x;
	private double y;

	/**
	 * Constructeur sans parametres
	 */
	public Point() {
		this(DFL_X, DFL_Y);
	}
	
	/**
	 * Usage : new Point(2.0, 3.14);
	 * Constructeur avec parametre
	 * @param x
	 * @param y
	 */
	public Point(double x, double y) {
		this.move(x,y);
	}
	
	
	public boolean equals(Object obj){
		Point a = (Point)obj;
		if(this.x == a.getX() && (this.y == a.getY())){
			return true;
		}
		return false;
	}
	

	
	//Accesseurs et mutateurs
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	/**
	 * Retourne une chaine de caractères au format '(x,y)'
	 */
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	public void move(double newX, double newY){
		this.setX(newX);
		this.setY(newY);
	}
	
	/**
	 * Méthode move effectue une translation
	 *  (changement de valeur par d'autre)
	 * @param point
	 */
	public void move(Point point){
		this.move(point.x, point.y);
	}
	
	/**
	 * Méthode permettant de rajouter une valeur à nos coordonnées
	 * @param x
	 * @param y
	 */
	public void translate (double x, double y) {
		this.x += x;
		this.y += y;
	}
	
	public void translate (Point point) {
		this.translate(point.x, point.y);
	}
	
}
