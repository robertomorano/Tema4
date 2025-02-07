package boletin.ejercicios2;

public class Persona {
	String dni;
	String nombre;
	String apellidos;
	int edad;
	/**
	 * construye una persona con sus atributos
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
	/**
	 * devuelve el valor nombre
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Cambia el valor nombre
	 * @param nombre cambia el nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * coge el apellido
	 * @return apllidos de la persona
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * apellido camabia
	 * @param apellidos de la persona
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 *  
	 * @return edad de la persona
	 */	
	public int getEdad() {
		return edad;
	}
	/**
	 * Cambia el valor edad
	 * @param edad de la persona
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * 
	 * @return
	 */
	public boolean esMayorEdad() {
		boolean mas18= false;
		if (this.edad >= 18) {
			mas18 = true;
		}
		return mas18;
	}
	/**
	 * 
	 * @return jubilado 
	 */
	public boolean esJubilado() {
		boolean jubilado= false;
		if (this.edad >= 65) {
			jubilado = true;
		}	
		return jubilado;
	}
	/**
	 * 
	 * @param p
	 * @return
	 */
	public int diferenciaEdad(Persona p) {
		int resta = 0;
		resta = p.edad - this.edad;
		return resta;
	}
}
