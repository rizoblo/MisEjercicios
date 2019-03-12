package RepasoExamenListas.Juegosimulacro;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class propiedadesjuego {

	/*1º.- Crea un programa en Java que utilice un fichero de propiedades para leer un nombre de usuario ficticio
	 *  y su correspondiente contraseña.*/

	
		public propiedadesjuego() {
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
					propiedades.load(propiedades.getClass().getResourceAsStream("/RepasoExamenListas/Juegosimulacro/propiedades"));
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


