package RepasoExamenListas.Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class EjemploListYArrayList {

	public static void main (String args[]) {

		/*public static void main(String[] args) {
	        List<Object>f=new ArrayList<Object>();
	        f.add(new Integer(7));
	        f.add(new Integer(3));
	        f.add(new Integer(1));
	        f.add(new Integer(5));
	        f.add(new Integer(7));
	        f.add("HOLA");
	        for(int i=0;i<f.size();i++) {
	            System.out.println(f.get(i));
	        }
	        System.out.println("--------en mi cabesa esta---------");
			//para borrar objetos segun su contenido
	        f.remove(f.indexOf("HOLA"));
	        //para borrar objetos segun su indice en la lista
			f.remove(3);
	        for(int i=0;i<f.size();i++) {
	            System.out.println(f.get(i));
	        }
	    }*/
		// Construyo dos objetos de tipo Cromo, que se a�adir�n a la lista
		Cromo pauGasol = new Cromo (1, "Pau Gasol");
		Cromo marcGasol = new Cromo (2, "Marc Gasol");
		
		// Instancio un nuevo elemento de la Interface List, a trav�s de la creaci�n de un objeto
		// que implementa la interfaz, en concreto en este caso se utiliza la clase ArrayList
		List<Cromo> cromosBasket1 = new ArrayList<Cromo>();

		// Un elemento de tipo List puede a�adir elementos al final de la lista o en cualquier 
		// posici�n concreta
		cromosBasket1.add(pauGasol);
		cromosBasket1.add(marcGasol); // Posici�n concreta: primer elemento de la lista

		cromosBasket1.add(0, marcGasol);
		Cromo cromoBorrado = cromosBasket1.remove(0);
		System.out.println("Cromo borrado: " + cromoBorrado);
		
		
		List<Cromo> cromos = new ArrayList<Cromo>();
		
		cromos.add(new Cromo(1, "Herrera"));
		cromos.add(new Cromo (2, "Luka Doncic"));
		
		for (Cromo cromo : cromos) {
			cromo.setDescripcion("Cromo: " + cromo.getDescripcion());
			System.out.println(cromo);
		}
		
		
		
		
		//imprimeList(cromosBasket1);

		/*
		// Ahora repito el experimento con otros dos cromos y otra lista diferente
		Cromo rudyFernandez = new Cromo (3, "Rudy Fern�ndez");
		Cromo rickyRubio = new Cromo (4, "Ricky Rubio");
		
		List<Cromo> cromosBasket2 = new ArrayList<Cromo>();
		
		cromosBasket2.add(rudyFernandez);
		cromosBasket2.add(1, rickyRubio);
		
		cromosBasket1.addAll(cromosBasket1);
		
		pauGasol.setDescripcion("Pau, el mejor de la historia");
*/		
		
	}
	
	
	/**
	 * 
	 * @param lista
	 */
	private static void imprimeList (List<Cromo> lista) {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).toString());
		}
	}
}
