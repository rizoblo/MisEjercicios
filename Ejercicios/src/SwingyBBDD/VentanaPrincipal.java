package SwingyBBDD;

import java.awt.Color;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class VentanaPrincipal extends JFrame {


	JTextField tfid;
	JTextField tfcif;
	JTextField tfnombre;
	
	public VentanaPrincipal(){
		super("Primera gestion fabricante");
		setDimensionesBasicas();
		this.setContentPane(getPanelPrincipal());
	}

	private JPanel getPanelPrincipal() {
		JPanel jpanel= new JPanel();
		jpanel.setBackground(Color.white);
		jpanel.setLayout(new BoxLayout(jpanel, BoxLayout.Y_AXIS));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jpanel.add(getPanelId());
		jpanel.add(getPanelCif());
		jpanel.add(getPanelNombre());
		jpanel.add(getPanelGuardar());
		return jpanel;
	}
	private void setDimensionesBasicas () {
		this.setExtendedState(JFrame.NORMAL);
		this.setBounds(0, 0, 800, 600);
		//this.setMinimumSize(new Dimension(ANCHO, ALTO));
	}
	
	private JPanel getPanelId() {
		JPanel jpanel= new JPanel();
		JLabel lbl=new JLabel("id");
		jpanel.add(lbl);
		tfid =new JTextField();
		tfid.setColumns(20);
		jpanel.add(tfid);
		jpanel.setBackground(Color.white);
		return jpanel;
	}
	
	private JPanel getPanelCif() {
		JPanel jpanel= new JPanel();
		JLabel lbl=new JLabel("CIF");
		jpanel.add(lbl);
		tfcif =new JTextField();
		tfcif.setColumns(20);
		jpanel.add(tfcif);
		jpanel.setBackground(Color.yellow);
		return jpanel;
	}
	
	private JPanel getPanelNombre() {
		JPanel jpanel= new JPanel();
		JLabel lbl=new JLabel("Nombre");
		jpanel.add(lbl);
		tfnombre =new JTextField();
		tfnombre.setColumns(20);
		jpanel.add(tfnombre);
		jpanel.setBackground(Color.blue);
		return jpanel;
	}
	
	
	private JPanel getPanelGuardar() {
		JPanel jpanel= new JPanel();
		JButton jbt=new JButton("Guardar");
		jpanel.add(jbt);
		jpanel.setBackground(Color.gray);
		jbt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					
				guardar();
			}
			
			
		});
		return jpanel;
		
	}
	public void insertar() {
		try {
			Connection conn=ConnectionManagerV2.getConexion();
			PreparedStatement ps = conn.prepareStatement("INSERT INTO tutorialjavacoches.fabricante (id,cif,nombre)"+" VALUES (?,?,?)");
			ps.setInt(1, Integer.parseInt(tfid.getText()));
			ps.setString(2, tfcif.getText());
			ps.setString(3, tfnombre.getText());
			
			int filasAfectadas=ps.executeUpdate();
			if (filasAfectadas==1){
				System.out.println("Registro insertado");
			}
			ps.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ImposibleConectarException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void actualizar() {
		try {
			Connection conn=ConnectionManagerV2.getConexion();
			PreparedStatement ps = conn.prepareStatement("UPDATE tutorialjavacoches.fabricante set cif=?,nombre=? where id=?");
			ps.setInt(1, Integer.parseInt(tfid.getText()));
			ps.setString(2, tfcif.getText());
			ps.setString(3, tfnombre.getText());
			
			
			int filasAfectadas=ps.executeUpdate();
			if (filasAfectadas==1){
				System.out.println("Registro actualizado");
			}
			ps.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ImposibleConectarException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void guardar() {
		Connection conn;
		try {
			conn = ConnectionManagerV2.getConexion();
			PreparedStatement ps = conn.prepareStatement("Select id from tutorialjavacoches.fabricante where "+ " id=?");
			ps.setInt(1, Integer.parseInt(tfid.getText()));
			ResultSet rs =ps.executeQuery();
			if (rs.next()) {
				actualizar();
			}
			else
			{
				insertar();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ImposibleConectarException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
