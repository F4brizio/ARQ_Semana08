package AppControllers;

import AppModels.Partida;

import java.util.ArrayList;

public class Principal {
    AppViews.PrincipalConsole PrincipalView;
    AppModels.Partidas partidasManager = AppModels.Partidas.getInstance();
    public Principal() {
        this.PrincipalView = new AppViews.PrincipalConsole(this);
        this.PrincipalView.init();
    }
    public void newGame(){
        PartidaNueva newGameView = new PartidaNueva();
        this.PrincipalView.close();
    }
    public ArrayList<Partida> getListPartidas(){
        return partidasManager.ObtenerListaPartidas();
    }

    public void loadGame(Partida partida) {
        this.partidasManager.setPartida(partida);
        this.delReg(partida.getId());
        this.PrincipalView.close();
        new CPartida();
    }
    public void delReg(String id) {
        partidasManager.delReg(id);
    }
}
