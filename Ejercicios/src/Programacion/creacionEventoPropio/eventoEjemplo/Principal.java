package Programacion.creacionEventoPropio.eventoEjemplo;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {

	static List<PalabraSecretaIntroducidaListener> palabraSecretaIntroducidaListeners = 
			new ArrayList<PalabraSecretaIntroducidaListener>();

	/**
	 * 
	 * @param listener
	 */
	public static void addPalabraSecretaIntroducidaListener (PalabraSecretaIntroducidaListener listener) {
		palabraSecretaIntroducidaListeners.add(listener);
	}
	
	/**
	 * 
	 * @param listener
	 */
	public static void removeNumeroImparIntroducidoListener (PalabraSecretaIntroducidaListener listener) {
		palabraSecretaIntroducidaListeners.remove(listener);
	}

	/**
	 * 
	 * @param e
	 */
	public static void firePalabraSecretaIntroducidaListener (PalabraSecretaIntroducidaEvent e) {
		for (PalabraSecretaIntroducidaListener listener : palabraSecretaIntroducidaListeners) {
			listener.palabraclaveintroducida(e);
		}
	}

	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Carlos carlos = new Carlos();
		Fran fran = new Fran();
		addNumeroImparIntroducidoListener(fran);
		
		String[] palabrasecreta= {"avioneta"};
		
		while (true) {
			String palabra = JOptionPane.showInputDialog("Introduzca palabra: ");
			System.out.println("N�mero introducido: " + palabra);
			
			// Notifico a los listeners
			if (palabra.equals(palabrasecreta)) {
				NumeroEspecialIntroducidoEvent event = new NumeroEspecialIntroducidoEvent(palabra);
				fireNumeroImparIntroducidoListener(event);
			}
			
			// Notifico n�mero primo
			boolean esPrimo =true;
			for (int i = 2; i == numIntroducido - 1; i++) {
				if (numIntroducido % i == 0) {
					esPrimo = false;
				}
			}
			if (esPrimo) fireNumeroPrimoIntroducidoListener(new NumeroEspecialIntroducidoEvent(numIntroducido));
			
		}

	}

}
