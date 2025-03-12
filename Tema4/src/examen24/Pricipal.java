package examen24;

import java.util.Scanner;

public class Pricipal {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//Variables
		int opcion = 0;
		String dni = "";
		int horasExtra = 0;
		int importeHoras = 0;
		Empleado emp;
		System.out.println("Bienvenido al sistema");
		
		do {
			menu();
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1 -> {//crear empleado
				emp = creaEmpleado();
				if(ListadoEmpleado.añadirEmpleado(emp)) {
					System.out.println("Exito");
				}else {
					System.out.println("NO");
				}
			}
			case 2 ->{
				ListadoEmpleado.listar();
			}
			case 3 ->{
				System.out.println("De que empleado quieres modificar");
				dni = sc.next();
				emp = ListadoEmpleado.existe(dni) 
				if( emp != null) {
					
				}
			}
			default ->{
				
			}
			}
		}while(opcion != 0);
	}
	private static Empleado creaEmpleado() {
		String dni = pedirDni();
		int sueldo = 0;
		String nombre = "";
		int horasExtra = pedirHoras();
		System.out.println("nombre y sueldo");
		nombre = sc.next();
		sueldo = sc.nextInt();
		
		return new Empleado(dni, nombre, sueldo, horasExtra);
	}
	/**
	 * 
	 */
	private static void menu() {
		System.out.println("Añadir empleado.\r\n"
				+ "Listar empleados.\r\n"
				+ "Modificar horas extra.\r\n"
				+ "Modificar importe horas extra.\r\n"
				+ "Eliminar empleado.\r\n"
				+ "Salir.\r\n"
				+ "");
	}
	
	private static String pedirDni(){
		System.out.println("DNI aqui ya");
		return sc.next();
	}
	
	private static int pedirHoras() {
		System.out.println("Horas extra realizadas");
		return sc.nextInt();
	}
}
