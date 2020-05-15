package logica.procesos;

public class Calidad implements IProceso {
	private int tiempoInicial;
	private int tiempoRestante;
	private boolean usarRecurso;
	private int quantum;
	
	public Calidad() {
		this.usarRecurso=false;//Indica que el proceso de CALIDAD NO usara el recurso que es el metal
		tiempoInicial = 9;
		tiempoRestante = tiempoInicial;
		
		quantum=3;
	}
	
	@Override
	public String getNombreProceso() {
		return "Control Calidad";
	}

	@Override
	public int getTiempoInicial() {
		return this.tiempoInicial;
	}

	@Override
	public void setTiempoInicial(int tiempoIni) {
		this.tiempoInicial=tiempoIni;
	}

	@Override
	public int getTiempoRestante() {
		return this.tiempoRestante;
	}

	@Override
	public void setTiempoRestante(int tiempoRest) {
		this.tiempoRestante= tiempoRest;
	}

	@Override
	public boolean getUsarRecurso() {
		return this.usarRecurso;
	}

	@Override
	public int getQuantum() {
		return this.quantum;
	}

	@Override
	public void setQuantum(int valor) {
		this.quantum=valor;
	}

	

}
