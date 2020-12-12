package Beginner.day45_Inheritance;

import java.util.ArrayList;
import java.util.Arrays;

class credentials {
	
	 private String userName;   // admin
	 private String passWord;	// 123
	 
	public  credentials() {
		setuserName("admin");
		setpassWord("123");
	}
	
	 // getter: 
	 public String getuserName() {
		 return userName;
	 }
	 
	 public String getpassWord() {
		 return passWord;
	 }
	 
	 // setter:
	 public void setuserName(String userName) {
		 this.userName = userName;
	 }
	 
	 public void setpassWord(String passWord) {
		 this.passWord = passWord;
	 }
	 
	 public void setcredentials(String userName, String passWord ) {
		 //	this.userName = userName;
		 //	this.passWord = passWord;
		 	setuserName(userName);
		 	setpassWord(passWord);
	 }
	 
	 public void getInfo() {
			System.out.println( "username: " + getuserName() );
			System.out.println( "password: " + getpassWord() );
	 }	
}


public class EncapsulationsReveiw {
	
	public static void main(String[] args) {
		credentials Zlfy = new credentials();
		
		//	obj.userName = "Zlfy";   // private is only visible within the class
		//	obj.passWord = "123456"; // private is only visible within the class
		
		// read:
			Zlfy.setcredentials("Zlfy", "111");
		
			System.out.println( "username: "+Zlfy.getuserName() );
			System.out.println( "password: "+Zlfy.getpassWord() );
			
		credentials Ken = new credentials();
					Ken.setuserName("9876");
					Ken.setpassWord("nuri345");
			
			System.out.println( "username: "+Ken.getuserName());
			System.out.println( "password: "+Ken.getpassWord() );
			
		
		credentials Sean = new credentials();
			Sean.setcredentials("Sean", "456");
			Sean.setpassWord("789");
		
			Sean.getInfo();
			
			System.out.println("==============================================");
		
			credentials[]  users = { Zlfy, Ken, Sean };
				users[0].getInfo();
				users[1].getInfo();
				users[2].getInfo();
			
			System.out.println("==============================================");
			
		ArrayList<credentials>  CredentialsList =  new  ArrayList<>();
			CredentialsList.addAll( Arrays.asList( Zlfy, Ken, Sean) );
				
			for( credentials  each    :  CredentialsList ) {
					each.getInfo();
			}
			
			
		
		
	}

}
