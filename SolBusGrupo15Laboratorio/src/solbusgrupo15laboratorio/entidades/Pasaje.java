
package solbusgrupo15laboratorio.entidades;

import java.time.LocalDate;
import java.time.LocalTime;

public class Pasaje {
    private int idPasaje;
    private int idPasajero;
    private int idColectivo;
    private int idRuta;
    private LocalDate fechaViaje;
    private LocalTime horaViaje;
    private int asiento;
    private double precio;

    public Pasaje() {
    }

    public Pasaje(int idPasaje, int idPasajero, int idColectivo, int idRuta, LocalDate fechaViaje, LocalTime horaViaje, int asiento, double precio) {
        this.idPasaje = idPasaje;
        this.idPasajero = idPasajero;
        this.idColectivo = idColectivo;
        this.idRuta = idRuta;
        this.fechaViaje = fechaViaje;
        this.horaViaje = horaViaje;
        this.asiento = asiento;
        this.precio = precio;
    }

    public Pasaje(int idPasajero, int idColectivo, int idRuta, LocalDate fechaViaje, LocalTime horaViaje, int asiento, double precio) {
        this.idPasajero = idPasajero;
        this.idColectivo = idColectivo;
        this.idRuta = idRuta;
        this.fechaViaje = fechaViaje;
        this.horaViaje = horaViaje;
        this.asiento = asiento;
        this.precio = precio;
    }

    public int getIdPasaje() {
        return idPasaje;
    }

    public void setIdPasaje(int idPasaje) {
        this.idPasaje = idPasaje;
    }

    public int getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(int idPasajero) {
        this.idPasajero = idPasajero;
    }

    public int getIdColectivo() {
        return idColectivo;
    }

    public void setIdColectivo(int idColectivo) {
        this.idColectivo = idColectivo;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public LocalDate getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(LocalDate fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public LocalTime getHoraViaje() {
        return horaViaje;
    }

    public void setHoraViaje(LocalTime horaViaje) {
        this.horaViaje = horaViaje;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
