package Tema6Recursos;

import javax.swing.JOptionPane;

public class JavalangBloque2 {

	/* Crear un programa que resuelva ecuaciones de segundo grado con una incógnita. 
	El programa debe pedir los parámetros a, b y c de la ecuación, e imprimir, en caso de que las haya, 
	la solución o soluciones de la ecuación.*/
	public static void main(String[] args) {
		
		ecuacionsegundogrado();
		
	}

	static public void ecuacionsegundogrado() {
		

	        int a =Integer.parseInt(JOptionPane.showInputDialog("Introduce parametro a")); //1

	        int b =Integer.parseInt(JOptionPane.showInputDialog("Introduce parametro b")); //0

	        int c =Integer.parseInt(JOptionPane.showInputDialog("Introduce parametro c")); //-1

	        //Obtien los valores x1,x2 de la ecuacion

	        double x1 = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);

	        double x2 = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);

	        //imprime los valores

	        System.out.println("La solucion de x1: "+x1);

	        System.out.println("La solucion de x2: "+x2);
	}
}
