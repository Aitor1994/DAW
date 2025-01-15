package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca su nombre completo:");
		String nombreCompleto = sc.nextLine();
       
		/*No sabremos la longitud del nombre d elos apellidos y tendremos que generar un programa que los separe en 3 lineas automaticamente.Primero
		 * averiguaremos donde esta el primer espacio , y con ello desde la poscion 0 hasta el espacio sabra el programa la longitud del nombre
		 * y lo guardaremos en una variable.*/
		
		//Con index.of el programa calculara la posicion del primer espacio lo gurdamos en un Int porq sera un numero.
		Integer posicionPrimerEspacio = nombreCompleto.indexOf(" ");
		//Con el nombre que nos dio el usuario .substring le decimos que calcule lo que hay desde la letra 0 hasta la posicion del primer espacio que calculo antes.
		String nombre = nombreCompleto.substring(0 , posicionPrimerEspacio);
		/*Calculamos con .indesOF la posicion desde el 2º espacio hasta la posicion del Primero que calculamos +1 ya que no queremos que coja 
		 * el espacio como letra tmbn*/
		Integer posicionSegundoEspacio = nombreCompleto.indexOf(" " , posicionPrimerEspacio + 1);
		//Con el comando substring volvemos a decirle que guarde lo que hay en este caso entre los dos espacios en la variable apellido1.
		String apellido1 = nombreCompleto.substring(posicionPrimerEspacio , posicionSegundoEspacio);
		//Lo mismo que el anterior pero con apellido 2 , al ser lo ultimo no el damos posicion final y capturara todo lo que hay en aelante.
		String apellido2 = nombreCompleto.substring(posicionSegundoEspacio);
		
		//Mostramos por separeado nombre y apellidos al usuario:
		System.out.println("su nombre es: " + nombre);
		System.out.println("Su 1º apellido es: "+ apellido1);
		System.out.println("Su 2º apellido es: "+ apellido2);
		sc.close();
		
	}

}
