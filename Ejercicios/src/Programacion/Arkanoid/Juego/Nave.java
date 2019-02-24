
package Programacion.Arkanoid.Juego;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;


	public class Nave extends Objetos {
		
		protected static final int PLAYER_SPEED = 5;
		protected int vx;
		public boolean left;
		public boolean right;	
		 
		public Nave(Stage stage) {
			super(stage);
			setSpriteName (new String[] {"navecita.png"});
		}
		
		public void act() {
			super.act();
			x+=vx;
			if (x < 0 )
			  x=0;
			if (x>Stage.WIDTH-getWidth())
			x=Stage.WIDTH-getWidth(); 
		}
	
		public int getVx() { return vx; }
		public void setVx(int i) {vx = i;	}
	 
	  protected void updateSpeed() {
	  	vx=0;
	  	if (left) vx = -PLAYER_SPEED;
	  	if (right) vx = PLAYER_SPEED;
	  }
	  
	  public void keyReleased(KeyEvent e) {
	   	switch (e.getKeyCode()) {
			  case KeyEvent.VK_LEFT : left = false; break; 
			  case KeyEvent.VK_RIGHT : right = false;break;
	   	}
	   	updateSpeed();
	  }
	  
	  public void keyPressed(KeyEvent e) {
	  	switch (e.getKeyCode()) {
			  case KeyEvent.VK_LEFT : left = true; break;
			  case KeyEvent.VK_RIGHT : right = true; break;
			  
	  	}
	  	updateSpeed();
	  }
	  
	  
	  public void Mousemoved(MouseEvent e) {
		  this.x=e.getX()-getWidth()/2;
	  }
	  
	  
	public void collision(Objetos a) {
		if (a instanceof Pelota ) {
			stage.getSoundCache().playSound("metralleta.wav");
		}
	}
}