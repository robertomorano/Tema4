package boletin.ejercicios4;

public class Principal {

	public static void main(String[] args) {
		Articulo pjama = new Articulo("pijama", 10, 500);
		double pvp = pjama.getPVP();
		System.out.println(pvp);
	}

}
	