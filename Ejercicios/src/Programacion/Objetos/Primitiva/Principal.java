package Programacion.Objetos.Primitiva;

import java.lang.reflect.Array;

import javax.print.attribute.standard.PrinterLocation;

public class Principal {

	public static void main(String[] args) {
		
		Primitiva primitiva=new Primitiva();
		for (int j=0;j<5;j++) {
		primitiva.generacioncombinacion();
		System.out.println();
		}
	}

}
