package tcsNQT;

public class LengthOfHypotenuse {

	public static void main(String[] args) {
		
		long h, p , b;
	    java.util.Scanner  sc = new java.util.Scanner(System.in); 
		System.out.print("Enter sides of triangle:-  ");
		p = sc.nextLong();
		b = sc.nextLong();
		
		p = (long)Math.pow(p, 2);
		b = (long)Math.pow(b, 2);
		
		h=(long)Math.sqrt(p+b);
		
		System.out.println("\nyour hypotenuse is:- "+h);

	}

}
