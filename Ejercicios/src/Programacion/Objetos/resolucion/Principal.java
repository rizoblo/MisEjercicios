package Programacion.Objetos.resolucion;

public class Principal {

	public static void main(String[] args) {
		Baraja baraja = new Baraja();

		baraja.imprimir();
		
		baraja.abajoHaciaArriba();
		baraja.imprimir();
		
		baraja.arribaHaciaAbajo();
		baraja.imprimir();
		
		baraja.mezclar();
		baraja.imprimir();
		
		baraja.ordenar();
		baraja.imprimir();
		
		Poker poker = new Poker (baraja);
		
	}

}
