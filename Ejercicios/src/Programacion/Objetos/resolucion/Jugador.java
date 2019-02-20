package Programacion.Objetos.resolucion;

public class Jugador {

		private String nombre;
		private Carta mano[] = new Carta[5];
		/**
		 * @param nombre
		 */
		public Jugador(String nombre) {
			super();
			this.nombre = nombre;
		}
		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}
		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		/**
		 * @return the mano
		 */
		public Carta[] getMano() {
			return mano;
		}
		/**
		 * @param mano the mano to set
		 */
		public void setMano(Carta[] mano) {
			this.mano = mano;
		}
		
		
		public void compruebaMano () {
			for (int i = 0; i < this.mano.length; i++) {
				if (mano[i] != null) {
					Carta cartaAComprobar = mano[i];
					int contadorCoincidencias = 0;
					for (int j = 0; j < mano.length; j++) {
						if (mano[j] != null) {
							if (cartaAComprobar.getValor() == mano[j].getValor()) {
								mano[j] = null;
								contadorCoincidencias++;
							}
						}
					}
				
					switch (contadorCoincidencias) {
					case 4:
						System.out.println("\tTienes 4 cartas de valor " + cartaAComprobar.getValor());
						break;
					case 3:
						System.out.println("\tTienes 3 cartas de valor " + cartaAComprobar.getValor());
						break;
					case 2:
						System.out.println("\tTienes 2 cartas de valor " + cartaAComprobar.getValor());
						break;
	
					default:
						break;
					}
				}

			}
			
		}
}
