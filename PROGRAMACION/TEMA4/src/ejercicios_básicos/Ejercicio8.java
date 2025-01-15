package ejercicios_básicos;

import java.util.Scanner;

public class Ejercicio8 {
	public static final String ADD = "ADD";
	public static final String SUB = "SUB";
	public static final String MUL = "MUL";
	public static final String DIV = "DIV";

	public static void main(String[] args) {
		/*
		 * Crea un nuevo método en la clase “Calculadora” que sea calcular. Recibirá
		 * tres parámetros: • Una cadena que será “ADD”, “SUB”, “MUL” o “DIV” • Dos
		 * números enteros En función de la cadena recibida, se tendrá que sumar,
		 * restar, multiplicar o dividir los números recibidos. Reutiliza los métodos ya
		 * creados en los ejercicios anteriores.
		 */

		Scanner sc = new Scanner(System.in);
		String operacion;
		
		do {
			System.out.println("Introduce la operacion a realizar:");
			 operacion = sc.nextLine();

			System.out.println("Introduce el primer numero:");
			int num = sc.nextInt();

			System.out.println("Introduce el segundo numero:");
			int num2 = sc.nextInt();

			Integer resultado = calcular(operacion, num, num2);
			System.out.println("El resultado es: " + resultado);
			sc.nextLine();

		} while (operacion.equals(ADD)||operacion.equals(SUB)||operacion.equals(MUL)||operacion.equals(DIV));
		sc.close();
	}

	public static int calcular(String cadena, int num, int num2) {
		int resultado = 0;

		if (cadena.equals(ADD)) {
			resultado = Ejercicio7.sumar(num, num2);
		} else if (cadena.equals(SUB)) {
			resultado = Ejercicio7.restar(num, num2);
		} else if (cadena.equals(MUL)) {
			resultado = Ejercicio7.multiplicar(num, num2);
		} else if (cadena.equals(DIV)) {
			resultado = Ejercicio7.dividir(num, num2);
		} else {
			System.out.println("Operacion no valida.");
		}
		return resultado;
	}
}
