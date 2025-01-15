package EJERCICIOS;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Preguntamos el nombre al usuario.
		System.out.println("Indique aqui su nombre");
		
		//Iniciamos el 
		Scanner sc = new Scanner(System.in);
		
		//Lo usamos para preguntarle al usuario y registrar su respuesta en una variable.
		String nombre = sc.nextLine();
		
		//Mostramos un mensaje de bienvenida con su respuesta.
		System.out.println("Bienvenido " + nombre + "¡");
		
		//Preguntamos por su localidad con Scanner esperando una respuesta de tipo String  palabra, frase o cadena.
		System.out.println("Donde vives " + nombre);
		
		//Preguntamos con scanner esperando una respuesta de tipo cadena o frase.
		String localidad = sc.nextLine();
		
		//Debemos mostrar unmensaje simple para preguntarle al usuario antes de usar el Scanner.
				System.out.println("¿Se vive bien en " + localidad + " " + nombre + "?: ");
				
		//Preguntamos de nuevo con Scanner esperando una respuesta para registrarla en una variable.
		String calidadDeVida = sc.nextLine();
		
		//Mostramos la respuesta:
		System.out.println(nombre + " dice que " + calidadDeVida + "Se vive bien en " + localidad);
		
		//Nos despedimos con un mensaje del usuario.
		System.out.println("Gracias por la informacion.Un saludo.");
		
		sc.close();
		

	}

}
