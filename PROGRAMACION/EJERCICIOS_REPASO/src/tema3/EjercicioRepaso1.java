package tema3;

public class EjercicioRepaso1 {

	public static void main(String[] args) {
		/*Haz un programa que cuente cuántos alumnos han suspendido (tienen menos de un 5). Imprime 
          la cantidad. El resultado debería ser: */
		Integer[] listaNotas  = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10};
		Integer suspensos = 0;
		
		for (int i = 0; i < listaNotas.length; i++) {
			if (listaNotas[i] < 5) {
				suspensos += 1;
			}
		}
		System.out.println("Han suspendido " + suspensos + " alumnos.");

	}

}
