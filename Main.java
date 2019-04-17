public class Main {
	
	public static void main(String[] args) {
		System.out.println("Reduce");	
		Fraction fracA = new Fraction(210,63);
		Fraction fracB = new Fraction(63,210);
		System.out.println("Fraction A 10/3: " +  fracA);
		System.out.println("Fraction B 3/10: " + fracB);
		
		System.out.println("Multipy positive");	
		fracA = new Fraction(1,3);
		fracB = new Fraction(2,5);
		System.out.println("Fraction A .3333: " +  fracA.toDouble());
		System.out.println("Fraction B .4: " + fracB.toDouble());

		System.out.println("Multipy positive");	
		fracA = new Fraction(1,3);
		fracB = new Fraction(2,5);
		System.out.println("Fraction A 1/3: " +  fracA);
		System.out.println("Fraction B 2/5: " + fracB);
		System.out.println("Fraction A * Fraction B 2/15: " + fracA.mul(fracB));
		
		System.out.println("Multipy negative");	
		fracA = new Fraction(1,-3);
		fracB = new Fraction(2,5);
		System.out.println("Fraction A -1/3: " +  fracA);
		System.out.println("Fraction B 2/5: " + fracB);
		System.out.println("Fraction A * Fraction B -2/15: " + fracA.mul(fracB));
		
		System.out.println("Multipy 0");	
		fracA = new Fraction(1,0);
		fracB = new Fraction(2,5);
		System.out.println("Fraction A 1/0: " +  fracA);
		System.out.println("Fraction B 2/5: " + fracB);
		System.out.println("Fraction A * Fraction B NaN: " + fracA.mul(fracB));
		
		System.out.println("Divide");	
		fracA = new Fraction(4,5);
		fracB = new Fraction(3,20);
		System.out.println("Fraction A 4/5: " +  fracA);
		System.out.println("Fraction B 3/20: " + fracB);
		System.out.println("Fraction A * Fraction B 80/15: " + fracA.div(fracB));
		
		System.out.println("Add");	
		fracA = new Fraction(1,4);
		fracB = new Fraction(2,5);
		System.out.println("Fraction A 1/4: " +  fracA);
		System.out.println("Fraction B 2/5: " + fracB);
		System.out.println("Fraction A + Fraction B 13/20: " + fracA.add(fracB));
		
		System.out.println("Subtract");	
		fracA = new Fraction(1,2);
		fracB = new Fraction(1,2);
		System.out.println("Fraction A 1/2: " +  fracA);
		System.out.println("Fraction B 1/2: " + fracB);
		System.out.println("Fraction A - Fraction B 0: " + fracA.sub(fracB));
	}
}
