/*
Ryan Whittingham
CSE 223
April 16th, 2019
-------------------
PA1: Fraction Class
-------------------
Fraction is a Java class that allows for the creation and arithmetic
of fractional numbers. It includes methods for add, subtract, 
multiply, divide, and decimal conversion.  
*/

class Fraction {

	private int num, denom; //numerator and denominator variables	

	//Contstructor that handles two integer inputs 
	public Fraction(int top, int bottom){
		
		// Assign arguments
		num = top;
		denom = bottom;
	
		//Simplify fraction by finding GCD
		int a, b, rem;//Variables for GCD algorithm
		boolean numNeg, denomNeg;//Negative number flags
		numNeg = denomNeg = false;
		if(num < 0){//Strip off negative sign before GCD algorithm
			numNeg = true;
			num = (num * -1);
		}
		if(denom < 0){
			denomNeg = true;
			denom = (denom * -1);
		}
		
		if(denom != 0 && num != 0){// Check for possible division by zero
			a=denom;
			b=num;
			if(a%b!=0){ // Check if gcd already found
				// GCD algorithm
				while(a%b!=0){
					rem=(a%b);
					a=b;
					b=rem;			
				}
			}
			
			// Divide numerator and denominator by the GCD
			num=num/b;
			denom=denom/b;
			
			//Apply negatives back if negative flag is true
			if(numNeg == true){
				num = (num * -1);
			}

			if(denomNeg == true){
				denom = (denom * -1);
			}
		}
		
		// Negative sign in denominator fix
		if(denom < 0){
			num = (num * -1);
			denom = (denom * -1);
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
		
		if(denom == 0){ //If division by zero
			return "NaN";
		}

		if(num == 0 && denom != 0){ //If fraction equals zero
			return ("" + num);
		}

		if(denom == 1) { //If a whole number
			return ("" + num);
		}

		return (num + "/" + denom);
	}

	//Method that multiplies two fractions
	public Fraction mul(Fraction n){

		Fraction result; //Create new fraction
		
		if(denom == 0 || n.getDenom() == 0){ //Check if division by zero 
			result = new Fraction(1,0);
			return result;			
		}
		
		int topResult = (num * n.getNum());//Multiply numerators
		int botResult = (denom * n.getDenom());//Multiply denominators	
		result = new Fraction(topResult, botResult); //Create new fraction
		return result;
		
	}
	
	//Method that divides two fractions
	public Fraction div(Fraction n){

		Fraction result = new Fraction(0, 0); //Create new fraction
		
		if(denom == 0 || n.getDenom() == 0){ //Check if divsion by zero 
			result = new Fraction(1,0);
			return result;			
		}

		int topResult = (num * n.getDenom());//Multiply numerator by denominator of new fraction
		int botResult = (denom * n.getNum());//Multiply denominator by numerator of new fraction
		result = new Fraction(topResult, botResult); //Create new fraction
		return result;
		
	}
	
	//Method that adds two fractions
	public Fraction add(Fraction n){

		Fraction result = new Fraction(0, 0); //Create new fraction
		
		if(denom == 0 || n.getDenom() == 0){ //Check if division by zero 
			result = new Fraction(1,0);
			return result;			
		}
		
		int topResult = ((num * n.getDenom()) + (denom * n.getNum()));//Multiply for like bases and add numerators
		int botResult = (denom * n.getDenom());	//Multiply for like bases
		result = new Fraction(topResult, botResult); //Create new fraction
		return result;
	}	

	//Method that subtracts two fractions
	public Fraction sub(Fraction n){

		Fraction result = new Fraction(0, 0); //Create new fraction
		
		if(denom == 0 || n.getDenom() == 0){ //Check if division by zero 
			result = new Fraction(1,0);
			return result;			
		}
		
		int topResult = ((num * n.getDenom()) - (denom * n.getNum()));//Multiply for like bases and substract numerators
		int botResult = (denom * n.getDenom());	//Multiply for like bases
		result = new Fraction(topResult, botResult); //Create new fraction
		return result;
	}

	//Method that returns the double equivalent of the fraction
	public double toDouble(){

		if(denom == 0){ //Check if division by zero 
			return Double.NaN;			
		}
		
		return ((double)num / (double)denom);//Cast int variables to doubles
	}
}
	
