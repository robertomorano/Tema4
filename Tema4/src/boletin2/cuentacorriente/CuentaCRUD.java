package boletin2.cuentacorriente;

import java.util.HashSet;

public class CuentaCRUD {
	private static HashSet<CuentaCorriente> cuentas = new HashSet<>();
	
	public void listar() {
		for(CuentaCorriente cuenta: cuentas) {
			System.out.println(cuenta);
			System.out.println("-------------------");
		}
	}
	
	/**
	 * 
	 * @param nuevaCuenta
	 * @return
	 */
	public static boolean añadir(CuentaCorriente nuevaCuenta) {
		boolean exito = false;
		if(!cuentas.contains(nuevaCuenta)) {
			cuentas.add(nuevaCuenta);
			exito = true;
		}
		return exito;
	}
	
	/**
	 * 
	 * @param cuentaEliminar
	 * @return
	 */
	public static boolean eliminar(CuentaCorriente cuentaEliminar) {
		boolean exito = false;
		if(cuentas.contains(cuentaEliminar)) {
			cuentas.remove(cuentaEliminar);
			exito = true;
		}
		return exito;
	}
	
	public static CuentaCorriente buscarCuenta(String dni, String nombre){
		CuentaCorriente encontrada = null;
		CuentaCorriente comparar = new CuentaCorriente(dni, nombre);
		for(CuentaCorriente cuenta :cuentas) {
			if(cuenta.equals(comparar)){
				encontrada = cuenta;
			}
		}
		return encontrada;
	}
	
	public static boolean ingresar(String dni, String nombre, double saldo) {
		boolean exito = false;
		CuentaCorriente cuentaIngresa = buscarCuenta(dni, nombre);
		if(cuentaIngresa != null) {
			cuentas.remove(cuentaIngresa);
			cuentaIngresa.ingresarDinero(saldo);
			cuentas.add(cuentaIngresa);
			exito = true;
		}
		return exito;
	}
	
	public static boolean sacar(String dni, String nombre, double saldo) {
		boolean exito = false;
		CuentaCorriente cuentaIngresa = buscarCuenta(dni, nombre);
		if(cuentaIngresa != null) {
			cuentas.remove(cuentaIngresa);
			cuentaIngresa.sacarDinero(saldo);
			cuentas.add(cuentaIngresa);
			exito = true;
		}
		return exito;
	}

}
