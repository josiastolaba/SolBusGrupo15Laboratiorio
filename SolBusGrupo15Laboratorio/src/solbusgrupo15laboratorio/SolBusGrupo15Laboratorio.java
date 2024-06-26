package solbusgrupo15laboratorio;

import accesoDatos.ColectivoData;
import accesoDatos.HorarioData;
import accesoDatos.PasajeroData;
import accesoDatos.RutaData;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import solbusgrupo15laboratorio.entidades.Colectivo;
import solbusgrupo15laboratorio.entidades.Pasajero;
import solbusgrupo15laboratorio.entidades.Ruta;
import solbusgrupo15laboratorio.entidades.Pasaje;
import accesoDatos.PasajeData;
import java.sql.Time;
import solbusgrupo15laboratorio.entidades.Horario;

public class SolBusGrupo15Laboratorio {

    public static void main(String[] args) {
//PRUEBAS RUTA============================================================================================================
        Ruta r1 = new Ruta(1, "La Punta", "San Luis", LocalTime.of(1, 20), true);
        RutaData rData = new RutaData();
//        rData.aniadirNuevaRuta(r1); 
//        List<Ruta> rutas = new ArrayList<>();
//        rutas = rData.listarRutas();
//        for (Ruta aux:rutas){ 
//           System.out.println(aux.toString());
//        }
//        Ruta prueba = rData.buscasRutaPorOrigen("La Punta");
//        Ruta prueba = rData.buscasRutaPorDestino("San Luis");
//        System.out.println(prueba.toString());
//PRUEBAS PASAJERO========================================================================================================
//        Pasajero p1 = new Pasajero(1, "Josias", "Tolaba", 12345678, "josiastolaba@gmail.com", 266412345, true);
        PasajeroData pasajeroData = new PasajeroData();
//        pasajeroData.guardarPasajero(p1);
//        List<Pasajero> pasajeros = new ArrayList<>();
//        pasajeros = pasajeroData.listarPasajeros();
//        for (Pasajero aux:pasajeros){ 
//            System.out.println(aux.toString());
//        }
//        Pasajero prueba = pasajeroData.buscasPasajeroPorNombre(p1.getNombre());
//        Pasajero prueba = pasajeroData.buscasPasajeroPorApellido(p1.getApellido());
//        Pasajero prueba = pasajeroData.buscasPasajeroPorDni(p1.getDni());
//        System.out.println(prueba.toString());
//PRUEBAS COLECTIVO=======================================================================================================
        Colectivo c1 = new Colectivo(1, "AB123CD", "Ford", "Full", 40, true);
        ColectivoData cData = new ColectivoData();
//        cData.guardarColectivo(c1);
//        List<Colectivo> colectivos = new ArrayList<>();
//        colectivos = cData.listarColectivos();
//        for (Colectivo aux : colectivos) {
//            System.out.println(aux.toString());
//        }
//        Colectivo prueba = cData.buscasColectivoPorMarca("Ford");
//        Colectivo prueba = cData.buscasColectivoPorMatricula("AB123CD");
//        System.out.println(prueba.toString());
        
//PRUEBAS PASAJE==========================================================================================================
//        Pasaje pas1 = new Pasaje(1, 1, 1, 1, LocalDate.of(2024, Month.JUNE, 4), LocalTime.of(12, 05), 3, 750);
//        Pasaje pas2 = new Pasaje(2, p1, c1, r1, LocalDate.of(2024, Month.JUNE, 4), LocalTime.of(12, 05), 3, 750);
        PasajeData pasData = new PasajeData();
//        pasData.venderPasaje(pas2);  
//        List<Pasaje> pasajeros=new ArrayList<Pasaje>();
//        pasajeros = pasData.historialVentasXRuta(1);
//        for (Pasaje aux : pasajeros) {
//            System.out.println(aux.toString());
//        }
//        List<Pasaje> pasajeros = pasData.historialVentasXHorario(Time.valueOf(LocalTime.of(12, 5)));
//        for (Pasaje aux : pasajeros) {
//            System.out.println(aux.toString());
//        }
//        List<Pasaje> pasajeros=new ArrayList<Pasaje>();
//        pasajeros = pasData.historialVentasXPasajero(p1);
//        for (Pasaje aux : pasajeros) {
//           System.out.println(aux.toString());
//        }
//        pasData.emitirRecibo(6);
//        pasData.anularPasaje(5);
//PRUEBAS HORARIO=========================================================================================================
        Horario h1 = new Horario(1, r1, LocalTime.of(6, 00), LocalTime.of(7, 20), true);
        HorarioData hData = new HorarioData();
//        hData.aniadirNuevoHorario(h1);
//        List<Horario> horarios = new ArrayList<Horario>();
//        horarios = hData.buscarHorariosPorRuta(r1);
//        horarios = hData.buscarHorariosPorHDeSalida(LocalTime.of(6, 00));
//        for (Horario horario : horarios) {
//            System.out.println(horario);
//        }
    }

}
