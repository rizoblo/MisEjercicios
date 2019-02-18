package f1;

import java.util.Arrays;

public class Carrera {
	
	// Necesito un array de elementos de tipo "Vehiculo", deben ser 5
	private Vehiculo vehiculos[] = new Vehiculo[5];

	/**
	 * Constructor
	 */
	public Carrera() {
		super();
		// Inicializaci�n de los veh�culos
		vehiculos[0] = new Coche("Bertha Benz", "ff7c7c");
		vehiculos[1] = new Moto("Dani Pedrosa", "ffe97c");
		vehiculos[2] = new Coche("Fernando Alonso", "82ff7c");
		vehiculos[3] = new Coche("Mar�a de Villota", "8effd9");
		vehiculos[4] = new Moto("Ana Carrasco", "d18eff");
	}

	@Override
	public String toString() {
		return "Carrera [vehiculos=" + Arrays.toString(vehiculos) + "]";
	}

	public Vehiculo[] getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(Vehiculo[] vehiculos) {
		this.vehiculos = vehiculos;
	}
	
	public void imprimirvehiculos () {
		
		for (int i = 0; i < vehiculos.length; i++) {
			System.out.println(vehiculos[i]);
		}
	}
	
	public void juego() {
		
	}
	
	
}
