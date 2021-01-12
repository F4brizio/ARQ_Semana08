package AppControllers;

import AppModels.Partida;
import AppViews.VPrincipalConsole;

import java.util.ArrayList;

public class CPrincipal {
    VPrincipalConsole PrincipalView;
    AppModels.Partidas partidasManager = AppModels.Partidas.getInstance();
    public CPrincipal() {
        this.PrincipalView = new VPrincipalConsole(this);
        this.PrincipalView.init();
    }
    public void newGame(){
        CPartidaNueva newGameView = new CPartidaNueva();
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
