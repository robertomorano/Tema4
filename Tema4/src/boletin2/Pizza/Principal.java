package boletin2.Pizza;

import java.util.Scanner;


public class Principal {
	static PizzaCRUD db = new PizzaCRUD();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
	}
	/**
	 * 
	 */
	static void menu() {
		
		int key = 0;
		System.out.println("1. Listado.\r\n"
				+ "2. Nueva Pizza.\r\n"
				+ "3.Pizza servida.\r\n"
				+ "5. Salir.\r\n"
				+ "");
		key = sc.nextInt();
		switch (key) {
		case 1 ->{
			db.listado();
		}
		case 2 ->{
			Pizza nuevo = creaPizza();
			if (db.añadir(nuevo)) {
				System.out.println("Añadido con exito");
			}
		}
		case 3 ->{
			int codigo = pedirCodigo();
			if(PizzaCRUD.cambiarEstado(codigo)) {
				System.out.println("Cambio con exito");
			}
		}
		
		default ->
		throw new IllegalArgumentException("Unexpected value: " + key);
		}
	}
	/**
	 * 
	 * @return
	 */
	static Pizza creaPizza() {
		int codigo;
		String tamano;
		String tipo;
		codigo  = pedirCodigo();
		tamano = pedirTamano();
		tipo = pedirTipo();
		Pizza nuevo = new Pizza(codigo, tamano, tipo);
		return nuevo;
	}

	
	private static String pedirTipo() {
		String tipo;
		System.out.println("Dame un tipo");
		tipo = sc.next();
		return tipo;
	}
	/**
	 * @return
	 */
	private static String pedirTamano() {
		String tamano;
		System.out.println("Dame un tamaño");
		tamano = sc.next();
		return tamano;
	}
	
	/**
	 * 
	 * @return
	 */
	private static int pedirCodigo() {
		int codigo;
		System.out.println("Dame un codigo");
		codigo = sc.nextInt();
		return codigo;
	}
}
