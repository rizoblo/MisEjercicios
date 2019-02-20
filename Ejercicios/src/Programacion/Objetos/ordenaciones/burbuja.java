package Programacion.Objetos.ordenaciones;

public class burbuja {

	public static void main(String[] args) {
		int array []= new int [5];
		int i=0;
		int j=0;
		int azar=0;
		int aux=0;
		boolean cambio=true;
		
		for (i=0;i<array.length;i++) {
			
			azar=(int)Math.round(Math.random()*100);
			array[i]=azar;
			System.out.print(array[i]+" ");
		
		}
	
			System.out.println();
		
		while (cambio)  {
			
			cambio=false;
			
			for (j=0;j<array.length-1;j++) {
			
			
				if (array[j+1]<array[j]) {
				
					aux=array[j];	
					array[j]=array[j+1];
					array[j+1]=aux;
					cambio=true;
			
				}	
				
			}
				
		}
		
		
		for (i=0;i<array.length;i++) {
			
			System.out.print(array[i]+" ");
			
		}
	
	}

}