public class Variables1 {

	public static void main (String[] args) {
		//Declarar variables
		int numero1;
		double numero2, numero3 = 0;

		double pi = 3.14159265359;

		final double velocidadDeLaLuz = 299792458.0;

		++numero3;
		numero3++;

		numero1 = (int)pi; //CAST

		numero2 = (pi + numero3) / 2;

		System.out.println(numero2);

	}

}