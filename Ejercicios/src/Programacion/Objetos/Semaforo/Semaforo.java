package Programacion.Objetos.Semaforo;

public class Semaforo {

	private String valor[]=new String [] {"rojo","ambar","verde"};
	private String personas[]=new String [] {"peatonrojo","peatonverde"};
	private String color="";
	private int numero=0;
	
	public Semaforo() {
		super();
		this.color=this.valor[0];
	}
	
	public void cambiacolor() {
		
		System.out.println(color);
		for (int i=0;i<valor.length;i++) {
			numero=(int)Math.round(Math.random()*(2-1)+1);
			color=valor[numero];
			System.out.println(color);
			if (color==valor[0]) {
				System.out.println(personas[1]);
			}
			else
			{
				System.out.println(personas[0]);
			}
		}
	}
		
}


