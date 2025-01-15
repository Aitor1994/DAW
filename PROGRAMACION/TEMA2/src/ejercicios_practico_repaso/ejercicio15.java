package ejercicios_practico_repaso;

import java.util.Random;
import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		Integer aleatorio;
		Integer numero;
		Integer intentos = 1;
		do {
			aleatorio = random.nextInt(0, 10);
			System.out.println("Intenta adivinar el numero: ");
			numero = sc.nextInt();
			if (aleatorio == numero) {
				System.out.println("!! Enhorabuena, has acertado ¡¡");
			} else if (aleatorio != numero) {
				System.out.println("ooooH has perdido, el numero es diferente. ");
				intentos++;
			}
		} while (aleatorio != numero);

		System.out.println("EL numero de intentos ha sido: " + intentos);
		System.out.println("La puntuacion total seria " + (intentos - 10));
		sc.close();

	}

}
