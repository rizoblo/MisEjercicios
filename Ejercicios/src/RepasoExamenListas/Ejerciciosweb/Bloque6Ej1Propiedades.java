package RepasoExamenListas.Ejerciciosweb;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class Bloque6Ej1Propiedades {

	/*1º.- Crea un programa en Java que utilice un fichero de propiedades para leer un nombre de usuario ficticio
	 *  y su correspondiente contraseña.*/
	
	public static void main(String[] args) {
		String usuario = Bloque6Ej1Propiedades.getProperty("Nombre");
		String password = Bloque6Ej1Propiedades.getProperty("Contrasenia");
		System.out.println("Usuario leido del fichero de propiedades: " + usuario);
		System.out.println("Password leido del fichero de propiedades: " + password);
	}
	
		public Bloque6Ej1Propiedades() {
		super();
		// TODO Auto-generated constructor stub
	}

		private static Properties propiedades = null;

		
		/**
		 * 
		 * @return
		 */
		private static Properties getPropiedades() {
			if (propiedades == null) {
				propiedades = new Properties();
			    
				try {
					propiedades.load(propiedades.getClass().getResourceAsStream("/RepasoExamenListas/Ejerciciosweb/propiedades.properties"));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
			}
			return propiedades;
		}

		/**
		 * 
		 * @param nombrePropiedad
		 * @return
		 */
		public static String getProperty(String nombrePropiedad) {
			return getPropiedades().getProperty(nombrePropiedad);
		}

		
		/**
		 * 
		 * @param nombrePropiedad
		 * @return
		 */
		public static int getIntProperty (String nombrePropiedad) {
			return Integer.parseInt(getPropiedades().getProperty(nombrePropiedad));
		}
		
		
		/**
		 * 
		 * @param nombrePropiedad
		 * @return
		 */
		public static Float getFloatProperty (String nombrePropiedad) {
			return Float.parseFloat(getPropiedades().getProperty(nombrePropiedad));
		}
		
		
		/**
		 * 
		 * @param args
		 */
		
	}


