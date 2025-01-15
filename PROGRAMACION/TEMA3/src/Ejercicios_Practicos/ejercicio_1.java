package Ejercicios_Practicos;

public class ejercicio_1 {

	public static void main(String[] args) {
		// Realizar un programa que guarde en un array todos los números pares entre 1 y
		// 30.
		// Después, en otro bucle distinto, mostrar el contenido del array por consola.

		Integer[] posicion = new Integer[15];
		int pos = 0;

		for (int i = 1; i <= 30; i++) {

			if (i % 2 == 0) {
				posicion[pos] = i; // Le damos valor al array en la posicion que se indique en los corchetes¡
				pos++;
			}
		}
		for (int i = 0; i < posicion.length; i++) {
			System.out.println(posicion[i]);

		}

	}
}
