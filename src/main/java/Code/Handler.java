package Code;

import java.util.ArrayList;

public class Handler {
    
    static ArrayList<Shirt> shirts= new ArrayList<Shirt>();
    
    public static void addShirt(Shirt.Type type,Shirt.Size size,boolean print) {
        shirts.add(new Shirt(type,size,print));
        System.out.println("Orden realizada con el número "+shirts.size());
    }
    
    /**
     * Metodo removeShirt recive
     * @param index y elimina la polera con el indice @param index
     */
    public static void removeShirt(int index) {
        shirts.remove(index);
    }
    
    /**
     * Metdo printAll se mueve por toda la ArrayList de poleras shirts
     * y llama a sus metodos print para imprimir sus datos.
     */
    public static void printAll(){
        for (int i=0;i<shirts.size();i++) {
            shirts.get(i).print(i);
        }
    }
}