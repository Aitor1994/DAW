package ejercicios_practico_repaso;

import java.util.Random;
import java.util.Scanner;

public class ejercicio25 {

	public static void main(String[] args) {
		// Realizar un programa que juegue a Piedra/Papel/Tijera con el usuario.
		// Iniciamos scanner e importamos:
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		String mano;
		String manopc = "hola";

		do {
			System.out.println("Piedra, papel, tijera… un, dos, tres… ya!!");
			Integer aleatorio = random.nextInt(1, 4);
			mano = sc.nextLine();
			
			if (aleatorio == 1) {
				manopc = "Piedra";
			} else if (aleatorio == 2) {
				manopc = "Papel";
			} else if (aleatorio == 3) {
				manopc = "Tijeras";
			}

			if (mano.equalsIgnoreCase("Piedra") && manopc.equalsIgnoreCase("Piedra")
					|| mano.equalsIgnoreCase("papel") && manopc.equalsIgnoreCase("papel")
					|| mano.equalsIgnoreCase("Tijeras") && manopc.equalsIgnoreCase("Tijeras")) {
				System.out.println("La maquina sacó " + manopc + " Ha sido empate¡");
			} else if (mano.equalsIgnoreCase("Piedra") && manopc.equalsIgnoreCase("Tijeras")
					|| mano.equalsIgnoreCase("papel") && manopc.equalsIgnoreCase("piedra")
					|| mano.equalsIgnoreCase("Tijeras") && manopc.equalsIgnoreCase("papel")) {
				System.out.println("La maquina sacó " + manopc + " Genial, has ganado ¡ ");
			} else if (mano.equalsIgnoreCase("Piedra") && manopc.equalsIgnoreCase("papel")
					|| mano.equalsIgnoreCase("papel") && manopc.equalsIgnoreCase("tijeras")
					|| mano.equalsIgnoreCase("Tijeras") && manopc.equalsIgnoreCase("piedra")) {
				System.out.println("La maquina sacó " + manopc + " oooooH , has perdido¡ ");
			}
		} while (mano.equalsIgnoreCase("Piedra") && manopc.equalsIgnoreCase("papel")
				|| mano.equalsIgnoreCase("papel") && manopc.equalsIgnoreCase("tijeras")
				|| mano.equalsIgnoreCase("Tijeras") && manopc.equalsIgnoreCase("piedra"));
	sc.close();}

}
