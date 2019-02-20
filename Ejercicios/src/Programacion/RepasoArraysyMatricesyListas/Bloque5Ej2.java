package Programacion.RepasoArraysyMatricesyListas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Bloque5Ej2 {

	static List<String> supermercado = new ArrayList<String>();
	public static void main(String[] args) {
		
		
		supermercado.add(JOptionPane.showInputDialog("Introduce el primer cliente"));
		do {
			añadirgente();
			eliminargente();	
			
		}while(supermercado.size()<15);
	}
	
	public static void añadirgente() {
		int entradanum=(int)Math.round(Math.random()*10);
		if(entradanum==5) {
		supermercado.add(JOptionPane.showInputDialog("Introduce cliente"));
		System.out.println(supermercado);
		System.out.println("Añado por aleatorio");
		}
	}
	
	public static void eliminargente() {
		int salidanum=(int)Math.round(Math.random()*10);
		if(salidanum==5) {
		supermercado.remove(0);
		System.out.println(supermercado);
		System.out.println("Elimino por aleatorio");
		}
	}

}
