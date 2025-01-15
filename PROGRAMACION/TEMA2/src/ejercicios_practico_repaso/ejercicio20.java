package ejercicios_practico_repaso;

public class ejercicio20 {

	public static void main(String[] args) {
		{
			// Realizar un programa que muestre por pantalla un cuadrado de 5x5 con su
			// diagonal. De este
			// modo:
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if(i == j) {
						System.out.print("* ");
						
					}else {
						System.out.print("- ");
					}
					
				}
				System.out.println();
			}
		}

	}
}
	
