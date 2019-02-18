
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
		setSpriteName(new String[] { "brazuca.png" });
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
	
	public void chocaladrillo(Ladrillo a) {
		Rectangle rectanguloinferior = new Rectangle(a.x, a.y + a.height - 1, a.width, 1);
		Rectangle rectangulosuperior = new Rectangle(a.x, a.y + 1, a.width, 1);
		Rectangle rectanguloderecho = new Rectangle(a.x + a.width - 1, a.y, 1, a.height);
		Rectangle rectanguloizquierdo = new Rectangle(a.x, a.y, 1, a.height);
		

		if (this.getBounds().intersects(rectanguloizquierdo) && this.getBounds().intersects(rectanguloinferior)) {
			this.trayectoria.modificarPendiente(this.trayectoria.m, coordenadas,!this.trayectoria.direccionCreciente);
			System.out.println("Esquina izquierda inferior");
		} else {
			if (this.getBounds().intersects(rectanguloderecho) && this.getBounds().intersects(rectanguloinferior)) {
				this.trayectoria.modificarPendiente(this.trayectoria.m, coordenadas,!this.trayectoria.direccionCreciente);
				System.out.println("Esquina derecha inferior");

			} else {
				if (this.getBounds().intersects(rectanguloderecho) && this.getBounds().intersects(rectangulosuperior)) {
					this.trayectoria.modificarPendiente(this.trayectoria.m, coordenadas,!this.trayectoria.direccionCreciente);
					System.out.println("Esquina derecha superior");

				} else {
					if (this.getBounds().intersects(rectanguloizquierdo) && this.getBounds().intersects(rectangulosuperior)) {
						this.trayectoria.modificarPendiente(this.trayectoria.m, coordenadas,!this.trayectoria.direccionCreciente);
						System.out.println("Esquina izquierda superior");

					}
					else {
						if (this.getBounds().intersects(rectanguloizquierdo)) {
							this.trayectoria.reflejarHorizontalmenteRespectoAPunto(coordenadas);
							System.out.println("izquierda");
							izquierdo = true;
						} else {
							if (this.getBounds().intersects(rectanguloderecho)) {
								this.trayectoria.reflejarHorizontalmenteRespectoAPunto(coordenadas);
								System.out.println("derecha");
								derecho = true;
							} else {
								if (this.getBounds().intersects(rectangulosuperior)) {
									this.trayectoria.reflejarVerticalmenteRespectoAPunto(coordenadas);
									System.out.println("arriba");
									superior = true;
								} else {
									if (this.getBounds().intersects(rectanguloinferior)) {
										this.trayectoria.reflejarVerticalmenteRespectoAPunto(coordenadas);
										System.out.println("abajo");
										inferior = true;
									}
								}
							}
						}
					}
				}
			}
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
