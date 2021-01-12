package AppModels;

import AppControllers.CPartida;
import AppControllers.CPrincipal;

public class MPartidaNueva {
    AppModels.Partidas partidasManager = AppModels.Partidas.getInstance();
    public void cancel(){
        new CPrincipal();
    }
    public void create(String name, String type){
        Partida partida = partidasManager.CrearPartida(name);
        IJugador jugadorA = new Persona();
        IJugador jugadorB = null;
        System.out.println("TIPO->"+type);
        if (type == "PvsP"){
            System.out.println("TIPO->persona");
            jugadorB = new Persona();
        }else if(type == "PvsM"){
            System.out.println("TIPO->maquina");
            jugadorB = new Maquina();
        }
        partida.setOponentes(jugadorA, jugadorB);
        new CPartida();
    }
}
