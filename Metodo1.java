/*
Nuevo ejemplo del uso
de métodos
Por Santiago Hernández
*/

import java.util.Scanner;	//IMPORTACON DE LA BIBLIOTECA PARA LEER DE TECLADO

public class Metodo1 {

	public static void main(String[] args) {

		String nombre = "Santi";

		Scanner lector = new Scanner(System.in);

		System.out.printf("Dame tu nombre ahora%n");
		nombre = lector.nextLine();

		System.out.printf("Dame tu edad ahora%n");
		int edad = lector.nextInt();

		imprime(nombre , edad);

		System.out.printf("Between llamadas al método.%n");

	}

	public static void imprime(String nom , int edad) {
		int anio = 2017 - edad;
		System.out.printf("Comostas %s , naciste en %d - el papá. %n" , nom , anio);

	}

}