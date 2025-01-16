package metodos;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*Crea un método llamado sumar que reciba dos números enteros y devuelva el resultado de la 
          suma. Pruébalo desde el método main con algún test. */

		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe 2 numeros para realizar la suma: ");
		Integer num = sc.nextInt();
		Integer num2 = sc.nextInt();
		sc.close();
		System.out.println("El resultado es " + suma(num,num2));
		
		
	}

	public static Integer suma(Integer num, Integer num2) {
		Integer suma = num + num2;
		return suma;
	}
}
