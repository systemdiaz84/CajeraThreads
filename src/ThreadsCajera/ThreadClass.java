package ThreadsCajera;

public class ThreadClass extends Thread {

    private Cajera cajera;
    private Cliente cliente;
    private Long tiempoinicio;

    public ThreadClass(Cajera cajera, Cliente cliente, Long tiempoinicio) {
        this.cajera = cajera;
        this.cliente = cliente;
        this.tiempoinicio = tiempoinicio;
    }

    @Override
    public void run() {
           this.cajera.procesarCompra(cliente, tiempoinicio);
    }

}
