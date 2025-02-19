package boletin3.suma_enteros;

public class SumaEnteros {
	/**
	 * 
	 * @param a
	 * @return
	 */
	public int sumaEnteros(int a) {
		int suma=0;
		if (a != 0) {
			suma = a+sumaEnteros(a-1);
		}
			return suma;
	}
	public double suma(int a, int b) {
		int suma=0;
	if (a >= 0) {
		suma = a+sumaEnteros(a-1);
	}
		return suma;
	}
}
