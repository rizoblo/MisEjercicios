package RepasoExamenListas.Juegosimulacro;

import java.util.ArrayList;
import java.util.List;

//el objeto debe implementar listener
public class Personaje2 extends Personaje implements PatadaListener{

	private static Personaje2 instancia = null;
	public Personaje2() {
		super();
		this.setCod(2);
		this.setNombre(propiedadesjuego.getProperty("jugador2"));
		this.setVida(100);
		Principal.addPatadaListener(this); //hay que aniadir este listener a la lista
	}

	private int cantidadataques=0;
	private int tipoataque=0;
	private int probabilidad=0;
	
	public List<Ataque> ListagolpesPersonaje2= new ArrayList<Ataque>();
	
	//aqui creamos un metodo como el que tenemos en el adapter y ponemos la notificacion
		public void patadaIntroducidaJ2(PatadaEvent event) {
			System.out.println("El jugador "+Personaje2.getInstancia().getNombre()+" ha intentado dar una patada");
		}
	@Override
	public void act() {
		cantidadataques=(int)Math.round(Math.random()*2+1);	
		for (int i=0;i<cantidadataques;i++) {
			tipoataque=0;
			tipoataque=(int)Math.round(Math.random()*2);
			if (tipoataque==0) {
				ListagolpesPersonaje2.add(new Patada());
				
			}
			if (tipoataque==1) {
				ListagolpesPersonaje2.add(new Punietazo());
				
			}
			if (tipoataque==2) {
				ListagolpesPersonaje2.add(new Ataqueespecial());
				
			}
			
		}
		for (int i=0;i<ListagolpesPersonaje2.size();i++) {
			if ( ListagolpesPersonaje2.get(i) instanceof Patada) {
				System.out.println("El turno es de: "+this.getNombre());
				probabilidad=(int)Math.round(Math.random()*100);

				if (probabilidad<75) {
				System.out.println(this.getNombre()+" ha dado una patada a "+Personaje1.getInstancia().getNombre());
				System.out.println("la vida del pegado antes es: "+Personaje1.getInstancia().getVida() );
				Personaje1.getInstancia().setVida(Personaje1.getInstancia().getVida()-Patada.getInstancia().getDanio());
				System.out.println("la vida del pegado despues es: "+Personaje1.getInstancia().getVida() );
				}
				else
				{
					System.out.println("El ataque fallo");
				}
				PatadaEvent event= new PatadaEvent(); //aqui creamos el evento
				Principal.firePatadaEventJ2(event); //para que coja este evento es necesario crearlo, como ves arriba
			}
			if ( ListagolpesPersonaje2.get(i) instanceof Punietazo) {
				System.out.println("El turno es de: "+this.getNombre());
				probabilidad=(int)Math.round(Math.random()*100);
				
				if (probabilidad<75) {
				System.out.println(this.getNombre()+" ha dado una punietazo a "+Personaje1.getInstancia().getNombre());
				System.out.println("la vida del pegado antes es: "+Personaje1.getInstancia().getVida() );
				Personaje1.getInstancia().setVida(Personaje1.getInstancia().getVida()-Punietazo.getInstancia().getDanio());
				System.out.println("la vida del pegado despues es: "+Personaje1.getInstancia().getVida() );
				}
				else
				{
					System.out.println("El ataque fallo");
				}
			}
			if ( ListagolpesPersonaje2.get(i) instanceof Ataqueespecial) {
				System.out.println("El turno es de: "+this.getNombre());
				probabilidad=(int)Math.round(Math.random()*100);

				if (probabilidad<75) {
				System.out.println(this.getNombre()+" ha dado una ataqueespecial a "+Personaje1.getInstancia().getNombre());
				System.out.println("la vida del pegado antes es: "+Personaje1.getInstancia().getVida() );
				Personaje1.getInstancia().setVida(Personaje1.getInstancia().getVida()-Ataqueespecial.getInstancia().getDanio());
				System.out.println("la vida del pegado despues es: "+Personaje1.getInstancia().getVida() );
				}
				else
				{
					System.out.println("El ataque fallo");
				}
			}
		}
		Personaje2.getInstancia().ListagolpesPersonaje2.clear();
		
	}

	public synchronized static Personaje2 getInstancia() {
        if (instancia == null) {
            instancia = new Personaje2();
        }
        return instancia;
    }
	
	
}
