package metodos;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*Crea un método llamado getMayusculas que reciba una cadena por parámetro y devuelva otra 
        cadena que será el resultado de quitar los espacios en blanco de los extremos de la primera y 
        de pasarla luego todo a mayúsculas. */
		//LOS METODOS SE CREAN FUERA DEL PROPIO METODO MAIN¡

		//Aqui en el main llamamos al METODO previamente creado y le metemos los parametros que queramos para que haga
		//su funcion, en este caso quitar espacios y pasar a mayusculas.
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escriba aqui su frase: ");
		System.out.println(getMinusculas(sc.nextLine()));
		sc.close();
		
	}
/*Los metodos se escriben de la siguiente manera
	public static TIPO_DEV nombreMetodo(TIPO_PARAM1 nombreParam1, TIPO_PARAM2 nombreParam2, ...) { 
		// AQUÍ IRÍA EL CÓDIGO 
		} */
	//El nombre del metodo se escribe con camelCase

	 public static String getMayusculas (String cadena) {
		 //Aqui dentro escribimos lo que queremos que haga el metodo cuando lo llamemos en el main con los datos que sean
		 String frase = cadena.trim().toUpperCase();
		 /*Como este metodo no es Void, sino que devuelve un parametro debemos usar un return para indicar que varible o parametro
		 queremos que nos devuelva al usarlo:*/
		 return frase;
	 }
	 //Creamos otro metodo pero que devuelva todo en Minusculas:
	 public static String getMinusculas (String cadena) {
		 String frase = cadena.trim().toLowerCase();
		 return frase;
	 }
}