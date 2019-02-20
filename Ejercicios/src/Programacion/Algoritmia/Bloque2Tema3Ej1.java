package Programacion;

import javax.swing.JOptionPane;

public class Bloque2Tema3Ej1 {

	public static void main(String[] args) {
	int cantidadnumeros=Integer.parseInt(JOptionPane.showInputDialog("Introduce cantidad de numeros"));
	int suma=0;
	int media=0;
	
	for (int i= 0; i < cantidadnumeros; i++) {
	
	int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero")); 
	
	suma=suma+numero;
	media=suma/cantidadnumeros;
	}
	System.out.println("La media es: "+media);
	
	}
	
}
