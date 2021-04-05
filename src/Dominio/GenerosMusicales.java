package Dominio;

public enum GenerosMusicales {
	Rock("Rock"), Heavy_metal("Heavy metal"), Reggaeton("Reggaet�n"), Trap("Trap"), Latinos("Latinos"), Pop("Pop");
	
    private final String toString;

    private GenerosMusicales(String toString) {
         this.toString = toString;
    }

    public String toString(){
         return toString;
    }
}
