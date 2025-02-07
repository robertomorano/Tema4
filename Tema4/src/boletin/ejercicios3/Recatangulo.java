package boletin.ejercicios3;

public class Recatangulo {
	private int x1 = 0;
	private int y1 = 0;
	private int x2 = 0;
	private int y2 = 0;

	/**
	 * 
	 * @param x1 x primer punto
	 * @param y1 y primer punto
	 * @param x2 x segund punto
	 * @param y2 y segundo punto
	 */
	public Recatangulo(int x1, int y1, int x2, int y2) {
		if ((x1 < x2) && (y1 < y2)){
			this.x1 = x1;
			this.x2 = x2;
			this.y1 = y1;
			this.y2 = y2;
		}
	
	}

	/**
	 * 
	 * @return
	 */
	public int getX1() {
		return x1;
	}

	/**
	 * 
	 * @param x1
	 */
	public void setX1(int x1) {
		if (x1 > 0) {
			this.x1 = x1;
		}
	}

	/**
	 * 
	 * @return
	 */
	public int getY1() {
		return y1;
	}

	/**
	 * 
	 * @param y1
	 */
	public void setY1(int y1) {
		if (y1 > 0) {
			this.y1 = y1;
		}
	}

	/**
	 * 
	 * @return
	 */
	public int getX2() {
		return x2;
	}

	/**
	 * 
	 * @param x2
	 */
	public void setX2(int x2) {
		if (x2 > 0) {
			this.x2 = x2;
		}
	}

	/**
	 * 
	 * @return
	 */
	public int getY2() {
		return y2;
	}

	/**
	 * 
	 * @param y2
	 */
	public void setY2(int y2) {
		if (y2 > 0) {
			this.y2 = y2;
		}
	}
	/**
	 * 
	 * @param x
	 * @param y
	 */
	public void setX1Y1(int x, int y) {
		this.x1 = x;
		this.y1 = y;
	}
	public void setX2Y2(int x, int y) {
		this.x2 = x;
		this.y2 = y;
	}
	public void setAll(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	/**
	 * 
	 * @return
	 */
	public int getArea() {
		return (this.x2 - this.x1) * (this.y2 - this.y1) ;
	}
	/**
	 * 
	 * @return
	 */
	public int getPerimetro() {
		return ((this.x2 - this.x1) + (this.y2 - this.y1));
	}
}
