package AppControllers;

import AppModels.Partida;
import datos.Servicio;

import java.util.ArrayList;

public class Principal {
    Servicio srv = new Servicio();

    //AppViews.Principal PrincipalView;
    AppViews.PrincipalConsole PrincipalView;
    AppModels.Partidas partidasManager = AppModels.Partidas.getInstance();
    public Principal() {
        //this.PrincipalView = new AppViews.Principal(this);
        //this.PrincipalView.init();
        this.PrincipalView = new AppViews.PrincipalConsole(this);
        this.PrincipalView.init();
    }
    public void newGame(){
        PartidaNueva newGameView = new PartidaNueva();
        //this.PrincipalView.close(false);
        this.PrincipalView.close();
    }
    public ArrayList<Partida> getListPartidas(){
        return partidasManager.ObtenerListaPartidas();
    }

    public void loadGame(Partida partida) {
        this.partidasManager.setPartida(partida);
        this.PrincipalView.close();
        new AppControllers.Partida();
    }
}
