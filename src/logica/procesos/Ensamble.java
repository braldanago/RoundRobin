package logica.procesos;



public class Ensamble implements IProceso{
	private int tiempoInicial;
	private int tiempoRestante;
	private boolean usarRecurso;
	private int quantum;

	public Ensamble() {
		this.usarRecurso=false;//Indica que el proceso de ensamble NO usara el recurso que es el metal
		tiempoInicial = 7;
		this.tiempoRestante = this.tiempoInicial;
		this.quantum=4;
	}
	
	@Override
	public String getNombreProceso() {
		return "Ensamble";
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
