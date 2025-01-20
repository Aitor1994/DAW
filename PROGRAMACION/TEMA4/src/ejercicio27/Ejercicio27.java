package ejercicio27;

import java.util.Scanner;

import ejercicio25.Alumno;

public class Ejercicio27 {

		public static void main(String[] args) {
			/*Desde tu programa, crea un array de 3 Alumnos. Todos los alumnos pertenecen al curso con
	          identificador = 1 y descripción “DAM-DAW”. El resto de datos de cada alumno, debes
	          solicitarlos al usuario.
	          Cuando tengas el array completo, comprueba si hay alumnos repetidos dentro del array (ten
	          en cuenta que dos alumnos estarán repetidos en función de lo que se haya implementado en
	          el método equals). Si hay alumnos repetidos, muestra un mensaje de error al usuario.*/
			Scanner sc = new Scanner (System.in);
			Alumno alumno = new Alumno();
			
			String dni = sc.nextLine();
			alumno.setDni(dni);
			
			
			for (int i = 0; i < dni.length(); i++) {
				
			}
			

			
			sc.close();
		}

	}
