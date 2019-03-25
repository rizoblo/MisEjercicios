package SwingyBBDD.EjerciciosWeb.Bloque1Ej1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;




public class VentanaPrincipalCasero extends JFrame {

	public VentanaPrincipalCasero () {
		this.setBounds(0,0,800,600);
		this.setResizable(false);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Creacion del tabbed para las pestañas
		JTabbedPane tabbedpanel=new JTabbedPane();
		//Creacion JPanel
		JPanel panel= new JPanel();
		//Creacion del layout
		panel.setLayout(new FlowLayout());
		//Creacion del JLabel
		panel.add(new JLabel("Etiqueta"));
		//Creacion del JTextField
		JTextField jtf= new JTextField("Texto",40);
		panel.add(jtf);
		//Creacion del JChecbox
		JCheckBox checkbox=new JCheckBox("Esto es un checkbox");
		checkbox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ha cambiado el estado del check "+checkbox.isSelected());
				
			}
		});
		panel.add(checkbox);
		//Creacion del JButton
		JButton jbt= new JButton("Aceptar");
		jbt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String str= ("Contenido del JTextField "+jtf.getText()+" y el valor del checkbox es "+checkbox.isSelected());
				JOptionPane.showMessageDialog(null, str);
				
			}
		});
		panel.add(jbt);
		//Creacion del tabbed y le pasamos el JPanel que hemos creado
		tabbedpanel.add("01", panel);
		//Aniadimos todo al content pane
		this.setContentPane(tabbedpanel);
	}
	
	public static void main(String[] args) {
		VentanaPrincipalCasero ventanaPrincipal = new VentanaPrincipalCasero ();
		ventanaPrincipal.setVisible(true);
	}
	
	
}
