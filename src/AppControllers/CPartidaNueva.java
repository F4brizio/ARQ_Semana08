package AppControllers;

import AppModels.IJugador;
import AppModels.Maquina;
import AppModels.Partida;
import AppModels.Persona;
import AppViews.VPartidaNuevaConsole;

public class CPartidaNueva {
    VPartidaNuevaConsole partidaNuevaView;
    AppModels.Partidas partidasManager = AppModels.Partidas.getInstance();
    public CPartidaNueva() {
        this.partidaNuevaView = new VPartidaNuevaConsole(this);
        this.partidaNuevaView.init();
    }
    public void cancel(){
        this.partidaNuevaView.close();
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
        this.partidaNuevaView.close();
        new CPartida();

    }
}
