package Beginner.day43_JavaRecap;

import java.util.Arrays;

public class InstanceBlock {
	
	String[] names = new String[3];
	
	{
		System.out.println("Instance block");
			names[0] = "Alla";
			names[2] = "Sean";
			names[1] = "Hugo";
		
		// names[3] = "Rose";
	}
	
	public InstanceBlock() {
		System.out.println("Constructor");
		names[0] = "Reece";
		names[2] = "Gulmila";
		names[1] = "Esma";
	}
	
	public static void main(String[] args) {	
		InstanceBlock obj = new InstanceBlock();
		
		System.out.println("Main method");
		System.out.println(Arrays.toString( obj.names) );
		
		
		InstanceBlock obj2 = new InstanceBlock();
		
		
		
	}
	
	

}
