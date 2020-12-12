package Beginner.day43_JavaRecap;

public class LogIn {
	
	public static void main(String[] args) {
		
		Credentials Fatih = new Credentials();
		//	Ftih.username = "Fatih";  // instance variable username is private
		//	Ftih.password = "Чуприна"; // instance variable username is private
			
		//	System.out.println( Ftih.username );
		//	System.out.println( Ftih.password );
		
		
		// read:
			System.out.println(  Fatih.getUsername()  );
			System.out.println(  Fatih.getPassword() );
		
		// modify:
				Fatih.setUsername("Fatih");
				Fatih.setPassword("Чуприна");
				
		System.out.println(  Fatih.getUsername()  );
		System.out.println(  Fatih.getPassword() );
				
			
			
		
		
	}

}
