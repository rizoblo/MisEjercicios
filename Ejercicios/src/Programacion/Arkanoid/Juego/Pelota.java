
package Programacion.Arkanoid.Juego;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;



public class Pelota extends Objetos {
	protected int vx;
	protected int vy;
	protected int contador = 0;
	protected int espacio = 0;
	protected int contlateral = 0;
	TrayectoriaRecta trayectoria = null;
	PuntoAltaPrecision coordenadas = null;
	public float pixelsPorFrame = 3;
	protected long millis = System.currentTimeMillis();
	protected long millisactuales;
	protected long segundos;
	private boolean superior;
	private boolean inferior;
	private boolean derecho;
	private boolean izquierdo;
	public boolean pelotamuerta=false;
	public boolean finronda=false;
	public int vidas=3;

	public Pelota(Stage stage) {
		super(stage);
		setSpriteName(new String[] { "granada.png" });
	}

	public void act() {

		millisactuales = System.currentTimeMillis();
		segundos = millisactuales - millis;

		if (espacio > 0 || contador > 0 || segundos > 5000) {
			System.out.println(pixelsPorFrame);
			if (this.trayectoria == null) {
				this.coordenadas = new PuntoAltaPrecision(x, y);
				this.trayectoria = new TrayectoriaRecta(-2.5f, coordenadas, true);
			}
			this.coordenadas = this.trayectoria.getPuntoADistanciaDePunto(this.coordenadas, pixelsPorFrame);
			if (pixelsPorFrame < 10) {
				pixelsPorFrame *= 1.00035;
			}
			this.x = Math.round(this.coordenadas.x);
			this.y = Math.round(this.coordenadas.y);

			if (x < 0 || x > Stage.WIDTH - 30) {
				this.trayectoria.reflejarHorizontalmenteRespectoAPunto(coordenadas);
			}
			if ( y > Stage.HEIGHT - 30) {
				this.trayectoria.reflejarVerticalmenteRespectoAPunto(coordenadas);
				
				//this.remove();
				finronda=true;
				vidas--;
				resetear();
				
				/*Arkanoid nuevafase=new Arkanoid();
				nuevafase.game();*/
			}
			if (y < 0) {
				this.trayectoria.reflejarVerticalmenteRespectoAPunto(coordenadas);
			}
			
		} else {
			vx = 0;
			vy = 0;
		}
	}

	
	public void resetear() {
		finronda=false;
		pixelsPorFrame=3;
		trayectoria=null;
		espacio=0;
		millis=System.currentTimeMillis();
		contador=0;
		System.out.println(pixelsPorFrame);
	}
	
	public Rectangle getRectanguloParaColisiones () {
		return new Rectangle(this.x + this.width / 2 - 4, this.y + this.height / 2 - 4, 8, 8);
	}
	
	public void chocaladrillo(Ladrillo a) {
		Rectangle rectanguloinferior = new Rectangle(a.x, a.y + a.height - 1, a.width, 1);
		Rectangle rectangulosuperior = new Rectangle(a.x, a.y + 1, a.width, 1);
		Rectangle rectanguloderecho = new Rectangle(a.x + a.width - 1, a.y, 1, a.height);
		Rectangle rectanguloizquierdo = new Rectangle(a.x, a.y, 1, a.height);
		

		if (this.getBounds().intersects(rectanguloizquierdo) && this.getBounds().intersects(rectanguloinferior)) {
			this.x = a.x;
			this.y = a.y + a.height;
			this.coordenadas.x = this.x; this.coordenadas.y = this.y;
			this.trayectoria.setPendiente(0-Math.abs(this.trayectoria.getPendiente()), this.coordenadas, false);
			return;
		} else {
			if (this.getBounds().intersects(rectanguloderecho) && this.getBounds().intersects(rectanguloinferior)) {
				this.x = a.x + a.width;
				this.y = a.y + a.height;
				this.coordenadas.x = this.x; this.coordenadas.y = this.y;
				this.trayectoria.setPendiente(Math.abs(this.trayectoria.getPendiente()), this.coordenadas, true);
				return;

			} else {
				if (this.getBounds().intersects(rectanguloderecho) && this.getBounds().intersects(rectangulosuperior)) {
					this.x = a.x + a.width;
					this.y = a.y;
					this.coordenadas.x = this.x; this.coordenadas.y = this.y;
					this.trayectoria.setPendiente(0-Math.abs(this.trayectoria.getPendiente()), this.coordenadas, true);
					return;

				} else {
					if (this.getBounds().intersects(rectanguloizquierdo) && this.getBounds().intersects(rectangulosuperior)) {
						this.x = a.x;
						this.y = a.y;
						this.coordenadas.x = this.x; this.coordenadas.y = this.y;
						// Recalculo la pendiente
						this.trayectoria.setPendiente(Math.abs(this.trayectoria.getPendiente()), this.coordenadas, false);
						return;

					}
					else {
						if (this.getBounds().intersects(rectanguloizquierdo)) {
							this.x = a.x;
							this.coordenadas.x = this.x;
							this.trayectoria.reflejarHaciaIzquierda(this.coordenadas);
							return;
						} else {
							if (this.getBounds().intersects(rectanguloderecho)) {
								this.x = a.x + a.width;
								this.coordenadas.x = this.x;
								this.trayectoria.reflejarHaciaDerecha(this.coordenadas);
								return;
							} else {
								if (this.getBounds().intersects(rectangulosuperior)) {
									this.y = a.y;
									this.coordenadas.y = this.y;
									this.trayectoria.reflejarHaciaArriba(this.coordenadas);
									return;
								} else {
									if (this.getBounds().intersects(rectanguloinferior)) {
										this.y = a.y + a.height;
										this.coordenadas.y = this.y;
										this.trayectoria.reflejarHaciaAbajo(this.coordenadas);
										return;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	private void colisionConNave (Nave nave) {
		// Creo rect�ngulos para determinar la zona de la nave con la que choca la bola
		int anchoZonaEspecial = 7; // p�xeles que delimitan la zona de rebote especial de la nave
		Rectangle rectIzqNave = new Rectangle(nave.getX(), nave.getY(), anchoZonaEspecial, nave.height);
		Rectangle rectDerNave = new Rectangle(nave.getX() + nave.width - anchoZonaEspecial, nave.getY(), anchoZonaEspecial, nave.height);
		Rectangle rectBola = this.getRectanguloParaColisiones();
		
		// Colisi�n con el lado derecho de la nave
		if (rectBola.intersects(rectDerNave)) {
			this.y = nave.getY() - nave.getHeight();
			this.coordenadas.y = this.y;
			if (Math.abs(this.trayectoria.getPendiente()) > 1 ) { // La bola viene on una pendiente mayor a 1
				this.trayectoria.setPendiente(-(float) (Math.random() * (0.8 - 0.3) + 0.3), this.coordenadas, true);
			}
			else { // La bola viene con una pendiente suave ( > 0 y < 1 )
				this.trayectoria.setPendiente(-(float) (Math.random() * (10 - 2) + 2), this.coordenadas, true);
			}
			return;
		}
		// Colisi�n con el lado izquierdo de la nave
		if (rectBola.intersects(rectIzqNave)) {
			this.y = nave.getY() - nave.getHeight();
			this.coordenadas.y = this.y;
			if (Math.abs(this.trayectoria.getPendiente()) > 1 ) { // La bola viene con una pendiente mayor a 1
				this.trayectoria.setPendiente((float) (Math.random() * (0.8 - 0.3) + 0.3), this.coordenadas, false);
			}
			else { // La bola viene con una pendiente suave ( > 0 y < 1 )
				this.trayectoria.setPendiente((float) (Math.random() * (10 - 2) + 2), this.coordenadas, false);
			}
			return;
		}
		else { // La bola intersecta la parte central de la nave
			this.trayectoria.reflejarHaciaArriba(this.coordenadas);
			return;
		}			
	}
	public void collision(Objetos a) {
		if (a instanceof Ladrillo) {
			chocaladrillo((Ladrillo) a);
		}
		if (a instanceof Nave) {
			this.trayectoria.reflejarVerticalmenteRespectoAPunto(coordenadas);
		}
		
	}

	public void Mouseclicked(MouseEvent e) {
		contador++;
		vx = 3;
		vy = 3;
	}

	public void keyPressed(KeyEvent e) {

		switch (e.getKeyCode()) {
		case KeyEvent.VK_SPACE:
			espacio++;
			break;
		case KeyEvent.VK_LEFT:
			contlateral++;
			break;
		case KeyEvent.VK_RIGHT:
			contlateral++;
			break;

		}
	}

	public int getVx() {
		return vx;
	}

	public void setVx(int i) {
		vx = i;
	}

	public int getVy() {
		return vy;
	}

	public void setVy(int i) {
		vy = i;
	}

	public void Mousemoved(MouseEvent e) {
		this.x = e.getX() - getWidth() / 2;
	}

}
