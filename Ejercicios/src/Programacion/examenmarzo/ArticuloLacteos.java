package Programacion.examenmarzo;

public class ArticuloLacteos extends Articulo {

	public ArticuloLacteos() {
		super();
		this.setId(2);
		this.setNombre("leche");
		this.setCantidad(1);
		this.setPrecio(10);
		this.setVaca("gorda");
	}

	public ArticuloLacteos(int id, String nombre, int cantidad, int precio) {
		super(id, nombre, cantidad, precio);
		// TODO Auto-generated constructor stub
	}

	
	public String vaca;


	public ArticuloLacteos(String vaca) {
		super();
		this.vaca = vaca;
	}

	@Override
	public String toString() {
		return "ArticuloLacteos [vaca=" + vaca + ", id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad
				+ ", precio=" + precio + "]";
	}

	@Override
	public String getDescripcion() {
		return "ArticuloLacteos [vaca=" + vaca + ", id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad
				+ ", precio=" + precio + "]";
	}

	public String getVaca() {
		return vaca;
	}

	public void setVaca(String vaca) {
		this.vaca = vaca;
	}

	
	
	
}
