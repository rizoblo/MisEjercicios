package Programacion.Arkanoid.Juego;

public class Pildoravida extends Pildora {

	public Pildoravida(Stage stage, int x, int y) {
		super(stage);
		this.x=x;
		this.y=y;
		setSpriteName(new String[] {"botiquin.png"});
	}

	public void collision(Objetos a) {
		if (a instanceof Nave) {
			colisionado=true;
			Arkanoid.getInstancia().getPelota().vidas++;
			stage.getSoundCache().playSound("Punches.wav");
			
		}
	}

}
