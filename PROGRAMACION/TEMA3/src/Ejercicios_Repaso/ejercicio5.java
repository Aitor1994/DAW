package Ejercicios_Repaso;

public class ejercicio5 {

	public static void main(String[] args) {
		// Haz un programa que cambie las notas de la lista del siguiente modo: todos
		// los alumnos que
		// estén suspensos los vamos a aprobar. Es decir, todas las notas que sean
		// menores a 5, pasarán a
		// ser un 5. Después, imprime la lista. El resultado tendría que ser:
		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };

		for (int i = 0; i < listaNotas.length -1; i++) {
			if (listaNotas[i] < 5) {
				listaNotas[i] = 5;
			}
			System.out.print(listaNotas[i]   + ",");		
			
		}
		System.out.print((listaNotas[listaNotas.length-1]));
		//syso ([i]);Seria lo mismo pero solo con [i] ya que el for anterior se ha quedado en la penultima posicion.

	}
}
