package Ejercicios_Practicos;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int tam;
		do {
			System.out.println("Dame un numero que indique el tamaño del array: ");
			tam = sc.nextInt();
		
		} while (tam <= 2);
		int[] fibonaci=new int[tam];
		fibonaci [0]=0;
		fibonaci [1]=1;
		for (int i = 2; i < fibonaci.length; i++) {
			fibonaci[i] = fibonaci[i - 1] + fibonaci[i -2];
			}
		for (int i = 0; i < fibonaci.length; i++) {
			System.out.println(fibonaci[i] + " ");
		}sc.close();
	}

}
