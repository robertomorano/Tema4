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
	static private int importeHorasExtra = 0;
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
	/**
	 * 
	 * @param sueldoBase
	 */
	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	/**
	 * 
	 * @param horasExtra
	 */
	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}
	public static void setImporteHora(int importeHorasExtra) {
		Empleado.importeHorasExtra = importeHorasExtra;
	}
	/**
	 * 
	 * @param dni
	 * @param nombre
	 * @param sueldoBase
	 * @param horasExtra
	 */
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
	Empleado(String dni){
		if (!dni.isEmpty() || dni != null) {
			this.dni = dni;
		}
	}
	/**
	 * 
	 * @return
	 */
	public int calcularComplemento() {
		return this.horasExtra * importeHorasExtra;
	}
	/**
	 * 
	 * @return
	 */
	public int sueldoBruto() {
		return calcularComplemento()+this.sueldoBase;
	}
	/**
	 * 
	 */
	@Override
	public String toString() {
		return this.dni+" "+this.nombre+"\n"+"Horas Extra: "+ this.horasExtra +"\n Sueldo Bruto: "+ this.sueldoBruto();
	}
	
	/** 	
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		boolean equal = false;
		Empleado comparar = (Empleado) obj;
		if (comparar.dni.equals(this.dni)) {
			equal = true;
		}
		return equal;
	}
}
