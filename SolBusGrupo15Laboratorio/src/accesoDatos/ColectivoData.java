
package accesoDatos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import solbusgrupo15laboratorio.entidades.Colectivo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import solbusgrupo15laboratorio.entidades.Pasajero;

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
    
      public List<Colectivo> listarColectivos() {
        List<Colectivo> colectivos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM colectivo WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Colectivo colectivo = new Colectivo();
                colectivo.setIdColectivo(rs.getInt("idColectivo"));
                colectivo.setMatricula(rs.getString("matricula"));
                colectivo.setMarca(rs.getString("marca"));
                colectivo.setModelo(rs.getString("modelo"));
                colectivo.setCapacidad(rs.getInt("capacidad"));
                colectivo.setEstado(rs.getBoolean("estado"));
                colectivos.add(colectivo);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Colectivo " + ex.getMessage());
        }
        return colectivos;
    }
    
      
        public Colectivo buscasColectivoPorMarca(String name){
        Colectivo colectivo = null;
        String sql = "SELECT idColectivo, matricula, marca, modelo, capaciad, estado FROM colectivo WHERE nombre= ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                colectivo = new Colectivo();
                colectivo.setIdColectivo(rs.getInt("idColectivo"));
                colectivo.setMatricula(rs.getString("matricula"));
                colectivo.setMarca(rs.getString("marca"));
                colectivo.setModelo(rs.getString("modelo"));
                colectivo.setCapacidad(rs.getInt("capacidad"));
                colectivo.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el colectivo");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla colectivo " + ex.getMessage());
        }
        return colectivo;
      
}
    
        
        
           public Colectivo buscasColectivoPorMatricula(String name){
        Colectivo colectivo = null;
        String sql = "SELECT idColectivo, matricula, marca, modelo, capaciad, estado FROM colectivo WHERE nombre= ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                colectivo = new Colectivo();
                colectivo.setIdColectivo(rs.getInt("idColectivo"));
                colectivo.setMatricula(rs.getString("matricula"));
                colectivo.setMarca(rs.getString("marca"));
                colectivo.setModelo(rs.getString("modelo"));
                colectivo.setCapacidad(rs.getInt("capacidad"));
                colectivo.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el colectivo");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla colectivo " + ex.getMessage());
        }
        return colectivo;
        
        
        
}
    
           
           public void eliminarColectivo(int id) {
        try {
            String sql = "UPDATE colectivo SET estado = 0 WHERE idColectivo = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó el colectivo.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Colectivo");
        }
    }
           
           
           
}
    

