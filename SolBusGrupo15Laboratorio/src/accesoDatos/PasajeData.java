package accesoDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import solbusgrupo15laboratorio.entidades.Pasaje;
import solbusgrupo15laboratorio.entidades.Ruta;

public class PasajeData {

    private Connection con = null;

    public PasajeData() {
        con = Conexion.getConexion();
    }

    public void venderPasaje(Pasaje pasaje) {
        String sql = "INSERT INTO pasaje(  `idPasajero`, `idColectivo`, `idRuta`, `fechaviaje`, `horaViaje`, `asiento`, `precio`) VALUES (?, ?, ?, ?, ?, ?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, pasaje.getIdPasajero());
            ps.setInt(2, pasaje.getIdColectivo());
            ps.setInt(3, pasaje.getIdRuta());
            ps.setDate(4, Date.valueOf(pasaje.getFechaViaje()));
            ps.setTime(5, Time.valueOf(pasaje.getHoraViaje()));
            ps.setInt(6, pasaje.getAsiento());
            ps.setDouble(7, pasaje.getPrecio());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                pasaje.setIdPasaje(rs.getInt(1));;
                JOptionPane.showMessageDialog(null, "Pasaje añadido con exito.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasaje" + ex.getMessage());
        }
    }

    public List<Pasaje> historialVentasXRuta(int id) {
        List<Pasaje> pasajes = new ArrayList<>();
        String sql = "SELECT pasaje.idPasaje,idPasajero, idColectivo,pasaje.idRuta, fechaviaje, "
                + "horaViaje, asiento, precio FROM pasaje,ruta"
                + " WHERE pasaje.idRuta = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pasaje pasaje = new Pasaje();
                pasaje.setIdPasaje(rs.getInt("idPasaje"));
                pasaje.setIdPasajero(rs.getInt("idPasajero"));
                pasaje.setIdColectivo(rs.getInt("idColectivo"));
                pasaje.setIdRuta(rs.getInt("idRuta"));
                pasaje.setFechaViaje(rs.getDate("fechaviaje").toLocalDate());
                pasaje.setHoraViaje(rs.getTime("horaViaje").toLocalTime());
                pasaje.setAsiento(rs.getInt("asiento"));
                pasaje.setPrecio(rs.getDouble("precio"));

                pasajes.add(pasaje);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a  la tabla pasaje " + ex.getMessage());

        }
        return pasajes;

    }

    public List<Pasaje> historialVentasXHorario(Time horario) {
        List<Pasaje> pasajes = new ArrayList<>();
        String sql = "SELECT idPasaje,idPasajero, idColectivo,pasaje.idRuta, fechaviaje, "
                + "horaViaje, asiento, precio FROM pasaje"
                + " WHERE horaViaje=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setTime(1, horario);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pasaje pasaje = new Pasaje();
                pasaje.setIdPasaje(rs.getInt("idPasaje"));
                pasaje.setIdPasajero(rs.getInt("idPasajero"));
                pasaje.setIdColectivo(rs.getInt("idColectivo"));
                pasaje.setIdRuta(rs.getInt("idRuta"));
                pasaje.setFechaViaje(rs.getDate("fechaviaje").toLocalDate());
                pasaje.setHoraViaje(rs.getTime("horaViaje").toLocalTime());
                pasaje.setAsiento(rs.getInt("asiento"));
                pasaje.setPrecio(rs.getDouble("precio"));

                pasajes.add(pasaje);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a  la tabla pasaje " + ex.getMessage());

        }
        return pasajes;

    }

    public List<Pasaje> historialVentasXPasajero(int id) {
        List<Pasaje> pasajes = new ArrayList<>();
        String sql = "SELECT pasaje.idPasaje,pasaje.idPasajero, idColectivo,idRuta, fechaviaje, "
                + "horaViaje, asiento, precio FROM pasaje,pasajero"
                + " WHERE pasaje.idPasajero = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pasaje pasaje = new Pasaje();
                pasaje.setIdPasaje(rs.getInt("idPasaje"));
                pasaje.setIdPasajero(rs.getInt("idPasajero"));
                pasaje.setIdColectivo(rs.getInt("idColectivo"));
                pasaje.setIdRuta(rs.getInt("idRuta"));
                pasaje.setFechaViaje(rs.getDate("fechaviaje").toLocalDate());
                pasaje.setHoraViaje(rs.getTime("horaViaje").toLocalTime());
                pasaje.setAsiento(rs.getInt("asiento"));
                pasaje.setPrecio(rs.getDouble("precio"));

                pasajes.add(pasaje);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a  la tabla pasaje " + ex.getMessage());

        }
        return pasajes;

    }

   public void emitirRecibo(int idPasaje) {
    String sql = "SELECT idPasaje, idPasajero, idColectivo, idRuta, fechaviaje, horaViaje, asiento, precio FROM pasaje WHERE idPasaje = ?";
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idPasaje);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            String recibo = "Detalle del pasaje:\n";  // Asegúrate de iniciar aquí tu string para el recibo
            recibo += "ID Pasaje: " + rs.getInt("idPasaje") + "\n";
            recibo += "ID Pasajero: " + rs.getInt("idPasajero") + "\n";
            recibo += "ID Colectivo: " + rs.getInt("idColectivo") + "\n";
            recibo += "ID Ruta: " + rs.getInt("idRuta") + "\n";
            recibo += "Fecha de Viaje: " + rs.getDate("fechaViaje").toString() + "\n";
            recibo += "Hora de Viaje: " + rs.getTime("horaViaje").toString() + "\n";
            recibo += "Asiento: " + rs.getInt("asiento") + "\n";
            recibo += "Precio: " + rs.getDouble("precio");
            JOptionPane.showMessageDialog(null, recibo);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un pasaje con el ID proporcionado.");
        }
        
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al emitir recibo: " + ex.getMessage());
    }
}


   public void anularPasaje(int idPasaje) {
    String sqlEliminar = "DELETE FROM pasaje WHERE idPasaje = ?";
    try {
        PreparedStatement ps = con.prepareStatement(sqlEliminar);
        ps.setInt(1, idPasaje);
        int pasajeBuscado = ps.executeUpdate();
        ps.close();

        if (pasajeBuscado > 0) {
            JOptionPane.showMessageDialog(null, "Pasaje anulado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un pasaje con el ID proporcionado o ya fue previamente anulado.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al anular el pasaje: " + ex.getMessage());
    }
}
}
