package repaso_;

public class Prueba {

	public static void main(String[] args) {
		
//Hemos cambiado los atributos en la class de publicos a privados por lo que necesitamos los metodos GET/SET
//para poder usarlos.... IMPORTANTE
		
		/* Caballo caballo1 = new Caballo();
		System.out.println(caballo1.nombre);
		System.out.println(caballo1.color);
		caballo1.color = "Marron";
		System.out.println(caballo1.color); */
		
		//Ahora si funciona al ser los atributos privados usamos GET y SET:
		Caballo caballo2 = new Caballo();
		
		//Con GET usamos para que nos devuelva el color que tiene el atributo 
		System.out.println(caballo2.getColor());
		caballo2.imprimeCarrerasGanadas();
	
	//Le ponemos la edad al atributo con SET y luego llamamos al metodo creado en la CLASE.
		caballo2.setEdad(20);
		System.out.println(caballo2.anyoNacimiento());
		
		caballo2.setCarrerasGanadas(5);
		System.out.println(caballo2.getCarrerasGanadas());
		
		
		
	}
      
     

}
