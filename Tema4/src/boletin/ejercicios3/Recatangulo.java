package boletin.ejercicios3;

public class Recatangulo {
	int x1 = 0; 
	int y1 = 0;
	int x2 = 0; 
	int y2 = 0;
	/**
	 * 
	 * @param x1 x primer punto
	 * @param y1 y primer punto
	 * @param x2 x segund punto 
	 * @param y2 y segundo punto 
	 */
	public Recatangulo(int x1, int y1, int x2, int y2) {
		if (x1 > 0)
		this.x1 = x1;
		if (y1 > 0)
		this.y1 = y1;
		if (x2 >0)
		this.x2 = x2;
		if (y2 > 0)
		this.y2 = y2;
	}

}
