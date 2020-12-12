package Beginner.day22_NestedLoop;

public class WarmUp {
	/*
	 1. write a program which prints out the numbers from 1 to 30:
		1. for numbers which are divisible by 3, print "FIN" instead of the number.
		2. for numbers which are divisible by 5, print "RA" instead of the number
		3. for numbers which are a divisible by both 3 and 5, print "FFINRA" instead of the number
				DO NOT USE FOR LOOP
				
			1 2 FIN 4 RA FIND .... FINDRA	
				
	 */
	public static void main(String[] args) {
	
		String str ="";// "" + 1 + 2 + 3 + 4 + 5 ....+30
		int i =1 ;
		
		while(i <= 30 ) {
			/*
			if( i % 3 == 0 && i %5 ==0 ) {
				str += "FINRA ";
			}else if(i % 3 == 0  ) {
				str += "FIN ";
			}else if(i %5 ==0) {
				str += "RA ";
			}else {
				str += i +" ";
			}
			*/
	str += ( i % 3 == 0 && i %5 ==0 ) ? "FINRA " : 
			(i % 3 == 0  ) ? "FIN " : (i %5 ==0)? "RA " : i+" ";
			
			
			i++;
		}
		
		
		System.out.println(str);
		
		
	}

}
