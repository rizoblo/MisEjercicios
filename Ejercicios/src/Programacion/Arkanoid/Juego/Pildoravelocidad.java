package Programacion.Arkanoid.Juego;

public class Pildoravelocidad extends Pildora {

	public Pildoravelocidad(Stage stage, int x, int y) {
		super(stage);
		this.x=x;
		this.y=y;
		setSpriteName(new String[] {"speed.png"});
	}
	public void collision(Objetos a) {
		if (a instanceof Nave) {
			colisionado=true;
			Arkanoid.getInstancia().getPelota().pixelsPorFrame+=Arkanoid.getInstancia().getPelota().pixelsPorFrame/5;
			stage.getSoundCache().playSound("Punches.wav");
			
		}
	}

}
