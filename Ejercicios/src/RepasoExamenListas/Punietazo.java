package RepasoExamenListas;

public class Punietazo extends Ataque {

	public Punietazo() {
		super();
		this.setDa�o(5);
	}

	private static Punietazo instancia = null;
	public synchronized static Punietazo getInstancia() {
        if (instancia == null) {
            instancia = new Punietazo();
        }
        return instancia;
    }
}
