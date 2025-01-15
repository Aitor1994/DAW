package ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		/*Crea una clase llamada Alumno que tenga como atributos privados el dni, nombre, edad y
		nota. Además, tendrá métodos get y set para todos los atributos. Luego crea un programa que
		lea por consola los datos de un alumno y los registre en un objeto de la clase que acabas de
		crear. */
		
		//Creamos un objeto:
		Alumno alumno = new Alumno();
		
		//Iniciamos scanner  para rellenar los datos:
		Scanner sc = new Scanner(System.in);
		
		//Le damos valores a las variables:
		System.out.println("Introduce dni, nombre, edad y Nota: ");
		String  dni = sc.nextLine();
		String nombre = sc.nextLine();
		Integer edad = sc.nextInt();
		Double nota = sc.nextDouble();
		sc.close();
		//Con el metodo SET le damos los valores que tienen las variables al OBJETO (en este caso alumno):
		alumno.setDni(dni);
		alumno.setEdad(edad);
		alumno.setNombre(nombre);
		alumno.setNota(nota);
		
		//Con el metodo GET lo usamos para que nos devuelva el valor de cierto atributo de cierto Objeto:
		System.out.println(alumno.getDni());
		System.out.println(alumno.getNombre());
		System.out.println(alumno.getEdad());
		System.out.println(alumno.getNota()); 
		
		
		
		


	}

}
