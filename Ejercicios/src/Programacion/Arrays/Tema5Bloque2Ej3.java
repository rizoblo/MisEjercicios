package Programacion.Arrays;

import javax.swing.JOptionPane;



public class Tema5Bloque2Ej3 {

	public static void main(String[] args) {
		
		int array[]= new int [5];
		int azar=0;
		int i=0;
		int resultados=0;
		
		int pregunta=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero para multiplicar por los valores del array"));
		
		
		for (i=0;i<array.length;i++) {
			
			
			azar=(int)Math.round(Math.random()*100);
			array[i]=azar;
			System.out.println("["+i+"]="+array[i]);
			
			
			
			
			
		}
		
		System.out.println("-------------------");
		
		for (i=0;i<array.length;i++) {
			
			resultados=array[i]*pregunta;
			System.out.println("["+i+"]="+resultados);
			
			
		}
		
	
	
		
	}

}
