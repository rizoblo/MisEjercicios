package Programacion.examenmarzo;

public class ArticuloPescado extends Articulo {

	public ArticuloPescado() {
		super();
		this.setId(4);
		this.setNombre("Espada");
		this.setCantidad(1);
		this.setPrecio(10);
		this.setMar("Indico");	}

	public ArticuloPescado(int id, String nombre, int cantidad, int precio) {
		super(id, nombre, cantidad, precio);
		// TODO Auto-generated constructor stub
	}

	public String mar;

	public ArticuloPescado(String mar) {
		super();
		this.mar = mar;
	}

	@Override
	public String toString() {
		return "ArticuloPescado [mar=" + mar + ", id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad
				+ ", precio=" + precio + "]";
	}

	@Override
	public String getDescripcion() {
		return "ArticuloPescado [mar=" + mar + ", id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad
				+ ", precio=" + precio + "]";
		
	}

	public String getMar() {
		return mar;
	}

	public void setMar(String mar) {
		this.mar = mar;
	}
	
	
	
	
}
