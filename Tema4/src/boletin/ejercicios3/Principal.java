package boletin.ejercicios3;

public class Principal {

	public static void main(String[] args) {
		 Recatangulo c1 = new Recatangulo();
		 Recatangulo c2 = new Recatangulo();
		 int perimetro;
		 int area;
		 c1.x1 = 0;
		 c1.y1 = 0;
		 c1.x2 = 5;
		 c1.y2 = 5;
		 c2.x1 = 7;
		 c2.y1 = 9;
		 c2.x2 = 2;
		 c2.y2 = 3;
		 perimetro= ((c1.x2-c1.x1)+(c1.y2-c1.y1)) * 2;
		 area = (c1.x2-c1.x1)*(c1.y2-c1.y1);
		 System.out.println("Cuadrado 1: "+ perimetro+ " Su area es "+ area );
		 perimetro= ((c2.x2-c2.x1)+(c2.y2-c2.y1)) * 2;
		 area = (c2.x2-c2.x1)*(c2.y2-c2.y1);
	}

}
