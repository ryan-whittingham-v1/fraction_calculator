/*
Ryan Whittingham
CSE 223
April 16th, 2019
-------------------
PA1: Fraction Class
-------------------
Fraction is a Java class that enables the use of rational numbers in fraction notation.
Includes methods for add, subtract, multiply, divide, and decimal conversion of fractions.  
*/

class Fraction {

	private int num, denom; //numerator and denominator variables	

	//Contstructor that handles two integer inputs 
	public Fraction(int top, int bottom){
		
		// Assign arguments
		num = top;
		denom = bottom;
	
		// Negative sign in denominator or both numerator and denominator fix
		if(denom < 0){
			num = (num * -1);
			denom = (denom * -1);
		}

		// Zero in numerator fix
		if(num == 0){
			denom = 0;
		}
		
		//Simplify fraction by finding GCD
		int bigInt, littleInt, rem;// rem=bigInt%littleInt

		if(denom !=0){// Check for possible division by zero
			if(num<denom){// Check which int is larger for GCD algorithm
				bigInt=denom;
				littleInt=num;
			} else {
				bigInt=num;
				littleInt=denom;
			}
			
			if(bigInt%littleInt!=0){ // Check if gcd already found
				// GCD algorithm
				while(bigInt%littleInt!=0){
					rem=(bigInt%littleInt);
					bigInt=littleInt;
					littleInt=rem;			
				}
			}
			
			// Divide numerator and denominator by the GCD
			num=num/littleInt;
			denom=denom/littleInt;
		}
	}

	//Contstructor that handles one integer input
	public Fraction(int top){
		num = top;
		denom = 1;
	}
	
	//Method that returns the numerator of the fraction
	public int getNum(){
		return num;
	}
	
	//Method that returns the denominator of the fraction
	public int getDenom(){
		return denom;
	}

	//Method that overides toString to return fraction as a string
	public String toString(){
		
		if(denom == 0){ //Check if division by zero
			return "NaN";
		}

		if(denom == 1) { //Check if a whole number
			return ("" + num);
		}

		return (num + "/" + denom);
	}

	//Method that multiplies two fractions
	public Fraction mul(Fraction n){

		Fraction result = new Fraction(0, 0); //Create new fraction
		
		if(denom == 0 || n.getDenom() == 0){ //Check if division by zero 
			return result;			
		}

		int topResult = (num * n.getNum());
		int botResult = (denom * n.getDenom());	
		result = new Fraction(topResult, botResult); //Create new fraction
		return result;
		
	}
	
	//Method that divides two fractions
	public Fraction div(Fraction n){

		Fraction result = new Fraction(0, 0); //Create new fraction
		
		if(denom == 0 || n.getDenom() == 0){ //Check if divsion by zero 
			return result;			
		}

		int topResult = (num * n.getDenom());
		int botResult = (denom * n.getNum());	
		result = new Fraction(topResult, botResult); //Create new fraction
		return result;
		
	}
	
	//Method that adds two fractions
	public Fraction add(Fraction n){

		Fraction result = new Fraction(0, 0); //Create new fraction
		
		if(denom == 0 || n.getDenom() == 0){ //Check if division by zero 
			return result;			
		}
		
		int topResult = ((num * n.getDenom()) + (denom * n.getNum()));
		int botResult = (denom * n.getDenom());	
		result = new Fraction(topResult, botResult); //Create new fraction
		return result;
	}	

	//Method that subtracts two fractions
	public Fraction sub(Fraction n){

		Fraction result = new Fraction(0, 0); //Create new fraction
		
		if(denom == 0 || n.getDenom() == 0){ //Check if division by zero 
			return result;			
		}
		
		int topResult = ((num * n.getDenom()) - (denom * n.getNum()));
		int botResult = (denom * n.getDenom());	
		result = new Fraction(topResult, botResult); //Create new fraction
		return result;
	}

	//Method that returns the double equivalent of the fraction
	public double toDouble(){

		if(denom == 0){ //Check if division by zero 
			return Double.NaN;			
		}
		
		return ((double)num / (double)denom);
	}
}
	
