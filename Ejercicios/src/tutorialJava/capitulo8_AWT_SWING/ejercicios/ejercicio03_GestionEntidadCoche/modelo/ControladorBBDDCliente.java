package tutorialJava.capitulo8_AWT_SWING.ejercicios.ejercicio03_GestionEntidadCoche.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tutorialJava.capitulo8_AWT_SWING.ejercicios.ejercicio03_GestionEntidadCoche.modelo.entidades.Cliente;
import tutorialJava.capitulo8_AWT_SWING.ejercicios.ejercicio03_GestionEntidadCoche.modelo.entidades.Coche;
import tutorialJava.capitulo8_AWT_SWING.ejercicios.ejercicio03_GestionEntidadCoche.modelo.entidades.Cliente;
import tutorialJava.capitulo8_AWT_SWING.ejercicios.ejercicio03_GestionEntidadCoche.modelo.entidades.Fabricante;

public class ControladorBBDDCliente {

	
	/**
	 * 
	 * @return
	 */
	public static List<Cliente> getTodosCliente () {
		List<Cliente> resultado = new ArrayList<Cliente>();
		try {
			Connection conn = ConnectionManagerV2.getConexion();
			
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM tutorialjavacoches.cliente order by nombre");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				resultado.add(getClienteFromResultSet(rs));
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException | ImposibleConectarException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return resultado;
	}
	
	public static Cliente getPrimerCliente() {
		Cliente cliente = null;
		try {
			Connection conn = ConnectionManagerV2.getConexion();
			
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM tutorialjavacoches.cliente order by id limit 1");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				cliente = getClienteFromResultSet(rs);		
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException | ImposibleConectarException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cliente;
	}
	
	public static Cliente getUltimoCliente () {
		Cliente cliente = null;
		try {
			Connection conn = ConnectionManagerV2.getConexion();
			
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM tutorialjavacoches.cliente order by id desc limit 1");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				cliente = getClienteFromResultSet(rs);		
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException | ImposibleConectarException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cliente;
	}
	
	
	public static Cliente getAnteriorCliente(Cliente clienteActual) {
		Cliente clienteResultado = null;
		try {
			Connection conn = ConnectionManagerV2.getConexion();
			
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM tutorialjavacoches.cliente where id < ? order by id desc limit 1");
			ps.setInt(1, clienteActual.getId());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				clienteResultado = getClienteFromResultSet(rs);		
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException | ImposibleConectarException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return clienteResultado;
	}
	
	public static Cliente getSiguienteCliente (Cliente clienteActual) {
		Cliente clienteResultado = null;
		try {
			Connection conn = ConnectionManagerV2.getConexion();
			
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM tutorialjavacoches.cliente where id > ? order by id limit 1");
			ps.setInt(1, clienteActual.getId());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				clienteResultado = getClienteFromResultSet(rs);		
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException | ImposibleConectarException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return clienteResultado;
	}
	/**
	 * 
	 * @param rs
	 * @return
	 */
	
	public static boolean guardarNuevoCliente (Cliente cliente) {
		boolean resultado = true;
		try {
			Connection conn = ConnectionManagerV2.getConexion();
			
			PreparedStatement ps = conn.prepareStatement(""
					+ "INSERT INTO tutorialjavacoches.cliente values (?, ?, ?, ?)");
			ps.setInt(1, getUltimoCliente().getId() + 1);
			ps.setString(2, cliente.getNombre());
			ps.setString(3, cliente.getApellidos());
			ps.setString(4, cliente.getLocalidad());
			ps.setString(5, cliente.getDni());
			ps.setDate(6, cliente.getFecha());
			int registrosAfectados = ps.executeUpdate();
			if (registrosAfectados != 1) {
				resultado = false;		
			}
			ps.close();
			conn.close();
		} catch (SQLException | ImposibleConectarException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultado = false;
		}
		
		return resultado;
	}
	
	public static boolean modificarCliente(Cliente cliente) {
		boolean resultado = true;
		try {
			Connection conn = ConnectionManagerV2.getConexion();
			
			PreparedStatement ps = conn.prepareStatement(""
					+ "UPDATE tutorialjavacoches.cliente SET  nombre = ?, apellidos = ? localidad = ? dni = ? fecha = ? where id = ?");
			ps.setInt(6, cliente.getId());
			ps.setString(1, cliente.getNombre());
			ps.setString(2, cliente.getApellidos());
			ps.setString(3, cliente.getLocalidad());
			ps.setString(4, cliente.getDni());
			ps.setDate(5, cliente.getFecha());
			int registrosAfectados = ps.executeUpdate();
			if (registrosAfectados != 1) {
				resultado = false;		
			}
			ps.close();
			conn.close();
		} catch (SQLException | ImposibleConectarException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultado = false;
		}
		
		return resultado;
	}
	
	public static boolean eliminarCliente (Cliente cliente) {
		boolean resultado = true;
		try {
			Connection conn = ConnectionManagerV2.getConexion();
			
			PreparedStatement ps = conn.prepareStatement(""
					+ "DELETE FROM tutorialjavacoches.cliente where id = ?");
			ps.setInt(1, cliente.getId());
			int registrosAfectados = ps.executeUpdate();
			if (registrosAfectados != 1) {
				resultado = false;		
			}
			ps.close();
			conn.close();
		} catch (SQLException | ImposibleConectarException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultado = false;
		}
		
		return resultado;
	}
	
	private static Cliente getClienteFromResultSet (ResultSet rs) {
		Cliente cliente = new Cliente();
		
		try {
			cliente.setId(rs.getInt("id"));
			cliente.setNombre(rs.getString("cif"));
			cliente.setApellidos(rs.getString("nombre"));
			cliente.setLocalidad(rs.getString("localidad"));
			cliente.setDni(rs.getString("dni"));
			cliente.setFecha(rs.getDate("fecha"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cliente;
	}
}
