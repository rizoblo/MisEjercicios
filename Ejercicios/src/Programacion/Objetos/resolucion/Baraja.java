package Programacion.Objetos.resolucion;

public class Baraja {
	Carta cartas[] = new Carta[52];
	
	/**
	 * 
	 */
	public Baraja () {
		int j = 0;
		for (int i = 0; i < 13; i++) {
			cartas[j] = new Carta(i + 1, "Picas", j);
			j++;
		}
		
		for (int i = 0; i < 13; i++) {
			cartas[j] = new Carta(i + 1, "Diamantes", j);
			j++;
		}
		
		for (int i = 0; i < 13; i++) {
			cartas[j] = new Carta(i + 1, "Treboles", j);
			j++;
		}
		
		for (int i = 0; i < 13; i++) {
			cartas[j] = new Carta(i + 1, "Corazones", j);
			j++;
		}
	}
	
	
	
	/*
	 * 
	 */
	public void abajoHaciaArriba () {
		Carta aux = cartas[0];
		for (int i = 1; i < cartas.length; i++) {
			cartas[i-1] = cartas[i];
		}
		cartas[cartas.length - 1] = aux;
	}
	
	
	/*
	 * 
	 */
	public void arribaHaciaAbajo () {
		Carta aux = cartas[cartas.length - 1];
		for (int i = cartas.length - 1; i > 0; i--) {
			cartas[i] = cartas[i-1];
		}
		cartas[0] = aux;
	}
	
	
	
	/**
	 * 
	 */
	public void mezclar () {
		for (int i = 0; i < 100; i++) {
			int indice1 = (int) Math.round(Math.random() * (cartas.length-1));
			int indice2 = (int) Math.round(Math.random() * (cartas.length-1));
			
			Carta aux = cartas[indice1];
			cartas[indice1] = cartas[indice2];
			cartas[indice2] = aux;
		}
	}
	
	
	/**
	 * 
	 */
	public void ordenar () {
		for (int i = cartas.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (cartas[j].getId() > cartas[j+1].getId()) {
					Carta aux = cartas[j];
					cartas[j] = cartas[j+1];
					cartas [j+1] = aux;
				}
			}
		}
	}
	
	
	
	
	
	public void darMano(Jugador jugador) {
		Carta mano[] = new Carta[5];
		
		for (int i = 0; i < mano.length; i++) {
			int azar;
			do {
				azar = (int) Math.round(Math.random() * (cartas.length-1));
			} while (cartas[azar] == null);
			mano[i] = cartas[azar];
			cartas[azar] = null;
		}
		
		jugador.setMano(mano);
	}
	
	
	
	/**
	 * 
	 */
	public void imprimir () {
		System.out.println("Baraja");
		for (int i = 0; i < cartas.length; i++) {
			System.out.println(cartas[i]);
		}
	}
	
}
