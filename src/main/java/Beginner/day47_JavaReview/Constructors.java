package Beginner.day47_JavaReview;

class Mike{
	
	public Mike() {
		System.out.println("Mike");
	}
	
}

class Resul extends Mike{
	
	public Resul() {
		//supert()  // Mike
		System.out.println("Resul");
	}
	
}

class Victoria extends Resul {
	
	public Victoria() {
		super();
		System.out.println("Victoria");
	}
	
}

public class Constructors {
	
	public static void main(String[] args) {
		
		Victoria obj = new Victoria();
		
		
	}

}
