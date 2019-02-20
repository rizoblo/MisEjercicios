package Programacion.Arrays;

import javax.swing.JOptionPane;

public class Bloque2Tema5Ej2 {

	public static void main(String[] args) {
		int array[] = new int[150];
		int i=0;
		int azar=0;
		int pregunta=0;
		int cont=0;
		
		
		for ( i = 0; i<149;i++) {
			
			azar=(int)Math.round(Math.random()*100);
			
			
			array[i]=azar;
			System.out.println(array[i]);
			
		}
		pregunta=Integer.parseInt(JOptionPane.showInputDialog("Introduce el indice para averiguar el valor"));
		
		
		for (i = 0;i<149;i++) {
			
			if (pregunta == array [i]) {
				System.out.println("El valor del indice "+i+" es "+azar);
			}
			
			else 
				cont++;
				
				if (cont==150) {
					
					System.out.println("Indice no encontrado");
			}
		}
	}

}
