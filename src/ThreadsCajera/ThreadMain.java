package ThreadsCajera;

public class ThreadMain {

    public static void main(String[] args) {
        Cliente Cliente1 = new Cliente("CLIENTE 1", new int[]{2, 2, 1, 5, 2, 3});
        Cliente Cliente2 = new Cliente("CLIENTE 2", new int[]{1, 3, 5, 1, 1});

        Cajera Cajera1 = new Cajera("CAJERA 1");
        Cajera Cajera2 = new Cajera("CAJERA 2");

        ThreadClass Hilo1 = new ThreadClass(Cajera1, Cliente1, System.currentTimeMillis());
        ThreadClass Hilo2 = new ThreadClass(Cajera2, Cliente2, System.currentTimeMillis());

        Hilo1.start();
        Hilo2.start();

    }

}
