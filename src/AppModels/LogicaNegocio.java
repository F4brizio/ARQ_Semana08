package AppModels;
import AppModels.Partida;
import AppModels.Partidas;
import datos.Servicio;

public class LogicaNegocio {
    Servicio servicio = new Servicio();
    
    public void iniciarAdminPartidas(Partida p){
        servicio.guardar(p);
    }
    public Partidas getPartidas(){
        return servicio.getPartidas();
    }
    
}
