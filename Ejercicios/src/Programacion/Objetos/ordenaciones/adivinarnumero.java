package Programacion.Objetos.ordenaciones;

import javax.swing.JOptionPane;

public class adivinarnumero {

	public static void main(String[] args) {
		
		int pregunta=0;
		
		int azar=(int)Math.round(Math.random()* (50-(-50)))+(-50);
		
		
		
		do {
			
			pregunta=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero para adivinar"));
			
			if (pregunta>azar) {
				
				JOptionPane.showMessageDialog(null,"El numero objetivo es menor que el objetivo");
				
			}
			
			if (pregunta<azar) {
				
				
				JOptionPane.showMessageDialog(null,"El numero objetivo es mayor que el objetivo");
				
			}
				
		
		
		
	
		
		}
		while (pregunta!=azar);
		JOptionPane.showMessageDialog(null, "Enhorabuena");
	}

}
