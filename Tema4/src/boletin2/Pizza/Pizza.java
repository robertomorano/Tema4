package boletin2.Pizza;

import boletin2.libros.Libros;

public class Pizza {
	enum Tamanho {
		MEDIANA, FAMILIAR
	}

	enum Tipo {
		MARGARITA, CUATROQUESOS, FUNGHI
	}

	enum Estado {
		PEDIDA, SERVIDA
	}

	private int codigo = 0;
	private Tamanho tamaño = Tamanho.MEDIANA ;
	private Tipo tipo = Tipo.MARGARITA;
	private Estado estado = Estado.PEDIDA;

	/**
	 * Constructor de la clase pizza le da un valor predefinido a estado siempre
	 * @param codigo codigo que identifica a las pizzas
	 * @param tamaño tamaño que tendra dicha pizza
	 * @param tipo Sabor de la pizza
	 */
	public Pizza(int codigo, String tamaño, String tipo) {
		super();
		if (codigo > 0) {
			this.codigo = codigo;
		}

		if (tamaño != null && !tamaño.isBlank()) {
			this.tamaño = Tamanho.valueOf(tamaño.toUpperCase());
		}

		if (tipo != null && !tipo.isBlank()) {
			this.tipo = Tipo.valueOf(tipo);
		}

		this.estado = Estado.PEDIDA;
	}

	/**
	 * FUNCION SETTER  para cambiar el tamaño
	 * @param tamaño
	 */
	public void setTamaño(String tamaño) {
		if (tamaño != null && !tamaño.isBlank()) {
			this.tamaño = Tamanho.valueOf(tamaño);
		}
	}
	/**
	 * 
	 * @param tipo
	 */
	public void setTipo(String tipo) {
		if (tipo != null && !tipo.isBlank()) {
			this.tipo = Tipo.valueOf(tipo);
		}
	}
	/**
	 * Alternar el estado de la pizza 
	 */
	public void changeEstado() {
		if (this.estado.equals(Estado.PEDIDA)) {
			this.estado = Estado.SERVIDA;
		}else {
			this.estado = Estado.PEDIDA;
		}

	}
	/**
	 * Devuelve el codigo de la pizza
	 * @return
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * Devuelve el tamaño como string
	 * @return
	 */
	public String getTamaño() {
		return String.valueOf(tamaño);
	}
	/**
	 * Devuelve el tipo como string
	 * @return
	 */
	public String getTipo() {
		return String.valueOf(tipo);
	}
	/**
	 * Devuelve el Estado actual como string
	 * @return
	 */
	public String getEstado() {
		return String.valueOf(estado);
	}
	
	
	
	@Override
	public String toString() {
		String texto = "";
		texto = this.codigo + ": " + this.tamaño + " - " + this.tipo + " - " + this.estado;
		return texto;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean equal = false;
		Pizza pizzaAComparar = (Pizza) obj;
		if (this.codigo == pizzaAComparar.codigo) {
			equal = true;
		}
		return equal;
	}
}
