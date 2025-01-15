package ejercicios_practico_repaso;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Realizar un programa que muestre esta serie de números y la sume: 
		//3 + 6 + 9 + 12 + 15 + 18 + 21 + 24 + 27 + 30 = 165 
		int numero ;
		String mas = "+";
		int contador = 1;
		for (numero = 3; contador <= 10 ; contador++) {
			numero = numero + 3;
		    System.out.print(numero + mas);
		}
		


	}

}
