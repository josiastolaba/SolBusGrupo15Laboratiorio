

package accesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Time;
import java.sql.ResultSet;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
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
    
    public List<Ruta> listarRutas() {
        List<Ruta> rutas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM ruta WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Ruta ruta = new Ruta();
                ruta.setIdRuta(rs.getInt("idRuta"));
                ruta.setOrigen(rs.getString("origen"));
                ruta.setDestino(rs.getString("destino"));
                ruta.setDuracion(rs.getTime("duracionEstimada").toLocalTime());
                ruta.setEstado(rs.getBoolean("estado"));
                rutas.add(ruta);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Ruta " + ex.getMessage());
        }
        return rutas;
    }
    public Ruta buscasRutaPorOrigen(String origen){
        Ruta ruta = null;
        String sql = "SELECT idRuta, origen, destino, duracionEstimada, estado FROM ruta WHERE origen = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, origen);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ruta = new Ruta();
                ruta.setIdRuta(rs.getInt("idRuta"));
                ruta.setOrigen(rs.getString("origen"));
                ruta.setDestino(rs.getString("destino"));
                ruta.setDuracion(rs.getTime("duracionEstimada").toLocalTime());
                ruta.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el ruta");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ruta " + ex.getMessage());
        }
        return ruta;
    }
    public Ruta buscasRutaPorDestino(String destino){
        Ruta ruta = null;
        String sql = "SELECT idRuta, origen, destino, duracionEstimada, estado FROM ruta WHERE destino = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, destino);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ruta = new Ruta();
                ruta.setIdRuta(rs.getInt("idRuta"));
                ruta.setOrigen(rs.getString("origen"));
                ruta.setDestino(rs.getString("destino"));
                ruta.setDuracion(rs.getTime("duracionEstimada").toLocalTime());
                ruta.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el ruta");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ruta " + ex.getMessage());
        }
        return ruta;
    }
}
