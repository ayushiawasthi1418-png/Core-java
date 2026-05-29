package ShallowCloning.java;

public class TestEmployee {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employe e1 = new Employe(1,"ram");
		Employe e2 = (Employe)e1.clone();
		
		e2.id=2;
		e2.name="Shyam";
		
		System.out.println(e1);
		System.out.println(e2);
		
	}

}
