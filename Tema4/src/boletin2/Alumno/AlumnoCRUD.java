package boletin2.Alumno;

import java.util.HashSet;

public class AlumnoCRUD {
	static HashSet<Alumno> Alumnos = new HashSet<>();
	/**
	 * 
	 */
	void listado() {
		for(Alumno alumno: Alumnos) {
			System.out.println(alumno);
			System.out.println("--------------------");
		}
	}
	
	/**
	 * 
	 * @param nuevo
	 */
	boolean añadir(Alumno nuevo) {
		boolean exito = false;
		
		if(!Alumnos.contains(nuevo)) {
			Alumnos.add(nuevo);
			exito = true;
		}
		
		return exito;
	}
	public boolean existe(String nombre) {
		boolean exito = false;
		
		if(!Alumnos.contains(nombre)) {
			exito = true;
		}
		
		return exito;
	}
	public boolean cambiarNota(String nombre, double nuevaNota) {
		if(existe(nombre)) {
			Alumnos.
		}
	}

}
