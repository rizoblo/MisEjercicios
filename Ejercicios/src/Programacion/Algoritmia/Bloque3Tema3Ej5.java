package Programacion;

import javax.swing.JOptionPane;

public class Bloque3Tema3Ej5 {

	public static void main(String[] args) {
		
		int mayor=0, menor=0;
		int num=1;

	
		for (int i = 0; num !=0; i++) {
			 num=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
			
			
			if (i == 0) {
				
				mayor=num;
				menor=num;
			}
			
			
			if (num>=mayor && num != 0) {
						mayor=num;
			}
			if (num<=menor && num != 0){
						menor=num;
			}
				
			
		
		
		}
		System.out.println("El mayor es "+mayor+ " y el numero menor es "+menor);
	}
}

	

