package RepasoExamenListas.Juegosimulacro;

public class Ataque {

	public Ataque() {
		super();
	}

	private static Ataque instancia = null;
	private int danio=0;

	public Ataque(int danio) {
		super();
		this.danio = danio;
	}

	public int getDanio() {
		return danio;
	}

	public void setDanio(int danio) {
		this.danio = danio;
	}
	
	public synchronized static Ataque getInstancia() {
        if (instancia == null) {
            instancia = new Ataque();
        }
        return instancia;
    }
}
