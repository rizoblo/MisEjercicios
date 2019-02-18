package RepasoArraysyMatrices;

public class Bloque4Ej1 {

	public static void main(String[] args) {
		int array[]= CrearArray();
		imprimirarray(array);
		ComprobarArrayImpar(array);
	}

	private static int i=0;
	private static int MitadArray;
	private static int[] CrearArray(){
		int array[] = new int[6];
		for (i=0;i<array.length;i++) {
			array[i]=(int)Math.round(Math.random()*100);
		}
		return array;
	}
	private static void imprimirarray (int array[]) {
		for (i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	private static void ComprobarArrayImpar(int array[]) {
		
			if (array.length%2==1) {
				MitadArray=array.length/2;
				System.out.println("El número de en medio es "+array[MitadArray]);
			}
		
			else
				System.out.println();;
			{
				System.out.println("Longitud par "+-1);
			}
	}
	
	
}
