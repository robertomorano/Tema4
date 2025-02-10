package boletin2.cuentacorriente;

public class CuentaCorriente {
	private String DNI = "";
	private String nombre = "";
	private double saldo = 0;
	private Nacionalidad nacionalidad;

	enum Nacionalidad {
		ESPAÑA, EXTRANJERO
	}

	public CuentaCorriente(String dNI, String nombre, double saldo, Nacionalidad nacionalidad) {
		super();
		this.DNI = dNI;
		this.nombre = nombre;
		this.saldo = saldo;
		this.nacionalidad = nacionalidad;
	}

	public CuentaCorriente(String dNI, String nombre, double saldo) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.saldo = saldo;
	}

	public CuentaCorriente(String dNI, double saldo) {
		super();
		DNI = dNI;
		this.saldo = saldo;
	}

	public String getDNI() {
		return DNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(Nacionalidad nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	/**
	 * 
	 * @param importe
	 * @return
	 */
	public boolean sacarDinero(double importe) {
		boolean exito = false;
		if (!(importe > this.saldo)) {
			exito = true;
			this.saldo -= importe;

		}
		return exito;
	}
	/**
	 * 
	 * @param importe
	 * @return
	 */
	public boolean ingresarDinero(double importe) {
		boolean exito = false;
		if (importe > 0) {
			exito = true;
			this.saldo -= importe;
		}
		return exito;
	}
	public String toString() {
		String texto="";
		texto = "La cuenta con DNI: "+this.DNI+" de nombre "+this.nombre+" saldo: "+this.saldo;
		return texto;
	}
	/**
	 * 
	 */
	public boolean equals(CuentaCorriente otra) {
		boolean iguales = false;
		if (this.toString().equals(otra.toString())) {
			iguales = true;
		}
		return iguales;
	}
	
	
	
}
