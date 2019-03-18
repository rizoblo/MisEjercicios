package Programacion.examenmarzo;



public class ArticuloCarnicos extends Articulo {

	public ArticuloCarnicos() {
		super();
		this.setId(1);
		this.setNombre("lomo");
		this.setCantidad(1);
		this.setPrecio(10);
		this.setRaza("jabali");
	}

	
	public ArticuloCarnicos(int id, String nombre, int cantidad, int precio) {
		super(id, nombre, cantidad, precio);
		// TODO Auto-generated constructor stub
	}

	public String raza;

	public ArticuloCarnicos(String raza) {
		super();
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "ArticuloCarnicos [raza=" + raza + ", id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad
				+ ", precio=" + precio + "]";
	}

	@Override
	public String getDescripcion() {
		return "ArticuloCarnicos [raza=" + raza + ", id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad
				+ ", precio=" + precio + "]";
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	
	
	
	
}
