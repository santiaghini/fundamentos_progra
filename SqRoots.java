public class SqRoots {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double root1;
		double root2;
		double semi1;

		a = Double.parseDouble(args[0]);
		b = Double.parseDouble(args[1]);
		c = Double.parseDouble(args[2]);

		semi1 = (b*b)-(4*a*c);

		root1 = ((-1)*b + (Math.sqrt(semi1)))/(2*a);
		root2 = ((-1)*b - (Math.sqrt(semi1)))/(2*a);

		System.out.println("La primera raíz es " + root1 );
		System.out.println("La segunda raíz es " + root2 );

	}


}