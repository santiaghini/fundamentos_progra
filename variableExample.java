public class variableExample {

	public static void main(String[] args) {


		int num2;
		int num1;

		num2 = Integer.parseInt(args[1]);
		num1 = Integer.parseInt(args[0]);

		System.out.println("La suma pro es " + (num1 + num2) );
		System.out.println("La resta pro es " + (num1 - num2) );
		System.out.println("La multi pro es " + (num1 * num2) );
		System.out.println("La división pro es " + ((double)num1 / (double)num2) );
		System.out.println("El módulo pro es " + (num1 % num2) );

	}


}