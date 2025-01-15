package ejercicios_practico_repaso;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		//Realizar un programa que genere contraseñas del siguiente modo: pedirá al usuario una 
		//palabra de al menos 8 caracteres. Si no tiene esa longitud, volverá a pedir otra hasta que el 
		//usuario indique una de al menos esa longitud. Después, el programa cambiará las letras de esa 
		//palabra por números siguiendo estas reglas:  a por 4  e por 3  i por 1  o por 0  t por 7:
		Scanner sc = new Scanner(System.in);
		String contraseña = " ";
		boolean exit = false;
		String aux = " ";
		
		 while (!exit) {
			 System.out.println("Intoduce contraseña: ");
			 contraseña = sc.nextLine();
			 
			 if(contraseña.length() < 8) {
				 System.out.println("ERROR");
			 }else {
				 exit = true;
			 }
		 }
		 
		 if(exit == true) {
			  aux = contraseña.replaceAll("a","4").replaceAll("3","e").replaceAll("1","i").replaceAll("0","o").replaceAll("7","t");}
			 System.out.println("LA contraseña es: "+aux);
		sc.close();
	} 

}
