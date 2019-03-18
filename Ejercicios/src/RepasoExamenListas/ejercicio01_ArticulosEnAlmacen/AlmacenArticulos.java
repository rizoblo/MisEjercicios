package tutorialJava.capitulo6_Recursos.ejercicios.bloque01_HashMap.ejercicio01_ArticulosEnAlmacen;

import java.util.HashMap;
import java.util.Iterator;

public class AlmacenArticulos {

	private static AlmacenArticulos instancia = null;
	private HashMap<String, Articulo> hmAlmacen = new HashMap<String, Articulo>();
	
	
	
	/**
	 * Constructor
	 */
	public AlmacenArticulos() {
		super();
	}


	/**
	 * Singleton
	 * @return
	 */
	public static AlmacenArticulos getInstancia () {
		if (instancia == null) {
			instancia = new AlmacenArticulos();
		}
		return instancia;
	}


	/**
	 * Método para insertar un nuevo articulo en el almacen
	 * @param art
	 */
	public void agregarNuevoArticulo (Articulo art) {
		this.hmAlmacen.put(art.getCodigoBarras(), art);
	}
	
	
	/**
	 * Obtenemos un listado de los artículos
	 * @return
	 */
	public String listarArticulos () {
		// Construyo la lista a través de un String
		StringBuffer sb = new StringBuffer();
		
		// Recorro todos los objetos del almacen
		Iterator<String> keys = this.hmAlmacen.keySet().iterator();
		while (keys.hasNext()) {
			sb.append(this.hmAlmacen.get(keys.next()).toString() + "\n");
		}
		
		// Finalmente devuelvo el listado en forma de String
		return sb.toString();
	}
	
	
	/**
	 * Eliminación de un articulo
	 * @param art
	 */
	public void eliminarArticulo (String key) {
		this.hmAlmacen.remove(key);
	}
	
	/**
	 * Sabremos si un código de barras existe o no existe
	 * @param key
	 * @return
	 */
	public boolean existeArticulo (String key) {
		if (this.hmAlmacen.get(key) != null) {
			return true;
		}
		return false;
	}
	
	
	
	// Getters y setters
	public HashMap<String, Articulo> getAlmacen() {
		return hmAlmacen;
	}

	public void setAlmacen(HashMap<String, Articulo> hmAlmacen) {
		this.hmAlmacen = hmAlmacen;
	}
}
