package td41;

public class MyThread {

	public MyThread() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		/*Job1 j1 = new Job1();
		j1.run();
		Job2 j2 = new Job2();
		j2.run();*/
		Job3 j3 = new Job3("j3");
		Thread t1 = new Thread(j3);
		Job3 j4 = new Job3("j4");
		Thread t2 = new Thread(j4);
		Job3 j5 = new Job3("j5");
		Thread t3 = new Thread(j5);
		
		t1.start();
		
		t2.start();
		
		t3.start();
		
		
	}
}
