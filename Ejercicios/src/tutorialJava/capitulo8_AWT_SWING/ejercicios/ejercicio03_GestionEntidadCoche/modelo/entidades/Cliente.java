package tutorialJava.capitulo8_AWT_SWING.ejercicios.ejercicio03_GestionEntidadCoche.modelo.entidades;

import java.util.Date;

public class Cliente {

	private int id;
	private String nombre;
	private String apellidos;
	private String localidad;
	private String dni;
	private Date fecha;
	/**
	 * 
	 */
	public Cliente() {
		super();
	}
	public Cliente(int id, String nombre, String apellidos, String localidad, String dni, Date fecha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.localidad = localidad;
		this.dni = dni;
		this.fecha = fecha;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	/**
	 * @param id
	 * @param cif
	 * @param nombre
	 */
	
	
	
	
	
}
