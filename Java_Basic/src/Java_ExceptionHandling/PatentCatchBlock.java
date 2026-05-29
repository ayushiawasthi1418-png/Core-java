package Java_ExceptionHandling;

public class PatentCatchBlock {
	
	public static void main(String[] args) {
		
		String name="shine";
		
		try {
			System.out.println(name.length());
			System.out.println(name.charAt(6));
		}catch(Exception e) {
			System.out.println("exception 1:"+e.getMessage());
		}finally{
			System.out.println("always exceute");
		}
	}

}
