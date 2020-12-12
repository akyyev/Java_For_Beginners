package Beginner.day41_initializerBlocks;


public class instanceBlockPractice {
		
	
	
		public String name ="Della";  //"Maggie" , "Daisy
		
		
		public instanceBlockPractice(){
			this(10);  // name = "John";
			name = "Daisy";
		//	this(10);  // constructor call has to be the first step
		}
		
		{
			name ="Maggie";
		}
		
		{
			name = "Declaration";
		}
		
		public instanceBlockPractice(int a) {
				name = "John";
		}
		
		public static void main(String[] args) {
			
			instanceBlockPractice obj = new instanceBlockPractice();
				obj.name = "Janet";
			System.out.println( obj.name );  //Della
			
			instanceBlockPractice obj2 = new instanceBlockPractice();
			System.out.println( obj2.name );  // Daisy
			
		
		}
	
	
	
	

}
