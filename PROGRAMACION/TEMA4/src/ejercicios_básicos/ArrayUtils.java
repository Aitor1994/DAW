package ejercicios_básicos;

public class ArrayUtils {

	public static void main(String[] args) {
		/*Crea un método llamado imprimirArray en una clase llamada ArrayUtils que reciba un array de cadenas
          y lo imprima por completo.*/
		String[] array = new String[]{"Hola","Adios","Mundo"};
	     imprimirarray(array);
		
	}

	public static void imprimirarray(String [] array ){
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
}
