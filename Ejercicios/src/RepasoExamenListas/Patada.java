package RepasoExamenListas;

public class Patada extends Ataque {

	public Patada() {
		super();
		this.setDa�o(10);
	}

	private static Patada instancia = null;
	public synchronized static Patada getInstancia() {
        if (instancia == null) {
            instancia = new Patada();
        }
        return instancia;
    }
}