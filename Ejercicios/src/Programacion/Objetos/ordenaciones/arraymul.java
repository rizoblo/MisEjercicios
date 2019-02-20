package Programacion.Objetos.ordenaciones;

public class arraymul {

	public static void main(String[] args) {
		int array1 [] = new int[5];
		int array2 [] = new int[5];
		int array3 [] = new int[5];
		int i=0; int j=0; int z=0;
		
		//declaracion
		
		for ( i = 0; i < array1.length; i++) {
			array1[i] = (int) Math.round(Math.random() * 100);
		}
		
		//declaracion
		
		for ( j = 0; j < array2.length; j++) {
			array2[j] = (int) Math.round(Math.random() * 100);
		}
		
		//multiplicacion
		
		for ( z = 0; z < array1.length; z++) {
				array3[z]=array1[z] * array2[z];
		}
		
		
		for  (z=0;z<array3.length;z++) {
			
			System.out.print(array3[z]+" ");
		}
		
	}
		
}


