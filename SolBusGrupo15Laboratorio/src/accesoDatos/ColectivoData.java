
package accesoDatos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import solbusgrupo15laboratorio.entidades.Colectivo;
import java.sql.*;

public class ColectivoData {



private Connection con = null; 
    public ColectivoData() {
        con = Conexion.getConexion();
    }

    public void guardarColectivo(Colectivo colectivo) {

        String sql = "INSERT INTO colectivo(matricula, marca, modelo, capacidad, estado) VALUES (?, ?, ?, ?, ?)";
        try {
             PreparedStatement ps = con.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS); 
                ps.setString(1, colectivo.getMatricula());
                ps.setString(2, colectivo.getMarca());
                ps.setString(3, colectivo.getModelo());
                
                ps.setInt(4, colectivo.getCapacidad());
                
                ps.setBoolean(5, colectivo.isEstado());
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    colectivo.setIdColectivo(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Colectivo añadido con exito.");
                }
            }

         catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Colectivo" + ex.getMessage());
        }

    }
}
    

