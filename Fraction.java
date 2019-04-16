/*
Java class that handles fraction numbers
*/

class Fraction {

	private int num, denom; //numerator and denominator
	
	//Contstructor that handles two integer inputs 
	public Fraction(int top, int bottom){
		
		num = top;
		denom = bottom;
	
		if(denom < 0){//Negative denominator fix
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
		
		if(denom == 0){ //If fraction is undefined
			return "NaN";
		}

		return (num + "/" + denom);
	}

	//Method that multiplies two fractions
	public Fraction mul(Fraction n){

		Fraction result = new Fraction(0, 0); //Create new fraction
		
		if(denom == 0 || n.getDenom() == 0){ //If dealing with undefined numbers 
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
		
		if(denom == 0 || n.getDenom() == 0){ //If dealing with undefined numbers 
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
		
		if(denom == 0 || n.getDenom() == 0){ //If dealing with undefined numbers 
			return result;			
		}
		
		int topResult = ((num * n.getDenom()) + (denom * n.getNum()));
		int botResult = (denom * n.getDenom());	
		result = new Fraction(topResult, botResult); //Create new fraction
		return result;
		
	}
}
	
