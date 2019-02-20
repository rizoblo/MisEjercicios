package Programacion.Arkanoid.Juego;

public class Ladrillosguays extends Ladrillo {

	public int contadorvidaladrillo=2;

	public Ladrillosguays(Stage stage, int i) {
		super(stage, i);
		setSpriteName(new String[] {nombre[i]});

	}
	protected String nombre[]=new String[] {"colorazul.jpg"};
			
	
	public void collision(Objetos a) {
		if (a instanceof Pelota) {
			contadorvidaladrillo--;
			if (contadorvidaladrillo==0) {
			remove();
			}
			stage.getSoundCache().playSound("bazooca.wav");

		}
	}
}
