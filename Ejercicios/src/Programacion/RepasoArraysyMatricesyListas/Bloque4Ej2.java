package Programacion.RepasoArraysyMatricesyListas;

public class Bloque4Ej2 {

	public static void main(String[] args) {

		int array[]= CrearArray();
		imprimirarray(array);
		porcentajes(array);
	}

	private static int i=0;
	private static float ContAprobados=0;
	private static float ContSuspensos=0;
	private static float PorcentajeAprobados=0;
	private static float PorcentajeSuspensos=0;

	private static int[] CrearArray(){
		int array[] = new int[200];
		for (i=0;i<array.length;i++) {
			array[i]=(int)Math.round(Math.random()*(10-0)+0);
		}
		return array;
	}
	private static void imprimirarray (int array[]) {
		for (i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	private static void porcentajes(int array[]) {
		for(i=0;i<array.length;i++)
			if (array[i]>=5) {
				ContAprobados++;
			}
			else
			{
				ContSuspensos++;
			}
		PorcentajeAprobados=ContAprobados*100/array.length;
		PorcentajeSuspensos=ContSuspensos*100/array.length;

		System.out.println("El porcentaje de aprobados es de "+PorcentajeAprobados+" y el de suspensos es de "+PorcentajeSuspensos);
	}
}
