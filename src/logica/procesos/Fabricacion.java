package logica.procesos;

public class Fabricacion implements IProceso {
	private int tiempoInicial;
	private int tiempoRestante;
	private boolean usarRecurso;
	private int quantum;
	
	
	public Fabricacion() {
		this.usarRecurso=true;//Indica que el proceso de fabricacion usara el recurso que es el metal
		tiempoInicial = 11;
		tiempoRestante = tiempoInicial;
		
		quantum=5;
	}
	
	@Override
	public String getNombreProceso() {
		return "Fabricación";
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
