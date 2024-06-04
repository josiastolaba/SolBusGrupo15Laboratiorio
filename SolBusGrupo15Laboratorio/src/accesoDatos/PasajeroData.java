package accesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import solbusgrupo15laboratorio.entidades.Pasajero;

public class PasajeroData {

    private Connection con = null;

    public PasajeroData() {
        con = Conexion.getConexion();
    }

    public void guardarPasajero(Pasajero pasajero) {
        String sql = "INSERT INTO pasajero( nombre, apellido, dni, correo, telefono, estado) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, pasajero.getNombre());
            ps.setString(2, pasajero.getApellido());
            ps.setInt(3, pasajero.getDni());
            ps.setString(4, pasajero.getCorreo());
            ps.setInt(5, pasajero.getTelefono());
            ps.setBoolean(6, pasajero.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                pasajero.setIdPasajero(rs.getInt(1));;
                JOptionPane.showMessageDialog(null, "Pasajero añadido con exito.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasajero" + ex.getMessage());
        }
    }

    public List<Pasajero> listarPasajero() {
        List<Pasajero> pasajeros = new ArrayList<>();
        try {
            String sql = "SELECT * FROM pasajero WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pasajero pasajero = new Pasajero();
                pasajero.setIdPasajero(rs.getInt("idPasajero"));
                pasajero.setNombre(rs.getString("nombre"));
                pasajero.setApellido(rs.getString("apellido"));
                pasajero.setDni(rs.getInt("dni"));
                pasajero.setCorreo(rs.getString("correo"));
                pasajero.setTelefono(rs.getInt("telefono"));
                pasajero.setEstado(rs.getBoolean("estado"));
                pasajeros.add(pasajero);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pasajeros " + ex.getMessage());
        }
        return pasajeros;
    }
}
