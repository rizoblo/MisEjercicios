package tutorialJava.capitulo8_AWT_SWING.ejercicios.ejercicio03_GestionEntidadCoche.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import tutorialJava.capitulo8_AWT_SWING.ejercicios.ejercicio03_GestionEntidadCoche.modelo.ControladorBBDDCliente;
import tutorialJava.capitulo8_AWT_SWING.ejercicios.ejercicio03_GestionEntidadCoche.modelo.ControladorBBDDCoche;
import tutorialJava.capitulo8_AWT_SWING.ejercicios.ejercicio03_GestionEntidadCoche.modelo.ControladorBBDDFabricante;
import tutorialJava.capitulo8_AWT_SWING.ejercicios.ejercicio03_GestionEntidadCoche.modelo.entidades.Cliente;
import tutorialJava.capitulo8_AWT_SWING.ejercicios.ejercicio03_GestionEntidadCoche.modelo.entidades.Coche;
import tutorialJava.capitulo8_AWT_SWING.ejercicios.ejercicio03_GestionEntidadCoche.modelo.entidades.Fabricante;


public class PanelGestionCliente extends JPanel {

	GridBagConstraints gridBagConstraints = new GridBagConstraints();
	JTextField jtfId = new JTextField();
	JTextField jtfNombre = new JTextField();
	JTextField jtfApellidos = new JTextField();
	JTextField jtfLocalidad = new JTextField();
	JTextField jtfDni = new JTextField();
	JTextField jtfFecha = new JTextField();
	JButton jbtNavPrimero = new JButton();
	JButton jbtNavUltimo = new JButton();
	JButton jbtNavAnterior = new JButton();
	JButton jbtNavSiguiente = new JButton();
	JButton jbtGuardar = new JButton();
	JButton jbtNuevo = new JButton();
	JButton jbtEliminar = new JButton();
	
	
	Cliente cliente = new Cliente();
	/**
	 * 
	 */
	public PanelGestionCliente () {
		
		this.maquetarVentana();
		
		// Manejo de la navegaci�n de registros por rueda de rat�n
		this.controlRuedaRaton();
		
		// Finalmente, despu�s de la construcci�n, cargamos el primer registro
		navegaAPrimero();
	}
	
	
	/**
	 * 
	 */
	private void controlRuedaRaton () {
		this.addMouseWheelListener(new MouseWheelListener() {
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				if (e.getUnitsToScroll() < 0) {
					if (ControladorBBDDCliente.getSiguienteCliente(cliente) != null) {
						navegaASiguiente();
					}
				}
				else {
					if (ControladorBBDDCliente.getAnteriorCliente(cliente) != null) {
						navegaAAnterior();
					}
				}
			}
		});
	}
	
	/**
	 * 
	 */
	private void maquetarVentana() {
		double pesoCol1 = 0.15, pesoCol2 = 1;
		
		this.setLayout(new GridBagLayout());

		gridBagConstraints.insets = new Insets(5, 5, 5, 5);

		// Incorporamos los components del Id
		colocaComponente(0, 0, GridBagConstraints.EAST, pesoCol1, 0, GridBagConstraints.NONE);
		this.add(new JLabel("Id:"), gridBagConstraints);
		
		colocaComponente(1, 0, GridBagConstraints.EAST, pesoCol2, 0, GridBagConstraints.HORIZONTAL);
		this.add(jtfId, gridBagConstraints);
		
		// Incorporamos el CIF
		colocaComponente(0, 1, GridBagConstraints.EAST, pesoCol1, 0, GridBagConstraints.NONE);
		this.add(new JLabel("Nombre:"), gridBagConstraints);
		
		colocaComponente(1, 1, GridBagConstraints.EAST, pesoCol2, 0, GridBagConstraints.HORIZONTAL);
		this.add(jtfNombre, gridBagConstraints);
		
		// Incorporamos el nombre
		colocaComponente(0, 2, GridBagConstraints.EAST, pesoCol1, 0, GridBagConstraints.NONE);
		this.add(new JLabel("Apellidos:"), gridBagConstraints);
		
		colocaComponente(1, 2, GridBagConstraints.EAST, pesoCol2, 0, GridBagConstraints.HORIZONTAL);
		this.add(jtfApellidos, gridBagConstraints);
		
		// Incorporamos el nombre
		colocaComponente(0, 3, GridBagConstraints.EAST, pesoCol1, 0, GridBagConstraints.NONE);
		this.add(new JLabel("Localidad:"), gridBagConstraints);
				
		colocaComponente(1, 3, GridBagConstraints.EAST, pesoCol2, 0, GridBagConstraints.HORIZONTAL);
		this.add(jtfApellidos, gridBagConstraints);
				
		// Incorporamos el nombre
		colocaComponente(0, 4, GridBagConstraints.EAST, pesoCol1, 0, GridBagConstraints.NONE);
		this.add(new JLabel("Dni:"), gridBagConstraints);
				
		colocaComponente(1, 4, GridBagConstraints.EAST, pesoCol2, 0, GridBagConstraints.HORIZONTAL);
		this.add(jtfApellidos, gridBagConstraints);
		
		// Incorporamos el nombre
		colocaComponente(0, 5, GridBagConstraints.EAST, pesoCol1, 0, GridBagConstraints.NONE);
		this.add(new JLabel("Fecha:"), gridBagConstraints);
						
		colocaComponente(1, 5, GridBagConstraints.EAST, pesoCol2, 0, GridBagConstraints.HORIZONTAL);
		this.add(jtfApellidos, gridBagConstraints);
		
		// Incorporamos fila botones
				colocaComponente(0, 6, GridBagConstraints.NORTH, 1, 1, GridBagConstraints.BOTH);
				gridBagConstraints.gridwidth = 2;
				this.add(getBotonera(), gridBagConstraints);
		
			
	}
	
	
	/**
	 * 
	 */
	
	
	/**
	 * 
	 */
	private JPanel getBotonera() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		panel.setBackground(Color.yellow);
		
		// Configuramos los botones
		configuraBoton(jbtNavPrimero, "gotostart.png", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				navegaAPrimero();
			}
		});
		configuraBoton(jbtNavAnterior, "previous.png", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				navegaAAnterior();
			}
		});
		configuraBoton(jbtNavSiguiente, "next.png", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				navegaASiguiente();
			}
		});
		configuraBoton(jbtNavUltimo, "gotoend.png", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				navegaAUltimo();
			}
		});
		configuraBoton(jbtGuardar, "guardar.png", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				guardar();
			}
		});
		configuraBoton(jbtNuevo, "nuevo.png", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				nuevo();
			}
		});
		configuraBoton(jbtEliminar, "eliminar.png", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				eliminar();
			}
		});
		
		//Inclu�mos los botones
		panel.add(jbtNavPrimero);
		panel.add(jbtNavAnterior);
		panel.add(jbtNavSiguiente);
		panel.add(jbtNavUltimo);
		panel.add(jbtGuardar);
		panel.add(jbtNuevo);
		panel.add(jbtEliminar);
		
		return panel;
	}

	
	/**
	 * 
	 */
	private void eliminar() {
		// Por regla general, siempre que eliminemos un coche navegaremos al siguiente
		// registro
		Cliente clienteAEliminar = this.cliente;
		
		// Compruebo si el coche actual es el �ltimo coche
		if (ControladorBBDDCliente.getUltimoCliente().getId() == this.cliente.getId()) {
			navegaAAnterior();
		}
		else {
			navegaASiguiente();
		}
		
		// Finalmente elimino el coche
		ControladorBBDDCliente.eliminarCliente(clienteAEliminar);
		
		// Actualizo la botonera
		this.actualizaEstadoBotonera();
	}
	
	
	/**
	 * 
	 */
	private void nuevo () {
		this.cliente = new Cliente();
		this.cliente.setId(-1);
		this.jtfId.setText("" + -1);
		this.jtfNombre.setText("");
		this.jtfApellidos.setText("");
		this.jtfLocalidad.setText("");
		this.jtfDni.setText("");
		this.jtfFecha.setText("");
		
		// Actualizo la botonera
		this.actualizaEstadoBotonera();
	}
	
	/**
	 * 
	 * @param jbt
	 * @param icono
	 */
	private void configuraBoton (JButton jbt, String icono, ActionListener actionListener) {
		jbt.setIcon(SwingyBBDD.utils.CacheImagenes.getCacheImagenes().getIcono(icono));
		jbt.addActionListener(actionListener);
	}
	
	
	
	private void guardar() {
		// Es un alta nueva o una modificaci�n
		cargaFabricanteDesdeComponentesVisuales();
		if (this.cliente.getId() == -1) { // Alta
			ControladorBBDDCliente.guardarNuevoCliente(this.cliente);
			this.navegaAUltimo();
		}
		else { // Modificaci�n
			ControladorBBDDCliente.modificarCliente(this.cliente);
		}

		// Actualizo la botonera
		this.actualizaEstadoBotonera();
	}
	
	
	/**
	 * 
	 */
	private void navegaAPrimero () {
		cliente = ControladorBBDDCliente.getPrimerCliente();
		cargaFabricanteEnComponentesVisuales();
		actualizaEstadoBotonera();
	}
	
	/**
	 * 
	 */
	private void navegaAUltimo () {
		cliente = ControladorBBDDCliente.getUltimoCliente();
		cargaFabricanteEnComponentesVisuales();
		actualizaEstadoBotonera();
	}
	
	/**
	 * 
	 */
	private void navegaASiguiente () {
		cliente = ControladorBBDDCliente.getSiguienteCliente(this.cliente);
		cargaFabricanteEnComponentesVisuales();
		actualizaEstadoBotonera();
	}
	
	/**
	 * 
	 */
	private void navegaAAnterior () {
		cliente = ControladorBBDDCliente.getAnteriorCliente(this.cliente);
		cargaFabricanteEnComponentesVisuales();
		actualizaEstadoBotonera();
	}
	
	
	
	/**
	 * 
	 */
	private void actualizaEstadoBotonera () {
		if (ControladorBBDDCliente.getAnteriorCliente(this.cliente) == null) {
			jbtNavPrimero.setEnabled(false);
			jbtNavAnterior.setEnabled(false);
		}
		else {
			jbtNavPrimero.setEnabled(true);
			jbtNavAnterior.setEnabled(true);
		}
		if (ControladorBBDDCliente.getSiguienteCliente(this.cliente) == null) {
			jbtNavSiguiente.setEnabled(false);
			jbtNavUltimo.setEnabled(false);
		}
		else {
			jbtNavSiguiente.setEnabled(true);
			jbtNavUltimo.setEnabled(true);
		}
		if (this.cliente.getId() != -1) {
			jbtEliminar.setEnabled(true);
		}
		else {
			jbtEliminar.setEnabled(false);
		}
	}
	
	/**
	 * 
	 */
	private void cargaFabricanteEnComponentesVisuales () {
		this.jtfId.setText("" + cliente.getId());
		this.jtfNombre.setText(cliente.getNombre());
		this.jtfApellidos.setText(cliente.getApellidos());
		this.jtfLocalidad.setText(cliente.getLocalidad());
		this.jtfDni.setText(cliente.getDni());
		this.jtfFecha.setText(cliente.getFecha());
	}
	
	/**
	 * 
	 */
	private void cargaFabricanteDesdeComponentesVisuales () {
		this.cliente.setNombre(this.jtfNombre.getText());
		this.cliente.setApellidos(this.jtfApellidos.getText());
		this.cliente.setLocalidad(this.jtfLocalidad.getText());
		this.cliente.setDni(this.jtfDni.getText());
		this.cliente.setFecha(this.jtfFecha.getText());
	}
	
	/**
	 * 
	 * @param gridX
	 * @param gridY
	 * @param pesoColumna
	 * @param pesoFila
	 * @param fill
	 */
	private void colocaComponente (int gridX, int gridY, int anchor, double pesoColumna, double pesoFila, int fill) {
		gridBagConstraints.gridx = gridX;
		gridBagConstraints.gridy = gridY;
		gridBagConstraints.anchor = anchor;
		gridBagConstraints.weightx = pesoColumna;
		gridBagConstraints.weighty = pesoFila;
		gridBagConstraints.fill = fill;
		
	}
}
