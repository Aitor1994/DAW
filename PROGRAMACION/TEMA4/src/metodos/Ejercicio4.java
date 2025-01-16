package metodos;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*Repite el ejercicio anterior, pero reutilizando (llamando a) los métodos creados en el Ejercicio 
          1 y 2. */

		System.out.println("Maysculas (1): ");
		System.out.println(getMayMin(1,"   Pasar a Mayusculas     "));
		System.out.println("Minsculas (2): ");
		System.out.println(getMayMin(2,"   Pasar a Minusculas     "));
	}
	
	
	public static String getMayMin(Integer num, String cadena ) {
		

		if(num==1)
			cadena= Ejercicio1.getMayusculas(cadena);
		else if(num==2)
			cadena= Ejercicio1.getMinusculas(cadena);
		
		return cadena;
	}
	
	



	}


