package boletin.ejercicios1;

public class Principal {
	public static void main(String[] args) {
		Punto punto1 = new Punto(0, 5);
		Punto punto2 = new Punto(10, 10);
		Punto punto3 = new Punto(-3, 7);
		System.out.println("Punto 1: "+punto1.x+", "+punto1.y);
		System.out.println("Punto 2: "+punto2.x+", "+punto2.y);
		System.out.println("Punto 3: "+punto3.x+", "+punto3.y);
		
		punto3.x -= punto1.x; 
	}
}
