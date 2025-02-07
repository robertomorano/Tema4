package boletin.ejercicios4;

public class Articulo {
	private String nombre = "";
	private double precio = 0;
	private static final double IVA = 21;
	private int stock = 0;

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
	}
	/**
	 * 
	 * @return
	 */
	public double getIVA() {
		return IVA;
	}
	/**
	 * 
	 * @return
	 */
	public double getPVP() {
		double PVP = 0;
		PVP = (this.precio + (this.precio * (IVA / 100)));
		return PVP;
	}
	/**
	 * 
	 * @param descuento
	 * @return
	 */
	public double getPVPDescuento(int descuento) {
		double PVPDesc = this.getPVP();
		PVPDesc = PVPDesc* (descuento/100);
		return PVPDesc;
	}
	/**
	 * 
	 * @param x
	 * @return
	 */
	
	public boolean vender(int x) {
		boolean venta = false;
		if(this.stock>x) {
			venta = true;
			this.setStock(this.stock-x);
		}
		return venta;
	}
	

}
