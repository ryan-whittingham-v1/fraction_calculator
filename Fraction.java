/*
Java class that handles fraction numbers
*/

public class Fraction {

	private int num, denom; //numerator and denominator
	
	//Contstructor that handles two integer inputs 
	public Fraction(int top, int bottom){
		num = top;
		denom = bottom;
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
		return num;
	}

	//Method that overides toString to return fraction as a string
	public String toString(){
		return (num + "/" + denom);
	}




}
