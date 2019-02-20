package Programacion.Arkanoid.Juego;

public class Ladrillo extends Objetos {

	protected String nombre[]=new String[] {"coloramarillo.jpg","colornaranja.jpg","colorverde.jpg"};
	public Ladrillo(Stage stage, int i) {
		super(stage);
		setSpriteName(new String[] {nombre[i]});
		
	}
	public void collision(Objetos a) {
		if (a instanceof Pelota) {
			remove();
			stage.getSoundCache().playSound("petardo.wav");

		}
	}
}
