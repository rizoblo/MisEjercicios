package Programacion.Objetos.prueba;

public class Clase2 {

	private int resultado=0;
	Clase clase=new Clase();
	
	public int resta() {
		resultado=(clase.getSuma())-(clase.getMedia());
		return resultado;
	}
	
	public void segundaimpresion() {
		System.out.println("La resta es: "+resultado);
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	public Clase getClase() {
		return clase;
	}

	public void setClase(Clase clase) {
		this.clase = clase;
	}

	public Clase2(int resultado, Clase clase) {
		super();
		this.resultado = resultado;
		this.clase = clase;
	}

	public Clase2() {
		super();
	}
	
}
