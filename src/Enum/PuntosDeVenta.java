package Enum;

public enum PuntosDeVenta {
	uno("La Casa De Gaby"), dos("La Casa De Fran"), tres("La Casa De Facu"), cuatro("La Casa De Andres");

    private final String toString;

    private PuntosDeVenta(String toString) {
         this.toString = toString;
    }

    public String toString(){
         return toString;
    }
}
