package Programacion.examenmarzo;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;









public class Caja {

	private static Caja instancia = null;
	public Caja() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static int totalapagar=0;
	public int respuesta;
	public boolean rechazo=false;
	public String hora;
	public static int pagousuario=0;
	public static int cambiousuario=0;
	public boolean cambiohecho=false;
	static List<ArticuloDevueltoListener> articulorechazadolisteners = 	new ArrayList<ArticuloDevueltoListener>();
	HashMap<Integer,Articulo> hm = new HashMap<Integer,Articulo>();
	
	public static void addArticulorechazadoListener (ArticuloDevueltoListener listener) {
		articulorechazadolisteners.add(listener);
	}
	
	/**
	 * 
	 * @param listener
	 */
	public static void removeArticulorechazadoListener (ArticuloDevueltoListener listener) {
		articulorechazadolisteners.remove(listener);
	}

	/**
	 * 
	 * @param e
	 */
	public static void fireArticulorechazadoListener (ArticuloDevueltoEvent e) {
		for (ArticuloDevueltoListener listener : articulorechazadolisteners) {
			listener.articuloencontrado(e);
		}
	}
	public void llenarhashmapdesdelista() {
		for(int i=0;i < Cliente.getInstancia().listarticulos.size();i++) {
			
			
			hm.put(i, Cliente.getInstancia().listarticulos.get(i));
			
			
			// Eliminaci�n de alg�n elemento en el HM
			//hm.remove("5");
			
		}
		System.out.println("Hashmap");
		Iterator<Articulo> articulos = hm.values().iterator();
		while (articulos.hasNext()) {
			System.out.println("Objeto obtenido: "  + articulos.next());
		}
	}
	
	public void comprobarprecio() {
		System.out.println("Total a pagar");
		for (int i=0;i<hm.size();i++) {
			totalapagar+=hm.get(i).precio*hm.get(i).cantidad;
		}
		System.out.println(totalapagar);
	}
	
	public void pago() throws Excepcionpago {
		do {
			
		
		System.out.println("El importe es de "+totalapagar);
		pagousuario=Integer.parseInt(JOptionPane.showInputDialog("Introduzca pago"));
		if (pagousuario<totalapagar) {
			throw new Excepcionpago();
		}
		if (pagousuario==totalapagar) {
			System.out.println("Precio justo introducido, gracias");
		}
		if (pagousuario>totalapagar) {
			cambiousuario=pagousuario-totalapagar;
			System.out.println("Ha introducido "+pagousuario+" su cambio es de "+cambiousuario+", gracias");
			cambiohecho=true;
		}
		}while(!(pagousuario==totalapagar) && cambiohecho==false);
	}
	public void retirararticulo() {
		
		Object claves[] = hm.keySet().toArray();
		for (int i = 0; i < claves.length; i++) {
			rechazo=false;
			System.out.println(" - valor: " + claves[i].toString() + " - Objeto obtenido: "  + hm.get(claves[i]));
			respuesta=Integer.parseInt(JOptionPane.showInputDialog("Desea borrar este articulo? n\""
					+ "1: Si n\""
					+ "2: No"));
			if (respuesta==1) {
				hm.remove(i);
				rechazo=true;
				ArticuloDevueltoEvent event = new ArticuloDevueltoEvent();
				fireArticulorechazadoListener(event);
			}
			else
			{
				System.out.println(" - valor: " + claves[i].toString() + " - Objeto obtenido: "  + hm.get(claves[i]));
			}
			
			System.out.println("Articulos resultantes");
			Iterator<Articulo> articulos = hm.values().iterator();
			while (articulos.hasNext()) {
				System.out.println("Objeto obtenido: "  + articulos.next());
			}
			if (rechazo==true) {
				
				SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy 'at' HH:mm:ss ");
				hora=sdf.format(new Date());
				System.out.println("Fecha actual: " + hora);
			}
		}
		
	}
	
	public synchronized static Caja getInstancia() {
        if (instancia == null) {
            instancia = new Caja();
        }
        return instancia;
    }
}
