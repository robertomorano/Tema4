package boletin.ejercicios2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		//Pedir datos
		System.err.println("Nombre lomo ya");
		p1.nombre = sc.nextLine();
		System.out.println("Apellido");
		p1.apellidos = sc.nextLine();
		System.out.println("dni");
		p1.dni = sc.nextLine();
		System.out.println("edad");
		p1.edad = sc.nextInt();
		sc.nextLine();
		System.err.println("Nombre lomo ya");
		p2.nombre = sc.nextLine();
		System.out.println("Apellido");
		p2.apellidos = sc.nextLine();
		System.out.println("dni");
		p2.dni = sc.nextLine();
		System.out.println("edad");
		p2.edad = sc.nextInt();
		sc.nextLine();
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
