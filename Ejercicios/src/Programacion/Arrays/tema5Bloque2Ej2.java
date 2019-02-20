package Programacion.Arrays;

public class tema5Bloque2Ej2 {

	public static void main(String[] args) {
		
		int array[]= new int [5];
		int array2[]= new int [5];
		int array3[]= new int [5];
		int i=0;
		int azar=0;
		int azar1=0;
		int azar2=0;
		int grupo1=0;
		int grupo2=0;
		
		for (i=0;i<=4;i++) {
			
			azar=(int)Math.round(Math.random()*100);
			array[i]=azar;
			System.out.println("["+i+"]"+array[i]);
			
			
			
		}
		
		System.out.println("-------------------------------------------------------");
		
		
		for (i=0;i<=4;i++) {
			
			azar1=(int)Math.round(Math.random()*100);
			array2[i]=azar1;
			System.out.println("["+i+"]"+array2[i]);
			
			
			
				
			
		}
		
		
		System.out.println("-------------------------------------------------------");
		
		
		for (i=0;i<=4;i++) {
			
			azar2=(int)Math.round(Math.random()*100);
			array3[i]=azar2;
			
			
				if(i%2!=0) {
				
					array3[i]=array[i];
				
				}
				
				if (i%2==0) {
					
					array3[i]=array2[i];				
				}
				
			
				
				System.out.println("["+i+"]"+array3[i]);
			
			
		}
		
		
	}

}
