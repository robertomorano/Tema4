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
		if (x1 > 0) {
			this.x1 = x1;
		}
		if (y1 > 0) {
			this.y1 = y1;
		}
		if (x2 > 0) {
			this.x2 = x2;
		}
		if (y2 > 0) {
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

}
