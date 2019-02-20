package Programacion;

import javax.swing.JOptionPane;

public class juego {

	public static void main(String[] args) {
		
		int numeropensado= (int) Math.round(Math.random()*100);
		int num=1;
		do {
			
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero para adivinar"));
			
			if (num > numeropensado) {
				JOptionPane.showMessageDialog(null,"El numero secreto es menor ");
			}
			
			if (num < numeropensado) {
				JOptionPane.showMessageDialog(null,"El numero secreto es mayor ");
			}
			
		}	
		while(num != numeropensado);
		
		JOptionPane.showMessageDialog(null,"Correcto, el numero secreto es "+numeropensado);
	}

}
