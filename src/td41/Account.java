package td41;

public class Account {

	public Account() {
		// TODO Auto-generated constructor stub
		System.out.println(balance);
	}
	
	private double balance = 100;
	
	/**
	 * Permet de faire un retrait
	 * @param amount
	 */
	public void withdraw(int amount){
		System.out.println("Valeur de votre compte : "+balance);
		balance = balance - amount;
		System.out.println("Valeur de votre compte : "+balance);
	}

}
