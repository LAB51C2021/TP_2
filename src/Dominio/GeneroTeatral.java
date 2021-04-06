package Dominio;

public class GeneroTeatral implements IGenero {
	//Drama("Drama"), Teatro("Teatro"), Comedia("Comedia");
		
	private TiposGeneros tipo;
    private String descripcion;
    
    
	public GeneroTeatral(String descripcion) {
		this.tipo = TiposGeneros.Teatral;
		this.descripcion = descripcion;
	}

	@Override
	public String GetGeneroDescripcion() {
		// TODO Auto-generated method stub
		return this.descripcion;
	}

	@Override
	public TiposGeneros GetTipoGenero() {
		// TODO Auto-generated method stub
		return this.tipo;
	}
}
