package ejercicios;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*Realizar un programa que muestre por consola 5 veces tu nombre utilizando un bucle. Además 
de tu nombre, deberá aparecer el número de línea que se ha impreso. Es decir, la salida 
tendría que ser algo así:*/
		
		//Al no usar el DO y no inciar el contador debemos darle un valor a la  variable contador, al usar DO no:
			
		String nombre = "Aitor jordi marin serrano.";
		int contador = 1;
		
		while (contador <= 5) {
			System.out.println(nombre + " Linea " + contador);
			contador = contador +1 ;
			
		}
		
		
	}

}
