package examenhoy;


public class Campobatalla {

	private String nombre;
	public static Campobatalla campobatalla = null; //Singleton
	Malvado malvados[] = new Malvado[20];
	Humano humanos[] = new Humano[20];
	public Campobatalla() {
		super();
		
		malvados = new Malvado[20];
		humanos = new Humano[20];
		int j=0;
		
		for (int i = 1; i < humanos.length+1; i++) {
			Humano.getHumano().calcularpuntosvidahumano();
			humanos[j] = new Humano(Humano.getHumano().getPuntosvida() , "Humano"+i, true);
			j++;
		}
		
		int x=0;
	
		for (int i = 1; i < malvados.length+1; i++) {
			Malvado.getMalvado().calcularpuntosvidamalvado();
			malvados[x] = new Malvado(Malvado.getMalvado().getPuntosvida() , "Malvado"+i, true);
			x++;
		}
	}
	/*
	 * 
	 */
	public void mezclararrayhumano(){
		
		for (int i = 0; i < 100; i++) {
			int indice1 = (int) Math.round(Math.random() * (humanos.length-1));
			int indice2 = (int) Math.round(Math.random() * (humanos.length-1));
			
			Humano aux = humanos[indice1];
			humanos[indice1] = humanos[indice2];
			humanos[indice2] = aux;
		
		}
	}
	/*
	 * 
	 */
	public void finalbosshumano() {
		int puntosvidajefe=humanos[humanos.length-1].getPuntosvida()*2;
		humanos[humanos.length-1].setPuntosvida(puntosvidajefe);
		System.out.println(puntosvidajefe);
	}
	/*
	 * 
	 */
	public void finalbossmalvado() {
		int puntosvidajefe=malvados[malvados.length-1].getPuntosvida()*2;
		malvados[malvados.length-1].setPuntosvida(puntosvidajefe);
		System.out.println(puntosvidajefe);
	}
	/*
	 * 
	 */
	public void mezclararraymalvado(){
		
		for (int i = 0; i < 100; i++) {
			int indice1 = (int) Math.round(Math.random() * (malvados.length-1));
			int indice2 = (int) Math.round(Math.random() * (malvados.length-1));
			
			Malvado aux = malvados[indice1];
			malvados[indice1] = malvados[indice2];
			malvados[indice2] = aux;
		
		}
	}
	/*
	 * 
	 */
	public void imprimirhumanos () {
		System.out.println("Humanos");
		for (int i = 0; i < humanos.length; i++) {
			System.out.println(humanos[i]);
		}
	}
	/*
	 * 
	 */
	public void imprimirmalvados () {
		System.out.println("Malvados");
		for (int i = 0; i < malvados.length; i++) {
			System.out.println(malvados[i]);
		}
	}
	/*
	 * 
	 */
	public void humanodisparamalvado() {

			int impacto=(int)Math.round(Math.random()*(25-5)+5);
			int puntosdespuesimpacto=malvados[0].getPuntosvida()-impacto;
			malvados[0].setPuntosvida(puntosdespuesimpacto);
	}
	/*
	 * 
	 */
	public void comprobacionmuertohumano() {
		int contadormuertoshumano=0;
		if (Humano.getHumano().getPuntosvida()==0 || Humano.getHumano().getPuntosvida()<=0){
			Humano.getHumano().setVivo(false);
			contadormuertoshumano++;
		}
	}
	/*
	 * 
	 */
	public void comprobacionmuertomalvado() {
		int contadormuertosmalvado=0;
		if (Malvado.getMalvado().getPuntosvida()==0 || Malvado.getMalvado().getPuntosvida()<=0){
			Malvado.getMalvado().setVivo(false);
			contadormuertosmalvado++;
		}
	}
	/*
	 * 
	 */
	public void malvadodisparahumano() {

		int impacto=(int)Math.round(Math.random()*(25-5)+5);
		int puntosdespuesimpacto=humanos[0].getPuntosvida()-impacto;
		humanos[0].setPuntosvida(puntosdespuesimpacto);
}
	/*
	 * 
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//Singleton
	public static Campobatalla getCampobatalla() {
		if (campobatalla==null) {
			campobatalla=new Campobatalla();	
		}
		return campobatalla;
	}
	
	
}
