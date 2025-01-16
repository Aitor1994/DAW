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

	// Otro metodo distinto.
	public static Integer buscarPalabra(String array[], String cadena) {
		Integer num = null;
		for (int i = 0; i < array.length; i++) {
			if (cadena.equals(array[i])) {
				num = i;
			} else if (!cadena.equals(array[i])) {
				num = -1;
			}
		}
		return num;
	}
}
