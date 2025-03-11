package examen24;
/**
 * 
 */
public class Empleado {
	/**
	 * dni de la persona identificador
	 */
	private String dni = "";
	/**
	 * Nombre del empleado
	 */
	private String nombre ="";
	/**
	 * salario sin modificaciones
	 */
	private int sueldoBase = 0;
	/**
	 * horas extras realizadas en el mes
	 */
	private int horasExtra = 0;
	/**
	 * valor fijo que valen las horas extra
	 */
	final static private int IMPORTEHORASEXTRA = 0;
	/**
	 * devuelve el dni
	 * @return el dni de la persona
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * nombre de la persona
	 * @return nombre de la persona 
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * el sueldo del pempleado
	 * @return el sueldo del pempleado	
	 */
	public int getSueldoBase() {
		return sueldoBase;
	}
	/**
	 * horas extra
	 * @return las horas
	 */
	public int getHorasExtra() {
		return horasExtra;
	}
	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}
	public Empleado(String dni, String nombre, int sueldoBase, int horasExtra) {
		if (!dni.isEmpty() || dni != null) {
			this.dni = dni;
		}
		if (!nombre.isEmpty() || nombre != null) {
			this.nombre = nombre;
		}
		if (sueldoBase >= 0) {
			this.sueldoBase = sueldoBase;
		}
		if (horasExtra >= 0) {
			this.horasExtra = horasExtra;
		}
		
	}
	
	
	
}
