package boletin.ejercicios4;

public class Articulo {
	String nombre = "";
	double precio = 0;
	final double IVA= 21;
	int stock = 0;
	/**
	 * 
	 * @param nombre nombre la persona
	 * @param precio precio producto
	 * @param stock catudad producto
	 */
	public Articulo(String nombre, int precio, int stock) {
		if (!nombre.isEmpty())
		this.nombre= nombre;
		if (precio > 0)
		this.precio = precio;
		if (stock > 0)
		this.stock = stock;
	}

}
