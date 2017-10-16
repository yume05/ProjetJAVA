package TD3;

/**
 * Classe TestCircle permet de tester la classe Circle
 * @author camille
 *
 */
public class TestCircle {

	public TestCircle() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Point point = new Point(5,5);
		Circle Circle1 = new Circle(point, 2);
		Point point1 = new Point(2,3);
		Circle Circle2 = new Circle(point1,3);
		
		System.out.println("Surface du cercle 1 est : " + Circle1.area());
		System.out.println("Le périmetre du cercle 1 est : " + Circle1.perimeter()); 
		System.out.println("Surface du cercle 2 est : " + Circle2.area());
		System.out.println("Le périmetre du cercle 2 est : " + Circle2.perimeter());
		System.out.println("Est ce que les cercles sont égaux ? :" + Circle1.equals(Circle2));

	} 

}
