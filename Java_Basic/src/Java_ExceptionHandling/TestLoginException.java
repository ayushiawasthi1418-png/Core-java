package Java_ExceptionHandling;

public class TestLoginException {
	
public static void main(String[] args) {
		
		String login="admin123";
		
		if(login=="admin123") {
			System.out.println("user found");
		}else {
			//try {
				throw new LoginException();
//			}catch(LoginException e){
//				
//				System.out.println(e.getMessage());
//				
//			}
		}
		
	}

}
