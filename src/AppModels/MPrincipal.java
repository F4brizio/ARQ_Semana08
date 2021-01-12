package AppModels;

import AppControllers.CPartida;
import AppControllers.CPartidaNueva;

import java.util.ArrayList;

public class MPrincipal {
    AppModels.Partidas partidasManager = AppModels.Partidas.getInstance();
    public void newGame(){
        new CPartidaNueva();

    }
    public ArrayList<Partida> getListPartidas(){
        return partidasManager.ObtenerListaPartidas();
    }

    public void loadGame(Partida partida) {
        this.partidasManager.setPartida(partida);
        this.delReg(partida.getId());

        new CPartida();
    }
    public void delReg(String id) {
        partidasManager.delReg(id);
    }
}
