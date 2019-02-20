package Programacion.Arkanoid.Juego;

public class Ladrilloimposible extends Ladrillo {

	

	public Ladrilloimposible(Stage stage, int i) {
		super(stage, i);
		setSpriteName(new String[] {nombre[i]});

	}
	protected String nombre[]=new String[] {"colorrojo.jpg"};
			
	
	public void collision(Objetos a) {
		if (a instanceof Pelota) {
			
			stage.getSoundCache().playSound("Punches.wav");

		}
	}
}
