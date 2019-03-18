package Programacion.examenmarzo;

public class ArticuloLimpieza extends Articulo {

	public ArticuloLimpieza() {
		super();
		this.setId(3);
		this.setNombre("Vip");
		this.setCantidad(1);
		this.setPrecio(10);
		this.setMarca("Caro");
	}

	public ArticuloLimpieza(int id, String nombre, int cantidad, int precio) {
		super(id, nombre, cantidad, precio);
		// TODO Auto-generated constructor stub
	}

	public String marca;

	public ArticuloLimpieza(String marca) {
		super();
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "ArticuloLimpieza [marca=" + marca + ", id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad
				+ ", precio=" + precio + "]";
	}

	@Override
	public String getDescripcion() {
		return "ArticuloLimpieza [marca=" + marca + ", id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad
				+ ", precio=" + precio + "]";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
	
}
