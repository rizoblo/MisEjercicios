package Programacion.Arrays;

import javax.swing.JOptionPane;

public class Bloque1Tema5Ej1 {

	public static void main(String[] args) {
		
		
		int numeros[] = new int[100];
		int max=Integer.parseInt(JOptionPane.showInputDialog("Introduce maximo"));
		int min=Integer.parseInt(JOptionPane.showInputDialog("Introduce minimo"));
		int aleatorio=0;
		int i=0;
		
		for ( i = 0; i < 100; i++) {
			 
			 aleatorio=aleatorio*0;
			
			while (aleatorio<=min) {
				aleatorio=(int) Math.round(Math.random()*max);
			}
			
			numeros [i]=aleatorio;
			System.out.println("["+i+"] : "+aleatorio);
			
		}

	}

}
