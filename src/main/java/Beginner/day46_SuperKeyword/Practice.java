package Beginner.day46_SuperKeyword;

class parent {
	
	public parent(int a) {
		System.out.println("A");
	}
	
	public parent(String b) {
		System.out.println("C");
	}
	
}

public class Practice extends parent {
			// sub             super
	
	public Practice() {
		super("A");
	}
	
	public static void main(String[] args) {
		Practice obj = new Practice();
		
	}
	
	
	

}
