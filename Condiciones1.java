import java.util.Scanner;

public class Condiciones1 {

	public static void main(String[] args){

		int temp;
		Scanner stdIn = new Scanner(System.in);

		System.out.println("Escribe la temperatura del auto");

		temp = stdIn.nextInt();

		if(temp >= 110){

			System.out.println("Hey! Esto está on fire! Échale unos hielos!");

		} else {

	 		System.out.println("Todo chido con tu vehículo");

	 	}

	}

}