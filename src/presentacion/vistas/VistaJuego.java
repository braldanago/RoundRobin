package presentacion.vistas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import presentacion.Controlador;
import presentacion.Modelo;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;

import java.awt.Color;
import javax.swing.ImageIcon;


import java.awt.List;
import java.util.ArrayList;


@SuppressWarnings("serial")
public class VistaJuego extends JFrame {

	private JPanel contentPane;
	private Modelo modelo;
	private Controlador controlador;
	
	
	JLabel lblMetal;
	JLabel lblTitulo;
	JLabel lblFondo; 
	
	JLabel lblTiempoJuego;
	
	JLabel lblFabricaPistola;
	
	JLabel lblValorTiempoEjecucionPistola;
	JLabel lblValorQuantumPistola;
	JLabel lblNomProcesoPistola;
	List colaListoPistolas;
	List colaSuspendidoPistola;
	List colaBloqueadoPistola;
	List colaTerminadoPistola;
	
	JLabel lblValorTiempoEjecucionEscopeta;
	JLabel lblValorQuantumEscopeta;
	JLabel lblNomProcesoEscopeta;
	List colaListoEscopetas;
	List colaSuspendidoEscopeta;
	List colaBloqueadoEscopeta;
	List colaTerminadoEscopeta;
	
	JLabel lblNomProcesoSniper;
	JLabel lblValorTiempoEjecucionSniper;
	JLabel lblValorQuantumSniper;
	List colaListoSnipers;
	List colaSuspendidoSniper;
	List colaBloqueadoSniper;
	List colaTerminadoSniper;
	
	JButton btnInsertarProcesoPistola;
	JButton btnInsertarProcesoEscopeta;
	JButton btnInsertarProcesoSniper;
	
	
	public VistaJuego(Modelo modelo) {
		setAutoRequestFocus(false);
		setResizable(false);
		setAlwaysOnTop(true);
		//setLocation(0, 0);
		setTitle("Round Robin");
		this.modelo=modelo;
		initComponents();
		capturarEventos();
		
	}
	
	public JButton getBtnInsertarProcesoPistola() {
		return btnInsertarProcesoPistola;
	}
	
	public JButton getBtnInsertarProcesoEscopeta() {
		return btnInsertarProcesoEscopeta;
	}
	
	public JButton getBtnInsertarProcesoSniper() {
		return btnInsertarProcesoSniper;
	}
	
	public void initComponents() {
		setBounds(400, 500, 1206, 740);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		esperar(20);
		lblTitulo = new JLabel("Round Robin");
		lblTitulo.setFont(new Font("Old English Text MT", Font.BOLD, 36));
		lblTitulo.setBounds(488, 21, 238, 32);
		contentPane.add(lblTitulo);
		
		esperar(20);
		lblMetal = new JLabel("New label");
		lblMetal.setIcon(new ImageIcon(VistaJuego.class.getResource("/imagenes/recurso/MetalDisponible.png")));
		lblMetal.setBounds(502, 42, 194, 194);
		contentPane.add(lblMetal);

		esperar(20);
		lblFabricaPistola = new JLabel("");
		lblFabricaPistola.setIcon(new ImageIcon(VistaJuego.class.getResource("/imagenes/Fabricas/FabricaPistola.png")));
		lblFabricaPistola.setBounds(48, 236, 260, 170);
		contentPane.add(lblFabricaPistola);
		
		esperar(20);
		JLabel lblTituloFabricaPistola = new JLabel("PISTOLAS");
		lblTituloFabricaPistola.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		lblTituloFabricaPistola.setBounds(138, 222, 89, 14);
		contentPane.add(lblTituloFabricaPistola);
		
		esperar(20);
		JLabel lblSeccionCriticaPistola = new JLabel("Seccion critica.");
		lblSeccionCriticaPistola.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSeccionCriticaPistola.setBounds(138, 402, 89, 14);
		contentPane.add(lblSeccionCriticaPistola);
		
		esperar(20);
		JLabel lblProcesoPistolas = new JLabel("Proceso:");
		lblProcesoPistolas.setBounds(135, 428, 74, 14);
		contentPane.add(lblProcesoPistolas);
		
		esperar(20);
		lblNomProcesoPistola = new JLabel("New label");
		lblNomProcesoPistola.setBounds(219, 428, 89, 14);
		contentPane.add(lblNomProcesoPistola);
		
		esperar(20);
		JLabel lblTiempoEjecucionPistola = new JLabel("Tiempo ejecucion:");
		lblTiempoEjecucionPistola.setBounds(135, 453, 117, 14);
		contentPane.add(lblTiempoEjecucionPistola);
		
		esperar(20);
		lblValorTiempoEjecucionPistola = new JLabel("New label");
		lblValorTiempoEjecucionPistola.setBounds(262, 453, 46, 14);
		contentPane.add(lblValorTiempoEjecucionPistola);
		
		esperar(20);
		JLabel lblQuantumPistola = new JLabel("Quantum:");
		lblQuantumPistola.setBounds(135, 478, 76, 14);
		contentPane.add(lblQuantumPistola);
		
		esperar(20);
		lblValorQuantumPistola = new JLabel("New label");
		lblValorQuantumPistola.setBounds(262, 478, 46, 14);
		contentPane.add(lblValorQuantumPistola);
		
		esperar(20);
		JLabel lblListoPistola = new JLabel("Listo");
		lblListoPistola.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblListoPistola.setBounds(70, 510, 46, 14);
		contentPane.add(lblListoPistola);
		
		esperar(20);
		JLabel lblSuspendidoPistola = new JLabel("Suspendido");
		lblSuspendidoPistola.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSuspendidoPistola.setBounds(133, 510, 72, 14);
		contentPane.add(lblSuspendidoPistola);
		
		esperar(20);
		JLabel lblBloqueadoPistola = new JLabel("Bloqueado");
		lblBloqueadoPistola.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBloqueadoPistola.setBounds(223, 511, 65, 14);
		contentPane.add(lblBloqueadoPistola);
		
		esperar(20);
		JLabel lblTerminadoPistola = new JLabel("Terminado");
		lblTerminadoPistola.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTerminadoPistola.setBounds(308, 511, 63, 14);
		contentPane.add(lblTerminadoPistola);
		
		esperar(20);
		colaListoPistolas = new List();
		colaListoPistolas.setFont(new Font("Arial", Font.PLAIN, 10));
		colaListoPistolas.setBounds(40, 530, 80, 102);
		contentPane.add(colaListoPistolas);
		
		esperar(20);
		colaSuspendidoPistola = new List();
		colaSuspendidoPistola.setFont(new Font("Arial", Font.PLAIN, 10));
		colaSuspendidoPistola.setBounds(126, 530, 80, 102);
		contentPane.add(colaSuspendidoPistola);
		
		esperar(20);
		colaBloqueadoPistola = new List();
		colaBloqueadoPistola.setFont(new Font("Arial", Font.PLAIN, 10));
		colaBloqueadoPistola.setBounds(212, 530, 80, 102);
		contentPane.add(colaBloqueadoPistola);
		
		esperar(20);
		colaTerminadoPistola = new List();
		colaTerminadoPistola.setFont(new Font("Arial", Font.PLAIN, 10));
		colaTerminadoPistola.setBounds(298, 530, 80, 102);
		contentPane.add(colaTerminadoPistola);
	
		//ELEMENTOS DE ESCOPETA
		esperar(20);
		JLabel lblFabricaEscopeta = new JLabel("");
		lblFabricaEscopeta.setIcon(new ImageIcon(VistaJuego.class.getResource("/imagenes/Fabricas/FabricaEscopeta.png")));
		lblFabricaEscopeta.setBounds(473, 236, 260, 170);
		contentPane.add(lblFabricaEscopeta);
		
		esperar(20);
		JLabel lblTituloFabricaEscopeta = new JLabel("ESCOPETAS");
		lblTituloFabricaEscopeta.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		lblTituloFabricaEscopeta.setBounds(538, 224, 117, 14);
		contentPane.add(lblTituloFabricaEscopeta);
		
		esperar(20);
		JLabel label = new JLabel("Seccion critica.");
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(556, 402, 89, 14);
		contentPane.add(label);
		
		esperar(20);
		JLabel label_1 = new JLabel("Proceso:");
		label_1.setBounds(553, 428, 74, 14);
		contentPane.add(label_1);
		
		esperar(20);
		lblNomProcesoEscopeta = new JLabel("New label");
		lblNomProcesoEscopeta.setBounds(637, 428, 89, 14);
		contentPane.add(lblNomProcesoEscopeta);
		
		esperar(20);
		JLabel label_3 = new JLabel("Tiempo ejecucion:");
		label_3.setBounds(553, 453, 117, 14);
		contentPane.add(label_3);
		
		esperar(20);
		lblValorTiempoEjecucionEscopeta = new JLabel("New label");
		lblValorTiempoEjecucionEscopeta.setBounds(680, 453, 46, 14);
		contentPane.add(lblValorTiempoEjecucionEscopeta);
		
		esperar(20);
		JLabel label_5 = new JLabel("Quantum:");
		label_5.setBounds(553, 478, 76, 14);
		contentPane.add(label_5);
		
		esperar(20);
		lblValorQuantumEscopeta = new JLabel("New label");
		lblValorQuantumEscopeta.setBounds(680, 478, 46, 14);
		contentPane.add(lblValorQuantumEscopeta);
		
		esperar(20);
		JLabel label_2 = new JLabel("Listo");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_2.setBounds(459, 510, 46, 14);
		contentPane.add(label_2);
		
		esperar(20);
		JLabel label_4 = new JLabel("Suspendido");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_4.setBounds(522, 510, 72, 14);
		contentPane.add(label_4);
		
		esperar(20);
		JLabel label_6 = new JLabel("Bloqueado");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_6.setBounds(612, 511, 65, 14);
		contentPane.add(label_6);
		
		esperar(20);
		JLabel label_7 = new JLabel("Terminado");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_7.setBounds(697, 511, 63, 14);
		contentPane.add(label_7);
		
		esperar(20);
		colaListoEscopetas = new List();
		colaListoEscopetas.setFont(new Font("Arial", Font.PLAIN, 10));
		colaListoEscopetas.setBounds(429, 530, 80, 102);
		contentPane.add(colaListoEscopetas);
		
		esperar(20);
		colaSuspendidoEscopeta = new List();
		colaSuspendidoEscopeta.setFont(new Font("Arial", Font.PLAIN, 10));
		colaSuspendidoEscopeta.setBounds(515, 530, 80, 102);
		contentPane.add(colaSuspendidoEscopeta);
		
		esperar(20);
		colaBloqueadoEscopeta = new List();
		colaBloqueadoEscopeta.setFont(new Font("Arial", Font.PLAIN, 10));
		colaBloqueadoEscopeta.setBounds(601, 530, 80, 102);
		contentPane.add(colaBloqueadoEscopeta);
		
		esperar(20);
		colaTerminadoEscopeta = new List();
		colaTerminadoEscopeta.setFont(new Font("Arial", Font.PLAIN, 10));
		colaTerminadoEscopeta.setBounds(687, 530, 80, 102);
		contentPane.add(colaTerminadoEscopeta);
		
		
		//ELEMENTOS DE SNIPER
		esperar(20);
		JLabel lblFabricaSniper = new JLabel("");
		lblFabricaSniper.setIcon(new ImageIcon(VistaJuego.class.getResource("/imagenes/Fabricas/FabricaSniper.png")));
		lblFabricaSniper.setBounds(867, 236, 260, 170);
		contentPane.add(lblFabricaSniper);
		
		esperar(20);
		JLabel lblTituloFabricaSniper = new JLabel("SNIPERS");
		lblTituloFabricaSniper.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		lblTituloFabricaSniper.setBounds(953, 224, 89, 14);
		contentPane.add(lblTituloFabricaSniper);
		
		esperar(20);
		JLabel label_8 = new JLabel("Seccion critica.");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_8.setBounds(957, 402, 89, 14);
		contentPane.add(label_8);
		
		esperar(20);
		JLabel label_9 = new JLabel("Proceso:");
		label_9.setBounds(954, 428, 74, 14);
		contentPane.add(label_9);
		
		esperar(20);
		lblNomProcesoSniper = new JLabel("New label");
		lblNomProcesoSniper.setBounds(1038, 428, 89, 14);
		contentPane.add(lblNomProcesoSniper);
		
		esperar(20);
		JLabel label_11 = new JLabel("Tiempo ejecucion:");
		label_11.setBounds(954, 453, 117, 14);
		contentPane.add(label_11);
		
		esperar(20);
		lblValorTiempoEjecucionSniper = new JLabel("New label");
		lblValorTiempoEjecucionSniper.setBounds(1081, 453, 46, 14);
		contentPane.add(lblValorTiempoEjecucionSniper);
		
		esperar(20);
		JLabel label_13 = new JLabel("Quantum:");
		label_13.setBounds(954, 478, 76, 14);
		contentPane.add(label_13);
		
		esperar(20);
		lblValorQuantumSniper = new JLabel("New label");
		lblValorQuantumSniper.setBounds(1081, 478, 46, 14);
		contentPane.add(lblValorQuantumSniper);
		
		esperar(20);
		JLabel label_10 = new JLabel("Listo");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_10.setBounds(853, 510, 46, 14);
		contentPane.add(label_10);
		
		esperar(20);
		JLabel label_12 = new JLabel("Suspendido");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_12.setBounds(916, 510, 72, 14);
		contentPane.add(label_12);
		
		esperar(20);
		JLabel label_14 = new JLabel("Bloqueado");
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_14.setBounds(1006, 511, 65, 14);
		contentPane.add(label_14);
		
		esperar(20);
		JLabel label_15 = new JLabel("Terminado");
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_15.setBounds(1091, 511, 63, 14);
		contentPane.add(label_15);
		
		esperar(20);
		colaListoSnipers = new List();
		colaListoSnipers.setFont(new Font("Arial", Font.PLAIN, 10));
		colaListoSnipers.setBounds(823, 530, 80, 102);
		contentPane.add(colaListoSnipers);
		
		esperar(20);
		colaSuspendidoSniper = new List();
		colaSuspendidoSniper.setFont(new Font("Arial", Font.PLAIN, 10));
		colaSuspendidoSniper.setBounds(909, 530, 80, 102);
		contentPane.add(colaSuspendidoSniper);
		
		esperar(20);
		colaBloqueadoSniper = new List();
		colaBloqueadoSniper.setFont(new Font("Arial", Font.PLAIN, 10));
		colaBloqueadoSniper.setBounds(995, 530, 80, 102);
		contentPane.add(colaBloqueadoSniper);
		
		esperar(20);
		colaTerminadoSniper = new List();
		colaTerminadoSniper.setFont(new Font("Arial", Font.PLAIN, 10));
		colaTerminadoSniper.setBounds(1081, 530, 80, 102);
		contentPane.add(colaTerminadoSniper);
		
		
		///////*INSERCION DE PROCESOS*//////////////////
		esperar(20);
		btnInsertarProcesoPistola = new JButton("PRESIONA TECLA A");
		btnInsertarProcesoPistola.setBounds(138, 638, 145, 23);
		contentPane.add(btnInsertarProcesoPistola);
		
		esperar(20);
		btnInsertarProcesoEscopeta = new JButton("PRESIONA TECLA D");
		btnInsertarProcesoEscopeta.setBounds(532, 638, 145, 23);
		contentPane.add(btnInsertarProcesoEscopeta);
		
		esperar(20);
		btnInsertarProcesoSniper = new JButton("PRESIONA TECLA G");
		btnInsertarProcesoSniper.setBounds(920, 638, 145, 23);
		contentPane.add(btnInsertarProcesoSniper);
		
		esperar(20);
		
		JLabel lblTiempo = new JLabel("TIEMPO");
		lblTiempo.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		lblTiempo.setBounds(953, 39, 89, 14);
		contentPane.add(lblTiempo);
		
		esperar(20);
		lblTiempoJuego = new JLabel("0");
		lblTiempoJuego.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTiempoJuego.setBounds(970, 53, 58, 49);
		contentPane.add(lblTiempoJuego);
		
		esperar(20);
		lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(VistaJuego.class.getResource("/imagenes/mapa.png")));
		lblFondo.setBounds(0, 0, 1200, 701);
		contentPane.add(lblFondo);

		this.setVisible(true);
		
	}
	
    public Modelo getModelo() {
        return modelo;
    }
    
    public Controlador getControlador() {
    	if(controlador==null) {
    		controlador = new Controlador(this);
    	}
    	return controlador;
    }
    
    /*
     * Cambia una imagen segun el estado del recurso metalico
     */
    public void cambiarEstadoMetal(String texto) {
    	lblMetal.setIcon(new ImageIcon(VistaJuego.class.getResource(texto)));
    }
    
    
    
    //////////////////*METODOS PISTOLA*///////////////////////////////
    /*
     * Cambia el nombre del proceso que esta en la seccion critica de la fabrica de pistola
     */
    public void cambiarProcesoPistola(String nombre) {
    	lblNomProcesoPistola.setText(nombre);
    }
    
    /*
     * Cambia el quantum del proceso que esta en la seccion critica de la fabrica de pistola
     */
    public void cambiarQuantumPistola(int valor) {
    	lblValorQuantumPistola.setText(""+valor);
    }
    
    /*
     * Cambia el tiempo restante del proceso que esta en la seccion critica de la fabrica de pistola
     */
    public void cambiarTiempoRestantePistola(int valor) {
    	lblValorTiempoEjecucionPistola.setText(""+valor);
    }
    
    /*
     * Recibe arreglo de valores para llenar la "cola" de listos en pistola
     */
	public void llenarListosPistola(ArrayList<String> listos) {
    	String valor = null;
    	int i = 0;
    	colaListoPistolas.removeAll();
    	while(listos.size()>i) {
    		valor = listos.get(i);
    		colaListoPistolas.add(valor);
    		i++;
    	}
    }
	/*
     * Recibe arreglo de valores para llenar la "cola" de suspendidos en pistola
     */
	public void llenarSuspendidosPistola(ArrayList<String> susp) {
    	String valor = null;
    	int i = 0;
    	colaSuspendidoPistola.removeAll();
    	while(susp.size()>i) {
    		valor = susp.get(i);
    		colaSuspendidoPistola.add(valor);
    		i++;
    	}
    }
    
	/*
     * Recibe arreglo de valores para llenar la "cola" de bloqueados en pistola
     */
	public void llenarBloqueadosPistola(ArrayList<String> bloq) {
    	String valor = null;
    	int i = 0;
    	colaBloqueadoPistola.removeAll();
    	while(bloq.size()>i) {
    		valor = bloq.get(i);
    		colaBloqueadoPistola.add(valor);
    		i++;
    	}
    }
    
	/*
     * Recibe arreglo de valores para llenar la "cola" de terminados en pistola
     */
	public void llenarTerminadosPistola(ArrayList<String> ter) {
    	String valor = null;
    	int i = 0;
    	colaTerminadoPistola.removeAll();
    	while(ter.size()>i) {
    		valor = ter.get(i);
    		colaTerminadoPistola.add(valor);
    		i++;
    	}
    }
    
	
	
	////////////////////////////////  *METODOS ESCOPETA*  ////////////////////////////////////////
    /*
     * Cambia el nombre del proceso que esta en la seccion critica de la fabrica de Escopeta
     */
    public void cambiarProcesoEscopeta(String nombre) {
    	lblNomProcesoEscopeta.setText(nombre);
    }
    
    /*
     * Cambia el quantum del proceso que esta en la seccion critica de la fabrica de Escopeta
     */
    public void cambiarQuantumEscopeta(int valor) {
    	lblValorQuantumEscopeta.setText(""+valor);
    }
    
    /*
     * Cambia el tiempo restante del proceso que esta en la seccion critica de la fabrica de Escopeta
     */
    public void cambiarTiempoRestanteEscopeta(int valor) {
    	lblValorTiempoEjecucionEscopeta.setText(""+valor);
    }
    
    /*
     * Recibe arreglo de valores para llenar la "cola" de listos en Escopeta
     */
	public void llenarListosEscopeta(ArrayList<String> listos) {
    	String valor = null;
    	int i = 0;
    	colaListoEscopetas.removeAll();
    	while(listos.size()>i) {
    		valor = listos.get(i);
    		colaListoEscopetas.add(valor);
    		i++;
    	}
    }
	
	/*
     * Recibe arreglo de valores para llenar la "cola" de suspendidos en Escopeta
     */
	public void llenarSuspendidosEscopeta(ArrayList<String> susp) {
    	String valor = null;
    	int i = 0;
    	colaSuspendidoEscopeta.removeAll();
    	while(susp.size()>i) {
    		valor = susp.get(i);
    		colaSuspendidoEscopeta.add(valor);
    		i++;
    	}
    }
    
	/*
     * Recibe arreglo de valores para llenar la "cola" de bloqueados en VEscopeta
     */
	public void llenarBloqueadosEscopeta(ArrayList<String> bloq) {
    	String valor = null;
    	int i = 0;
    	colaBloqueadoEscopeta.removeAll();
    	while(bloq.size()>i) {
    		valor = bloq.get(i);
    		colaBloqueadoEscopeta.add(valor);
    		i++;
    	}
    }
    
	/*
     * Recibe arreglo de valores para llenar la "cola" de terminados en Escopeta
     */
	public void llenarTerminadosEscopeta(ArrayList<String> ter) {
    	String valor = null;
    	int i = 0;
    	colaTerminadoEscopeta.removeAll();
    	while(ter.size()>i) {
    		valor = ter.get(i);
    		colaTerminadoEscopeta.add(valor);
    		i++;
    	}
    }
	
	
	/*/*////////////////////////// *METODOS DE SNIPER* ///////////////////////////////////////////
	/*
     * Cambia el nombre del proceso que esta en la seccion critica de la fabrica de Sniper
     */
    public void cambiarProcesoSniper(String nombre) {
    	lblNomProcesoSniper.setText(nombre);
    }
    
    /*
     * Cambia el quantum del proceso que esta en la seccion critica de la fabrica de Sniper
     */
    public void cambiarQuantumSniper(int valor) {
    	lblValorQuantumSniper.setText(""+valor);
    }
    
    /*
     * Cambia el tiempo restante del proceso que esta en la seccion critica de la fabrica de Sniper
     */
    public void cambiarTiempoRestanteSniper(int valor) {
    	lblValorTiempoEjecucionSniper.setText(""+valor);
    }
    
    /*
     * Recibe arreglo de valores para llenar la "cola" de listos en Sniper
     */
	public void llenarListosSniper(ArrayList<String> listos) {
    	String valor = null;
    	int i = 0;
    	colaListoSnipers.removeAll();
    	while(listos.size()>i) {
    		valor = listos.get(i);
    		colaListoSnipers.add(valor);
    		i++;
    	}
    }
	
	/*
     * Recibe arreglo de valores para llenar la "cola" de suspendidos en Sniper
     */
	public void llenarSuspendidosSniper(ArrayList<String> susp) {
    	String valor = null;
    	int i = 0;
    	colaSuspendidoSniper.removeAll();
    	while(susp.size()>i) {
    		valor = susp.get(i);
    		colaSuspendidoSniper.add(valor);
    		i++;
    	}
    }
    
	/*
     * Recibe arreglo de valores para llenar la "cola" de bloqueados en Sniper
     */
	public void llenarBloqueadosSniper(ArrayList<String> bloq) {
    	String valor = null;
    	int i = 0;
    	colaBloqueadoSniper.removeAll();
    	while(bloq.size()>i) {
    		valor = bloq.get(i);
    		colaBloqueadoSniper.add(valor);
    		i++;
    	}
    }
    
	/*
     * Recibe arreglo de valores para llenar la "cola" de terminados en Sniper
     */
	public void llenarTerminadosSniper(ArrayList<String> ter) {
    	String valor = null;
    	int i = 0;
    	colaTerminadoSniper.removeAll();
    	while(ter.size()>i) {
    		valor = ter.get(i);
    		colaTerminadoSniper.add(valor);
    		i++;
    	}
    }
	
	public void cambiarTiempoJuego(int valor) {
		lblTiempoJuego.setText(""+valor);
	}
	
    /*
     * Captura de eventos del mouse en la vista
     */
    private void capturarEventos() {
    	//btnInsertarProcesoPistola.addMouseListener(getControlador());
    	//.addMouseListener(getControlador());
    	//btnInsertarProcesoSniper.addMouseListener(getControlador());
    	colaListoPistolas.addKeyListener(getControlador());
    }
    
    public void avisarFin() {
    	JOptionPane.showMessageDialog(null, "!JUEGO TERMINADO!");
    }
    
    
    private void esperar(int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
        }
    }
}
