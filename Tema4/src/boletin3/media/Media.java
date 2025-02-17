package boletin3.media;

public class Media {
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public double media(int a, int b) {
		double avg = 0;
		avg = (double)((a+b)/2);
		return avg;
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public double media(int a, int b, int c) {
		return	(double) (a+b+c)/3;
	}
}
