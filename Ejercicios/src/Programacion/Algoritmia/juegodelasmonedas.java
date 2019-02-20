package Programacion;

import javax.swing.JOptionPane;

public class juegodelasmonedas {

	public static void main(String[] args) {
		
		
		int contadoruser=0;
		int contadorcpu=0;
		int cara=0;
		int cruz=1;
		
		do {
		
			int tirada=(int) Math.round(Math.random());
			
			int opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Escoge, para cara (0) o cruz (1)"));
			
			JOptionPane.showMessageDialog(null, "La tirada ha sido "+tirada);
			
			if (opcion == cara) {
				if (tirada == 0) {
					contadoruser++;
					
					JOptionPane.showMessageDialog(null, "Enhorabuena, has ganado esta ronda \n"
							+ "Tu "+contadoruser+" CPU: "+contadorcpu);
					
				}
				else {
					contadorcpu++;
					JOptionPane.showMessageDialog(null, "Que mal, has perdido esta ronda \n" + 
														 "Tu "+contadoruser+" CPU: "+contadorcpu);
					
				}
			}
			
			if (opcion == cruz) {
				
				if (tirada == 1) {
					contadoruser++;
					JOptionPane.showMessageDialog(null, "Enhorabuena, has ganado esta ronda\n"
							+ "Tu "+contadoruser+" CPU: "+contadorcpu);
					
				}
				else {
					contadorcpu++;
					JOptionPane.showMessageDialog(null, "Que mal, has perdido esta ronda \n"
							+ "Tu "+contadoruser+" CPU: "+contadorcpu);
					
				}
			}
			
			
		}
		while (contadoruser<3 && contadorcpu<3);
		
		if (contadoruser > contadorcpu) {
			
		JOptionPane.showMessageDialog(null, "Has ganado");
		}
		else {
		JOptionPane.showMessageDialog(null, "Has perdido");
		}
}

}