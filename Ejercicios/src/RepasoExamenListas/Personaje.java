package RepasoExamenListas;


public abstract class Personaje {

	
	
	
	public Personaje() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Personaje(int cod, String nombre, int vida, int fuerza) {
		super();
		this.cod = cod;
		this.nombre = nombre;
		this.vida = vida;
		this.fuerza = fuerza;
	}

	public abstract void act();
	
	private int cod;
	private String nombre;
	private int vida;
	private int fuerza;
	
	
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + "]";
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	
}

