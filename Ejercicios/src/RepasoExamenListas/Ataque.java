package RepasoExamenListas;

public class Ataque {

	public Ataque() {
		super();
	}

	private static Ataque instancia = null;
	private int daño=0;

	public Ataque(int daño) {
		super();
		this.daño = daño;
	}

	public int getDaño() {
		return daño;
	}

	public void setDaño(int daño) {
		this.daño = daño;
	}
	
	public synchronized static Ataque getInstancia() {
        if (instancia == null) {
            instancia = new Ataque();
        }
        return instancia;
    }
}
