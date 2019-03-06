package RepasoExamenListas.excepciones;

import javax.swing.JOptionPane;

public class Capt06Bloque4Ej2 {

	
		/*2º.- Realiza un programa Java parecido al anterior en el que pidas al usuario una frase que 
		 * contenga la palabra "bombilla".
 		Las excepciones, creadas por ti, deben realizarse en los siguientes casos:
      - La frase introducida no tiene caracteres distintos al espacio en blanco.
      - La cantidad de palabras de la frase introducida es inferior a 3.
      - En la frase no aparece la palabra "bombilla".
      - En la frase aparece una palabra ofensiva de la siguiente relación: "tonto", "tonta", "idiota".
		Cada uno de los supuestos anteriores provocará un tipo diferente de excepción. 
		Tú debes controlar todos los tipos y responder al usuario con un mensaje adecuado.*/
	
	static String respuesta;
	public static void main(String[] args) {
		try {
			pregunta();
		} catch (Capt06Bloque4Ej2exceptionEspacioblanco e) {
			// TODO Auto-generated catch block
			System.out.println("No tiene caracteres introducidos distintos de espacios");
			
		}
		catch (Capt06Bloque4Ej2exceptionnobombilla e) {
			// TODO Auto-generated catch block
			System.out.println("No aparece la palabra bombilla");
			
		}
		catch (Capt06Bloque4Ej2exceptioncantidadinferior3 e) {
			// TODO Auto-generated catch block
			System.out.println("La cantidad de palabras introducidas es inferior a 3");
			
		}
		catch (Capt06Bloque4Ej2exceptionpalabraofensiva e) {
			// TODO Auto-generated catch block
			System.out.println("La palabra introducida fue ofensiva");
			
		}
	}

	public static void pregunta() throws Capt06Bloque4Ej2exceptionEspacioblanco, Capt06Bloque4Ej2exceptionnobombilla, 
	Capt06Bloque4Ej2exceptioncantidadinferior3, Capt06Bloque4Ej2exceptionpalabraofensiva {
		respuesta=JOptionPane.showInputDialog("Introduce bombilla");
		//el trim borra los espacios que hay al principio de la frase introducida
		if ((respuesta.trim()).isEmpty()) {
			throw new Capt06Bloque4Ej2exceptionEspacioblanco();
		}
		if (respuesta.contains("idiota")||respuesta.contains("tonto")||respuesta.contains("tonta")) {
			throw new Capt06Bloque4Ej2exceptionpalabraofensiva();
		}
		String[] palabras = respuesta.split(" ");
		if (palabras.length<3) {
			throw new Capt06Bloque4Ej2exceptioncantidadinferior3();
		}
		if (!respuesta.contains("bombilla")) {
			throw new Capt06Bloque4Ej2exceptionnobombilla();
		}
		
	}
	
}
