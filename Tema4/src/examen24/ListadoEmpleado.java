package examen24;

import java.util.ArrayList;

public class ListadoEmpleado {
	private static ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
	
	public static boolean añadirEmpleado(Empleado newEmp) {
		return listaEmpleados.add(newEmp);
	}
	public static void listar() {
		for (Empleado emp : listaEmpleados) {
			System.out.println(emp);
		}
	}
	
	public static boolean modificaHora(String dni, int nuevoHoras) {
		boolean exito = false;
		Empleado comparar = new Empleado(dni);
		int indice = listaEmpleados.indexOf(comparar);
		if (indice >= 0) {
			listaEmpleados.get(indice).setHorasExtra(nuevoHoras);
			
			exito = true;
		}
		return exito;
	}
	public static void modificaImporte(int nuevoImporte) {
		//boolean exito=false;
		
		//return exito;
	}
	public static boolean eliminar(String dni) {
		boolean exito = false;
		Empleado comparar = new Empleado(dni);
		int indice = listaEmpleados.indexOf(comparar);
		if (indice >= 0) {
			listaEmpleados.remove(indice);
			
			exito = true;
		}
		return exito;
	}
}
