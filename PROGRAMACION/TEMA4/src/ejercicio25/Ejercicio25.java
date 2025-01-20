package ejercicio25;


import java.util.Scanner;



public class Ejercicio25 {

	public static void main(String[] args) {
		/*Desde tu programa, crea un array de 3 Alumnos. Todos los alumnos pertenecen al curso con
          identificador = 1 y descripción “DAM-DAW”. El resto de datos de cada alumno, debes
          solicitarlos al usuario.
          Cuando tengas el array completo, comprueba si hay alumnos repetidos dentro del array (ten
          en cuenta que dos alumnos estarán repetidos en función de lo que se haya implementado en
          el método equals). Si hay alumnos repetidos, muestra un mensaje de error al usuario.*/
		Scanner sc = new Scanner (System.in);
		Alumno alumno = new Alumno();
		
		
		Alumno [] array = new Alumno[3];
		for (int i = 0; i < array.length; i++) {
			alumno.setEdad(5);
			alumno.setNombre("DAM-DAW");
			alumno.setDni(sc.nextLine());
		}
		for (int i = 0; i < array.length; i++) {
			
		}
		

		
		sc.close();
	}

}
