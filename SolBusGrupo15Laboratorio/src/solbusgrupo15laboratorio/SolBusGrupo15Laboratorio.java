
package solbusgrupo15laboratorio;

import accesoDatos.PasajeroData;
import accesoDatos.RutaData;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import solbusgrupo15laboratorio.entidades.Pasajero;
import solbusgrupo15laboratorio.entidades.Ruta;

public class SolBusGrupo15Laboratorio {

    public static void main(String[] args) {
//        Ruta r1 = new Ruta(1,"La Punta", "San Luis",LocalTime.of(1, 20) , true);
//        RutaData rData = new RutaData();
//        rData.aniadirNuevaRuta(r1);
        Pasajero p1 = new Pasajero(1, "Josias", "Tolaba", 12345678, "josiastolaba@gmail.com", 266412345, true);
        PasajeroData pasajeroData = new PasajeroData();
//        pasajeroData.guardarPasajero(p1);
        List<Pasajero> pasajeros = new ArrayList<>();
        pasajeros = pasajeroData.listarPasajero();
        for (Pasajero aux:pasajeros){ 
        System.out.println(aux.toString());
        
    }
        
    }
    
}
