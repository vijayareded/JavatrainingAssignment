package program5;

public class StudentPortal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserRegistration registration=new UserRegistration();
		
		try {
			registration.registerUser("Ram", "india");
		} catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
	}

}


