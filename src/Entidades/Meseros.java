
package Entidades;

public class Meseros {
    
    private int idMeseros;
    private String nombre;
    private String apellido;
    private int dni;

    public Meseros() {
    }

    public Meseros(int idMeseros, String nombre, String apellido, int dni) {
        this.idMeseros = idMeseros;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public Meseros(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public int getIdMeseros() {
        return idMeseros;
    }

    public void setIdMeseros(int idMeseros) {
        this.idMeseros = idMeseros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Meseros{" + "idMeseros=" + idMeseros + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }            
    
}
