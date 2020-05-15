package presentacion;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import presentacion.vistas.VistaJuego;

public class Controlador implements KeyListener {
	private final VistaJuego ventana;
	private JButton boton;
	
	
	
	public Controlador(VistaJuego window){
		ventana = window;
	}
	/*
	@Override
	public void mouseClicked(MouseEvent arg0) {

		boton =(JButton) arg0.getSource(); 
		if(boton == ventana.getBtnInsertarProcesoPistola()) {
			ventana.getModelo().getSistema().getFabricaPistola().llenarEnCaliente();
		}else if(boton == ventana.getBtnInsertarProcesoEscopeta()) {
			ventana.getModelo().getSistema().getFabricaEscopeta().llenarEnCaliente();
		}else if(boton == ventana.getBtnInsertarProcesoSniper()) {
			ventana.getModelo().getSistema().getFabricaSniper().llenarEnCaliente();
		}

	}*/

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_A) {
			ventana.getModelo().getSistema().getFabricaPistola().llenarEnCaliente();
		}else if (e.getKeyCode()==KeyEvent.VK_D) {
			ventana.getModelo().getSistema().getFabricaEscopeta().llenarEnCaliente();
		}else if (e.getKeyCode()==KeyEvent.VK_G) {
			ventana.getModelo().getSistema().getFabricaSniper().llenarEnCaliente();
		}
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {

	}

}
