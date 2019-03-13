package RepasoExamenListas.Juegosimulacro;

import java.util.ArrayList;
import java.util.List;


	
public class Personaje1 extends Personaje {

	private static Personaje1 instancia = null;
	public Personaje1() {
		super();
		this.setCod(1);
		this.setNombre(propiedadesjuego.getProperty("jugador1"));
		this.setVida(100);
		Principal.addPatadaListener(this); //hay que aniadir este listener a la lista
	}

	private int cantidadataques=0;
	private int tipoataque=0;
	private int probabilidad=0;

	public List<Ataque> ListagolpesPersonaje1= new ArrayList<Ataque>();
	
	//aqui creamos un metodo como el que tenemos en el adapter y ponemos la notificacion
	public void patadaIntroducidaJ1(PatadaEvent event) {
		System.out.println("El jugador "+Personaje1.getInstancia().getNombre()+" ha intentado dar una patada");
	}
	@Override
	public void act() {
		cantidadataques=(int)Math.round(Math.random()*2+1);	
		for (int i=0;i<cantidadataques;i++) {
			tipoataque=0;
			tipoataque=(int)Math.round(Math.random()*2);
			if (tipoataque==0) {
				ListagolpesPersonaje1.add(new Patada());
				
			}
			if (tipoataque==1) {
				ListagolpesPersonaje1.add(new Punietazo());
				
			}
			if (tipoataque==2) {
				ListagolpesPersonaje1.add(new Ataqueespecial());
				
			}
			
		}
		for (int i=0;i<ListagolpesPersonaje1.size();i++) {
			if ( ListagolpesPersonaje1.get(i) instanceof Patada) {
				System.out.println("El turno es de: "+this.getNombre());
				probabilidad=(int)Math.round(Math.random()*100);
				
				if (probabilidad<75) {
					System.out.println(this.getNombre()+" ha dado una patada a "+Personaje2.getInstancia().getNombre());
					System.out.println("la vida del pegado antes es: "+Personaje2.getInstancia().getVida());
					Personaje2.getInstancia().setVida(Personaje2.getInstancia().getVida()-Patada.getInstancia().getDanio());
					System.out.println("la vida del pegado despues es: "+Personaje2.getInstancia().getVida() );
				}
				else
				{
					System.out.println("El ataque fallo");
				}
				PatadaEvent event= new PatadaEvent(); //aqui creamos el evento
				Principal.firePatadaEventJ1(event); //para que coja este evento es necesario crearlo, como ves arriba
			}
			if ( ListagolpesPersonaje1.get(i) instanceof Punietazo) {
				System.out.println("El turno es de: "+Personaje1.getInstancia().getNombre());
				probabilidad=(int)Math.round(Math.random()*100);
				
				if (probabilidad<75) {
				System.out.println(this.getNombre()+" ha dado una punietazo a "+Personaje2.getInstancia().getNombre());
				System.out.println("la vida del pegado antes es: "+Personaje2.getInstancia().getVida() );
				Personaje2.getInstancia().setVida(Personaje2.getInstancia().getVida()-Punietazo.getInstancia().getDanio());
				System.out.println("la vida del pegado despues es: "+Personaje2.getInstancia().getVida() );
				}
				else
				{
					System.out.println("El ataque fallo");
				}

			}
			if ( ListagolpesPersonaje1.get(i) instanceof Ataqueespecial) {
				System.out.println("El turno es de: "+Personaje1.getInstancia().getNombre());
				probabilidad=(int)Math.round(Math.random()*100);
				
				if (probabilidad<75) {
				System.out.println(this.getNombre()+" ha dado una ataqueespecial a "+Personaje2.getInstancia().getNombre());
				System.out.println("la vida del pegado antes es: "+Personaje2.getInstancia().getVida() );
				Personaje2.getInstancia().setVida(Personaje2.getInstancia().getVida()-Ataqueespecial.getInstancia().getDanio());
				System.out.println("la vida del pegado despues es: "+Personaje2.getInstancia().getVida() );
				}
				else
				{
					System.out.println("El ataque fallo");
				}
			}
		}
		Personaje1.getInstancia().ListagolpesPersonaje1.clear();
		
	}
	
	public synchronized static Personaje1 getInstancia() {
        if (instancia == null) {
            instancia = new Personaje1();
        }
        return instancia;
    }

	

	

	
	
}
