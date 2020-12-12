package Beginner.day37_classAndObject;

public class Dog {
	
	/*
	  Dog
	 	Attributes/data:
			breed, size, age, color, name, gender

		actions:
			eat, sleep, bark, play ...
	 */

		String	Breed;	
		String	Size;
		byte	Age;
		String	color;
		String name;
		char  Gender;
		String food;
		
		
	public void getInfo() {
		System.out.println(Breed +" " + Size + ", " 
					+ Age+" years old, "+color+", Gender is "+Gender+", Name is "+name);
			
	}
		
	
	public void eat() {
		System.out.println(name +" is eating "+food);
	}
	
	
	public void play() {
		System.out.println(Breed+" is playing");
	}
	
	

}
