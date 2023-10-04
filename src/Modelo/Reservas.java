
package Modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reservas {
    
    private int idReservas;
    private int idMesas;
    private String nombre;
    private int dni;
    private LocalDate fecha;
    private LocalTime hora;
    private boolean estado;

    public Reservas() {
    }

    public Reservas(int idReservas, int idMesas, String nombre, int dni, LocalDate fecha, LocalTime hora, boolean estado) {
        this.idReservas = idReservas;
        this.idMesas = idMesas;
        this.nombre = nombre;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public Reservas(int idMesas, String nombre, int dni, LocalDate fecha, LocalTime hora, boolean estado) {
        this.idMesas = idMesas;
        this.nombre = nombre;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public int getIdReservas() {
        return idReservas;
    }

    public void setIdReservas(int idReservas) {
        this.idReservas = idReservas;
    }

    public int getIdMesas() {
        return idMesas;
    }

    public void setIdMesas(int idMesas) {
        this.idMesas = idMesas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Reservas{" + "idReservas=" + idReservas + ", idMesas=" + idMesas + ", nombre=" + nombre + ", dni=" + dni + ", fecha=" + fecha + ", hora=" + hora + ", estado=" + estado + '}';
    }        
    
}
    
