package Programacion.Arkanoid.Juego;

public class Pildorapeligrosa extends Pildora {

	public Pildorapeligrosa(Stage stage,int x, int y) {
		super(stage);
		this.x=x;
		this.y=y;
		setSpriteName(new String[] {"bomba.png"});
	}

	public void collision(Objetos a) {
		if (a instanceof Nave) {
			colisionado=true;
			Arkanoid.getInstancia().getPelota().vidas=0;
			stage.getSoundCache().playSound("Punches.wav");
			
		}
	}
}
