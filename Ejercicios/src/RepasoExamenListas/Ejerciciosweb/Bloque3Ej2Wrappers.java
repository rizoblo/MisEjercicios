package RepasoExamenListas.Ejerciciosweb;

import javax.swing.JOptionPane;

public class Bloque3Ej2Wrappers {

	/*2º.- Crear un programa que pida al usuario una contraseña con los siguientes requisitos:
         - Al menos una mayúscula.
         - Al menos una minúscula.
         - Al menos un dígito
         - Al menos un carácter no alfanumérico.
       El programa no terminará hasta que el usuario no introduzca la contraseña con estos requisitos.*/
	
	public static String respuesta;
	public static boolean error=false;
	public static boolean errorminus=false;
	public static boolean errordigito=false;
	public static boolean erroralfa=false;
	public static void main(String[] args) {
		
		do {
			error=false;
			errorminus=false;
			errordigito=false;
			erroralfa=false;
			respuesta=JOptionPane.showInputDialog("Introduzca contraseña");
			mayuscula();
			minuscula();
			digito();
			alfanumerico();
		}
		while(!error==true || !errorminus==true || !errordigito==true || !erroralfa==true);
		JOptionPane.showMessageDialog(null, "Contrasenia correcta");
	}
	public static void mayuscula() {
		int tamaniopalabra=respuesta.length();
		char cadenaTexto[] = new char[tamaniopalabra];
		
		for (int i = 0; i < cadenaTexto.length; i++) {
			cadenaTexto[i]=respuesta.charAt(i);
		}
		for (int i = 0; i < cadenaTexto.length; i++) {
			if (Character.isUpperCase(cadenaTexto[i])) {
				error=true;	
			}
		}
		if (error==false) {
			System.out.println("La contraseña debe tener una mayuscula");
		}
	}
	public static void minuscula() {
		int tamaniopalabra=respuesta.length();
		char cadenaTexto[] = new char[tamaniopalabra];
		
		for (int i = 0; i < cadenaTexto.length; i++) {
			cadenaTexto[i]=respuesta.charAt(i);
		}
		for (int i = 0; i < cadenaTexto.length; i++) {
			if (Character.isLowerCase(cadenaTexto[i])) {
				errorminus=true;	
			}	
		}
		if (errorminus==false) {
		System.out.println("La contraseña debe tener una minuscula");
		}
	}
	
	public static void digito() {
		int tamaniopalabra=respuesta.length();
		char cadenaTexto[] = new char[tamaniopalabra];
		
		for (int i = 0; i < cadenaTexto.length; i++) {
			cadenaTexto[i]=respuesta.charAt(i);
		}
		for (int i = 0; i < cadenaTexto.length; i++) {
			if (Character.isDigit(cadenaTexto[i])) {
				errordigito=true;
			}
		}
		if (errordigito==false) {
			System.out.println("La contraseña debe tener un digito");
		}
	}

	public static void alfanumerico() {
		int tamaniopalabra=respuesta.length();
		char cadenaTexto[] = new char[tamaniopalabra];
		
		for (int i = 0; i < cadenaTexto.length; i++) {
			cadenaTexto[i]=respuesta.charAt(i);
		}
		for (int i = 0; i < cadenaTexto.length; i++) {
			if (!Character.isLetterOrDigit(cadenaTexto[i])) {
				erroralfa=true;
			}
		}
		if (erroralfa==false) {
			System.out.println("La contraseña debe tener un alfanumerico");
		}
	}
}
