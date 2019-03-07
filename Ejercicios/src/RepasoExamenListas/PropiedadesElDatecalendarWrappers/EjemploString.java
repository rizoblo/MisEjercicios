package RepasoExamenListas.PropiedadesElDatecalendarWrappers;

public class EjemploString {

	public static void main(String[] args) {
		String str = "Cadena de texto de tama�o mediano"; 
		str = new String("Cadena de texto de tama�o mediano");
		str = new String(new char[] {'C', 'a', 'd', 'e', 'n', 'a', ' ', 'd', 'e', ' ', 't', 'e', 'x', 't', 'o'});
		str = new String(new StringBuffer("Cadena de texto de tama�o mediano"));
		
		System.out.println("Caracter en la posici�n 4: " + str.charAt(4));
		System.out.println("Comparaci�n con la cadena \"Hola\": " + str.compareTo("Hola"));
		System.out.println("Concatenaci�n con la cadena \" para practicar\": " + str.concat(" para practicar"));
		System.out.println("B�squeda booleana de la cadena \"texto\": " + str.contains("texto"));
		System.out.println("Respuesta booleana a la terminaci�n de la cadena con respecto a la cadena \"mediano\": " + str.endsWith("mediano"));
		System.out.println("Comparaci�n de cadena ignorando may�sculas: " + str.equalsIgnoreCase("CADENA DE TEXTO DE TAMA�O MEDIANO"));
		System.out.println("�ndice en el que se encuentra la cadena \"texto\" (-1 si no se encuentra la cadena): " + str.indexOf("texto"));
		System.out.println("Est� la cadena vac�a?: " + str.isEmpty());
		System.out.println("�ndice de la �ltima aparici�n del car�cter 'a': " + str.lastIndexOf("a"));
		System.out.println("Longitud de una cadena de texto: " + str.length());
		System.out.println("Reemplazar todas las apariciones de 'a' por el car�cter 'o': " + str.replace('a', 'o'));
		System.out.println("Remplazo de todas las vocales a trav�s de expresi�n regular: " + str.replaceAll("[aeiou]", "�"));
		
		// Ejemplo de separaci�n de cadena en cadenas a trav�s de split()
		System.out.println("Separaci�n de una cadena en otras cadenas a trav�s de un espacio en blanco");
		String[] palabras = str.split(" ");
		for (int i = 0; i < palabras.length; i++) {
			System.out.println("Palabra " + (i + 1) + ": " + palabras[i]);
		}
		
		// Uso de split() con una expresi�n regular
		System.out.println("Separaci�n de una cadena en otras cadenas a trav�s de la expresi�n regular [adt]");
		palabras = str.split("[adt]");
		for (int i = 0; i < palabras.length; i++) {
			System.out.println("Palabra " + (i + 1) + ": " + palabras[i]);
		}
		
		// Uso de split() con una expresi�n regular
		System.out.println("Separaci�n de una cadena en otras cadenas a trav�s de la expresi�n regular \" {2,}\", \" \"");
		palabras = new String("Cadena con 2 espacios  en medio").split(" {2,}");
		for (int i = 0; i < palabras.length; i++) {
			System.out.println("Palabra " + (i + 1) + ": " + palabras[i]);
		}
		
		System.out.println("Subcadena de texto a partir de los �ndices de inicio y fin: " + str.substring(4, 15));
		System.out.println("Paso a min�sculas: " + str.toLowerCase());
		System.out.println("Paso a may�sculas: " + str.toUpperCase());
		System.out.println("Eliminaci�n de los espacios en blanco iniciales: " + new String("        Cadena de texto de tama�o mediano").trim());
	}

}
