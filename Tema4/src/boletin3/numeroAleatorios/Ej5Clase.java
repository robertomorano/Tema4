package boletin3.numeroAleatorios;

public class Ej5Clase {
	public void numerosAleatorios(int num) {
		int i = 0;
		while(i<num) {
			System.out.println((int)(Math.random())*2);
			i++;
		}
	}
	public void numerosAleatorios(int cant, int valorMax) {
		int i = 0;
		while(i<cant) {
			System.out.println((int)(Math.random())*(valorMax+1));
			i++;
		}
	}
	public void numerosAleatorios(int cant, int valorMax, int valorMin) {
		int i = 0;
		while(i<cant) {
			System.out.println((int)(Math.random())*((valorMax+1)-valorMin));
			i++;
		}
	}
}	
