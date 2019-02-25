package Programacion.Arkanoid.Juego;
/**
 * Curso B�sico de desarrollo de Juegos en Java - Invaders
 * 
 * (c) 2004 Planetalia S.L. - Todos los derechos reservados. Prohibida su reproducci�n
 * 
 * http://www.planetalia.com
 * 
 */

import java.awt.Canvas;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Arkanoid extends Canvas implements Stage {

	private BufferStrategy strategy;
	private long usedTime;
	private static Arkanoid instancia = null;
	private SpriteCache spriteCache = new SpriteCache();
	private List<Objetos> objetos = new ArrayList<Objetos>();
	private Nave nave = new Nave(this);
	private BufferedImage fondo;
	private BufferedImage fondofinal;
	private int t;
	public int puntuacion=0;
	protected long millis = System.currentTimeMillis();
	protected long millisactuales;
	protected long segundos;
	public boolean finvidas=false;
	public boolean nuevaronda=false;
	Raton raton=new Raton();
	private List<Objetos> explosiones = new ArrayList<Objetos>();
	private List<Objetos> pildoras = new ArrayList<Objetos>();
	private SoundCache soundCache=new SoundCache();
	Pelota pelota = new Pelota(this);
	public Arkanoid() {

		JFrame ventana = new JFrame("Invaders");
		JPanel panel = (JPanel) ventana.getContentPane();
		setBounds(0, 0, Stage.WIDTH, Stage.HEIGHT);
		panel.setPreferredSize(new Dimension(Stage.WIDTH, Stage.HEIGHT));
		panel.setLayout(null);
		panel.add(this);
		ventana.setBounds(0, 0, Stage.WIDTH, Stage.HEIGHT);
		ventana.setVisible(true);
		ventana.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		this.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				nave.keyReleased(e);
			}

			public void keyPressed(KeyEvent e) {
				nave.keyPressed(e);
				pelota.keyPressed(e);
				if (pelota.espacio==1 && e.getKeyCode()== KeyEvent.VK_SPACE) {
					pelota.vx=3;
					pelota.vy=3;
				}
			}
		});
		this.addMouseMotionListener(new MouseAdapter() {
			public void mouseMoved(MouseEvent e) {
				nave.Mousemoved(e);
				if (pelota.contador<1 && pelota.espacio<1) {
					pelota.Mousemoved(e);
					pelota.setX(nave.getX()+8);
					pelota.setY(nave.getY()-15);	
				}
				
			}
			
			

		});
		addMouseListener(raton);
		ventana.setResizable(false);
		createBufferStrategy(2);
		strategy = getBufferStrategy();
		requestFocus();

	}

	public void initWorld() {
		
		objetos.add(pelota);
		pelota.setY(Stage.HEIGHT-75);
		objetos.add(nave);
		nave.setX(Stage.WIDTH / 2 - 50);
		nave.setY(420);
		pelota.setX(nave.getX());
	    soundCache.loopSound("Valkirias.wav");

	    for (int i = 0; i < 1; i++) {
			for (int j=0;j<13;j++) {
				Ladrillosguays ladrillosguays=new Ladrillosguays(this,i);
				ladrillosguays.setX(5+j * 46+15);
				ladrillosguays.setY(i*16+10);
				objetos.add(ladrillosguays);
				
			}
		}
	    
		for (int i = 0; i < 3; i++) {
			for (int j=0;j<13;j++) {
				
				Ladrillo ladrillo = new Ladrillo(this,i);
				ladrillo.setX(5+j * 46+15);
				ladrillo.setY(i*16+27);
				objetos.add(ladrillo);
				
			}
		}
	}

	public void initWorld2() {
		
		objetos.clear();
		
		objetos.add(pelota);
		pelota.setY(Stage.HEIGHT-75);
		objetos.add(nave);
		nave.setX(Stage.WIDTH / 2 - 50);
		nave.setY(420);
		pelota.setX(nave.getX());
	    soundCache.loopSound("Valkirias.wav");

	    for (int i = 0; i < 1; i++) {
			for (int j=0;j<13;j++) {
				
				Ladrilloimposible ladrilloimposible = new Ladrilloimposible(this,i);
				ladrilloimposible.setX(5+j * 46+15);
				ladrilloimposible.setY(i*16+59);
				objetos.add(ladrilloimposible);
				
			}
		}
	    
	    for (int i = 0; i < 1; i++) {
			for (int j=0;j<13;j++) {
				
				Ladrillosguays ladrillosguays=new Ladrillosguays(this,i);
				ladrillosguays.setX(5+j * 46+15);
				ladrillosguays.setY(i*16+75);
				objetos.add(ladrillosguays);
			}
		}
	    
		for (int i = 0; i < 3; i++) {
			for (int j=0;j<13;j++) {
				
				Ladrillo ladrillo = new Ladrillo(this,i);
				ladrillo.setX(5+j * 46+15);
				ladrillo.setY(i*16+10);
				objetos.add(ladrillo);
				
			}
		}

	}
	
	public void updateWorld() {
		
		int i=0;
		
		for(Objetos objetos:objetos) {
			objetos.act();
		}
		
		while (i<objetos.size()) {
			Objetos m=(Objetos)objetos.get(i);
			if (m.isMarkedForRemoval() && m instanceof Ladrillo) {
				Explosion e = new Explosion(this);
				e.setX(m.getX()+15);
				e.setY(m.getY());
				explosiones.add(e);
				creadorpildoras(m);
				objetos.remove(i);
				
			}
			
			if (m instanceof Pildora && m.isMarkedForRemoval()) {
				objetos.remove(i);
			}
			{
				m.act();
				i++;
			}
		}
		for (i=0;i<explosiones.size();) {
			Objetos m = (Objetos) explosiones.get(i);
			if (m.isMarkedForRemoval()) {
				explosiones.remove(i);
			}
			else
			{
				i++;
			}
		}
		for (i=0;i<explosiones.size();i++) {
			Objetos m = (Objetos) explosiones.get(i);
			m.act();
		}
		
		
		if((nave.left==true || nave.right==true) && (pelota.espacio==0 && pelota.contador==0) && (pelota.segundos<5000) || (pelota.finronda==true)) {
			pelota.setX(nave.getX()+8);
			pelota.setY(nave.getY()-15);
			
			
		
		}
	}

	private void creadorpildoras(Objetos m) {
		int tipopildora=(int)Math.round(Math.random()*10);
		int probabilidadpildora=(int)Math.round(Math.random()*10);
		if (probabilidadpildora>0){
			if(tipopildora>6) {
				Pildora p=new Pildoravelocidad(this,m.getX()+25,m.getY());
				objetos.add(p);
				return;
			}
			if(tipopildora>3) {
				Pildora p=new Pildoravida(this,m.getX()+25,m.getY());
				objetos.add(p);
				return;
			}
			if(tipopildora>0) {
				Pildora p=new Pildorapeligrosa(this,m.getX()+25,m.getY());
				objetos.add(p);
				return;
			}
		}
			
	}

	public void checkCollisions() {
		Rectangle playerBounds = nave.getBounds();
		for (int i = 0; i < objetos.size(); i++) {
			Objetos a1 = (Objetos) objetos.get(i);
			Rectangle r1 = a1.getBounds();
			for (int j = i + 1; j < objetos.size(); j++) {
				Objetos a2 = (Objetos) objetos.get(j);
				Rectangle r2 = a2.getBounds();
				if (r1.intersects(r2)) {
					a1.collision(a2);
					a2.collision(a1);
					
				}
			}
		}
	}
	public class Raton implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			if (pelota.contador==0 && e.getButton()== MouseEvent.BUTTON1) {
				pelota.Mouseclicked(e);
			}
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		
	}

	public void paintWorld() {
		Toolkit.getDefaultToolkit().sync();
		Graphics2D g = (Graphics2D) strategy.getDrawGraphics();
		fondo = spriteCache.getSprite("vietnam.jpg");
		fondofinal= spriteCache.getSprite("final.jpg");
		g.setPaint(new TexturePaint(fondo, new Rectangle(0, t, fondo.getWidth(), fondo.getHeight())));
		
		if (pelota.vidas==0) {
			g.setPaint(new TexturePaint(fondofinal, new Rectangle(0, t, fondofinal.getWidth(), fondofinal.getHeight())));
			finvidas=true;
			objetos.clear();
		}
		
		g.fillRect(0, 0, getWidth(), getHeight());
		for (Objetos objetos : objetos) {
			objetos.paint(g);
		}
		
		for (int i=0; i<explosiones.size();i++) {
			Objetos m = (Objetos) explosiones.get(i);
			m.paint(g);
		}
		for (int i=0; i<pildoras.size();i++) {
			Objetos m = (Objetos) pildoras.get(i);
			m.paint(g);
		}
		g.setColor(Color.white);
		g.drawString("Vidas actuales: "+pelota.vidas, 520, 445);
		g.setColor(Color.white);
		g.drawString("Puntaje: "+puntuacion, 520, 430);
		if (usedTime > 0)
			g.drawString(String.valueOf(1000 / usedTime) + " fps", 0, Stage.HEIGHT - 50);
		
		else
			g.drawString("--- fps", 0, 445);
		strategy.show();
		
	}

	public SpriteCache getSpriteCache() {
		return spriteCache;
	}

	public void game() {
		usedTime = 1000;
		initWorld();
		while (isVisible()) {
			long startTime = System.currentTimeMillis();
			updateWorld();
			paintWorld();
			checkCollisions();
			usedTime = System.currentTimeMillis() - startTime;
			try {
				Thread.sleep(SPEED);
			} catch (InterruptedException e) {
			}
			if (objetos.size()==2) {
				nuevaronda=true;
				JOptionPane.showMessageDialog(null,"�A por esos malditos Charlies!");
				initWorld2();
				pelota.resetear();

			}
		}
	}
	

	public synchronized static Arkanoid getInstancia() {
        if (instancia == null) {
            instancia = new Arkanoid();
        }
        return instancia;
    }

	public static void main(String[] args) {
		
		Arkanoid.getInstancia().game();
	}

	public SoundCache getSoundCache() {
		return soundCache;
	}

	public Pelota getPelota() {
		return pelota;
	}

	public void setPelota(Pelota pelota) {
		this.pelota = pelota;
	}
	
	
	
}
