package tema3;

public class EjercicioRepaso2 {

	public static void main(String[] args) {
		/*
		 * Haz un programa que calcule la media de los alumnos que han aprobado. Imprime
		 * el resultado. Debería ser:
		 */
		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };
		Integer notas = 0;
		Integer aprobados = 0;
		for (int i = 0; i < listaNotas.length; i++) {
			if (listaNotas[i] >= 5) {
				notas = listaNotas[i] + notas;
				aprobados += 1;
			}
		}
		System.out.println("El total de alumnos aprobados han sido " + aprobados + " y la media de aprobados ha sido "
				+ (notas / aprobados));

	}

}
