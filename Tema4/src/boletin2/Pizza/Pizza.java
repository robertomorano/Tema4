package boletin2.Pizza;

public class Pizza {
	enum Tamanho{
		Mediana, Familiar
	}
	enum Tipo{
		Margarita, CuatroQuesos, Funghi
	}
	enum Estado{
		Pedida, Servida
	}
	private int codigo ;
	private Tamanho tamaño;
	private Tipo tipo;
	private Estado estado;
	
	public Pizza(int codigo, Tamanho tamaño, Tipo tipo) {
		super();
		this.codigo = codigo;
		this.tamaño = tamaño;
		this.tipo = tipo;
		
	}
	public void setTamaño(Tamanho tamaño) {
		this.tamaño = tamaño;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public int getCodigo() {
		return codigo;
	}
	public Tamanho getTamaño() {
		return tamaño;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public Estado getEstado() {
		return estado;
	}
	@Override
	public String toString() {
		String texto = "";
		texto = this.codigo+": ";
		return texto;
	}
}
