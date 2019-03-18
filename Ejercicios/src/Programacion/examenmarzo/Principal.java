package Programacion.examenmarzo;



public class Principal {

	public static void main(String[] args) {
		
		System.out.println(Propiedadessupermercado.getProperty("nombresuper"));;
		System.out.println();
		Cliente.getInstancia().introducearticulo();
		Caja.getInstancia().llenarhashmapdesdelista();
		Caja.getInstancia().comprobarprecio();
		//Caja.getInstancia().retirararticulo();
		try {
			Caja.getInstancia().pago();
		} catch (Excepcionpago e) {
			// TODO Auto-generated catch block
			System.out.println("Ha introducido una suma inferior al importe, usted ha introducido "+ Caja.getInstancia().pagousuario+" y el importe es de "+Caja.getInstancia().totalapagar);
			
		}
	}

}
