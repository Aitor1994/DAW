package Ejercicios_Repaso;

public class ejercicio1 {

	public static void main(String[] args) {
		// Haz un programa que cuente cuántos alumnos han suspendido (tienen menos de un
		// 5). Imprime
		// la cantidad. El resultado debería ser:
		// Este es el array que tenemos en un principio y con el que trabajamos:
		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };
		Integer suspensos = 0;
		Integer aprobados = 0;

		for (int i = 0; i < listaNotas.length; i++) {
			if (listaNotas[i] < 5) {
				suspensos = suspensos + 1;
				aprobados = listaNotas.length - suspensos;
			}
		}

		System.out.println("El resultado seria:");
		System.out.println(suspensos + " Alumnos han suspendido.");
		System.out.println("Han aprobado " + aprobados + " Alumnos");

		/*for each, cont=0
		 * for(Integer in : listaNotas) {
		 * if(in<5)
		 * cont++
		 * }
		 * syso... "suspensos" + cont
		 */
	}

}
