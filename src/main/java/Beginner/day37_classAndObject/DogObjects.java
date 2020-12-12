package Beginner.day37_classAndObject;

public class DogObjects {
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
			System.out.println( dog1.name  );  // null
		
			dog1.Breed ="Husky";
			dog1.Size = "small";
			dog1.color = "gray and white";
			dog1.name ="Holly";
			dog1.Gender = 'F';
			dog1.Age = 25;
			dog1.food = "Chicken";
			System.out.println( dog1.Breed  );  // husky
		
			dog1.getInfo();
		
			
		Dog dog2 = new Dog();
			dog2.Breed = "Pitbull";
			dog2.name = "lyka";
			dog2.color = "gray";
			dog2.Age = 3;
			dog2.Size = "large";
			dog2.Gender = 'M';
			dog2.food = "Sushi";
			dog2.getInfo();
			
			dog2.eat();
			
			dog1.eat();
			
			dog1.play();  
			dog2.play();
		
			
		//	String str = new String("Hello");
		//			str.toLowerCase();
		
			
			
			
	/*
	 Assignment:
	 	create a custom class for Employees
	 		
	 			attributes:	EmployeeName
	 						EmployeeID
	 						JobTitle
	 						SSN
	 						Gender
	 						Salary
	 						
	 			actions:
	 					getInfo
	 					
	 						
	 		
	 */
			
			
			
	}

}
