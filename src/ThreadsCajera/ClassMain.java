package ThreadsCajera;

public class ClassMain {

    public static void main(String[] args) {
        Cliente Cliente1 = new Cliente("CLIENTE 1", new int[]{2, 2, 1, 5, 2, 3});
        Cliente Cliente2 = new Cliente("CLIENTE 2", new int[]{1, 3, 5, 1, 1});
        
        Cajera Cajera1 = new Cajera("CAJERA 1");
        Cajera Cajera2 = new Cajera("CAJERA 1");
        
        Cajera1.procesarCompra(Cliente1, System.currentTimeMillis());
        Cajera2.procesarCompra(Cliente2, System.currentTimeMillis());
        
    }

}
