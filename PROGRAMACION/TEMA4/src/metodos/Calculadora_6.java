package metodos;

import java.util.Scanner;

public class Calculadora_6 {

	public static void main(String[] args) {
		// En este metodo main probramos los metodos creados en otra clase
		// importandolos:
		// Ejemplo Calculadora.sumar

		System.out.println("El resultado es " + Calculadora.suma(4, 4));
		System.out.println("El resultado es " + Calculadora.restar(-4, 4));
		System.out.println("El resultado es " + Calculadora.multiplicar(18, 4));
		System.out.println("El resultado es " + Calculadora.dividir(18, 4));
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la operacion");
		String frase = sc.nextLine();
		System.out.println("Intorduce los numeros: ");
		Integer num1 = sc.nextInt();
		Integer num2 = sc.nextInt();
		Calculadora.calcular(frase,num1,num2);
		sc.close();

		

	}

}
