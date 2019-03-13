package examenhoy;

public class Malvado {
	
	private int puntosvida=0;
	private String nombre;
	private boolean vivo=true;
	public static Malvado malvado = null;
	

	
	
	public Malvado() {
		super();
	}
	
	public void calcularpuntosvidamalvado(){
		puntosvida=(int)Math.round(Math.random()*(100-50)+50);
	}
	
	public void imprimirvidamalvado() {
		System.out.println("Malvado: "+puntosvida);
	}
	
	public static Malvado getMalvado() {
		if (malvado==null) {
			malvado=new Malvado();	
		}
		return malvado;
	}
	
	public Malvado(int puntosvida, String nombre, boolean vivo) {
		super();
		this.puntosvida = puntosvida;
		this.nombre = nombre;
		this.vivo = vivo;
	}
	@Override
	public String toString() {
		return "Malvado [puntosvida=" + puntosvida + ", nombre=" + nombre + ", vivo=" + vivo + "]";
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
