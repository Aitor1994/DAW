package ejercicios_practicos_avanzados;


import java.util.Scanner;

public class ejercicio_5 {

	public static void main(String[] args) {
		//Realiza un programa que cuente el número de veces que aparece la letra ‘a’ y el número 
		//palabras que hay en un texto solicitado al usuario. No se pueden utilizar arrays.
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Introduce el texto: ");
		String texto = sc.nextLine();
		//Con estos splits separamos las palbras por espacios y la guardamos, y las letras , letra por letra:
		String [] palabras = texto.split(" ");
		String [] letra = texto.split("");
		//Con esto nos imprime la longitud de palabras , es decir el numero de palabras que tenemos:
		System.out.println(palabras.length);
		Integer letraA=0;
		sc.close();
		//Vamos a recorrer el array guardando la letra cuando encuentre una A:
		for (int i = 0; i < letra.length; i++) {
			if (letra[i].contains("a")) {
				letraA ++;
			}		
		}
		
		System.out.println("Mi texto contiene " + letraA + " aes");
		System.out.println("Mi texto contiene " + palabras.length + " palabras");

	}

}
