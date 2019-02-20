package Programacion.Objetos.matriculaciones;

import javax.swing.JOptionPane;



public class principal {

	public static void main(String[] args) {
		
		String menu="\n1 Persona \n2 Matricula";
		
		int opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
		int opcionpersona;
		int opcionmatricula;
	
		if (opcion >=1 && opcion <=2) {
			
			Persona persona=null;
			matricula matricula=null;
			
			
			
				
				switch (opcion) {
				
				case 1:
					
					String menu2="\n1 Identificada \n2 NoIdentificada";
					opcionpersona=	persona.setNombre(JOptionPane.showInputDialog("Introduzca nombre"));
					persona.setApellidos(JOptionPane.showInputDialog("Introduzca apellidos"));
					persona.setFechanacimiento(JOptionPane.showInputDialog("Introduzca fecha"));
					
					System.out.println(persona.toString());Integer.parseInt(JOptionPane.showInputDialog(menu2));
					
						switch (opcionpersona){
						case 1:
					
							persona = new personanoidentificada();
							((personanoidentificada)persona).setDescripcion(JOptionPane.showInputDialog("Introduzca descripcion"));
						
							break;
					
					
						case 2:
						
		
							persona = new personaidentificada();
							((personaidentificada)persona).setDni(JOptionPane.showInputDialog("Introduzca DNI"));
						
						
						break;
					
						}
						persona.setNombre(JOptionPane.showInputDialog("Introduzca nombre"));
						persona.setApellidos(JOptionPane.showInputDialog("Introduzca apellidos"));
						persona.setFechanacimiento(JOptionPane.showInputDialog("Introduzca fecha"));
						
						System.out.println(persona.toString());
				case 2:
					
					String menu3="\n1 ESO \n2 Bachiller \n3 FP";
					opcionmatricula=Integer.parseInt(JOptionPane.showInputDialog(menu3));
					
						switch (opcionmatricula){
						case 1:
					
							matricula = new eso();
							((eso)matricula).setPmal(Boolean.parseBoolean(JOptionPane.showInputDialog("Introduzca si hay pmal")));
						
							break;
					
					
						case 2:
						
		
							matricula = new bachiller();
							((bachiller)matricula).setModalidad(JOptionPane.showInputDialog("Introduzca modalidad"));
						
						
						break;
						
						case 3:
							
							
							matricula = new fp();
							((fp)matricula).setDual(Boolean.parseBoolean(JOptionPane.showInputDialog("Introduzca si es dual")));
						
						
						break;
				
						}
					
				}
			
			}
		
		
		
		
		
	}

}
