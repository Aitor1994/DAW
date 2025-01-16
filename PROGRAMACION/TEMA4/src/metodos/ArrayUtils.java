package metodos;

public class ArrayUtils {

	public static void imprimirArray(String array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}

	public static String obtenerPalabra(String array[], Integer num) {
		String palabra = null;
		for (int i = 0; i < array.length; i++) {
			if (num == i) {
				palabra = array[i];
				System.out.println(palabra);
				break;
			} else if (num > array.length) {
				System.out.println(palabra);
			}
		}
		return palabra;
	}

	/*En la clase ArrayUtils, crea un método llamado buscarPalabra que reciba un array de cadenas 
      y una palabra por parámetros. Debe devolver un entero indicando la posición donde se 
      encuentra esa palabra dentro del array. Si no existe la palabra en el array, devolverá -1. */
	
	public static Integer buscarPalabra(String array[], String cadena) {
		for (int i = 0; i < array.length; i++) {
			if (cadena.equals(array[i])) {
				return i;
				
			}else if (!cadena.equals(array[i])) {
				System.out.println(-1);
			}
		}return -1;
		
	}
}


