package boletin.ejercicios1;

public class Punto {
	int x; 
	int y;
	/**
	 * Constructor del punto 
	 * @param x coordenada cartesiana x
	 * @param y coordenada cartesiana y
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * devuelve la coordenada x
	 * @return x coordenada cartesiana x
	 */
	public int getX() {
		return x;
	}
	/**
	 * da un nuevo valor ax
	 * @param x coordenada cartesiana x
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * devuelve coordenada x	 
	 * @return y coordenada cartesiana y
	 */
	public int getY() {
		return y;
	}
	/**
	 * da un valor nuevo a y 
	 * @param y coordenada cartesiana y
	 */
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * nuevo valor para x e y
	 * @param x coordenada cartesiana x
	 * @param y coordenada cartesiana y
	 */
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * 
	 * @param dx
	 * @param dy
	 */
	public void desplaza(int dx,   int dy) {
		int newX = dx+getX();
		int newY = dy+getY();
		setXY(newX, newY);
	}
	/**
	 * 
	 * @param p
	 * @return
	 */
	public double distancia(Punto p) {
		
		return Math.sqrt((Math.pow(this.x,2)-Math.pow(p.getX(),2))+(Math.pow(this.y,2)-Math.pow(p.getY(),2)));
		
	}
	public String toString() {
		String texto = "";
		
		return texto;
	}
	
}
