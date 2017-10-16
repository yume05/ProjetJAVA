package TD3;

/**
 * La classe TestPoint contient une méthode 
 * principale qui créer plusiurs objets
 * de type Point
 * @author camille
 *
 */
public class TestPoint {
	
	/**
	 * Test de la classe Point 
	 * @param args
	 */
	public static void main(String[] args) {
		Point point = new Point();
		Point point2 = new Point(2,3);
		System.out.println("vos points de départ P1 = "+ point +" et P2 = "+ point2 + ".");
		point.move(3.0, 9.0);
		point2.move(0.0, 0.0);
		System.out.println("vos points de d'arrivé P1 = "+ point +" et P2 = "+ point2 + ".");
		point.translate(2.0, 3.0);
		System.out.println("Point 1 après translation :" + point);
	} 

}
