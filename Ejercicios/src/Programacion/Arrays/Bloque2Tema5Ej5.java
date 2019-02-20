package Programacion.Arrays;

import javax.swing.JOptionPane;

public class Bloque2Tema5Ej5 {

	public static void main(String[] args) {
		
	
		int array[]= new int [5];
		int i=0,j=0;
		int azar=0;
		int ultimo=0;
		
				
		
		
		for (i=0;i<array.length;i++) {
			
			azar=(int)Math.round(Math.random()*100);
			array[i]=azar;	
			System.out.print(array[i]+" ");
			
		}
		
		ultimo=array[4];
		int cantidad=Integer.parseInt(JOptionPane.showInputDialog("Introduce cantidad de desplazamientos"));

		
		for (i=0;i<array.length-1;i++) {
			
			array[i]=array[i+cantidad];
			
		
		}
		
		array[i]=ultimo;
		for (i=0;i<array.length;i++) {
			
			System.out.println(array[i]);
		}

}
}