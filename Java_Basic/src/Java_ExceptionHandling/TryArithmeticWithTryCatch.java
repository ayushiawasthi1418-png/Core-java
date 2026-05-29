package Java_ExceptionHandling;

public class TryArithmeticWithTryCatch {
	 
	public static void main(String[] args) {
		
		int a=15;
		int b=0;
		try {
			int c=a/b;
			System.out.println("C is"+ c);
		}catch(ArithmeticException e) {
			System.out.println("exception is"+ e.getMessage());
//			e.printStackTrace();
			
		}
		System.out.println("program is finished");
	}

}
