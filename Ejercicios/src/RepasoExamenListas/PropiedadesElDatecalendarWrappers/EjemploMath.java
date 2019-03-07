package RepasoExamenListas.PropiedadesElDatecalendarWrappers;

public class EjemploMath {

	public static void main(String[] args) {
		// La clase Math tiene una cantidad importante de m�todos que podemos utilizar en c�lculos muy diversos
		
		// Respecto a las propiedades encontramos dos propiedades est�ticas
		System.out.println("Valor de PI: " + Math.PI);
		System.out.println("Valor de E: " + Math.E);
		
		// M�todos de inter�s
		System.out.println("\nM�todos b�sicos:\nM�ximo de dos n�meros: " + Math.max(3, 4.5));
		System.out.println("M�nimo de dos n�meros: " + Math.min(3.5, 4));
		System.out.println("Valor absoluto de -3: " + Math.abs(-3)); 
		System.out.println("Redondeo del n�mero 3.5: " + Math.round(3.5));
		System.out.println("N�mero al azar entre 0 y 1: " + Math.random());
		
		System.out.println("\nPotenciaci�n:\nPotencia de base 25 y exponente 0.5 (raiz cuadrada de 25): " + Math.pow(25, 0.5));
		System.out.println("Raiz cuadrada de 9: " + Math.sqrt(9));
		System.out.println("Raiz c�bica de 27: " + Math.cbrt(27));
		System.out.println("Potencia del n�mero E con exponente 10: " + Math.exp(10));
		System.out.println("Hipotenusa de un tri�ngulo rect�ngulo, dados dos de los catetos del mismo: " + Math.hypot(3, 4));
		System.out.println("Logaritmos:\nLogaritmo en base 10 del n�mero 100: " + Math.log10(100));
		System.out.println("Logaritmo en base E de la potencia de base E y exponente 2: " + Math.log(Math.pow(Math.E, 2)));

		System.out.println("\nTrigonometr�a:\nPaso de 90 grados a radianes: " + Math.toRadians(90));
		System.out.println("Paso de 1 radi�n a grados: " + Math.toDegrees(1));
		System.out.println("Seno del �ngulo de 1 radi�n: " + Math.sin(1));
		System.out.println("Coseno del �ngulo de 2 radianes: " + Math.cos(2));
		System.out.println("Tangente del �ngulo de 45 grados: " + Math.tan(Math.toRadians(45)));
		System.out.println("Arcoseno del �ngulo de 0.85 radianes: " + Math.asin(0.85)); 
		System.out.println("Arcocoseno del �ngulo de 0.15 radianes: " + Math.acos(0.15)); 
		System.out.println("Arcotangente del �ngulo de 45 grados: " + Math.atan(Math.toRadians(45))); 

		// Existen otros pocos m�todos m�s en la clase Math, si quieres puedes descubrirlos a trav�s de Javadoc Math.
	}

}
