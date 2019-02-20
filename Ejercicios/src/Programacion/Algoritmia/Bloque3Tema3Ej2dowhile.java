package Programacion;

import javax.swing.JOptionPane;

public class Bloque3Tema3Ej2dowhile {

	public static void main(String[] args) {
		
		int suma=0, contador=-1;
		int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
		
		do {
			contador++;
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
			suma+=num;
			
			
			 
		} 	while (num != 0); 
			
			
		
			
		
		JOptionPane.showMessageDialog(null,"La media de los numeros es "+((float)suma/contador));
		}
	
}

