package RepasoArraysyMatrices;

public class Bloque4Ej3 {

	public static void main(String[] args) {
		
		float[] array= CrearArray();
		imprimirarray(array);
		Comprobacion(array);
	}

	private static int i=0;
	private static int NumeroEntero=0;
	private static float NumeroDecimal=0;
	private static float Numero=0;
	private static int ContDecimales=0;
	private static int NumeroComprEntero=0;
	private static float holita=0;


	private static float[] CrearArray(){
		float[] array = new float[20];
		for (i=0;i<array.length;i++) {
			NumeroEntero=(int)Math.round(Math.random()*(100-0)+0);
			NumeroDecimal=(float)Math.round(Math.random()*99)/100;
			Numero=NumeroEntero+NumeroDecimal;
			array[i]=Numero;

		}
		return array;
	}
	private static void imprimirarray (float array[]) {
		for (i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	private static void Comprobacion(float array[]) {
		for(i=0;i<array.length;i++) {
			NumeroComprEntero=(int) array[i];
			holita=(float) (array[i]-NumeroComprEntero)*100;
			//System.out.println("Entero "+NumeroComprEntero);
			System.out.println("Decimal "+holita);
			if (holita>=0 && holita <=49) {
				ContDecimales++;
			}
		}
		
		System.out.println("La cantidad de numeros entre ese intervalo es "+ContDecimales);
	}
	
	
}
