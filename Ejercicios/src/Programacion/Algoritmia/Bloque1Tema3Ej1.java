package Programacion;

import javax.swing.JOptionPane;

public class Bloque1Tema3Ej1 {

	public static void main(String[] args) {
		int suma=0;
		int num1;
		for (int i = 0; i < 4; i++) {
		num1=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));	
		
		if (num1>10) {
			suma=suma+num1;
		}
		}
		
		System.out.println("El resultado es: "+ suma);
	}

}
