package RepasoExamenListas.Juegosimulacro;

public class Punietazo extends Ataque {

	public Punietazo() {
		super();
		this.setDanio(5);
	}

	private static Punietazo instancia = null;
	public synchronized static Punietazo getInstancia() {
        if (instancia == null) {
            instancia = new Punietazo();
        }
        return instancia;
    }
}
