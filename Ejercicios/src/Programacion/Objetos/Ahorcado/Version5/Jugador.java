package Programacion.Objetos.Ahorcado.Version5;

import javax.swing.JOptionPane;

public class Jugador {
	
	static boolean comprobacion1=false;
	static boolean acierto=false;
	static boolean terminadoporletra=false;
	static String intento;
	static String palabracheto="cheto";
	static String mododios="dios";
	public static Jugador jugador = null; //singleton
	static boolean chetoactivado=false;
	static boolean mododiosactivado=false;
	static char guiones[];
	static int contadorfallos;
	static String palabra;
	public Jugador() {
		super();
	}
	
//singleton
	public static Jugador getJugador() {
		if (jugador==null) {
			jugador=new Jugador();	
		}
		return jugador;
	}
	
	public static void generacionpalabra() {
			
		//Creación array de palabras
			String palabras[]=new String[] {"corbeta","bricbarca","bergantin","galera","fragata","galeon","naviodelinea"};
		//Aleatorio para escoger palabra
			palabra= palabras[(int)Math.round(Math.random()*(palabras.length-1))];
			//System.out.println(palabra);
		//Creacion del char de caracteres de extension tan largo como la palabra al azar escogida, impresion de tantos guiones como letras haya
			guiones=new char[palabra.length()];
			for (int i=0;i<guiones.length;i++) {
				guiones[i]='_';
				System.out.print(guiones[i]+" ");	
			}
			contadorfallos=0;
			do {
				acierto=false;
				mododiosactivado=false;
				intento=JOptionPane.showInputDialog("Introduce intento");
		//Cheat de pista
				if (intento.equals(palabracheto)) {
					if (chetoactivado==false){	
						chetoactivado=true;
						System.out.println();
		//Elección de la letra al azar que && Jugador.mododiosactivado==falseserá una pista
						int aleatoria=(int)Math.round(Math.random()*(palabra.length()));
						palabra.charAt(aleatoria);
						for (int i=0;i<palabra.length();i++) {
		//Introducción de la letra aleatoria en el char comprobacion para revelar la letra de la pista
							char comprobacion=palabra.charAt(aleatoria);
							guiones[aleatoria]=comprobacion;
							System.out.print(guiones[i]+" ");	
							acierto=true;
							ventana1.getventana().repaint();
						}
					}	
				}	
		//Cheat de inmortal	
				if (intento.equals(mododios)) {
					contadorfallos=7;
					mododiosactivado=true;
				}
		//Comprobación de la letra del usuario con la letra de la palabra, en caso afirmativo, introducción			
				if (intento.length()==1){
					System.out.println();
					for (int i=0;i<palabra.length();i++) {
						char comprobacion=intento.charAt(0);
						if (comprobacion==palabra.charAt(i)) {
							guiones[i]=comprobacion;
							acierto=true;
							ventana1.getventana().repaint();
						}	
					}
		//Creamos un string del array guiones para saber si la palabra ha sido completada por el jugador y así utilizarla como condición de escape
					String guionesString=new String (guiones);
					if (guionesString.equals(palabra)){
						terminadoporletra=true;
					}
		//En caso de que el intento sea erróneo
					if (acierto==false) {
						JOptionPane.showMessageDialog(null, "Letra erronea");
						contadorfallos++;
						ventana1.getventana().repaint();	
					}
					else
					{
		//En caso de que sea un acierto, será añadida
						for (int i=0;i<guiones.length;i++) {
							System.out.print(guiones[i]+" ");
						}			
					}			
				}
				else
				{
		//Comprobación de si la palabra introducida por el jugador es acertada
					if (intento.equals(palabra)) {
						for (int i=0;i<palabra.length();i++) {
							guiones[i]=palabra.charAt(i);
						}
						ventana1.getventana().repaint();
					}
					else
					{
		//En caso contrario, decir que la palabra introducida es errónea, y sumar fallo. Excluimos el caso de las palabras que utilizamos para activar el modo dios
						if (mododiosactivado==false && !(intento.equals(palabracheto))) {
							JOptionPane.showMessageDialog(null, "Palabra erronea");
							contadorfallos++;
							ventana1.getventana().repaint();
						}
						if (intento.equals(palabracheto)) {
							contadorfallos++;
						}
					}
				}
		//Las condiciones de escape son que los fallos sean 6, que la palabra haya sido completada con éxito, o que la palabra introducida sea igual que la escogida
			}while (!((contadorfallos==6)||(terminadoporletra==true)||(intento.equals(palabra))));
	}
}
