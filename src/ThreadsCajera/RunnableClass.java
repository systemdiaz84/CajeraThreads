package ThreadsCajera;

public class RunnableClass implements Runnable{
    
    private Cajera cajera;
    private Cliente cliente;
    private long tiempoinicio;

    public RunnableClass(Cajera cajera, Cliente cliente, long tiempoinicio) {
        this.cajera = cajera;
        this.cliente = cliente;
        this.tiempoinicio = tiempoinicio;
    }

    @Override
    public void run() {
        this.cajera.procesarCompra(cliente, tiempoinicio);
    }
    
}
