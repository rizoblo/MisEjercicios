package Programacion.examenmarzo;

public class ArticuloProductoFresco extends Articulo {

	public ArticuloProductoFresco() {
		super();
		this.setId(5);
		this.setNombre("Manzana");
		this.setCantidad(1);
		this.setPrecio(10);
		this.setBiodegradable("Argal");
	}

	public ArticuloProductoFresco(int id, String nombre, int cantidad, int precio) {
		super(id, nombre, cantidad, precio);
		// TODO Auto-generated constructor stub
	}

	public String biodegradable;

	public ArticuloProductoFresco(String biodegradable) {
		super();
		this.biodegradable = biodegradable;
	}

	@Override
	public String toString() {
		return "ArticuloProductoFresco [biodegradable=" + biodegradable + ", id=" + id + ", nombre=" + nombre
				+ ", cantidad=" + cantidad + ", precio=" + precio + "]";
	}

	@Override
	public String getDescripcion() {
		return "ArticuloProductoFresco [biodegradable=" + biodegradable + ", id=" + id + ", nombre=" + nombre
				+ ", cantidad=" + cantidad + ", precio=" + precio + "]";
		
	}

	public String getBiodegradable() {
		return biodegradable;
	}

	public void setBiodegradable(String biodegradable) {
		this.biodegradable = biodegradable;
	}
	
	
	
}
