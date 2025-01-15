package Ejercicios_Practicos;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String web = sc.nextLine();
		
		String [] parte1 = web.split("://");
		String [] parte2 = parte1[1].split("\\.");//Las barras se ponen para que no considere el . como un caracter eepsecial.
		
		for (int i = 0; i < parte1.length; i++) {
			System.out.println(parte1[i]);
			System.out.println(parte2[i]);
		}sc.close();
		
		

	}

}
