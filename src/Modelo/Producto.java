
package Modelo;

public class Producto {
    
    private int idProductos;
    private int idCodigo;
    private String nombre;
    private int cantidad;
    private double precio;

    public Producto() {
    }

    public Producto(int idProductos, int idCodigo, String nombre, int cantidad, double precio) {
        this.idProductos = idProductos;
        this.idCodigo = idCodigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Producto(int idCodigo, String nombre, int cantidad, double precio) {
        this.idCodigo = idCodigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getIdProductos() {
        return idProductos;
    }

    public void setIdProductos(int idProductos) {
        this.idProductos = idProductos;
    }

    public int getIdCodigo() {
        return idCodigo;
    }

    public void setIdCodigo(int idCodigo) {
        this.idCodigo = idCodigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProductos=" + idProductos + ", idCodigo=" + idCodigo + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }
    
    
    
}
