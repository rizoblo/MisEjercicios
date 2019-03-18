package tutorialJava.capitulo6_Recursos.ejercicios.bloque01_HashMap.ejercicio01_ArticulosEnAlmacen;

import javax.swing.JOptionPane;

public class PrincipalAlmacen {

	private static String textoMenu = "GESTI�N DE ALMAC�N DE ART�CULOS\n" +
			"1.- Agregar art�culo al almac�n\n" + 
			"2.- Eliminar art�culo del almac�n\n" + 
			"3.- Modificar art�culo\n" + 
			"4.- Listar art�culos\n" +
			"5.- Abandonar el programa\n\n" + 
			"Seleccione opci�n: ";
	
	
	/**
	 * M�todo principal
	 * @param args
	 */
	public static void main(String[] args) {
		int opcionMenu;
		
		do {
			// Muestro el men� y recojo la opci�n del usuario
			opcionMenu = getOpcionMenu();
			
			// En funci�n de la opci�n elegida....
			switch (opcionMenu) {
			case 1: // Agregar nuevo art�culo
				Articulo nuevoArt = new Articulo();
				usuarioRellenaDatosDeArticulo(nuevoArt);
				// Compruebo si el articulo existe en el almacen
				if (AlmacenArticulos.getInstancia().existeArticulo(nuevoArt.getCodigoBarras())) {
					JOptionPane.showMessageDialog(null, "El c�digo de barras introducido corresponde a un art�culo del almacen");
				}
				else { // El articulo no existe, se puede insertar
					AlmacenArticulos.getInstancia().agregarNuevoArticulo(nuevoArt);
					JOptionPane.showMessageDialog(null, "Art�culo insertado");
				}
				break;
				
			case 2: // Eliminar articulo
				// Selecci�n del art�culo
				String codArt = JOptionPane.showInputDialog(AlmacenArticulos.getInstancia().listarArticulos() + 
						"\n\nIntroduzca el c�digo del art�culo que desea eliminar: ");
				// Elimino el articulo si el c�digo existe
				if (AlmacenArticulos.getInstancia().existeArticulo(codArt)) {
					AlmacenArticulos.getInstancia().eliminarArticulo(codArt);
					JOptionPane.showMessageDialog(null, "Art�culo eliminado");
				}
				else { // El art�culo no existe
					JOptionPane.showMessageDialog(null, "El art�culo pedido no existe");
				}
				break;
				
			case 3: // Modificar art�culo
				// Selecci�n del art�culo
				String cod = JOptionPane.showInputDialog(AlmacenArticulos.getInstancia().listarArticulos() + 
						"\n\nIntroduzca el c�digo del art�culo que desea editar: ");
				// Edito el articulo si el c�digo existe
				if (AlmacenArticulos.getInstancia().existeArticulo(cod)) {
					usuarioRellenaDatosDeArticulo(AlmacenArticulos.getInstancia().getAlmacen().get(cod));
					JOptionPane.showMessageDialog(null, "Art�culo modificado");
				}
				else { // El art�culo no existe
					JOptionPane.showMessageDialog(null, "El art�culo pedido no existe");
				}
				break;
				
			case 4: // Listar Articulos
				JOptionPane.showMessageDialog(null, AlmacenArticulos.getInstancia().listarArticulos());
				break;
			}
			
		} while (opcionMenu > -1 && opcionMenu < 5);

	}
	
	
	/**
	 * Recoger opci�n del usuario
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
	 * Gracias a este m�todo el usuario podr� rellenar todos los datos de un articulo
	 * @param art
	 */
	private static void usuarioRellenaDatosDeArticulo (Articulo art) {
		// Nos siempre pido el c�digo de barras, s�lo si no existe
		if (art.getCodigoBarras() == null) {
			art.setCodigoBarras(JOptionPane.showInputDialog("Introduzca el c�digo de barras: "));
		}
		// Pido el resto de los datos del art�culo
		String nuevoDato = JOptionPane.showInputDialog("Introduzca el estante del art�culo: ");
		if (!nuevoDato.equals(""))
			art.setEstante(nuevoDato);
		nuevoDato = JOptionPane.showInputDialog("Introduzca la descripci�n corta del art�culo: ");
		if (!nuevoDato.equals(""))
			art.setDescripcion(nuevoDato);
	}
}
