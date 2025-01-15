package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		/*Realizar un programa que solicite un texto por teclado. A continuación, dividir el texto en 
        trozos de 5 caracteres cada uno que iremos imprimiendo por consola. Por ejemplo, si el texto 
        indicado es: “Buenos días, mi nombre es Blau Blau.” El resultado tendrá que ser: */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba su frase aqui: ");
		String texto = sc.nextLine();
		int longitudTexto = texto.length();
		int i = 0;
		int fin;
		while (i < longitudTexto) {
			fin=i + 5;
			
			//Si el indice final supera la longitud del texto, ajustar
			if (fin > longitudTexto) {
				fin = longitudTexto;}
			//Extraer y mostrar el trozo
			String trozo = texto.substring(i,fin);
			System.out.println(trozo);
			
			//Avanzar al sig. trozo:
			 i += 5;
			
			
			sc.close();
		}
	}

}
