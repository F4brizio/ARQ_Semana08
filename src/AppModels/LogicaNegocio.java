package AppModels;
import datos.Servicio;

public class LogicaNegocio {
    Servicio servicio = new Servicio();
    public void guardarPartida(Partida p){
        servicio.guardar(p);
    }

    public void eliminarRegistro(String id) {
        servicio.eliminarRegistro(id);
    }

    public void obtenerDatos(Partidas partidas) {
        servicio.obtenerDatos(partidas);
    }
}
