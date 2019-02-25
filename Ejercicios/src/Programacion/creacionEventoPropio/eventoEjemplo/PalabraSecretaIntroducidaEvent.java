package Programacion.creacionEventoPropio.eventoEjemplo;

public class PalabraSecretaIntroducidaEvent {
	
	private String[] palabra;

	/**
	 * @param numeroIntroducido
	 */
	public PalabraSecretaIntroducidaEvent(String[] palabra) {
		super();
		this.palabra = palabra;
	}

	public String[] getPalabra() {
		return palabra;
	}

	public void setPalabra(String[] palabra) {
		this.palabra = palabra;
	}

	
	
	
	
}
