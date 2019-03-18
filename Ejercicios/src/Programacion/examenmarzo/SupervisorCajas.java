package Programacion.examenmarzo;



public class SupervisorCajas implements ArticuloDevueltoListener{

	@Override
	public void articuloencontrado(ArticuloDevueltoEvent event) {
		System.out.println("Ha rechazado un articulo");		
	}
}
