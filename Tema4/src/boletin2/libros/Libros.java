package boletin2.libros;

import boletin2.cuentacorriente.CuentaCorriente;

public class Libros {
	enum Genero {
		Narrativo, Lírico, Dramático, Didáctico, Poético
	}

	private String titulo;
	private String autor;
	private int ejemplares;
	private int emprestao = 0;
	private Genero tema;

	/**
	 * 
	 * @param titulo
	 * @param autor
	 */
	public Libros(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}

	public Libros(String titulo, String autor, int ejemplares, int emprestao) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.emprestao = emprestao;
	}

	public Libros(String titulo, String autor, int ejemplares, int emprestao, Genero tema) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.emprestao = emprestao;
		this.tema = tema;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int getEmprestao() {
		return emprestao;
	}

	public void setEmprestao(int emprestao) {
		this.emprestao = emprestao;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public Genero getTema() {
		return tema;
	}

	/**
	 * 
	 * @return
	 */
	public boolean prestamo() {
		boolean prestar = false;
		if (this.ejemplares > this.emprestao) {
			prestar = true;
			this.emprestao++;
		}
		return prestar;
	}

	/**
	 * 
	 * @return
	 */
	public boolean devolucion() {
		boolean devolver = false;
		if (this.emprestao > 0) {
			devolver = true;
			this.emprestao--;
		}
		return devolver;
	}

	@Override
	public String toString() {
		String texto = "";
		texto = "titulo: " + this.titulo + " \n" + "autor: " + this.autor + 
				" \n" + "Ejemplares: " + this.ejemplares+"\n"+
				"Emprestao: "+ this.emprestao;
		return texto;
	}
	@Override
	public boolean equals(Object obj) {
		boolean equal = false;
		Libros libro = (Libros) obj;
		if (this.titulo.equals(libro.titulo) && this.autor.equals(libro.autor)) {
			equal = true;
		}
		return equal;
	}

}
