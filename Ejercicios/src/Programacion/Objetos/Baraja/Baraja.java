package Programacion.Objetos.Baraja;

public class Baraja {

	private String carta;
	private String palo[]=new String [] {"oros","espadas","copas","bastos"};
	private int numerocarta=0;
	private int numeropalo=0;
	private String repartidas[]=new String [40];
	public void repartir(){
		
		numerocarta=(int)Math.round(Math.random()*(12-1)+1);
		numeropalo=(int)Math.round(Math.random()*(4-1)+1);
		for (int i = 0; i < palo.length; i++) {
			
		}
	}
	
	
	
	
	
	
	
}
