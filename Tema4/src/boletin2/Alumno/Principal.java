package boletin2.Alumno;

import java.util.Scanner;

public class Principal {
	static AlumnoCRUD db = new AlumnoCRUD();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		menu();
	}

	static void menu() {

		int key = 0;
		do {
			System.out.println("1. Listado.\r\n" + "2. Nuevo Alumno.\r\n" + "3. Modificar.\r\n" + "4. Borrar.\r\n"
					+ "5. Salir.\r\n" + "");
			key = sc.nextInt();
			switch (key) {
			case 1 -> {
				db.listado();
			}
			case 2 -> {
				Alumno nuevo = creaAlumno();
				if (db.añadir(nuevo)) {
					System.out.println("Añadido con ");
				}
			}
			case 3 -> {
				String nombre = pedirNombre();
				modificar(nombre);
			}
			default -> throw new IllegalArgumentException("Unexpected value: " + key);
			}
		} while (key != 0);
	}

	static Alumno creaAlumno() {
		String nombre;
		double notamedia;

		nombre = pedirNombre();
		notamedia = pedirNota();

		Alumno nuevo = new Alumno(nombre, notamedia);
		return nuevo;
	}

	/**
	 * @return
	 */
	private static double pedirNota() {
		double notamedia;
		System.out.println("Tu nota media");
		notamedia = sc.nextInt();
		return notamedia;
	}

	private static String pedirNombre() {
		String nombre;
		System.out.println("Dame un nombre");
		nombre = sc.next();
		return nombre;
	}

	private static void modificar(String nombr) {
		double nuevaNota = pedirNota();
		Alumno cambio = db.cambiarNota(nombr, nuevaNota) ;
		
		if(cambio != null) {
			db.eliminar(nombr);
			db.añadir(cambio)
		}

	}

}
