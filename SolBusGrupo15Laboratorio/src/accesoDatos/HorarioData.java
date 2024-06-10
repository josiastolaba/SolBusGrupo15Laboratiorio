
package accesoDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import solbusgrupo15laboratorio.entidades.Colectivo;
import solbusgrupo15laboratorio.entidades.Horario;
import solbusgrupo15laboratorio.entidades.Pasaje;
import solbusgrupo15laboratorio.entidades.Pasajero;
import solbusgrupo15laboratorio.entidades.Ruta;

public class HorarioData {
    private Connection con = null;

    public HorarioData() {
        con = Conexion.getConexion();
    }
    public void aniadirNuevoHorario(Horario horario) {
        String sql = "INSERT INTO horario(`idRuta`, `horaSalida`, `horaLlegada`, `estado`)VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, horario.getIdRuta().getIdRuta());
            ps.setTime(2, Time.valueOf(horario.getHoraSalida()));
            ps.setTime(3, Time.valueOf(horario.getHoraLlegada()));
            ps.setBoolean(4, horario.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                horario.setIdHorario(rs.getInt(1));;
                JOptionPane.showMessageDialog(null, "Horario añadido con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla horario" + ex.getMessage());
        }
    }
    
    public List<Horario> buscarHorariosPorRuta(Ruta ruta){
        List<Horario> horarios = new ArrayList<>();
        String sql = "SELECT horario.idRuta, horaSalida,horaLlegada, horario.estado "
                +"FROM horario,ruta "
                 +"       WHERE horario.idRuta = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ruta.getIdRuta());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Horario horario = new Horario();
                Ruta rut = new Ruta();
                rut.setIdRuta(rs.getInt("idRuta"));
                horario.setIdRuta(ruta);
                horario.setHoraSalida(rs.getTime("horaSalida").toLocalTime());
                horario.setHoraLlegada(rs.getTime("horaLlegada").toLocalTime());
                horario.setEstado(rs.getBoolean("estado"));
                horarios.add(horario);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a  la tabla horario " + ex.getMessage());

        }
        return horarios;
    }
    public List<Horario> buscarHorariosPorHDeSalida(LocalTime horario) {
        List<Horario> horarios = new ArrayList<>();
        String sql = "SELECT horario.idRuta, horaSalida,horaLlegada, horario.estado "
                +"FROM horario "
                 +"       WHERE horaSalida =?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setTime(1, Time.valueOf(horario));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Horario h = new Horario();
                Ruta ruta = new Ruta();
                ruta.setIdRuta(rs.getInt("idRuta"));
                h.setIdRuta(ruta);
                h.setHoraSalida(rs.getTime("horaSalida").toLocalTime());
                h.setHoraLlegada(rs.getTime("horaLlegada").toLocalTime());
                h.setEstado(rs.getBoolean("estado"));
                horarios.add(h);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla horario " + ex.getMessage());
        }
        return horarios;
    }
    
    public void modificarHorario(Horario horario) {
        String sql = "UPDATE horario SET idRuta = ? , horaSalida = ?, horaLlegada = ?,estado = ? WHERE estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, horario.getIdRuta().getIdRuta());
            ps.setTime(2, Time.valueOf(horario.getHoraSalida()));
            ps.setTime(2, Time.valueOf(horario.getHoraLlegada()));
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El horario no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Horario " + ex.getMessage());
        }
    }
}
