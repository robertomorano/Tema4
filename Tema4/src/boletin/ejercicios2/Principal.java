package boletin.ejercicios2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Persona p1 ;
		Persona p2 ; 
		String nombre = "";
		String apellidos = "";
		String dni = "";
		int edad;
		//Pedir datos
		System.err.println("Nombre lomo ya");
		nombre = sc.nextLine();
		System.out.println("Apellido");
		apellidos = sc.nextLine();
		System.out.println("dni");
		dni = sc.nextLine();
		System.out.println("edad");
		edad = sc.nextInt();
		sc.nextLine();
		p1 = new Persona(nombre, apellidos, dni, edad);
		System.err.println("Nombre lomo ya");
		nombre = sc.nextLine();
		System.out.println("Apellido");
		apellidos = sc.nextLine();
		System.out.println("dni");
		dni = sc.nextLine();
		System.out.println("edad");
		edad = sc.nextInt();
		sc.nextLine();
		p2 = new Persona(nombre, apellidos, dni, edad);
		if (p1.edad> 17) {
			System.out.println(p1.nombre+" "+ p1.apellidos+"con DNI "+ p1.dni +" Es mayor de edad");
		}else {
			System.out.println(p1.nombre+" "+ p1.apellidos+"con DNI "+ p1.dni +" No es mayor de edad");
		}
		if (p2.edad> 17) {
			System.out.println(p2.nombre+" "+ p2.apellidos+"con DNI "+ p2.dni +" Es mayor de edad");
		}else {
			System.out.println(p2.nombre+ " "+p2.apellidos+"con DNI "+ p2.dni +" No es mayor de edad");
		}
		sc.close();
			
	}

}
