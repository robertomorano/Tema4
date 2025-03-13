package boletin2.Alumno;

import java.util.HashSet;

public class AlumnoCRUD {
	static HashSet<Alumno> Alumnos = new HashSet<>();
	/**
	 * 
	 */
	void listado() {
		for(Alumno alumno: Alumnos) {
			System.out.println(alumno.toString());
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
		Alumno alum = new Alumno(nombre, 0);
		if(!Alumnos.contains(alum)) {
			exito = true;
		}
		
		return exito;
	}
	
	
	public Alumno cambiarNota(String nombre, double nuevaNota) {
		
		Alumno alumnoNotaNueva = getAlumno(nombre);
		
		if( alumnoNotaNueva != null) {
			alumnoNotaNueva.setNotaMedia(nuevaNota);
			
		}
		return alumnoNotaNueva;
	}
	
	public Alumno getAlumno(String nombre) {
		Alumno encontrada = null;
		Alumno comparar = new Alumno(nombre, 0);
		for (Alumno alumno: Alumnos) {
			if (alumno.equals(comparar)) {
				encontrada = alumno;
			}
		}
		
		return encontrada;
	}
	public boolean eliminar(String nombre) {
		Alumno eliminarAlumno = getAlumno(nombre);
		boolean eliminado = false;
		if (eliminarAlumno != null){
			Alumnos.remove(eliminarAlumno);
			eliminado = true;
		}
		return eliminado;
		

	}

}
