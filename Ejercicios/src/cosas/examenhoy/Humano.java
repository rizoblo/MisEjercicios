package examenhoy;

public class Humano {

	private int puntosvida=0;
	private String nombre;
	private boolean vivo=true;
	public static Humano humano = null;
	
	public void calcularpuntosvidahumano(){
		puntosvida=(int)Math.round(Math.random()*(100-50)+50);
	}
	
	public void imprimirvidahumano() {
		System.out.println("Humano: "+puntosvida);
	}
	
	public static Humano getHumano() {
		if (humano==null) {
			humano=new Humano();	
		}
		return humano;
	}
	
	public Humano() {
		super();
	}
	public Humano(int puntosvida, String nombre, boolean vivo) {
		super();
		this.puntosvida = puntosvida;
		this.nombre = nombre;
		this.vivo = vivo;
	}
	@Override
	public String toString() {
		return "Humano [puntosvida=" + puntosvida + ", nombre=" + nombre + ", vivo=" + vivo + "]";
	}
	public int getPuntosvida() {
		return puntosvida;
	}
	public void setPuntosvida(int puntosvida) {
		this.puntosvida = puntosvida;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
}
