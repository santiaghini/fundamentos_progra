public class Variables2 {

	public static void main (String[] args) {

		char inicialNombre, inicialApellido;

		inicialNombre = 'S';
		inicialApellido = 'H';

		char codigoControl = '\n';

		String texto = "origin  master";

		System.out.println("Hola " + inicialNombre);
		System.out.println("Código:  " + codigoControl);
		System.out.println("\"Hola de nuevo \r" + inicialApellido);

		System.out.println("El caracter en 5 es \"" + texto.charAt(5) + "\"");



	}
}