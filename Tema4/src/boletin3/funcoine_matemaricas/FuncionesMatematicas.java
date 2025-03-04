package boletin3.funcoine_matemaricas;

public class FuncionesMatematicas {
	public int sumaEnteros(int a) {
		int suma=0;
		if (a > 0) {
			suma = a+sumaEnteros(a-1);
		}
			return suma;
	}
	
	public double potencia(double a, int n) {
		double potence = a;
		if (n>0) {
			potence *= potencia(a , n-1);
		}
		
		return potence;
	}
	static public int serieFibonacci(int numero) {
		int serie = 0;
		if (numero == 0 || numero == 1) {
			serie += 1;
		}else { 
			serie = serieFibonacci(numero-1) + serieFibonacci(numero-2);
		}
		System.out.println(serie);
		System.out.println(serie +" + " +numero);
		return serie;
	}
	public static void main(String[] args) {
		System.out.println(serieFibonacci(9));
	}
}



