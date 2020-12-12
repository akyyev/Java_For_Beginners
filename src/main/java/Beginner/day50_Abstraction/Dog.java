package Beginner.day50_Abstraction;

public class Dog extends Animal{
	
	public Dog(char Gender, byte Age, String color, String NickName) {
		super(Gender, Age, color, NickName);
	}

	// Dog obj = new Dog('F', 5, "Red","Ace");	
	
	@Override
	public  void  Speak(String languge) {
		System.out.println(Nickname + " is speaking "+languge);
	}

	@Override
	public void Eat(String food) {
		System.out.println(Nickname +" is eating "+food);
	}

	@Override
	public void Sleep(int hour) {
		System.out.println( Nickname+" sleeps "+hour+" hours");
	}

	@Override
	public void Drink(String drinks) {
		System.out.println(Nickname+" drinks "+drinks);
	}
	
	
	
}
