package ejerciciosderepaso;

import java.util.Scanner;

public class Ejercicio1 {
	public static final Double NUMEROPI = 3.1425926518;

	public static void main(String[] args) {
		/*
		 * Solucion:Debemos preguntar al usuario por lo que usaremos Scanner y lo
		 * importaremos para que se pueda ejecutar a continuacion haremos las
		 * operaciones necesarias y las mostraremos en consola.En este ejercicio podemos
		 * usar algunos valores como constantes o no , pero seria mas correcto(SE USAN
		 * ARRIBA DEL TODo , FUERA DEL MAIN.
		 */

		Scanner sc = new Scanner(System.in);

		// Mostramos la pregunta y acto seguido usamos scanner para que pueda introducir
		// los datos.
		System.out.println("Indiquenos el radio de su circulo para mostrarle el resultado en cm: ");

		Double radio = sc.nextDouble();

		// Hacemos los calculos necesarios y se lo mostramos al usuario con sysout:
		Double area = NUMEROPI + (radio * radio);

		Double circunferencia = 2 * NUMEROPI * radio;

		System.out.println("El area de tu circunferencia seria de " + area + " cm" + "Y la circunferecia de "
				+ circunferencia + " cm.");

		sc.close();

	}

}
