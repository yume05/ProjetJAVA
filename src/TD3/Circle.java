package TD3;
/**
 * La classe Circle permet de représenter un cercle
 * Point center, Double radius
 * @author camille
 *
 */
public class Circle {

	//Coordonnées par défaut 
	private static final double CONST_RAD = 1.0;
	private static final Point CONST_POINT = new Point();
	
	//Variables d'instances 
	private Point center;
	private double radius;
	

	/**
	 * Constructeur sans paramètres
	 */
	public Circle() {
		this(CONST_POINT, CONST_RAD);
	}

	/**
	 * Constructeur avec paramètres
	 * @param point
	 * @param radius
	 */
	public Circle(Point point, double radius) {
		this.center = point;
		this.radius = radius;
	}
	
	//Accesseurs et mutateurs associés
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * Permet de calculer la surface
	 * @return
	 */
	public double area(){
		return Math.PI*this.radius*this.radius;
	}
	
	/**
	 * Permet de calculer son périmètre
	 * @return
	 */
	public double perimeter(){
		return Math.PI*this.radius*2;
	}

	/**
	 * Permet de savoir son égaliter avec un autre cercle
	 */
	public boolean equals(Object obj){
		Circle a = (Circle)obj;
		if(this.center.equals(a.getCenter()) && (this.radius == a.getRadius())){
			return true;
		}
		return false;
	}
}
