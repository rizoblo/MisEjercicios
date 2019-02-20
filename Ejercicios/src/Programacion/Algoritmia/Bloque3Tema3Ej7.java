package Programacion;

import javax.swing.JOptionPane;

public class Bloque3Tema3Ej7 {

	public static void main(String[] args) {
	
		int num=1, contadorpos=0, contadorneg=0;
		for (; num != 0;)

		{
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
			
			if (num > 0) {
				contadorpos++;
			}
			if (num<0)
			{
				contadorneg++;
			}
		}
			JOptionPane.showMessageDialog(null, "El numero de positivos es "+contadorpos+", y el numero de negativos es : "+contadorneg);
			
	}

}
