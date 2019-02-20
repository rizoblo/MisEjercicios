package Programacion;

import javax.swing.JOptionPane;

public class Bloque3Tema3Ej1 {

	public static void main(String[] args) {
		
		int suma=0;
		int num=1;
		
		for (int i = 0; num != 0;i++) {
			
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
			suma=suma+num;
		}
		System.out.println("El valor de la suma de todos los numeros es: "+suma);
	}

}
