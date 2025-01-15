package EJERCICIOS;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Este metodo main es indispensable para que se ejecuten loscomandos en consola.
		
		//Iniciamos la funcion scanner que permite que el usuario escriba y registremos el texto en una variable.
		Scanner sc = new Scanner(System.in);
		
		//Hacemos nuestra pregunta alusuario
		System.out.println(" Indique aqui su nombre ");
		
		//Usamos el scanner con el tipo string ya que queremos que escriba una cadena o frase.
		String nombre = sc.nextLine();
		
		//Pedimos el apellido del usuario.
		System.out.println(" Indique aqui su apellido ");
		
		//Pedimos el apellido con otra cadena.
		String apellido = sc.next();
		
		//Mostrar el nombre completo obtenido por el scanner
		System.out.println(nombre + " " + apellido);
		
		//Cerramos scanner
		sc.close();

	}

}
