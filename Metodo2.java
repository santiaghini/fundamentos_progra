/*
Nuevo ejemplo del uso
de métodos
Por Santiago Hernández
*/

import java.util.Scanner;	//IMPORTACON DE LA BIBLIOTECA PARA LEER DE TECLADO

public class Metodo2 {

	public static void main(String[] args) {

		double numero1 = cuadrado(5.0);

		System.out.printf("El cuadrado de %f es %f. %n", 4.0, cuadrado(4.0));

		System.out.printf("%.2f %n", numero1);

	}

	public static double cuadrado(double numero) {

		double cuadrado;
		cuadrado = numero*numero;
		return cuadrado;
	}

}