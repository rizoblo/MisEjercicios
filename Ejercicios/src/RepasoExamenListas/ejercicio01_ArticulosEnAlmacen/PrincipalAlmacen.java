package tutorialJava.capitulo6_Recursos.ejercicios.bloque01_HashMap.ejercicio01_ArticulosEnAlmacen;

import javax.swing.JOptionPane;

public class PrincipalAlmacen {

	private static String textoMenu = "GESTIÓN DE ALMACÉN DE ARTÍCULOS\n" +
			"1.- Agregar artículo al almacén\n" + 
			"2.- Eliminar artículo del almacén\n" + 
			"3.- Modificar artículo\n" + 
			"4.- Listar artículos\n" +
			"5.- Abandonar el programa\n\n" + 
			"Seleccione opción: ";
	
	
	/**
	 * Método principal
	 * @param args
	 */
	public static void main(String[] args) {
		int opcionMenu;
		
		do {
			// Muestro el menú y recojo la opción del usuario
			opcionMenu = getOpcionMenu();
			
			// En función de la opción elegida....
			switch (opcionMenu) {
			case 1: // Agregar nuevo artículo
				Articulo nuevoArt = new Articulo();
				usuarioRellenaDatosDeArticulo(nuevoArt);
				// Compruebo si el articulo existe en el almacen
				if (AlmacenArticulos.getInstancia().existeArticulo(nuevoArt.getCodigoBarras())) {
					JOptionPane.showMessageDialog(null, "El código de barras introducido corresponde a un artículo del almacen");
				}
				else { // El articulo no existe, se puede insertar
					AlmacenArticulos.getInstancia().agregarNuevoArticulo(nuevoArt);
					JOptionPane.showMessageDialog(null, "Artículo insertado");
				}
				break;
				
			case 2: // Eliminar articulo
				// Selección del artículo
				String codArt = JOptionPane.showInputDialog(AlmacenArticulos.getInstancia().listarArticulos() + 
						"\n\nIntroduzca el código del artículo que desea eliminar: ");
				// Elimino el articulo si el código existe
				if (AlmacenArticulos.getInstancia().existeArticulo(codArt)) {
					AlmacenArticulos.getInstancia().eliminarArticulo(codArt);
					JOptionPane.showMessageDialog(null, "Artículo eliminado");
				}
				else { // El artículo no existe
					JOptionPane.showMessageDialog(null, "El artículo pedido no existe");
				}
				break;
				
			case 3: // Modificar artículo
				// Selección del artículo
				String cod = JOptionPane.showInputDialog(AlmacenArticulos.getInstancia().listarArticulos() + 
						"\n\nIntroduzca el código del artículo que desea editar: ");
				// Edito el articulo si el código existe
				if (AlmacenArticulos.getInstancia().existeArticulo(cod)) {
					usuarioRellenaDatosDeArticulo(AlmacenArticulos.getInstancia().getAlmacen().get(cod));
					JOptionPane.showMessageDialog(null, "Artículo modificado");
				}
				else { // El artículo no existe
					JOptionPane.showMessageDialog(null, "El artículo pedido no existe");
				}
				break;
				
			case 4: // Listar Articulos
				JOptionPane.showMessageDialog(null, AlmacenArticulos.getInstancia().listarArticulos());
				break;
			}
			
		} while (opcionMenu > -1 && opcionMenu < 5);

	}
	
	
	/**
	 * Recoger opción del usuario
	 * @return
	 */
	private static int getOpcionMenu () {
		try {
			return Integer.parseInt(JOptionPane.showInputDialog(textoMenu));
		}
		catch (Exception ex) {
			return 0;
		}
	}
	
	
	/**
	 * Gracias a este método el usuario podrá rellenar todos los datos de un articulo
	 * @param art
	 */
	private static void usuarioRellenaDatosDeArticulo (Articulo art) {
		// Nos siempre pido el código de barras, sólo si no existe
		if (art.getCodigoBarras() == null) {
			art.setCodigoBarras(JOptionPane.showInputDialog("Introduzca el código de barras: "));
		}
		// Pido el resto de los datos del artículo
		String nuevoDato = JOptionPane.showInputDialog("Introduzca el estante del artículo: ");
		if (!nuevoDato.equals(""))
			art.setEstante(nuevoDato);
		nuevoDato = JOptionPane.showInputDialog("Introduzca la descripción corta del artículo: ");
		if (!nuevoDato.equals(""))
			art.setDescripcion(nuevoDato);
	}
}
