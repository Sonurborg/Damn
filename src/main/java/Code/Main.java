package Code;

public class Main {
    
    public static void main(String[]Args) {
        menu();
    }
    
    /**
     * Metodo menu ejecuta al metodo options mientras
     * @param selection sea diferente de 4.
     */
    private static void menu(){
        int selection;
        do {
           selection=optionSel();
           options(selection);
        }while (selection!=4);
    }
    
    /**
     * Metodo optionSel imprime las opciones para el menú y
     * @return el input recibido de IntInputReader.
     */
    private static int optionSel() {
        System.out.println("Seleccione lo que desea realizar");
        System.out.println(" 1 - Agregar Polera");
        System.out.println(" 2 - Eliminar Polera");
        System.out.println(" 3 - Mostrar Pedidos");
        System.out.println(" 4 - Salir");
        return IntInputReader.input(1, 4);
    }
    
    /**
     * Metodo options recibe el
     * @param o y ejecuta el metodo correspondiente a la opcion seleccionada.
     */
    private static void options(int o){
        if (o==1) newShirt();
        if (o==2) tryDelShirt(); 
        if (o==3) Handler.printAll();
    }
    
    /**
     * Metodo newShirt inicializa variables @param type, @param size y @param print
     * necesarias para la creacion del objeto Shirt.
     */
    private static void newShirt(){
        create(typeSel(),sizeSel(),printSel());
    }
    
    /**
     * Metodo typeSel imprime las opciones para el tipo de tela de la polera y
     * @return  el input de IntInputReader.
     */
    private static int typeSel(){
        System.out.println("Seleccione el tipo de tela para su polera");
        System.out.println(" 1 - Algodón");
        System.out.println(" 2 - Polyester");
        System.out.println(" 3 - Spandex");
        return IntInputReader.input(1, 3);
    }
    
    /**
     * Metodo typeSel imprime las opciones para la talla de la polera y
     * @return  el input de IntInputReader.
     */
    private static int sizeSel(){
        System.out.println("Seleccione la talla para su polera");
        System.out.println(" 1 - S");
        System.out.println(" 2 - M");
        System.out.println(" 3 - L");
        System.out.println(" 4 - XL");
        return IntInputReader.input(1, 4);
    }
    
    /**
     * Metodo typeSel imprime las opciones para el estampado de la polera y
     * @return  el input de IntInputReader.
     */
    private static int printSel(){
        System.out.println("Seleccione si desea su polera con estampados");
        System.out.println(" 0 - Sin Estampado");
        System.out.println(" 1 - Con Estampado");
        return IntInputReader.input(0, 1);
    }
    
    /**
     * Metodo create recibe @param type, @param size, @param print
     * y crea el objeto Shirt.
     */
    private static void create(int type,int size,int print) {
        if (print == 0) {
            Handler.addShirt(tipo(type),talla(size),false);
        }else Handler.addShirt(tipo(type),talla(size),true);
    }
    
    /**
     * Metodo tipo recibe el @param type y lo transforma
     * al necesario para la creacion de la polera.
     * @return tipo , parametro ya transformado
     */
    private static Shirt.Type tipo(int type) {
        Shirt.Type tipo=null;
        if (type==1) tipo=Shirt.Type.Algodon;
        if (type==2) tipo=Shirt.Type.Polyester;
        if (type==3) tipo=Shirt.Type.Spandex;
        return tipo;
    }
    
    /**
     * Metodo talla recibe el @param size y lo transforma
     * al necesario para la creacion de la polera.
     * @return talla , parametro ya transformado
     */
    private static Shirt.Size talla(int size) {
        Shirt.Size talla=null;
        if (size==1) talla=Shirt.Size.S;
        if (size==2) talla=Shirt.Size.M;
        if (size==3) talla=Shirt.Size.L;
        if (size==4) talla=Shirt.Size.XL;
        return talla;
    }
    
    /**
     * Metodo tryDelShirt muestra los pedidos actuales de poleras y comienza la
     * eliminacion del pedido mediante delShirt solo si existen pedidos en existencia.
     */
    private static void tryDelShirt() {
        if (Handler.shirts.size()>0) {
            Handler.printAll();
            delShirt();
        } else System.out.println("No hay pedidos de poleras para eliminar");
    }
    
    /**
     * Metodo delShirt elimina la orden del numero obtenido desde delOrder
     * e imprime un mensaje para declarar que el comando a sido ejecutado.
     */
    private static void delShirt() {
        Handler.removeShirt(delOrder());
        System.out.println("El pedido a sido eliminado");
    }
    
    /**
     * Metodo delOrder imprime un mensaje para
     * @return input de IntInputReader.
     */
    private static int delOrder(){
        System.out.println("Ingrese el número de la orden a eliminar");
        return IntInputReader.input(0,Handler.shirts.size()-1);
    }
}