package RepasoExamenListas.Ejerciciosweb;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.swing.JOptionPane;

public class Bloque5Ej1Datecalendar {

	/*1º.- Crea un programa en Java que pida al usuario la introducción de una fecha a través de JOptionPane. 
	 * El usuario te especificará un dato de tipo String y tú debes convertirlo a un objeto de tipo java.util.Date 
	 * utilizando SimpleDateFormat. 
	 * A continuación realiza las siguientes acciones
      - Con el objeto java.util.Date, crea un objeto de tipo Calendar y que represente la misma fecha que ha introducido el usuario.
      - Obtén en pantalla los siguientes campos: año, mes, día, hora, minuto y segundo.
       Cada campo debe aparecer en una línea de la consola. Debes obtener cada campo desde el objeto java.util.Date y 
       desde el objeto Calendar.
        Es decir, campo debe ser obtenido dos veces en pantalla.
      - Utiliza el objeto de tipo Calendar para obtener nuevas fechas e 
      imprimirlas en pantalla: suma 3 días, resta 2 semanas, suma 300 días, suma 4 años.*/
	public static void main(String[] args) {
		
		fechaparseadasdf();
		dateacalendar();
		camposdelcalendar();
		sumafechas();
	}
	public static Date fechaparseada=null;
	public static Calendar fechaCalendar = new GregorianCalendar(2018, Calendar.APRIL, 01, 22, 05, 23);
	public static Locale locale = Locale.getDefault();
	
	public static void fechaparseadasdf() {
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		try {
			fechaparseada=sdf.parse(JOptionPane.showInputDialog("Introduzca hora"));
		}  catch (ParseException e) {
			System.out.println("Error al parsear fecha");
			e.printStackTrace();
		}
		System.out.println("Fecha parseada "+sdf.format(fechaparseada));
	}
	public static void dateacalendar() {
		// Otra forma muy habitual de manejar fechas es a trav�s de los objetos de tipo Calendar
	
				fechaCalendar.setTime(fechaparseada);
				System.out.println("Fecha a partir de Calendar : " + fechaCalendar.getTime());
	}
	
	public static void camposdelcalendar() {
		System.out.println("Anio: " + fechaCalendar.get(Calendar.YEAR));
		System.out.println("Month (String): " + fechaCalendar.getDisplayName(Calendar.MONTH, Calendar.SHORT, locale));
		System.out.println("Dia del mes: " + fechaCalendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Hora en formato 24H: " + fechaCalendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minutos: " + fechaCalendar.get(Calendar.MINUTE));
		System.out.println("Segundos: " + fechaCalendar.get(Calendar.SECOND));
	}
	
	public static void sumafechas() {
		fechaCalendar.add(Calendar.DAY_OF_MONTH, 3);
		System.out.println("Suma 3 dias : " + fechaCalendar.getTime());
		fechaCalendar.add(Calendar.WEEK_OF_YEAR, -2);
		System.out.println("Resta 2 semanas : " + fechaCalendar.getTime());
		fechaCalendar.add(Calendar.DAY_OF_MONTH, 300);
		System.out.println("Suma 300 dias : " + fechaCalendar.getTime());
		fechaCalendar.add(Calendar.YEAR, 4);
		System.out.println("Suma 4 anios : " + fechaCalendar.getTime());
	}
}
