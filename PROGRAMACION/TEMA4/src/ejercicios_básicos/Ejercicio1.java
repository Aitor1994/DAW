package ejercicios_básicos;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*Crea un método llamado getMayusculas que reciba una cadena por parámetro y devuelva otra cadena que
          será el resultado de quitar los espacios en blanco de los extremos de la primera y de pasarla luego todo a
          mayúsculas.
          Pruébalo desde el método main con algún test.*/
		
		//Inicamos scanner para que sea el usuario el que mete los datos de entrada:
		Scanner sc = new Scanner(System.in);
		
		//Llamamos al metodo para que haga a lo que meta el usuario todo lo que hemos dicho al metodo que haga abajo.
		System.out.println("Escriba toda su frase en minusculas: ");
		String frase = getMinusculas(sc.nextLine());
		sc.close();
		System.out.println(frase);
		

	}

	public static String getMayusculas(String cadena) {
		String frase = cadena.trim().toUpperCase();
		return frase;
	}
	public static String getMinusculas(String cadena) {
		String frase = cadena.trim().toLowerCase();
		return frase;}
}
