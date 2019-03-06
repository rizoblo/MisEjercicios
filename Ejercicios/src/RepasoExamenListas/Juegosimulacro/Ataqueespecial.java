package RepasoExamenListas.Juegosimulacro;

public class Ataqueespecial extends Ataque {

	public Ataqueespecial() {
		super();
		this.setDanio(20);
	}

	private static Ataqueespecial instancia = null;
	public synchronized static Ataqueespecial getInstancia() {
        if (instancia == null) {
            instancia = new Ataqueespecial();
        }
        return instancia;
    }
}
