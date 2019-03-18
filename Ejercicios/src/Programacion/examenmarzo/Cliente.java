package Programacion.examenmarzo;

import java.util.ArrayList;
import java.util.List;





public class Cliente {

	private static Cliente instancia = null;
	static List<Articulo> listarticulos = new ArrayList<Articulo>();
	public int tamaniolista=0;
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}








	public void introducearticulo() {
		System.out.println("Lista");
		listarticulos.add(new ArticuloCarnicos());
		listarticulos.add(new ArticuloLacteos());
		listarticulos.add(new ArticuloLimpieza());
		listarticulos.add(new ArticuloPescado());
		listarticulos.add(new ArticuloProductoFresco());
		tamaniolista=listarticulos.size();
		for (int i=0;i<listarticulos.size();i++) {
		System.out.println(listarticulos.get(i));
		}
	}
	
	
	
	
	
	
	
	public synchronized static Cliente getInstancia() {
        if (instancia == null) {
            instancia = new Cliente();
        }
        return instancia;
    }
}
