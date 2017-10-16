package td41;
import java.lang.Thread;

public class Job3 implements Runnable {

	private String name;
	public Job3(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			for(int i = 0; i<10;i++){
				int random = (int)Math.round(Math.random() * ( 200 - 0 ));
				Thread.sleep(random);
				System.out.println(name);
			}
		} catch (Exception e){
			
		}
	}

}
