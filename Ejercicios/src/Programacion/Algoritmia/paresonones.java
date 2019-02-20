package Programacion;

import javax.swing.JOptionPane;

public class paresonones {

	public static void main(String[] args) {
		int opcion=Integer.parseInt(JOptionPane.showInputDialog("Elige pares (0) o nones (1)"));
		int mano1user=0;
		int mano2user=0;
		int mano1cpu=0;
		int mano2cpu=0;
		int sumauser=mano1user+mano2user;
		int sumacpu=mano1cpu+mano2cpu;
		int resultado=0;
		int resto=0;
		
		
		if (opcion == 0) {
			JOptionPane.showMessageDialog(null, "Has elegido pares");
			 mano1user=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce la suma de tu primera mano (0-5)"));
			 mano2user=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce la suma de tu segunda mano (0-5)"));
			 mano1cpu=(int) Math.round(Math.random()*5);
			 mano2cpu=(int) Math.round(Math.random()*5);
			 resultado=sumauser+sumacpu;
			 resto=resultado%2;
			 
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Has elegido nones");
			 mano1user=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce la suma de tu primera mano (0-5)"));
			 mano2user=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce la suma de tu segunda mano (0-5)"));
			 mano1cpu=(int) Math.round(Math.random()*5);
			 mano2cpu=(int) Math.round(Math.random()*5);
			 resultado=sumauser+sumacpu;
			 resto=resultado%2;
		}
		if (resto == 0 && opcion == 0) {
			
			JOptionPane.showMessageDialog(null, "Has ganado porque tu tienes "+sumauser+" y la CPU tiene "+sumacpu+" siendo la suma total "+resultado);
			
		}
		if (resto == 0 && opcion == 1) {
			
			JOptionPane.showMessageDialog(null, "Has perdido porque tu tienes "+sumauser+" y la CPU tiene "+sumacpu+" siendo la suma total "+resultado);
		}
		
		if (resto !=0 && opcion == 0) {
			
			JOptionPane.showMessageDialog(null, "Has perdido porque tu tienes "+sumauser+" y la CPU tiene "+sumacpu+" siendo la suma total "+resultado);
		}
		
		if (resto !=0 && opcion == 1) {
		
		JOptionPane.showMessageDialog(null, "Has g porque tu tienes "+sumauser+" y la CPU tiene "+sumacpu+" siendo la suma total "+resultado);
		}
	}
		
}
