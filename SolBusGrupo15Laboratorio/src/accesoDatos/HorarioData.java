
package accesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import javax.swing.JOptionPane;
import solbusgrupo15laboratorio.entidades.Horario;

public class HorarioData {
    private Connection con = null;

    public HorarioData() {
        con = Conexion.getConexion();
    }
    public void guardarHorario(Horario hora){
        String sql = "INSERT INTO `horario`(`idHorario`, `idRuta`, `horaSalida`, `horaLlegada`, `estado`) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, hora.getIdHorario());
            ps.setInt(2, hora.getIdRuta());
            ps.setTime(3, Time.valueOf(hora.getHoraSalida()));
            ps.setTime(4, Time.valueOf(hora.getHoraLlegada()));
            ps.setBoolean(5, hora.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                hora.setIdHorario(rs.getInt(1));;
                JOptionPane.showMessageDialog(null, "Horario añadido con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Horario" + ex.getMessage());
        }
    }
}
