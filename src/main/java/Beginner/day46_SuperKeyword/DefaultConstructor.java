package Beginner.day46_SuperKeyword;

class B {
	
	public B() {
		System.out.println("super");
	}
}

public class DefaultConstructor extends B{
	//				sub                 super
	 
	public DefaultConstructor(){
				// super
		System.out.println("Sub"); // sub
		
	}
	
	public static void main(String[] args) {
		DefaultConstructor obj = new DefaultConstructor();
		
		
	}
	
}
