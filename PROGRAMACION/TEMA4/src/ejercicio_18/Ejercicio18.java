package ejercicio_18;

public class Ejercicio18 {

	public static void main(String[] args) {
		/*
		 * Crea una clase llamada Alumno que tenga como atributos privados el dni,
		 * nombre, edad y nota. Además, tendrá métodos get y set para todos los
		 * atributos. Luego crea un programa que lea por consola los datos de un alumno
		 * y los registre en un objeto de la clase que acabas de crear.
		 */

		// Creamos un objeto de la Clase Alumno y le damos un nombre para poder darle
		// atributos y leerlos.
		Alumno alumno = new Alumno();

		// Con el metodo SET le damos valor directamente o con scaner a los atributos ya
		// que no podriamos normalmente
		// ya que los atributos son priavte.
		alumno.setDni("kdkfjgfig");
		alumno.setEdad(30);
		alumno.setNombre("Aitor");
		alumno.setNota(10);

		// Con el metodo Get creado previamente en la clase Alumno simplemente leemos
		// los datos , ya que con un syso normal no
		// podemos al ser atributos private .
		System.out.println(alumno.getDni());
		System.out.println(alumno.getNota());
		System.out.println(alumno.getNombre());
		System.out.println(alumno.getEdad());

		// Usamos el metodo nuevo creado en Alumno que cambia la nota a 5 y volvemos a
		// imprimir Nota:
		alumno.aprobar();
		System.out.println(alumno.getNota());

	}

}
