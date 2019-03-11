package RepasoExamenListas.Ejerciciosweb;

import java.util.HashMap;

import javax.swing.JOptionPane;



	/*Crear una aplicación que gestione los artículos guardados en un almacén. 
	 * Cada artículo tiene un código de barras, y un número de estante. La aplicación permitirá que el usuario añada artículos nuevos, 
	 * los borre, actualice el estante de un artículo, e imprima la lista de artículos.
	 *  Además el usuario podrá consultar la localización de un determinado artículo por su código de barras. 
	 * Sólo existirá como mucho una unidad de cada tipo de artículo.*/

public class Bloque1Ej1Hashmap {

	public static String texto="Elija opcion \n"
			+ "1.Añadir articulo \n"
			+ "2.Imprimir articulo \n"
			+ "3.Actualizar articulo \n"
			+ "4.Borrar articulo \n"
			+ "0.Salir";
	public static int respuesta=0;
	public static String posicion;
	public static String codigo;
	public static String estante;
	public static String descripcion;
	public static String lista;
	public static String respuestaupdate;
	
	
	public static HashMap<String, Articulo> hm = new HashMap<String, Articulo>();
	public static void main(String[] args) {
		ejercicio();


	}

	public static void ejercicio(){
		do {
			
		
		respuesta=Integer.parseInt(JOptionPane.showInputDialog(texto));
		if (respuesta==1) {
			codigo=JOptionPane.showInputDialog("Introduzca codigo");
			estante=JOptionPane.showInputDialog("Introduzca estante");
			descripcion=JOptionPane.showInputDialog("Introduzca descripcion");
			hm.put(codigo, new Articulo (codigo, estante, descripcion));
		}
		if (respuesta==2) {
			lista="";
			Object claves[] = hm.keySet().toArray();
			for (int i = 0; i < claves.length; i++) {
				lista+=("Codigo: " + claves[i].toString() + " Articulo: "  + hm.get(claves[i])+"\n");
			}
			JOptionPane.showMessageDialog(null, lista);
		}
		if (respuesta==3) {
			lista="";
			Object claves[] = hm.keySet().toArray();
			for (int i = 0; i < claves.length; i++) {
				lista+=("Codigo: " + claves[i].toString() + " Articulo: "  + hm.get(claves[i])+"\n");
			}
			JOptionPane.showMessageDialog(null, lista);

			respuestaupdate=JOptionPane.showInputDialog("Introduce el codigo que desea actualizar");
			//codigo=JOptionPane.showInputDialog("Introduzca codigo");
			estante=JOptionPane.showInputDialog("Introduzca estante");
			descripcion=JOptionPane.showInputDialog("Introduzca descripcion");
			hm.put(respuestaupdate, new Articulo (codigo, estante, descripcion));
		}
		if (respuesta==4) {
			Object claves[] = hm.keySet().toArray();
			for (int i = 0; i < claves.length; i++) {
				lista+=("Codigo: " + claves[i].toString() + " Articulo: "  + hm.get(claves[i])+"\n");
			}
			JOptionPane.showMessageDialog(null, lista);

			respuestaupdate=JOptionPane.showInputDialog("Introduce el codigo que desea borrar");
			hm.remove(codigo);
		}
		}while(respuesta!=0);
	}
	
}
