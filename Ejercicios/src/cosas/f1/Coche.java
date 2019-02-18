package f1;

public class Coche extends Vehiculo {

	/**
	 * 
	 * @param x
	 * @param nombre
	 * @param color
	 */
	public Coche(String nombre, String color) {
		super(nombre, color);
	}

	
	@Override
	public String toString() {
		return "Coche [x=" + x + ", nombre=" + nombre + ", color=" + color + "]";
	}

	

	/**
	 * Implementaci�n del m�todo abstracto que pinta el coche
	 */
	@Override
	public String paint() {
		return "Coche: " + this.nombre + " - " + this.x;
	}

}
