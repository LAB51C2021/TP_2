package Dominio;

public enum GenerosTeatrales {
	Drama("Drama"), Teatro("Teatro"), Comedia("Comedia");
		
	    private final String toString;
	
	    private GenerosTeatrales(String toString) {
	         this.toString = toString;
	    }
	
	    public String toString(){
	         return toString;
	    }
	    
}
