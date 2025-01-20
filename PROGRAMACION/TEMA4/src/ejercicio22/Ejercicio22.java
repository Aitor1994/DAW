
package ejercicio22;

public class Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno alumno = new Alumno("deede");
		Curso curso = new Curso();

		alumno.setDni("dwedee");
		alumno.setNota(23);

		String identificador = "Esto es el identificador";
		String descripcion = "Esto es la descripcion";
		
		curso.setDescripcion(descripcion);
		curso.setIdentificador(identificador);

		alumno.setCurso(curso);
		System.out.println(alumno.getCurso());
	}

}
