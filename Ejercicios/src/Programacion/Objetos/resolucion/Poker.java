package Programacion.Objetos.resolucion;

public class Poker {
	private Jugador jugadores[] = new Jugador[5];
	private Baraja baraja;
	
	
	public Poker (Baraja baraja) {
		this.baraja = baraja;
		
		jugadores[0] = new Jugador("Pedro");
		jugadores[1] = new Jugador("Emilio");
		jugadores[2] = new Jugador("Jorge");
		jugadores[3] = new Jugador("Maria");
		jugadores[4] = new Jugador("Sandra");
		
		for (int i = 0; i < jugadores.length; i++) {
			baraja.darMano(jugadores[i]);
			
			System.out.println("Jugador/a: " + jugadores[i].getNombre());
			for (int j = 0; j < jugadores[i].getMano().length; j++) {
				System.out.println("\t" + jugadores[i].getMano()[j].toString());
			}
			jugadores[i].compruebaMano();
		}
	}
}
