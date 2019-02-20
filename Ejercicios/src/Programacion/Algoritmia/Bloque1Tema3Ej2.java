package Programacion;

import javax.swing.JOptionPane;

public class Bloque1Tema3Ej2 {

	public static void main(String[] args) {
		int num1;
		int suma=0;
		
		int tope=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de operaciones"));
		for (int i= 0;  i < tope; i++) {
		num1=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));	
		
		if (num1>10) {
			suma=suma+num1;
		}
		}
		
		System.out.println("El resultado es: "+suma);
	}
	}


