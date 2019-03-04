package RepasoExamenListas;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		

		System.out.println("El primer personaje es: "+Personaje1.getInstancia().getNombre()+"\n"
				+ "Tiene una vida de: "+Personaje1.getInstancia().getVida()+"\n"
				+ "El segundo personaje es: "+Personaje2.getInstancia().getNombre()+"\n"
						+ "Tiene una vida de: "+Personaje2.getInstancia().getVida());
		game();
		
	}

	static public void game() {
		do {
			JOptionPane.showMessageDialog(null, "Cambia turno");
			if (Personaje1.getInstancia().getVida()>0) {
			Personaje1.getInstancia().act();
			System.out.println("Turno finalizado, la vida de "+Personaje1.getInstancia().getNombre()+" es de: "+Personaje1.getInstancia().getVida()+", y la de: "+Personaje2.getInstancia().getNombre()+" es de: "+Personaje2.getInstancia().getVida());
			}
			JOptionPane.showMessageDialog(null, "Cambia turno");
			if (Personaje2.getInstancia().getVida()>0) {
			Personaje2.getInstancia().act();
			System.out.println("Turno finalizado, la vida de "+Personaje1.getInstancia().getNombre()+" es de: "+Personaje1.getInstancia().getVida()+", y la de: "+Personaje2.getInstancia().getNombre()+" es de: "+Personaje2.getInstancia().getVida());
			}
		}while(Personaje1.getInstancia().getVida()>0 && Personaje2.getInstancia().getVida()>0);
		System.out.println("Combate terminado");
	}
}
