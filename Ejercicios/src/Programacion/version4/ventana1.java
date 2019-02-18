package programacion.version4;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class ventana1 extends Canvas {

	public static final int WIDTH = 640;
	public static final int HEIGHT = 480;
	public static ventana1 ventana = null;

	public ventana1() {
		JFrame ventana = new JFrame("Ahorcado Náutico");
		ventana.setBounds(0,0,WIDTH,HEIGHT);
		JPanel panel = (JPanel)ventana.getContentPane();
		panel.add(this);
		this.setBounds(0,0,WIDTH,HEIGHT);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		ventana.setResizable(false);	
	}
	
	public BufferedImage getImagen(String nombre) {
		URL url=null;
		try {
			url = getClass().getResource("/programacion/version4/" + nombre);
			return ImageIO.read(url);
		} 
		catch (Exception e) {
			System.out.println("No se pudo cargar la imagen " + nombre +" de "+url);
			System.out.println("El error fue : "+e.getClass().getName()+" "+e.getMessage());
			System.exit(0);
			return null;
		}
	}
	@Override
	public void paint(Graphics g) {
		if (Jugador.intento.equals(Jugador.palabra)|| Jugador.terminadoporletra==true) {
			g.drawString("¡Felicidades!, la palabra era: "+Jugador.palabra, 100, 380);
		}
		if (Jugador.contadorfallos==6) {
			g.drawString("Lo sentimos, ¡perdiste marinero!", 100, 380);
		}
		g.drawImage(getImagen("que-siente-una-persona-feliz.jpg"), 0, 0, this);
		//soporte
		g.setColor(Color.gray);
		g.fillRect(70, 50, 20, 400);
		//soporte
		g.setColor(Color.gray);
		g.fillRect(70, 50, 250, 25);
		//cabeza
		g.setColor(Color.pink);
		g.fillOval(280, 80, 70, 70);
		//cabezaerror
		if (Jugador.contadorfallos>0) {
			g.setColor(Color.red);
			g.fillOval(280, 80, 70, 70);
		}
		//torso
		g.setColor(Color.pink);
		g.fillRect(285, 155, 65, 85);
		//torsoerror
		if (Jugador.contadorfallos>1) {
			g.setColor(Color.red);
			g.fillRect(285, 155, 65, 85);
		}
		//brazoderecho
		g.setColor(Color.pink);
		g.fillRect(355, 155, 25, 85);
		//brazoderechoerror
		if (Jugador.contadorfallos>2) {
			g.setColor(Color.red);
			g.fillRect(355, 155, 25, 85);
		}
		//brazoizquierdo
		g.setColor(Color.pink);
		g.fillRect(255, 155, 25, 85);
		//brazoizquierdoerror
		if (Jugador.contadorfallos>3) {
			g.setColor(Color.red);
			g.fillRect(255, 155, 25, 85);
		}
		//piernaderecha
		g.setColor(Color.pink);
		g.fillRect(325, 245, 25, 85);
		//piernaderechaerror
		if (Jugador.contadorfallos>4) {
			g.setColor(Color.red);
			g.fillRect(325, 245, 25, 85);
		}
		//piernaizquierda
		g.setColor(Color.pink);
		g.fillRect(285, 245, 25, 85);
		//piernaizquierdaerror
		if (Jugador.contadorfallos>5) {
			g.setColor(Color.red);
			g.fillRect(285, 245, 25, 85);
		}
		String impresion="";
		//introduciendo los guiones en la pantalla
		for (int i=0;i<Jugador.getJugador().guiones.length;i++) {
			impresion+=Jugador.getJugador().guiones[i]+" ";
		}
		g.setColor(Color.black);
		g.setFont(new Font("default",Font.BOLD, 15));
		g.drawString("Palabra:"+impresion, 100, 350);
		//He intentado felicitar al usuario cuando termina, decir la palabra oculta y comentarle que ha perdido, y parece que el programa funciona normalmente, pero salen un montón de excepciones en la consola así que lo dejo comentado 
		
	}
		
	public static ventana1 getventana() {
		if (ventana==null) {
			ventana=new ventana1();
			
		}
		return ventana;
	}
}
