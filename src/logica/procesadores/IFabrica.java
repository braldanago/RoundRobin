package logica.procesadores;

import java.util.ArrayList;

public interface IFabrica {
	public boolean estaDisponible();
	public void setEstaDisponible(boolean valor);
	public int getTiempoEjecucion();
	public int getQuantum();
	public String getNombreProceso();
	public ArrayList<String> getListaProcesosListos();
	public ArrayList<String> getListaProcesosSuspendidos();
	public ArrayList<String> getListaProcesosBloqueados();
	public ArrayList<String> getListaProcesosTerminados();
	public void llenarEnCaliente();
	
}
