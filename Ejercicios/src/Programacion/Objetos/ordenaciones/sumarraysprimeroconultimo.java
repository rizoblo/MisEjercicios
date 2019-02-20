package Programacion.Objetos.ordenaciones;

import java.lang.reflect.Array;

public class sumarraysprimeroconultimo {

	public static void main(String[] args) {
		int array1 [] = new int[5];
		int array2 [] = new int[5];
		int array3 [] = new int[5];
		
		int i=0; int j=0; int z=0;
		
		for ( i = 0; i < array1.length; i++) {
			array1[i] = (int) Math.round(Math.random() * 100);
		}
		
		for ( j = 0; j < array1.length; j++) {
			array2[j] = (int) Math.round(Math.random() * 100);
		}
		
		j=array1.length;
		
		for ( i = 0; i < array1.length; i++) {
				
				j=j-1;
				
				array3[i]=array1[i]+array2[j];
			}
			
		
		for (z = 0; z < array1.length; z++) {
			
			System.out.println(array3[z]+" ");
		}
	}

}
