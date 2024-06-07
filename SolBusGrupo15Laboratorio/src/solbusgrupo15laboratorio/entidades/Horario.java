
package solbusgrupo15laboratorio.entidades;

import java.time.LocalTime;

public class Horario {
    private int idHorario;
    private Ruta idRuta;
    private LocalTime horaSalida;
    private LocalTime horaLlegada;
    private boolean estado ;

    public Horario() {
    }

    public Horario(int idHorario, Ruta idRuta, LocalTime horaSalida, LocalTime horaLlegada, boolean estado) {
        this.idHorario = idHorario;
        this.idRuta = idRuta;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.estado = estado;
    }

    public Horario(Ruta idRuta, LocalTime horaSalida, LocalTime horaLlegada, boolean estado) {
        this.idRuta = idRuta;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.estado = estado;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public Ruta getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(Ruta idRuta) {
        this.idRuta = idRuta;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public LocalTime getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(LocalTime horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Horario idHorario = " + idHorario + ", idRuta = " + idRuta + ", horaSalida = " + horaSalida + ", horaLlegada = " + horaLlegada + ", estado = " + estado;
    }
    
    
}
