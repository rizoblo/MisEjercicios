package RepasoExamenListas;

public class Ataque {

	public Ataque() {
		super();
	}

	private static Ataque instancia = null;
	private int da�o=0;

	public Ataque(int da�o) {
		super();
		this.da�o = da�o;
	}

	public int getDa�o() {
		return da�o;
	}

	public void setDa�o(int da�o) {
		this.da�o = da�o;
	}
	
	public synchronized static Ataque getInstancia() {
        if (instancia == null) {
            instancia = new Ataque();
        }
        return instancia;
    }
}
