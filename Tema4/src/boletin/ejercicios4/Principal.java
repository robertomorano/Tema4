package boletin.ejercicios4;

public class Principal {

	public static void main(String[] args) {
		Articulo pjama = new Articulo();
		pjama.nombre="pijama";
		pjama.precio= 10;
		pjama.stock = 500;
//		pjama.iva= 21;
		double pvp= (pjama.precio+ (pjama.precio*(pjama.iva/100)));
		System.out.println(pvp);

	}

}
