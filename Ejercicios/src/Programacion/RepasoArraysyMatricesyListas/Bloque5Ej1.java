package Programacion.RepasoArraysyMatricesyListas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;



public class Bloque5Ej1 {
	

	public static void main(String[] args) {
		List<String> editor = new ArrayList<String>();
		List<String> portapapeles= new ArrayList<String>();
		int opcion=0; 
		int pregunta=0;
		int pregunta2=0;
		String aux;
		do {
			 opcion=Integer.parseInt(JOptionPane.showInputDialog("Escoge una opción \n"
					+ "1. Añadir línea de texto \n"
					+ "2. Insertar línea en cualquier posición \n"
					+ "3. Editar una línea (reescribir su contenido). \n"
					+ "4. Borrar una línea. \n"
					+ "5. Cortar un conjunto de líneas, (marcadas por su posición inicial y final). \n"
					+ "6. Pegar un conjunto de líneas cortadas en una determinada posición. \n"
					+ "7. Imprimir el texto. Cada línea aparecerá numerada. \n"
					+ "8. Salir."));
			switch (opcion){
				case 1:
					editor.add(JOptionPane.showInputDialog("Introduce línea"));
					System.out.println(editor);
				break;
				case 2:
					pregunta=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce la posición en la que quieres insertar"));
					editor.add(pregunta, JOptionPane.showInputDialog("Introduce texto"));
					System.out.println(editor);
				break;
				case 3:
					pregunta=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce la posición de la línea que quieres modificar"));
					editor.set(pregunta, JOptionPane.showInputDialog("Introduce texto"));
					System.out.println(editor);
				break;
				case 4:
					pregunta=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce la posición de la línea que quieres eliminar"));
					editor.remove(pregunta);
					System.out.println(editor);
				break;
				case 5:
					pregunta=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce la primera posición de intervalo que quieres cortar"));
					pregunta2=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce la última posición de intervalo que quieres cortar"));
					portapapeles=editor.subList(pregunta, pregunta2);
					aux=editor.get(pregunta2);
					portapapeles.add(aux);
					editor.removeAll(portapapeles);
					System.out.println("Este es el original "+editor);
					break;
				case 6:
					pregunta=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce la posición en la que quieres pegar"));
					editor.addAll(pregunta, portapapeles);
					System.out.println(editor);
				break;

			}
		}while(opcion!=8);
	}
}
