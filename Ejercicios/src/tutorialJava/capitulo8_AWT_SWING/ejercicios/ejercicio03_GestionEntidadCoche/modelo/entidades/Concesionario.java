package tutorialJava.capitulo8_AWT_SWING.ejercicios.ejercicio03_GestionEntidadCoche.modelo.entidades;

public class Concesionario {

	private int id;
	private String CIF;
	private String nombre;
	private String localidad;
	public Concesionario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Concesionario(int id, String CIF, String nombre, String localidad) {
		super();
		this.id = id;
		this.CIF = CIF;
		this.nombre = nombre;
		this.localidad = localidad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCIF() {
		return CIF;
	}
	public void setCIF(String cIF) {
		CIF = cIF;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	
	
}
