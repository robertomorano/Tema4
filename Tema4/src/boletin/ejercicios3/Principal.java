package boletin.ejercicios3;

public class Principal {

	public static void main(String[] args) {
		Recatangulo c1 = new Recatangulo(0, 0, 5, 5);
		Recatangulo c2 = new Recatangulo(7, 9, 2, 3);
		int perimetro;
		int area;
		perimetro = ((c1.x2 - c1.x1) + (c1.y2 - c1.y1)) * 2;
		area = (c1.x2 - c1.x1) * (c1.y2 - c1.y1);
		System.out.println("Cuadrado 1: " + perimetro + " Su area es " + area);
		perimetro = ((c2.x2 - c2.x1) + (c2.y2 - c2.y1)) * 2;
		area = (c2.x2 - c2.x1) * (c2.y2 - c2.y1);
		System.out.println("Cuadrado 2: " + perimetro + " Su area es " + area);
	}

}
