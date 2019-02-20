package Programacion.Objetos.prueba;

import javax.swing.JOptionPane;

public class Clase {

	private int numero1=0;
	private int numero2=0;
	private int suma=0;
	private int media=0;
	
	public int suma(int numero1, int numero2) {
		
		//numero1=Integer.parseInt(JOptionPane.showInputDialog("Introduce primer numero"));
		//numero2=Integer.parseInt(JOptionPane.showInputDialog("Introduce primer numero"));
		suma=numero1+numero2;
		return suma;
	}
	
	public void impresion() {
		System.out.println("La suma es: "+suma+" y la media es: "+media);
	}
	
	public int media() {
		media=suma/2;
		return media;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public int getSuma() {
		return suma;
	}

	public void setSuma(int suma) {
		this.suma = suma;
	}

	public int getMedia() {
		return media;
	}

	public void setMedia(int media) {
		this.media = media;
	}

	public Clase(int numero1, int numero2, int suma, int media) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.suma = suma;
		this.media = media;
	}

	public Clase() {
		super();
	}
	
}
