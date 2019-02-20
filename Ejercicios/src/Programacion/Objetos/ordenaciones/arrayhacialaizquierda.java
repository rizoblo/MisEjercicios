package Programacion.Objetos.ordenaciones;

public class arrayhacialaizquierda {

	public static void main(String[] args) {
		
		int array []= new int [5];
		int i=0;
		
		
		for (i=0;i<array.length;i++) {
				
			int azar=(int)Math.round(Math.random()*100);
			array[i]=azar;
			System.out.print(array[i]+" ");
		
		}
		
		System.out.println("");
		int primero=array[0];
		
		for (i=0;i<array.length-1;i++) {
			
			array[i]=array[i+1];
			
			
			
		}
		
		array[i]=primero;
		
		for (i=0;i<array.length;i++) {
		
		System.out.print(array[i]+" ");
		
		}
		
	}


}

