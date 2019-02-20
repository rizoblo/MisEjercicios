package Programacion.Arrays;

import javax.swing.JOptionPane;

public class Bloque1Tema5Ej1y1 {

	public static void main(String[] args) {
		


		int array[] = new int[150];
		int max=Integer.parseInt(JOptionPane.showInputDialog("Introduce maximo"));
		int min=Integer.parseInt(JOptionPane.showInputDialog("Introduce minimo"));
		int i=0;
		int azar=0;
		
		for (i=149; i >-1;i--) {
			
			azar=azar*0;
			
				
			
			azar=(int)Math.round(Math.random()*((max-min)+min));
		
			
			array[i]=azar;
			System.out.println("["+i+"] : "+azar);
		}
		
	}

}
