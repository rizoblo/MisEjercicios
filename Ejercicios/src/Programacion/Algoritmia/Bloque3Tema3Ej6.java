package Programacion.Algoritmia;

import javax.swing.JOptionPane;

public class Bloque3Tema3Ej6 {

	public static void main(String[] args) {
		

		int num=1;
		int mul=0;
		int b;
		for ( int i = 0; num != 0; i++)

		{
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
			
			if (num!=0) {
			for (  b = 1; b <= 10 ; b++) {
				
				mul=num*b;
				System.out.println(num+" x " + b + " = "+mul );
			}
		
			}
		}
		}

}
