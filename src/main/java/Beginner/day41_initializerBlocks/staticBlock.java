package Beginner.day41_initializerBlocks;

public class staticBlock {
	
	public staticBlock() {
		System.out.println("Constructor");
	}
	
	
	
	public static void main(String[] args) {
		
		staticBlock obj1 = new staticBlock();
		staticBlock obj2 = new staticBlock();
		staticBlock obj3 = new staticBlock();
		staticBlock obj4 = new staticBlock();
		staticBlock obj5 = new staticBlock();
		
		 System.out.println("Main method");
		
	}
	
	static {
		System.out.println("static block2");
	}
	
	static {
		System.out.println("static block1");
		//System.out.println("static block B");
	}
	
	
	
	
	

}
