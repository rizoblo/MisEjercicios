package RepasoExamenListas.Ejerciciosweb;

public class Articulo {

	private String codigo;
	private String estante;
	private String descripcion;
	public Articulo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Articulo(String codigo, String estante, String descripcion) {
		super();
		this.codigo = codigo;
		this.estante = estante;
		this.descripcion = descripcion;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getEstante() {
		return estante;
	}
	public void setEstante(String estante) {
		this.estante = estante;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Articulo [codigo=" + codigo + ", estante=" + estante + ", descripcion=" + descripcion + "]";
	}

	
}
