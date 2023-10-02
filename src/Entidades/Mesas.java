
package Entidades;

public class Mesas {
    
    private int idMesas;
    private int numero;
    private int capacidad;
    private boolean estado;

    public Mesas() {
    }

    public Mesas(int idMesas, int numero, int capacidad, boolean estado) {
        this.idMesas = idMesas;
        this.numero = numero;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public Mesas(int numero, int capacidad, boolean estado) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public int getIdMesas() {
        return idMesas;
    }

    public void setIdMesas(int idMesas) {
        this.idMesas = idMesas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Mesas{" + "idMesas=" + idMesas + ", numero=" + numero + ", capacidad=" + capacidad + ", estado=" + estado + '}';
    }        
    
}
