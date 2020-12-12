package Beginner.day42_OOP_Encapsulation;

public class AmericanAirLine {
	
	public static void main(String[] args) {
		
		EmployeeInfo hary = new EmployeeInfo();
			//	hary.Name = "Hary";   // private data is not visible outside the class
			hary.setName("Hary");
			
		//	System.out.println( hary.Name );  //  // private data is not visible outside the class
		
			System.out.println( hary.getName() ); // Hary
		
			hary.setSSN(1234546);
			System.out.println(hary.getSSN()); 
			
			hary.setAge( (byte) 20  );
			System.out.println( hary.getAge() );  
			
			hary.setSalary(120000);
			System.out.println( hary.getSalary()  );
		
			System.out.println("=======================================");
			
		EmployeeInfo Della = new EmployeeInfo();
			Della.setName( "Della" );
			Della.setAge( (byte)20 );
			Della.setSSN(777777);
			Della.setSalary( 2 );
			
		System.out.println( Della.getName() );
		System.out.println(Della.getSSN());
		System.out.println(Della.getAge());
		System.out.println( Della.getSalary() );
			
		System.out.println("=======================================");
		
		
		EmployeeInfo Rohan = new EmployeeInfo();
			Rohan.setInfo("Rohan", 3215672, (byte)20 , 150000);
		
			System.out.println(Rohan.getName());  //Rohan
			System.out.println(Rohan.getSSN());
			System.out.println(Rohan.getSalary());
		
		
		
		
			
		
	}

}
