package AlmacenRestaurante;

import java.time.LocalDate;
import java.util.ArrayList;

public class pedido {
    private int cantidadPedida;
    private int cantidadRecibida;
    private LocalDate fechaPedido;
    private LocalDate fechaLlegada;
    private ArrayList <pedido> pedidos;

    public pedido(int cantidadPedida, int cantidadRecibida, LocalDate fechaPedido, LocalDate fechaLlegada){
        this.cantidadPedida = cantidadPedida;
        this.cantidadRecibida = cantidadRecibida;
        this.fechaPedido = fechaPedido;
        this.fechaLlegada = fechaLlegada;

    }
    public LocalDate getfechaPedido(){
        return fechaPedido;

    }
    public void actualizarPedido(int cantidadPedida, LocalDate fechaPedido){
        this.cantidadPedida = cantidadPedida;
        this.fechaPedido = fechaPedido;
    }

    public void registrarLlegada(int cantidadRecibida, LocalDate fechaLlegada){
        this.cantidadRecibida = cantidadRecibida;
        this.fechaLlegada = fechaLlegada;
    }

    @Override
    public String toString() {
        return "pedido{" +
                "cantidadPedida=" + cantidadPedida +
                ", cantidadRecibida=" + cantidadRecibida +
                ", fechaPedido=" + fechaPedido +
                ", fechaLlegada=" + fechaLlegada +
                '}';
    }
}
