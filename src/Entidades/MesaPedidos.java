
package Entidades;

public class MesaPedidos {
    
    private int idMesas;
    private int idPedidos;

    public MesaPedidos() {
    }

    public MesaPedidos(int idMesas, int idPedidos) {
        this.idMesas = idMesas;
        this.idPedidos = idPedidos;
    }

    public int getIdMesas() {
        return idMesas;
    }

    public void setIdMesas(int idMesas) {
        this.idMesas = idMesas;
    }

    public int getIdPedidos() {
        return idPedidos;
    }

    public void setIdPedidos(int idPedidos) {
        this.idPedidos = idPedidos;
    }

    @Override
    public String toString() {
        return "MesaPedidos{" + "idMesas=" + idMesas + ", idPedidos=" + idPedidos + '}';
    }        
    
}
