package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String email;
		Boolean emailValido=true;
		do {
			System.out.println("Dame un email");
			email = scanner.nextLine();
			
			//Primero hemos de analizar el mensaje que escribe el usuario antes de poder hacerle ninguna comprobacion con IF:
			
		  //Guardamos el @ (en el caso de que lo halla , aun no lo sabe , eso lo comprobaremos con IF) en la variable arroba:
			Integer arroba = email.indexOf("@");
			//Analiza y guarda en la variable todo lo que hay desde el arroba en adelante.
			String subcadena = email.substring(arroba + 1);
			
	     //Con IF haremos las comprobaciones que nos pide el ejercicio:
			if (!email.contains("@")){
				emailValido = false;
				System.out.println("El email tiene que tener una @");
			}
			else if(subcadena.contains("@"))
			{
				emailValido = false;
				System.out.println("El email slo puede contener una @");
			}			
			else if (email.contains("@.")){
				emailValido = false;
				System.out.println("El email no puede contener @.");
			}
			else if (email.endsWith(".")) {
				emailValido = false;
				System.out.println("El email no puede terminar en .");
			}
			else if (!subcadena.contains(".")) {
				emailValido = false;
				System.out.println("El email no tiene un . despus de la @");
			}
		}
		while(!emailValido);
		
		System.out.println("Email correcto");
		scanner.close();
	}

}
