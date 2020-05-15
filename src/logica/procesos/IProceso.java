package logica.procesos;

public interface IProceso {
	
	public String getNombreProceso();
	public int getTiempoInicial();
	public void setTiempoInicial(int tiempoIni);
	public int getTiempoRestante();
	public void setTiempoRestante(int tiempoRest);
	public boolean getUsarRecurso();
	public int getQuantum();
	public void setQuantum(int valor);
	
}

