package boletin2.cuentacorriente;

import java.util.Scanner;

public class Principal {
	static Scanner sc = new Scanner(System.in);
	static CuentaCRUD db = new CuentaCRUD();
	public static void main(String[] args) {
		menu();

	}
	static void menu() {

		int key = 0;
		do {
			System.out.println("1. Listado.\r\n" + "2. Crear.\r\n" + "3. Borrar.\r\n" + "4. Ingresar.\r\n"
					+ "5. Retirar.\r\n" + "");
			key = sc.nextInt();
			switch (key) {
			case 1 -> {
				db.listar();
			}
			case 2 -> {
				String dni = pedirDNI();
				String nombre = pedirNombre();
				double saldo = pedirSaldo();
				CuentaCorriente nuevaCuenta = new CuentaCorriente(dni,nombre, saldo);
				if(db.añadir(nuevaCuenta)) {
					System.out.println("Añadido con exito");
				}
			}
			case 3 -> {
				String dni = pedirDNI();
				String nombre = pedirNombre();
				CuentaCorriente nuevaCuenta = new CuentaCorriente(dni,nombre);
				if(db.eliminar(nuevaCuenta)) {
					System.out.println("eliminado con exito");
				}
			}
			case 4 ->{
				String dni = pedirDNI();
				String nombre = pedirNombre();
				double saldo = pedirSaldo();
				if(db.ingresar(dni, nombre, saldo)) {
					System.out.println("Ingreso con exito");
				}
			}
			case 5 ->{
				String dni = pedirDNI();
				String nombre = pedirNombre();
				double saldo = pedirSaldo();
				if(db.sacar(dni, nombre, saldo)) {
					System.out.println("Retirado con exito");
				}
			}
			default -> throw new IllegalArgumentException("Unexpected value: " + key);
			}
		} while (key != 0);
	}
	private static String pedirDNI() {
		String dni = "";
		System.out.println("Dame el dni");
		dni = sc.next();
		return dni;
	}
	private static String pedirNombre() {
		String nombre = "";
		System.out.println("Dame el nombre");
		nombre = sc.next();
		return nombre;
	}
	private static double pedirSaldo() {
		double saldo = 0;
		System.out.println("Dame el Saldo");
		saldo = sc.nextDouble();
		return saldo;
	}
}
