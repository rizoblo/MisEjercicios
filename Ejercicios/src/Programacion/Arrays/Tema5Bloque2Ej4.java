package Programacion.Arrays;

public class Tema5Bloque2Ej4 {

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
		
		for (i=array.length-1;i>0;i--) {
			
			array[i]=array[i-1];
			
		
		}
		
		array[i]=ultimo;
		System.out.println("");
		
		for (i=0;i<array.length;i++) {
			
			System.out.print(array[i]+" ");
			
		}
		
		
		
	}

}
