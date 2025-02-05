package boletin.ejercicios1;

public class Punto {
	int x; 
	int y;
	/**
	 * 
	 * @param x
	 * @param y
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * 
	 * @return x
	 */
	public int getX() {
		return x;
	}
	/**
	 * 
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * 
	 * @return y
	 */
	public int getY() {
		return y;
	}
	/**
	 * 
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void desplaza(int   dx,   int   dy) {
		int newX = dx+getX();
		int newY = dx+getY();
		setXY(newX, newY);
	}
	/**
	 * 
	 * @param p
	 * @return
	 */
	public double distancia(Punto p) {
		return Math.sqrt(Math.pow(this.x-)+Math.pow(getY()));
	}
	
}
