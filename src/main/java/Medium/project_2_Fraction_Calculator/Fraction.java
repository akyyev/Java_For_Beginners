package Medium.project_2_Fraction_Calculator;

public class Fraction {

	private int num;
	private int den;
	
	public Fraction() {
		this.num = 0;
		this.den = 1;
	}
	
	public Fraction(int num) {
		this.num = num;
		this.den = 1;
	}
	
	public Fraction(int num, int den) {

		if (den != 0) {
			if (den < 0) {
				this.num = -num;
				this.den = -den;
			} else {
				this.num = num;
				this.den = den;
			}
		} else {
			throw new IllegalArgumentException("Divisor can't be zero, run it again, Jan Gulshat!");
		}

	}
	
	public int getNumarator() {
		return this.num;
	}
	
	public int getDenominator() {
		return this.den;
	}
	
	public String toString() {
		if(den==1) return num+"";
		else return num+"/"+den;
	}
	
	public double toDouble() {
		return (double) num/den;
	}
	
	
/*	
 		private int lcd(int denom1, int denom2)
		   {
		      int factor = denom1;
		      while ((denom1 % denom2) != 0)
		         denom1 += factor;
		      return denom1;
		   }
	
*/
	  
	  public int gcd(int den1, int den2) {
		  while(den1 !=0 && den2 !=0) {
			  int rem = den1 % den2;
			  den1 = den2;
			  den2 = rem;
		  }
		  return den1;
	  }
	  
	public Fraction add(Fraction f) {
		
		Fraction sum = new Fraction();
		sum.num = this.num* f.den+f.num*this.den;
		sum.den = this.den * f.den;

		return sum.toLowestTerm();
	}
	
	
	public Fraction subtract(Fraction f) {
		
		Fraction subt = new Fraction();
		subt.num = this.num* f.den-f.num*this.den;
		subt.den = this.den * f.den;

		return subt.toLowestTerm();
	}
	
	
	
	public Fraction multiply(Fraction m) {
		
		Fraction product = new Fraction();
		
		product.num = num * m.num;
		product.den = den * m.den;
		
		return product.toLowestTerm();
	}

	public Fraction divide(Fraction d) {
		
		Fraction res = new Fraction();
		
		res.num = this.num * d.den;
		res.den = this.den * d.num;
		
		return res.toLowestTerm();
	}
	
	
	public boolean equalTo(Fraction other) {
		
		return this.toDouble() == other.toDouble();
	}
	
	public Fraction toLowestTerm() {
		
		if(this.num==0)	return new Fraction(0);

		int a = gcd(this.num,this.den);
		
		Fraction lowest = new Fraction(num/a, den/a);
		
		return lowest;
		
	}
	
}

