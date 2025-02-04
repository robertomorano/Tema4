package boletin.ejercicios2;

public class Persona {
	String dni;
	String nombre;
	String apellidos;
	int edad;
	/**
	 * 
	 * @param nombre nombrepersona
	 * @param apellidos apellidos persona 
	 * @param dni dni persona
	 * @param edad edad persona
	 */
	public Persona(String nombre, String apellidos, String dni, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
	}

}
