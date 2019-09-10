package Code;

public class Shirt {
    
    /**
     * enum Type establece los tipos de telas para las poleras
     */
    public static enum Type{
        Algodon(),
        Polyester(),
        Spandex(),
        ;
    }
    
    /**
     * enum Size establece las tallas para las poleras
     */
    public static enum Size{
        S(),
        M(),
        L(),
        XL(),
        ;
    }
    
    private Type type;
    private Size size;
    private boolean Print;
    
    public Shirt(Type type,Size size,boolean print){
        this.type=type;
        this.size=size;
        this.Print=print;
    }
    
    /**
     * Metodo print imprime las caracteristicas de la orden Nro @param i
     */
    public void print(int i) {
        if (Print) {
            System.out.println("Tipo: "+type+" | Talla: "+size+" | Estampado: SI |Número de orden: "+i);
        }else System.out.println("Tipo: "+type+" | Talla: "+size+" | Estampado: NO |Número de orden: "+i);
    }
    
}