package ThreadsCajera;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Cajera {
    
    private String nombre;
    
    public Cajera(String nombre) {
        this.nombre = nombre;
    }
    
    public void procesarCompra(Cliente cliente, long tiempoInicio) {
        System.out.println("LA CAJERA " + this.nombre + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + cliente.getNombre()
                + " EN EL TIEMPO " + (System.currentTimeMillis() - tiempoInicio) / 1000 + " SEG.");
        
        for (int i = 0; i < cliente.getCarrito().length; i++) {
            this.esperarxsegundos(cliente.getCarrito()[i]);
            System.out.println(this.nombre + " ESTÁ PROCESANDO EL PRODUCTO " + (i + 1) + " DEL CLIENTE " + cliente.getNombre() + "->TIEMPO: "
                    + (System.currentTimeMillis() - tiempoInicio) / 1000 + " SEG.");
        }
        System.out.println("LA CAJERA " + this.nombre + " HA TERMINADO DE PROCESAR LA COMPRA DEL CLIENTE " + cliente.getNombre() + " EN EL TIEMPO "
                + (System.currentTimeMillis() - tiempoInicio) / 1000 + " SEG.");
        
    }
    
    private void esperarxsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cajera.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
