
package solbusgrupo15laboratorio;

import accesoDatos.PasajeroData;
import accesoDatos.RutaData;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import solbusgrupo15laboratorio.entidades.Pasajero;
import solbusgrupo15laboratorio.entidades.Ruta;
import solbusgrupo15laboratorio.entidades.Pasaje;
import accesoDatos.PasajeData;

public class SolBusGrupo15Laboratorio {

    public static void main(String[] args) {
//        Ruta r1 = new Ruta(1,"La Punta", "San Luis",LocalTime.of(1, 20) , true);
//          Ruta r2 = new Ruta(1,"La Punta", "San Luis",LocalTime.of(1, 20) , true);
//        RutaData rData = new RutaData();
////        rData.aniadirNuevaRuta(r1); 
//          rData.aniadirNuevaRuta(r2);
//        Pasajero p1 = new Pasajero(1, "Josias", "Tolaba", 12345678, "josiastolaba@gmail.com", 266412345, true);
//        PasajeroData pasajeroData = new PasajeroData();
////        pasajeroData.guardarPasajero(p1);
//        List<Pasajero> pasajeros = new ArrayList<>();
//        pasajeros = pasajeroData.listarPasajero();
//        for (Pasajero aux:pasajeros){ 
//        System.out.println(aux.toString());
          Pasaje pas1= new Pasaje(1, 1, 1, 1, LocalDate.of(2024, Month.JUNE, 4), LocalTime.of(12, 05), 3, 750);
          PasajeData pasData=new PasajeData();
          pasData.venderPasaje(pas1);
        
    }
     
}
