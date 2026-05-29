package Java_ExceptionHandling;

public class multiException {
	
	public static void main(String[] args) {
		
		String name="shine";
		
		try {
			System.out.println(name.length());
			System.out.println(name.charAt(5));
		}catch(NullPointerException e) {
			System.out.println("exception 1"+ e.getMessage());
		}catch(IndexOutOfBoundsException e) {
			System.out.println("exception 2"+ e.getMessage());
		}
	}

}
