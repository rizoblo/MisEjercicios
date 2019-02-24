package Programacion.Arkanoid.Juego;

public class Pildora extends Objetos {
	public boolean colisionado=false;
	public Pildora(Stage stage) {
			super(stage);
			setFrameSpeed(50);	
		}
		

		@Override
		public void act() {
			super.act();
			this.setY(this.getY()+1);
			if(this.getY()>=600||colisionado) {
				remove();
			}
		}
		public void collision(Objetos actorColisionado) {
			
		}
	}


