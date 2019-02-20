package Programacion.matriculaciones;

public class personaidentificada extends Persona {

	
		
		private String dni;

		public personaidentificada() {
			super();
		}

		public personaidentificada(String nombre, String apellidos, String fechanacimiento, String dni) {
			super(nombre, apellidos, fechanacimiento);
			this.dni = dni;
			
		}

		public String getDni() {
			return dni;
		}

		public void setDni(String dni) {
			this.dni = dni;
		}

		@Override
		public String toString() {
			return "personaidentificada [getDni()=" + getDni() + ", getNombre()=" + getNombre() + ", getApellidos()="
					+ getApellidos() + ", getFechanacimiento()=" + getFechanacimiento() + "]";
		}
		
	

}
