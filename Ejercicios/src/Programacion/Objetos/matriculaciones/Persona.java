package Programacion.matriculaciones;

public class Persona {

	
		private String nombre;
		private String apellidos;
		private String fechanacimiento;
		
		

		public Persona() {
			super();
		}

		
		public Persona(String nombre, String apellidos, String fechanacimiento) {
			super();
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.fechanacimiento = fechanacimiento;
		}

		
		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public String getApellidos() {
			return apellidos;
		}


		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}


		public String getFechanacimiento() {
			return fechanacimiento;
		}


		public void setFechanacimiento(String fechanacimiento) {
			this.fechanacimiento = fechanacimiento;
		}
	

		
		
}
