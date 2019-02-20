package Programacion.Objetos.ordenaciones;

public class inserciondirecta {

	public static void main(String[] args) {
		
		int array []= new int [5];
		int i=0;
		int j=0;
		int azar=0;
		int aux=0;
		
		
		for (i=0;i<array.length;i++) {
			
			azar=(int)Math.round(Math.random()*100);
			array[i]=azar;
			System.out.print(array[i]+" ");
		
		}
		
		System.out.println("");

		
		for (i=0;i<array.length-1;i++) {
			
			for (j=i+1;j>0;j--) {
				
				if (array[j]<array[j-1]) {
						
				aux=array[j-1];
				array[j-1]=array[j];
				array[j]=aux;
				}
				
			}
			
		}
		
		
		
		for (i=0;i<array.length;i++) {
			
			System.out.print(array[i]+" ");
		}
		
	}

}
