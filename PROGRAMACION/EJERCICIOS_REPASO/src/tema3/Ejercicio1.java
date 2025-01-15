package tema3;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*Realizar un programa que guarde en un array todos los números pares entre 1 y 30.  
          Después, en otro bucle distinto, mostrar el contenido del array por consola. */
		Integer[] array = new Integer[30];
		for (int i = 0; i < array.length; i++) {
			if (i%2 == 0) {
				array[i] = i;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
