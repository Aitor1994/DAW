package ejercicios;

public class Ejercicios_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int linea = 0; linea < 5; linea++){
		   //Una vez termine la fila salta a la columna:

			for (int columna = 1 ; columna <= 5; columna++) {

				System.out.print(columna + " ");
			}
			//Este salto de linea es imprescindible sino lo pondra todo en una columna.
			System.out.println();
		}
	}
}