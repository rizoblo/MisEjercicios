package prueba;

import javax.swing.JOptionPane;

public class Jugador {
	
	private int fallos=0;
	static boolean comprobacion1=false;
	//private int tirada;
	private String palabra;
	private String auxiliar;
	private String letras;
	static boolean acierto=false;
	static boolean terminadoporletra=false;
	static String intento;
	static String palabracheto="cheto";
	static boolean chetoactivado=false;
	
	public Jugador() {
		super();
	}
	
	
	public Jugador(int fallos, int tirada) {
		super();
		this.fallos = fallos;
		
	}

	
	
	public static void generacionpalabra() {
			
			String palabras[]=new String[] {"hola", "hola2","hola3"};
			String palabra= palabras[(int)Math.round(Math.random()*(palabras.length-1))];
			System.out.println(palabra);
			char guiones[]=new char[palabra.length()];
			for (int i=0;i<guiones.length;i++) {
				guiones[i]='_';
				System.out.print(guiones[i]+" ");
				
			}
		
			int contadorfallos=0;
			
			do {
				
				 intento=JOptionPane.showInputDialog("Introduce intento");
					if (intento.equals(palabracheto)) {
						if (chetoactivado==false){	
							chetoactivado=true;
							System.out.println();
							int aleatoria=(int)Math.round(Math.random()*(palabra.length()));
							palabra.charAt(aleatoria);
							for (int i=0;i<palabra.length();i++) {
								char comprobacion=palabra.charAt(aleatoria);
									guiones[aleatoria]=comprobacion;
									System.out.print(guiones[i]+" ");	
									acierto=true;
							}
						}
						
					}
					
						
						
					
					if (intento.length()==1){
						System.out.println();
						for (int i=0;i<palabra.length();i++) {
							char comprobacion=intento.charAt(0);
							if (comprobacion==palabra.charAt(i)) {
								guiones[i]=comprobacion;
								acierto=true;
							}
						
						}
						String guionesString=new String (guiones);
						if (guionesString.equals(palabra)){
							terminadoporletra=true;
						}
						if (acierto==false) {
							JOptionPane.showMessageDialog(null, "Letra erronea");
							contadorfallos++;
						}
						else
						{
							for (int i=0;i<guiones.length;i++) {
								
								System.out.print(guiones[i]+" ");
								
							}
							
						}
							
					}
					else
					{
						if (intento.equals(palabra)) {
							
							JOptionPane.showMessageDialog(null,"Enhorabuena");
						}
						else
						{
							if (!(intento.equals(palabracheto))) {
							JOptionPane.showMessageDialog(null, "Palabra erronea");
							contadorfallos++;
							}
						}
					}
						
			}while (!((contadorfallos==6)||(terminadoporletra==true)||(intento.equals(palabra))));


	
	}
	
	
}
