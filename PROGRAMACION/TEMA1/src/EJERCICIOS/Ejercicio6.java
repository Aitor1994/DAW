package EJERCICIOS;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Solicitamos al usuario el precio sin IVA del articulo
		System.out.println("¿Podria indicar el precio del articulo sin IVA porfavor?:");
		
		 //Iniciamos scanner e importamos para poder usarla.
		Scanner sc = new Scanner(System.in);
		
		//Usamos scanner y preguntamos al usuario el precio , al ser un numero usamos Int
		double precioSinIva = sc.nextDouble();
		
		//Calculamos el IVA del producto y lo restamos para averiguar el precio final.
		double iva = precioSinIva * 0.21;
		
		//Sumamos el IVA al precio 
		double precioTotal = precioSinIva + iva;
		
		//Mostramos el precio final 
		System.out.println("El precio final de su articulo seria de " + precioTotal + " €.");
		
		//Cerramos scanner.
		sc.close();
		
		
	}
}
