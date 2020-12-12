package Beginner.day41_initializerBlocks;

public class InstanceBlock {
		
		{
			System.out.println("instance block 1");
		}
		
		{
			System.out.println("instance block 3");
		}
		
		{
			System.out.println("instance block 2");
		}
		
		public InstanceBlock(){
			System.out.println("Constructor");
		}
		
		
		public static void main(String[] args) {
			
			InstanceBlock obj = new InstanceBlock();  // ins Cons
			InstanceBlock obj2 = new InstanceBlock(); // ins   cons
			//InstanceBlock obj3 = new InstanceBlock(); // ins  cons
			
		}
	
}
