package SwingyBBDD.EjerciciosWeb.Bloque1Ej1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;



public class VentanaPrincipalConMetodos extends JFrame {

	public VentanaPrincipalConMetodos () {
		this.setBounds(0, 0, 800, 600);
		
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPanel = new JTabbedPane();		
		tabbedPanel.add("01", getPanelTab01());		
		tabbedPanel.add("02", getPanelTab02());
		this.setContentPane(tabbedPanel);
	}
	
	
	
	/**
	 * 
	 * @return
	 */
	private JPanel getPanelTab01 () {		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(new JLabel("Una etiqueta"));

		JTextField jtf = new JTextField("Texto", 40);
		panel.add(jtf);
		
		JCheckBox check = new JCheckBox("Esto es un check");
		check.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ha cambiado el estado del check a : " + check.isSelected());
			}
		});
		panel.add(check);
		
		JButton jbt = new JButton ("Aceptar");
		jbt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = "Contenido del JTextField: " + jtf.getText() +
						" - Check: " + check.isSelected();
				JOptionPane.showMessageDialog(null, str);
			}
		});
		
		panel.add(jbt);
		
		return panel;
	}
	
	private JPanel getPanelTab02 () {		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(new JLabel("Una etiqueta"));

		JTextField jtf = new JTextField("Texto", 40);
		panel.add(jtf);
		
		JPasswordField jpw = new JPasswordField(8);
		panel.add(jpw);
		
		String arraycombo []= new String []{"Madrid","Barcelona"};
		JComboBox jcb = new JComboBox(arraycombo);
		jcb.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, jcb.getSelectedItem());
				
			}
		});
		
		panel.add(jcb);
		
		JList jl = new JList(arraycombo);
		jl.setSelectedIndex(0);
		jl.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jl.setLayoutOrientation(JList.VERTICAL);
		jl.setVisibleRowCount(2);
		panel.add(jl);
		
		JButton jbt = new JButton ("Aceptar");
		jbt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.decode(getColorAzar()));
				String str = "Contenido del JTextField: " + jtf.getText();
				JOptionPane.showMessageDialog(null, str);
			}
		});
		
		panel.add(jbt);
		
		return panel;
	}
	
	private static char digitosHexadecimales[] = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
	private static String getColorAzar () {
		StringBuffer sb = new StringBuffer ("#");
		for (int i = 0; i < 6; i++) {
			sb.append(digitosHexadecimales[Programacion.Utils.obtenerNumeroAzar(0, digitosHexadecimales.length-1)]);
		}
		return sb.toString();
	}
	
	public static void main (String args[]) {
		VentanaPrincipalConMetodos ventana = new VentanaPrincipalConMetodos();
		ventana.setVisible(true);
	}
}
