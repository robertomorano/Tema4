package boletin.ejercicios1;

public class Principal {
	public static void main(String[] args) {
		Punto punto1 = new Punto();

		Punto punto2 = new Punto();
		Punto punto3 = new Punto();
		//Inicializar
		punto1.x = 0;
		punto1.y = 5;
		punto2.x = 10;
		punto2.y = 10;
		punto3.x = -3;
		punto3.y = 7;
		System.out.println("Punto 1: "+punto1.x+", "+punto1.y);
		System.out.println("Punto 2: "+punto2.x+", "+punto2.y);
		System.out.println("Punto 3: "+punto3.x+", "+punto3.y);
		
		punto3.x -= punto1.x; 
	}
}
