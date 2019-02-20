package Programacion.Arkanoid.Juego;

public class Pildoravelocidad extends Pildora {

	public boolean colision=false;
	protected String nombre[]=new String [] {""};
	public Pildoravelocidad(Stage stage, int pildora) {
		super(stage);
		String name[]=new String[] {""};
		setSpriteName(name);
	}

	public void collision(Objetos a ) {
		if (a instanceof Nave) {
			remove();
			colision=true;
		}
	}
}
