package Programacion;

import javax.swing.JOptionPane;

public class calculadora {

	public static void main(String[] args) {
		
		
		String mensaje = "";		
		int num1, num2, opcion;
		String menu = "MENU\n"
				+ "1.- Calcular hipotenusa de triangulo\n"
				+ "2.- Calcular superficie de circunferencia\n"
				+ "3.- Calcular perimetro de circunferencia\n"
				+ "4.- Calcular area de rectangulo\n"
				+ "5.- Calcular area de triangulo\n"
				+ "0.- Salir de la operacion\n";
			
		
		opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		
		
		// Resoluci�n de la operaci�n seg�n el tipo de operaci�n pedido por el usuario
		switch (opcion) {
		case 1: // Hipotenusa
			
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Intoduzca primer cateto"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca segundo cateto"));
			mensaje = "Hipotenusa es igual a: " + Math.sqrt((Math.pow(num1, 2)) + (Math.pow(num2, 2)));
			break;
		case 2: // Superficie circunferencia
			mensaje = "Resultado: " + (num1 - num2);
			break;
		case 3: // Multiplicaci�n de dos n�meros
			mensaje = "Resultado: " + (num1 * num2);
			break;
		case 4: // Divisi�n de dos n�meros
			mensaje = "Resultado: " + ((float) num1 / num2);
			break;
		case 5: // M�dulo de la Divisi�n de dos n�meros
			mensaje = "Resultado: " + (num1 % num2);
			break;
		case 6: // Potencia de dos n�meros
			mensaje = "Resultado: " + Math.pow(num1, num2);
			break;
		case 7: // ra�z n-�sima de un n�mero
			mensaje = "Resultado: " + Math.pow(num2, (float) 1 / num1);
			break;
		}  
		
		// Saca la informaci�n al usuario
		JOptionPane.showMessageDialog(null, mensaje);
	}



	}


