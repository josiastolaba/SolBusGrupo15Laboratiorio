

package accesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Time;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.JOptionPane;
import solbusgrupo15laboratorio.entidades.Ruta;

public class RutaData {
    private Connection con = null;

    public RutaData() {
        con = Conexion.getConexion();
    }
    public void aniadirNuevaRuta(Ruta ruta) {
        String sql = "INSERT INTO ruta(origen, destino, duracionEstimada,estado)VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, ruta.getOrigen());
            ps.setString(2, ruta.getDestino());
            ps.setTime(3, Time.valueOf(ruta.getDuracion()));
            ps.setBoolean(4, ruta.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                ruta.setIdRuta(rs.getInt(1));;
                JOptionPane.showMessageDialog(null, "Ruta añadido con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ruta" + ex.getMessage());
        }
    }
}
