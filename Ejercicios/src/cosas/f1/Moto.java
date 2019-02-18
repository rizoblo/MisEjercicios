package f1;

public class Moto extends Vehiculo {
	
	/**
	 * @param x
	 * @param nombre
	 * @param color
	 */
	public Moto(String nombre, String color) {
		super(nombre, color);
	}

	
	@Override
	public String toString() {
		return "Moto [x=" + x + ", nombre=" + nombre + ", color=" + color + "]";
	}


	/**
	 * Implementaci�n del m�todo abstracto que pinta la moto
	 */
	@Override
	public String paint() {
		return "Moto: " + this.nombre + " - " + this.x;
	}

}
