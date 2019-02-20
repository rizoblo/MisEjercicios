package Programacion.matriculaciones;

public class bachiller extends matricula {

	private String modalidad;

	public bachiller() {
		super();
	}

	public bachiller(String fecha, int codigo, String modalidad) {
		super(fecha, codigo);
		this.modalidad=modalidad;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	@Override
	public String toString() {
		return "bachiller [getModalidad()=" + getModalidad() + ", getFecha()=" + getFecha() + ", getCodigo()="
				+ getCodigo() + "]";
	}
	
	
}
