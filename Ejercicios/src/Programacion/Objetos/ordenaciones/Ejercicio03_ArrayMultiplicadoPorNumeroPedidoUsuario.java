package Programacion.Objetos.ordenaciones;

import javax.swing.JOptionPane;

public class Ejercicio03_ArrayMultiplicadoPorNumeroPedidoUsuario {

	public static void main(String[] args) {
		int array [] = new int[15];
		
		// Inicializaci�n de los arrays
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}
		
		// Impresi�n del array antes de la multiplicaci�n
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		// Pido el n�mero
		int factor = Integer.parseInt(JOptionPane.showInputDialog("Introduzca factor para multiplicar el array"));
		
		// Recorro el array, multiplicando sus valores
		for (int i = 0; i < array.length; i++) {
			array[i] *= factor;
		}
		
		// Impresi�n del array despu�s del cambio de signo
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}

}
