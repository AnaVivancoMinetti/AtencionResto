
package Entidades;

import java.time.LocalDate;

public class Pedidos {
    
    private int idPedidos;
    private int idMesas;
    private int idMeseros;
    private LocalDate fecha;
    private boolean estado;

    public Pedidos() {
    }

    public Pedidos(int idPedidos, int idMesas, int idMeseros, LocalDate fecha, boolean estado) {
        this.idPedidos = idPedidos;
        this.idMesas = idMesas;
        this.idMeseros = idMeseros;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Pedidos(int idMesas, int idMeseros, LocalDate fecha, boolean estado) {
        this.idMesas = idMesas;
        this.idMeseros = idMeseros;
        this.fecha = fecha;
        this.estado = estado;
    }

    public int getIdPedidos() {
        return idPedidos;
    }

    public void setIdPedidos(int idPedidos) {
        this.idPedidos = idPedidos;
    }

    public int getIdMesas() {
        return idMesas;
    }

    public void setIdMesas(int idMesas) {
        this.idMesas = idMesas;
    }

    public int getIdMeseros() {
        return idMeseros;
    }

    public void setIdMeseros(int idMeseros) {
        this.idMeseros = idMeseros;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pedidos{" + "idPedidos=" + idPedidos + ", idMesas=" + idMesas + ", idMeseros=" + idMeseros + ", fecha=" + fecha + ", estado=" + estado + '}';
    }        
    
}
