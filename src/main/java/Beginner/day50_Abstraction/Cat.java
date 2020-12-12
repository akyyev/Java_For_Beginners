package Beginner.day50_Abstraction;

public class Cat extends Animal{
	
	
	public Cat(char Gender, byte Age, String color, String NickName) {
		super(Gender, Age, color, NickName );
	}
	// Cat mycat = new Cat(Gender, Age, color, NickName);
	
	@Override
	public void Speak(String languge) {
		System.out.println(Nickname+" speask "+languge+" Language");
	}

	@Override
	public void Eat(String food) {
		System.out.println(Nickname+" eats "+food);
	}

	@Override
	public void Sleep(int hour) {
		System.out.println(Nickname+" sleeps "+hour+" hours");
	}

	@Override
	public void Drink(String drinks) {
		System.out.println(Nickname+" drinks "+drinks);
	}

	
	
	
	
	

}
