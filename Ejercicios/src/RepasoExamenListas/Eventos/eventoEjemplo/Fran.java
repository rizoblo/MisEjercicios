package RepasoExamenListas.Eventos.eventoEjemplo;

public class Fran  extends NumeroEspecialIntroducidoAdapter  {

	@Override
	public void numeroImparIntroducido(NumeroEspecialIntroducidoEvent event) {
		System.out.println("Soy Fran, han introducido un número impar: " + event.getNumeroIntroducido());
	}

}
