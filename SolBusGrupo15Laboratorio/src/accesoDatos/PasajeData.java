
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
    
    public void venderPasaje(Pasaje pasaje){
        String sql = "INSERT INTO pasaje(  `idPasajero`, `idColectivo`, `idRuta`, `fechaviaje`, `horaViaje`, `asiento`, `precio`) VALUES (?, ?, ?, ?, ?, ?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1,pasaje.getIdPasajero() );
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
    
    public List<Pasaje> historialVentasXRuta(int id){
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
}
