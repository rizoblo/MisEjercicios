package RepasoExamenListas.Ejerciciosweb.Bloque7Ej1EventosyListeners;

public class Usuario3 implements DigitosListener2 {

	String nombre;

	public Usuario3() {
		super();
	
	}
	

	public Usuario3(String nombre) {
		super();
		this.nombre = nombre;
		Principal.addDigitosListener(this);
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public void digitosintroducidos (DigitosEvent1 event) {
		System.out.println("Hola Cuevas soy tu padre"
				+ "\n El usuario "+nombre+" ha recibido el evento(ha introducido 3 digitos");
	}
}
