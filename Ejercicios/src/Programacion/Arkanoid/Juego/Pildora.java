package Programacion.Arkanoid.Juego;

public class Pildora extends Objetos {

	public Pildora(Stage stage) {
			super(stage);
			setSpriteName(new String[] {nombre[i]});

		}
		
		protected String nombre[]=new String[] {"colorazul.jpg"};
		int probabilidad=0;
		int tipopildora=0;
		
		public void pildoraencuestion(){
			tipopildora=(int)Math.round(Math.random()*10);
		}
		public void probabilidadpildora() {
			probabilidad=(int)Math.round(Math.random()*10);
		}
		public void act() {
			this.setY(this.getY()+1);
		}
	}


