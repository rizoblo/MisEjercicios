package Programacion.Arkanoid.Juego;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Objetos {
	protected int x,y;
	protected int width, height;
	protected String [] spriteName;
	protected int currentFrame;
	protected int frameSpeed;
	protected int t;
	protected static Stage stage;
	protected SpriteCache spriteCache;
	protected boolean markedForRemoval;
	protected static Objetos instance = null;
	public int ladrilloseliminados=0;
	public boolean faseterminada=false;
	public void remove() {
		markedForRemoval=true;
		
	}
	
	public boolean isMarkedForRemoval() {
		return markedForRemoval;
	}
	public Rectangle getBounds() {
		return new Rectangle(x,y,width,height);
	}
	
	public void collision(Objetos a) {
		
	}
	
	public Objetos(Stage stage) {
		this.stage = stage;
		spriteCache = stage.getSpriteCache();
		currentFrame = 0;
		frameSpeed = 1;
		t=0;
	}
	
	public void paint(Graphics2D g){
		g.drawImage( spriteCache.getSprite(spriteName[currentFrame]), x,y, stage );
	}
	
	public int getX()  { return x; }
	public void setX(int i) {	x = i; }

	public int getY() {	return y; }
	public void setY(int i) { y = i; }
	

	public void setSpriteName(String [] string) { 
		spriteName = string;
		height = 0;
		width = 0;
		for ( int i=0; i< string.length;i++) {
			BufferedImage image = spriteCache.getSprite(spriteName[i]);
			height = Math.max(height, image.getHeight());
			width = Math.max(width, image.getWidth());

		}
	}			
	
	public int getHeight() { return height; }
	public int getWidth() {	return width;	}
	public void setHeight(int i) {height = i;	}
	public void setWidth(int i) {	width = i;	}

	public void act() {	
		t++;
		if(t%frameSpeed==0) {
			t=0;
			currentFrame=(currentFrame+1)% spriteName.length;
		}
	}

	
	
	public int getFrameSpeed() {
		return frameSpeed;
	}

	public void setFrameSpeed(int frameSpeed) {
		this.frameSpeed = frameSpeed;
	}

	public static Objetos getInstance () {
		if (instance == null) {
			instance = new Objetos (stage);
		}
		return instance;
	}
}

