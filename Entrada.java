import java.util.Scanner;

public class Entrada {

	public static void main (String[] args) {
		String nombre;

		Scanner stdIn = new Scanner(System.in);

		nombre = stdIn.nextLine();

		System.out.println("qué onda comostas" + nombre);

	}
}