package Programacion.Objetos.Primitiva;

public class Primitiva {

	public int array[]= new int[7];
	private int numeroaleatorio=0;
	private int i=0;
	

	public void generacioncombinacion() {
		
		for (i=0;i<array.length;i++) {	
			numeroaleatorio=(int)Math.round(Math.random()*(49-1)+1);
			System.out.print(numeroaleatorio+" ");
		}
	}


	public Primitiva() {
		super();
	}
	

	public Primitiva(int[] array, int numeroaleatorio, int i) {
		super();
		this.array = array;
		this.numeroaleatorio = numeroaleatorio;
		this.i = i;
	}


	public int[] getArray() {
		return array;
	}


	public void setArray(int[] array) {
		this.array = array;
	}


	public int getNumeroaleatorio() {
		return numeroaleatorio;
	}


	public void setNumeroaleatorio(int numeroaleatorio) {
		this.numeroaleatorio = numeroaleatorio;
	}


	public int getI() {
		return i;
	}


	public void setI(int i) {
		this.i = i;
	}
	
}
