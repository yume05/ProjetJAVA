package td41;

public class JulietteAndRomeoJob implements Runnable {

	public JulietteAndRomeoJob() {
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		
		JulietteAndRomeoJob romeoJob = new JulietteAndRomeoJob();
		JulietteAndRomeoJob julietteJob = new JulietteAndRomeoJob();
		
		Thread t1 = new Thread(romeoJob);
		Thread t2 = new Thread(julietteJob);
		
		t1.start();
		t2.start();
	
	}
	
	Account account = new Account();
	@Override
	public void run() {
		try{
			// TODO Auto-generated method stub
			for (int i=0; i<10;i++){
				account.withdraw(10);
			}
		}catch(Exception e){
			
		}
	}
	
	private Account name;
	

	public Account getName() {
		return name;
	}

	public void setName(Account name) {
		this.name = name;
	}


	
	public void doWithdraw(int amount){
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){
			System.out.println("got interrupted !");
		}
		account.withdraw(amount);
		System.out.println("Nom du thread : "+Thread.currentThread().getName());
	}

}
