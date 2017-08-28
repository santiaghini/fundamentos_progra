/*
Nuevo ejemplo del uso
de métodos
Por Santiago Hernández
*/

import java.util.Scanner;	//IMPORTACON DE LA BIBLIOTECA PARA LEER DE TECLADO

public class Metodo2 {

	public static void main(String[] args) {

		System.printf("El cuadrado de %f es %f", 4.0, cuadrado(4.0));

	}

	public static double cuadrado(double numero) {

		double cuadrado;
		cuadrado = numero*numero;
		return cuadrado;
	}

}