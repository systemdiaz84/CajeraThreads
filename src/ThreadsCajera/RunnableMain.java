package ThreadsCajera;

public class RunnableMain {

    public static void main(String[] args) {
        Cliente Cliente1 = new Cliente("CLIENTE 1", new int[]{2, 2, 1, 5, 2, 3});
        Cliente Cliente2 = new Cliente("CLIENTE 2", new int[]{1, 3, 5, 1, 1});

        Cajera Cajera1 = new Cajera("CAJERA 1");
        Cajera Cajera2 = new Cajera("CAJERA 2");

        RunnableClass obj1 = new RunnableClass(Cajera1, Cliente1, System.currentTimeMillis());
        RunnableClass obj2 = new RunnableClass(Cajera2, Cliente2, System.currentTimeMillis());

        Thread Hilo1 = new Thread(obj1);
        Thread Hilo2 = new Thread(obj2);

        Hilo1.start();
        Hilo2.start();

    }

}
