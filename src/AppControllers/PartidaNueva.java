package AppControllers;

import AppModels.IJugador;
import AppModels.Maquina;
import AppModels.Partida;
import AppModels.Persona;
import com.sun.xml.internal.ws.wsdl.writer.document.Part;

import java.util.UUID;

public class PartidaNueva {
    //AppViews.PartidaNueva partidaNuevaView;
    AppViews.PartidaNuevaConsole partidaNuevaView;
    AppModels.Partidas partidasManager = AppModels.Partidas.getInstance();
    public PartidaNueva() {
        //this.partidaNuevaView = new AppViews.PartidaNueva(this);
        this.partidaNuevaView = new AppViews.PartidaNuevaConsole(this);
        this.partidaNuevaView.init();
    }
    public void cancel(){
        this.partidaNuevaView.close();
        new Principal();
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
        new AppControllers.Partida();

    }
}
