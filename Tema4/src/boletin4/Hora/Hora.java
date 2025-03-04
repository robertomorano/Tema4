package boletin4.Hora;

public class Hora {
	private int segundos=0;
	private int minutos=0;
	private int hora=0;
	
	/**
	 * 
	 * @param hora
	 * @param minutos
	 * @param segundos
	 */
	
	public Hora(int hora, int minutos, int segundos){
		if (hora< 60 && hora >= 0) {
			this.hora = hora;
		}
		if (minutos< 60 && minutos >= 0) {
			this.minutos = minutos;
		}
		if(segundos< 60 && segundos>=0) {
			this.segundos= segundos;
		}
		
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}
	
	public void incrementar(int incremento) {
		this.segundos += incremento;
		int diferencia;
		while (this.segundos > 60) {
			diferencia = this.segundos - 60;
			this.segundos = diferencia;
			this.minutos++;
			
			 
		}
	}
}
