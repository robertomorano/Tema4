package boletin2.Alumno;

public class Alumno {
	private String nombre;
	private double notaMedia;
	public Alumno(String nombre,  double notaMedia){
		this.nombre = nombre;
		this.notaMedia = notaMedia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getNotaMedia() {
		return notaMedia;
	}
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	@Override
	public boolean equals(Object obj) {
		boolean equal = false;
		Alumno alumnoAComparar = (Alumno) obj;
		if (this.nombre == alumnoAComparar.nombre) {
			equal = true;
		}
		return equal;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nombre+" Nota Media"+ this.notaMedia;
	}
}
