package ejercicio27;

import ejercicio22.Curso;

public class Alumno {
	private String dni;
    private Integer nota;
    //Hemos creado en alumno un "TIPO" curso que lleva los atributos de su clase"En este caso curso"
	private Curso curso;
	
	//Constructor Alumnos
	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nota=" + nota + ", curso=" + curso + "]";
	}

	//ESTO SERIA UN CONSTRUCTOR CON PARAMETRO, PARA ELLO NO TENDRIAMOS QUE USAR GET Y SET
	

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni.toUpperCase();
		
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public void aprobar() {
		this.nota = 5;
	}

	public Boolean validarDNI() {
		if (!dni.isBlank() ) {
			System.out.println("Error, el dni no puede estar vacio.");
		}
		else if (dni.length() < 9) {
			System.out.println("Error el dni debe contener al menos 9 caracteres.");
		}
		return null;
		
	}
}
