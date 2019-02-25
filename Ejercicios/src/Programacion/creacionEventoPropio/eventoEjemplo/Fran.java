package Programacion.creacionEventoPropio.eventoEjemplo;

public class Fran  extends PalabraEspecialIntroducidaAdapter  {

	@Override
	public void palabraclaveintroducida(PalabraSecretaIntroducidaEvent event) {
		System.out.println("Ha introducido la palabra secreta: " + event.getPalabra());
	}

}
