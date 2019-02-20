package Programacion.matriculaciones;

public class eso extends matricula {

	private boolean pmal;

	public eso() {
		super();
	}

	public eso(String fecha, int codigo, boolean pmal) {
		super(fecha, codigo);
		this.pmal=pmal;
	}

	public boolean isPmal() {
		return pmal;
	}

	public void setPmal(Boolean pmal) {
		this.pmal = pmal;
	}

	@Override
	public String toString() {
		return "eso [isPmal()=" + isPmal() + ", getFecha()=" + getFecha() + ", getCodigo()=" + getCodigo() + "]";
	}

	
	
	
}
