package Medium.InterestingProblems;

import java.util.ArrayList;

public class PrimeNumbers {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> primes = new ArrayList<>();
		primes.add(2);
		
		for(int i=3; i<100; i+=2) {
			if(isPrime(primes, i)){
				primes.add(i);
			}
		}
		

		System.out.println("Primes: "+ primes);
		System.out.println("How many primes? "+primes.size());
		System.out.println("Biggest one: "+primes.get(primes.size()-1));
		System.out.println(isPrime(124_234_250_011L));
	}
	
	
	public static boolean isPrime(long num) {
		
		for(int i=2; i<=Math.sqrt(num); i++) {
			if(num % i == 0) {
				System.out.println(i);
				return false;
			}
		}
		return true;
	}
	
	
	
	/**
	 * @param takes arrayList as a parameter
	 * @param num needs to be checked if prime or not according to list 
	 * @return
	 */
	public static boolean isPrime(ArrayList<Integer> list,int num) {
		
		for(int each: list) {
			if(num%2==0 || num%each == 0) return false;
		}
		return true;
	}

	
}
