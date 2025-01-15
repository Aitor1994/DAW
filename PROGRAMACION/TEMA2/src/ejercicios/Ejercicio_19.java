package ejercicios;

public class Ejercicio_19 {

	public static void main(String[] args) {
	
		//Declaramos la variable y le ponemos la condicion y las instrucciones.
		for(int fila = 1; fila<=9; fila++) {
			
			//declaramos la variable columna y le ponemos la condicion y las instrucciones.
			for(int columna = 1; columna<= fila; columna++) {
				
				//Con esto declaramos un espacio entre numeros.
				System.out.print(columna+" ");
			}
			//Debemos usar un syso printLN para crear el salto de linea y que salte de columna.
			System.out.println(" ");
		}
	}
	}