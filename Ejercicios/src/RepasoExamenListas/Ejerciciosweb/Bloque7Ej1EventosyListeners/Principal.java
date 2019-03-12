package RepasoExamenListas.Ejerciciosweb.Bloque7Ej1EventosyListeners;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


public class Principal {

	/*1º.- Crea un programa en Java que pida palabras, continuamente, al usuario. 
	 * Para cada palabra debes examinar sus caracteres buscando la cantidad de digitos numéricos que existen.
	 *  Crea una clase llamada "BuscaDigitos". Debes crear la estructura de listeners y eventos necesarios para que, 
	 * cuando la palabra introducida por el usuario contenga 3 dígitos, la clase BuscaDigitos sea notificada de ese evento producido.*/
	
	static List<DigitosListener2> palabrasintroducidasListeners = new ArrayList<DigitosListener2>();
	static String palabra;
	static int contadordigitos=0;
	public static void main(String[] args) {
		Usuario3 pepe= new Usuario3("pepe");
		preguntapalabra();
		
	}

	public static void preguntapalabra() {
		do
		{
			contadordigitos=0;
			palabra=JOptionPane.showInputDialog("Introduce palabra");
			int tamaniopalabra=palabra.length();
			char cadenaTexto[] = new char[tamaniopalabra];
			
			for (int i = 0; i < cadenaTexto.length; i++) {
				cadenaTexto[i]=palabra.charAt(i);
			}
			for (int i = 0; i < cadenaTexto.length; i++) {
				if (Character.isDigit(cadenaTexto[i])) {
					contadordigitos++;
				}
			}
			if (contadordigitos==3) {
				DigitosEvent1 evento= new DigitosEvent1(palabra);
				fireDigitoEvent(evento);
			}
		}while(!(contadordigitos==3));
	}
	public static void addDigitosListener (DigitosListener2 listener) {
		palabrasintroducidasListeners.add(listener);
	}
	public static void removeDigitosListener (DigitosListener2 listener) {
		palabrasintroducidasListeners.remove(listener);
	}
	public static void fireDigitoEvent(DigitosEvent1 event) {
		for (DigitosListener2 listener : palabrasintroducidasListeners) {
			listener.digitosintroducidos(event);
		}
	}
}
