package Dominio;

public class Deportivo extends Evento {
	
	private final float recargo = (float) 1.30;
	
	public Deportivo(String caracteristicas, int cantidadEntradas,
			boolean clasificacion) {
		super(caracteristicas, cantidadEntradas);
		
		this.clasificacion = clasificacion;
	}

	private boolean clasificacion;
	
	//private Deporte deporte;
	
	/*public float GetPrecio()
	{
		 float precioFinal = GetPrecio();
	
		 if (clasificacion) // si es true es internacional
		 {
			 return precioFinal * recargo;
		 }
		 else
		 {
			 
		 }
		//deporte.GetPrecio();
	}*/
	
	@Override
	public String toString() {
		return super.toString();
	}
}