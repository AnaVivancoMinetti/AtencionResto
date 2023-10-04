
package Modelo;

public class DetallePedidos {

private int idDetallePedidos;
private int idPedidos;
private int idProductos;
private int cantidad;
private double subTotal;

    public DetallePedidos() {
    }

    public DetallePedidos(int idDetallePedidos, int idPedidos, int idProductos, int cantidad, double subTotal) {
        this.idDetallePedidos = idDetallePedidos;
        this.idPedidos = idPedidos;
        this.idProductos = idProductos;
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }

    public DetallePedidos(int idPedidos, int idProductos, int cantidad, double subTotal) {
        this.idPedidos = idPedidos;
        this.idProductos = idProductos;
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }

    public int getIdDetallePedidos() {
        return idDetallePedidos;
    }

    public void setIdDetallePedidos(int idDetallePedidos) {
        this.idDetallePedidos = idDetallePedidos;
    }

    public int getIdPedidos() {
        return idPedidos;
    }

    public void setIdPedidos(int idPedidos) {
        this.idPedidos = idPedidos;
    }

    public int getIdProductos() {
        return idProductos;
    }

    public void setIdProductos(int idProductos) {
        this.idProductos = idProductos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    @Override
    public String toString() {
        return "DetallePedidos{" + "idDetallePedidos=" + idDetallePedidos + ", idPedidos=" + idPedidos + ", idProductos=" + idProductos + ", cantidad=" + cantidad + ", subTotal=" + subTotal + '}';
    }
    
}
