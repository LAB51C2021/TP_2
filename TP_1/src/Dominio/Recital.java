package Dominio;

public class Recital extends Evento {
	
	private final float precio = 800;
	
	private final float precioVip = 1500;
	
	public Recital(String descripcion, int cantidadEntradas) {
		super(descripcion, cantidadEntradas);

	}
	
	//private GeneroMusical generoMusical;
	
	//private Banda bandaPrincipal;
	
	//private ArrayList<Banda> bandaSoporteList;
	
	public float GetPrecio(boolean esVip)
	{
		if (esVip)
		{
			return precioVip;
		}
		else
		{
			return precio;
		}
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
