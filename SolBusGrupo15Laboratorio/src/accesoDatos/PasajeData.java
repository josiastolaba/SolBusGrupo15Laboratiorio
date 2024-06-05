
package accesoDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import javax.swing.JOptionPane;
import solbusgrupo15laboratorio.entidades.Pasaje;

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
}
