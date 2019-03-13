package RepasoExamenListas.Juegosimulacro;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;





public class Principal {

	static List<PatadaListener> patadasintroducidasListeners = new ArrayList<PatadaListener>(); //lista de listeners
	public static void main(String[] args) {
		

		System.out.println("El primer personaje es: "+Personaje1.getInstancia().getNombre()+"\n"
				+ "Tiene una vida de: "+Personaje1.getInstancia().getVida()+"\n"
				+ "El segundo personaje es: "+Personaje2.getInstancia().getNombre()+"\n"
						+ "Tiene una vida de: "+Personaje2.getInstancia().getVida());
		game();
		
	}

	public static void addPatadaListener (PatadaListener listener) { //add para el listener
		patadasintroducidasListeners.add(listener);
	}
	public static void removePatadaListener (PatadaListener listener) { //remove para el listener
		patadasintroducidasListeners.remove(listener);
	}
	public static void firePatadaEventJ1(PatadaEvent event) {
		for (PatadaListener listener : patadasintroducidasListeners) {
			listener.patadaIntroducidaJ1(event); //el metodo del listener que queramos llamar
		}
	}
	public static void firePatadaEventJ2(PatadaEvent event) {
		for (PatadaListener listener : patadasintroducidasListeners) {
			listener.patadaIntroducidaJ2(event); //el metodo del listener que queramos llamar
		}
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
