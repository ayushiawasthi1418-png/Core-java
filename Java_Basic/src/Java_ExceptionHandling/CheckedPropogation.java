package Java_ExceptionHandling;

public class CheckedPropogation {
	
	public static void main(String[] args) throws Exception {
		dad();
	}
	public static void dad(){
		try {
		mom();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	public static void mom() throws Exception{
		child();
	}
	public static void child() throws Exception {
		Exception e = new Exception("make a mistake");
		throw e;
	}

}
