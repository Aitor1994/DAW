package tema2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		// PIEDRA/PAPEL/TIJERAS;
		// Primero iniciamos scanner para interactuar con el usuario y la clase random
		// para el aleatorio:
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		// Ponemos las variables que vayamos usando aqui:
		String mano;
		String manoPc;
		do {
			System.out.println("Piedra, Papel, Tijeras, un , dos , tres , YA¡");
			mano = sc.nextLine();

			// Generamos el numero aleatorio que asemejaremo a una figura con IF:
			Integer aleatorio = random.nextInt(1, 4);
			sc.close();
			if (aleatorio == 1) {
				manoPc = "Piedra";
			} else if (aleatorio == 2) {
				manoPc = "Tijeras";
			} else {
				manoPc = "Papel";
			}
			System.out.println( "El pc saco " + manoPc + ". Has perdido, vulve a intentarlo.");
		} while (!mano.equalsIgnoreCase(manoPc));
		System.out.println("Has acertado¡");

	}

}
