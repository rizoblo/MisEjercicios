package Programacion.matriculaciones;

public class personanoidentificada extends Persona {

	private String descripcion;

	public personanoidentificada() {
		super();
	}

	public personanoidentificada(String nombre, String apellidos, String fechanacimiento,String descripcion) {
		super(nombre, apellidos, fechanacimiento);
		
		this.descripcion=descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "personanoidentificada [getDescripcion()=" + getDescripcion() + ", getNombre()=" + getNombre()
				+ ", getApellidos()=" + getApellidos() + ", getFechanacimiento()=" + getFechanacimiento() + "]";
	}

	
	
	
	

	
	
	

}
