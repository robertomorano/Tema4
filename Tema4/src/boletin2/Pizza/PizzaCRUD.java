package boletin2.Pizza;

import java.util.HashSet;



public class PizzaCRUD {
	private static HashSet<Pizza> Pizzas = new HashSet<>();
	/**
	 * 
	 */
	public static void listado() {
		for(Pizza pizza: Pizzas) {
			System.out.println(pizza);
			System.out.println("--------------------");
		}
	}
	
	/**
	 * 
	 * @param nueva
	 */
	public static boolean añadir(Pizza nueva) {
		boolean exito = false;
		
		if(!Pizzas.contains(nueva)) {
			Pizzas.add(nueva);
			exito = true;
		}
		
		return exito;
	}
	/**
	 * 
	 * @param pizza
	 */
	public static boolean cambiarEstado(int codigo) {
		boolean cambio = false;
		Pizza pizza = getPizza(codigo);
		if (pizza != null) {
			pizza.changeEstado();
			cambio = true;
		}
		return cambio;
	}
	public static Pizza getPizza(int codigo) {
		Pizza encontrada = null;
		for (Pizza pizza: Pizzas) {
			if (pizza.getCodigo() == codigo) {
				encontrada = pizza;
			}
		}
		
		return encontrada;
	}
}
