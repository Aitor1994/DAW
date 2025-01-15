package EJERCICIOS;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		//Iniciamos scanner y lo usamos para preguntar la altura y el peso al usuario:
		Scanner sc = new Scanner(System.in);
		System.out.println("Indiquenos su altura en M porfavor:");
		Float altura = sc.nextFloat();
		System.out.println("A continuacion indique su peso en Kg para calcular su IMC: ");
		Float masa = sc.nextFloat();
		//A continuacion realizamos los calculos y se lo devolvemos al usuario:
		System.out.println("Su IMC es de " + masa/(altura*altura));
		
		sc.close();
		

	}

}
