package tema3;

public class EjercicioRepaso5 {

	public static void main(String[] args) {
		/*
		 * Haz un programa que cambie las notas de la lista del siguiente modo: todos
		 * los alumnos que estén suspensos los vamos a aprobar. Es decir, todas las
		 * notas que sean menores a 5, pasarán a ser un 5. Después, imprime la lista.
		 */

		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };
		int aprobado = 5;

		for (int i = 0; i < listaNotas.length; i++) {
			if (listaNotas[i] < 5) {
				listaNotas[i] = aprobado;
			}
		}
		for (int i = 0; i < listaNotas.length - 1; i++) {
			System.out.print(listaNotas[i] + ",");
		}
		int tamaño = listaNotas.length;
		System.out.println(listaNotas[tamaño - 1]);
	}

}
