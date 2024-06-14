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
        String sqlBuscar = "SELECT * FROM pasajero WHERE dni = ?";
        String sqlInsertar = "INSERT INTO pasajero(nombre, apellido, dni, correo, telefono, estado) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            
            PreparedStatement psBuscar = con.prepareStatement(sqlBuscar);
            psBuscar.setString(1, pasajero.getDni());
            ResultSet rs = psBuscar.executeQuery();

            if (rs.next()) {
                
                JOptionPane.showMessageDialog(null, "El DNI ingresado ya existe. No se puede agregar el pasajero.");
            } else {
               
                PreparedStatement psInsertar = con.prepareStatement(sqlInsertar, Statement.RETURN_GENERATED_KEYS);
                psInsertar.setString(1, pasajero.getNombre());
                psInsertar.setString(2, pasajero.getApellido());
                psInsertar.setString(3, pasajero.getDni());
                psInsertar.setString(4, pasajero.getCorreo());
                psInsertar.setString(5, pasajero.getTelefono());
                psInsertar.setBoolean(6, pasajero.isEstado());

                psInsertar.executeUpdate();
                ResultSet rsInsertar = psInsertar.getGeneratedKeys();

                if (rsInsertar.next()) {
                    pasajero.setIdPasajero(rsInsertar.getInt(1));
                    JOptionPane.showMessageDialog(null, "Pasajero añadido con éxito.");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasajero: " + ex.getMessage());
        }
    }

    public List<Pasajero> listarPasajeros() {
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
                pasajero.setDni(rs.getString("dni"));
                pasajero.setCorreo(rs.getString("correo"));
                pasajero.setTelefono(rs.getString("telefono"));
                pasajero.setEstado(rs.getBoolean("estado"));
                pasajeros.add(pasajero);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pasajero " + ex.getMessage());
        }
        return pasajeros;
    }

    public Pasajero buscasPasajeroPorNombre(String name) {
        Pasajero pasajero = null;
        String sql = "SELECT idPasajero, nombre, apellido, dni, correo, telefono, estado FROM pasajero WHERE nombre= ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pasajero = new Pasajero();
                pasajero.setIdPasajero(rs.getInt("idPasajero"));
                pasajero.setDni(rs.getString("dni"));
                pasajero.setApellido(rs.getString("apellido"));
                pasajero.setNombre(rs.getString("nombre"));
                pasajero.setCorreo(rs.getString("correo"));
                pasajero.setTelefono(rs.getString("telefono"));
                pasajero.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el pasajero");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasajero " + ex.getMessage());
        }
        return pasajero;
    }

    public Pasajero buscasPasajeroPorApellido(String lastname) {
        Pasajero pasajero = null;
        String sql = "SELECT idPasajero, nombre, apellido, dni, correo, telefono, estado FROM pasajero WHERE apellido = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, lastname);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pasajero = new Pasajero();
                pasajero.setIdPasajero(rs.getInt("idPasajero"));
                pasajero.setDni(rs.getString("dni"));
                pasajero.setApellido(rs.getString("apellido"));
                pasajero.setNombre(rs.getString("nombre"));
                pasajero.setCorreo(rs.getString("correo"));
                pasajero.setTelefono(rs.getString("telefono"));
                pasajero.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el pasajero");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasajero " + ex.getMessage());
        }
        return pasajero;
    }

    public Pasajero buscasPasajeroPorDni(int dni) {
        Pasajero pasajero = null;
        String sql = "SELECT idPasajero, nombre, apellido, dni, correo, telefono, estado FROM pasajero WHERE dni = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                pasajero = new Pasajero();
                pasajero.setIdPasajero(rs.getInt("idPasajero"));
                pasajero.setDni(rs.getString("dni"));
                pasajero.setApellido(rs.getString("apellido"));
                pasajero.setNombre(rs.getString("nombre"));
                pasajero.setCorreo(rs.getString("correo"));
                pasajero.setTelefono(rs.getString("telefono"));
                pasajero.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el pasajero");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasajero " + ex.getMessage());
        }
        return pasajero;
    }

    public void modificarPasajero(Pasajero pasajero) {
        String sql = "UPDATE pasajero SET dni = ? , nombre = ?, apellido = ?, email = ?, telefono=? WHERE idPasajero = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pasajero.getDni());

            ps.setString(2, pasajero.getNombre());
            ps.setString(3, pasajero.getApellido());
            ps.setString(4, pasajero.getCorreo());
            ps.setString(5, pasajero.getTelefono());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El alumno no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());
        }
    }

    public void eliminarPasajero(String dni) {

        try {
            String sql = "UPDATE pasajero SET estado = 0 WHERE dni = ? ";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, dni);

            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó el pasajero.");
            } else {

                JOptionPane.showMessageDialog(null, "No se encontró el pasajero ");
            }

            ps.close();
        } catch (SQLException e) {
            // Aquí deberías mostrar el mensaje de error específico de la excepción.
            JOptionPane.showMessageDialog(null, "Error al eliminar el pasajero: " + e.getMessage());
        }
    }
}
