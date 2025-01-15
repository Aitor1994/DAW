package ejercicios;

public class Ejercicio5 {

	public static void main(String[] args) {

	//Realizar un programa que muestre la suma de todos los números del 1 al 10000.Es decir: 1 + 2 + 3 + 4 + 5 + … + 9999 + 10000.
		int contador = 1;
		int suma = 0;
		
		while (suma <= 10000) {
		    suma = suma + contador;
		    contador = contador + 1;
		}
		System.out.println("El resultado de sumar 10000 numeros es : " + suma);
	
	
	
	
	}}
