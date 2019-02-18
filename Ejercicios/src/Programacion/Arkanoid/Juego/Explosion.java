package Programacion.Arkanoid.Juego;

public class Explosion extends Objetos {
	
	String explosion[]=new String[] {
			"sprite-explosion1.png",
			"sprite-explosion2.png",
			"sprite-explosion3.png",
			"sprite-explosion4.png",
			"sprite-explosion5.png",
			"sprite-explosion6.png",
			"sprite-explosion8.png",
			"sprite-explosion9.png"
	};

	public Explosion(Stage stage) {
		super(stage);
		setSpriteName(explosion);
		setFrameSpeed(3);
		
	}
	public void act() {
		super.act();
		if (currentFrame==(explosion.length-1)) {
			remove();
		}
	}

}
