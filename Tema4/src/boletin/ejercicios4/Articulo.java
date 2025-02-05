package boletin.ejercicios4;

public class Articulo {
	String nombre = "";
	double precio = 0;
	public static final double IVA = 21;
	int stock = 0;

	/**
	 * 
	 * @param nombre nombre la persona
	 * @param precio precio producto
	 * @param stock  catudad producto
	 */
	public Articulo(String nombre, int precio, int stock) {
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
		if (precio > 0) {
			this.precio = precio;
		}
		if (stock > 0) {
			this.stock = stock;
		}
	}

	/**
	 * javalin javadoc
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}

	/**
	 * 
	 * @return
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * 
	 * @param precio
	 */
	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}

	/**
	 * 
	 * @return
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * 
	 * @param stock
	 */
	public void setStock(int stock) {
		if (stock > 0) {
			this.stock = stock;
		}
	public double getIVA() {
		return this.IVA;
		}
	}

}
