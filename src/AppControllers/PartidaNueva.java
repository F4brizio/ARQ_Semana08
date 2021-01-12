package AppControllers;

import AppModels.IJugador;
import AppModels.Maquina;
import AppModels.Partida;
import AppModels.Persona;
import com.sun.xml.internal.ws.wsdl.writer.document.Part;

import java.util.UUID;

public class PartidaNueva {
    AppViews.PartidaNueva partidaNuevaView;
    AppModels.Partidas partidasManager = AppModels.Partidas.getInstance();
    public PartidaNueva() {
        this.partidaNuevaView = new AppViews.PartidaNueva(this);
        this.partidaNuevaView.setVisible(true);
    }
    public void cancel(){
        this.partidaNuevaView.setVisible(false);
        new Principal();
    }
    public void create(String name, String type){

        Partida partida = partidasManager.CrearPartida(name);

        //IJugador jugadorA = new Persona();
        //IJugador jugadorB = new Persona();

        IJugador jugadorA = new Persona();
        IJugador jugadorB = new Maquina();

        partida.setOponentes(jugadorA, jugadorB);
        this.partidaNuevaView.setVisible(false);

        new AppControllers.Partida();

    }
}
