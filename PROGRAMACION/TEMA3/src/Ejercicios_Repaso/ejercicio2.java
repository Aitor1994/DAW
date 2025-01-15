package Ejercicios_Repaso;

public class ejercicio2 {

	public static void main(String[] args) {
		// Haz un programa que calcule la media de los alumnos que han aprobado. Imprime
		// el resultado.
		// Debería ser:

		// ESTE ES NUESTRO ARRAY YA INICIADO CON LOS DATOS:
		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };
		
        //Aqui nombramos y damos valor a nuestras variables:
		Integer aprobados = 0;
		//Esto deberia ser un double ya que la media puede ser decimal.
		Integer media = 0;

		//Recorremos el array y le ponemos las condiciones que queremos, en este caso usamos un IF.
		for (int i = 0; i < listaNotas.length; i++) {
			if (listaNotas[i] >= 5) {

				aprobados = aprobados + 1;
				media = media + listaNotas[i];

			}

		}
		//El syso siempre va fuera del for sino nos lo repetira cada vez que avanza un numero del array.
		System.out.println("La nota media de los alumnos aprobados es: " + media / aprobados);

	}

}
