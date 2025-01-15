package EJERCICIOS;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Vamos a pedir datos al usuario para guardarlas en variables. Usaremos scanner:
		Scanner sc = new Scanner(System.in);
		
		//Pedimos y guardamos las variables:
		System.out.println("Danos un numero: ");
		String a = sc.nextLine();
		
		sc.toString();
		
		System.out.println("Danos el segundo numero: ");
		Double b = sc.nextDouble();
		
		System.out.println("Danos un tercer numero: ");
		Integer c = sc.nextInt();
		
		//A continuacion realizamos las conversiones correspondiente:
		Long x1 = Long.parseLong(a);
		String x2 = b.toString();
		long x3 = b.longValue();
		Long x4 = c.longValue();
		
		//Imprimimos en consola el valor de las variables:
		System.out.println("El valor de x1 es " + x1);
		System.out.println("El valor de x2 es " + x2);
		System.out.println("El valor de x3 es " + x3);
		System.out.println("El valor de x4 es " + x4);
		
sc.close();
	}

}
