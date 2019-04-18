import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int numInt, denomInt;
		String num, denom, calcButton;
		Fraction fracA, fracB, fracC;
		Scanner scanner = new Scanner(System.in);  // Create a Scanner object
		while(true){
			System.out.println("FracA Num: ");
			num = scanner.nextLine();  // Read user input
			System.out.println("FracA Denom: ");
			denom = scanner.nextLine();  // Read user input
			numInt = Integer.parseInt(num);
			denomInt = Integer.parseInt(denom);
			fracA = new Fraction(numInt, denomInt);
			System.out.println("FracA: " + fracA);
			System.out.println("FracA: " + fracA.toDouble());
			
			System.out.println("Calculator Button: ");
			calcButton = scanner.nextLine();  // Read user input
			
			System.out.println("FracB Num: ");
			num = scanner.nextLine();  // Read user input
			System.out.println("FracB Denom: ");
			denom = scanner.nextLine();  // Read user input
			numInt = Integer.parseInt(num);
			denomInt = Integer.parseInt(denom);
			fracB = new Fraction(numInt, denomInt);
			System.out.println("FracB: " + fracB);
			System.out.println("FracB: " + fracB.toDouble());
			
			switch(calcButton) {
				case "/" :
					System.out.println(fracA + " / " + fracB + "= " + fracA.div(fracB)); 
					break;
				
				case "*" :
					System.out.println(fracA + " * " + fracB + "= " + fracA.mul(fracB)); 
					break;
				
				case "-" :
					System.out.println(fracA + " - " + fracB + "= " + fracA.sub(fracB)); 
					break;
				
				case "+" :
					System.out.println(fracA + " + " + fracB + "= " + fracA.add(fracB)); 
					break;
			      }
		}
	}
}

