package Java_ExceptionHandling;

public class testAccount {
	
	public static void main(String[] args) {
		
		Account a=new Account();
		a.setBalance(500.00);
		System.out.println("current balance: "+a.getBalance());
		
		a.withdraw(2000.00);
	}

}
