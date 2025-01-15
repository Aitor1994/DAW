package ejercicios_básicos;

import java.util.Scanner;

public class Ejercicio5 {

	
	
	
	
	
	
	public static void main(String[] args) {
		/*Crea un método llamado sumar que reciba dos números enteros y devuelva el resultado de la suma.Pruébalo
          desde el método main con algún test.*/

		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca ambos numeros para realizar la operacion, pulse Intro para introducir el numero:");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int resultado = sumar(num, num2);//El orden de la llamada debe ser igual al orden que tiene la FUNCION.
		System.out.println("El resultado seria " + resultado);
sc.close();
	}

	public static Integer sumar(int num1, int num2) {
		
		int resultado =  num1 + num2;
		return resultado;
	}
}
