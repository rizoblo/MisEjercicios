package RepasoExamenListas.excepciones;

import javax.swing.JOptionPane;

public class Capt06Bloque4Ej1 {

	/*1�.- Implementa un programa que contenga una clase llamada "PeticionNumeros", con un m�todo "pideNumeroPar()". 
	 * Desde un m�todo "main()" llama al m�todo anterior. Dentro del m�todo "pideNumeroPar()" debes crear todo lo necesario 
	 * para disparar una Exception, creada por ti, cuando el n�mero introducido no sea un n�mero par.*/
	static int numerousuario=0;
	public static void main(String[] args) {
		
		try {
			pedirNumeropar();
			System.out.println(numerousuario);
		} catch (Capt06Bloque4Ej1exception e) {
			// TODO Auto-generated catch block
			System.out.println("Numero impar introducido");
			e.printStackTrace();
		}
	}
	
	public static void pedirNumeropar() throws Capt06Bloque4Ej1exception{
		numerousuario=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
		if (numerousuario % 2 ==1) {
			throw new Capt06Bloque4Ej1exception();
		}
		
	}

}
