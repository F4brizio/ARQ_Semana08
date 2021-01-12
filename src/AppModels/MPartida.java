package AppModels;

import AppControllers.CPrincipal;
import AppViews.VPartidaConsole;

public class MPartida {
    AppModels.Partidas partidasManager = AppModels.Partidas.getInstance();
    public String evalularJugada(VPartidaConsole vPartidaConsole, Elemento a, Elemento b) {
        partidasManager.getPartida().getOponentes()[0].JugadaTurno(a);
        partidasManager.getPartida().getOponentes()[1].JugadaTurno(b);
        String r = partidasManager.getPartida().EvaluarJugada();
        updatePoints(vPartidaConsole);
        String e = partidasManager.getPartida().EvalularPartidad();
        if (e != null){
            r = e;
        }
        return r;
    }
    public void evaluar(VPartidaConsole vPartidaConsole){
        String e = partidasManager.getPartida().EvalularPartidad();
        if (e != null){
            vPartidaConsole.close();
            new CPrincipal();
        }
    }

    public IJugador getOponenteA(){
        return partidasManager.getPartida().getOponentes()[0];
    }
    public IJugador getOponenteB(){
        return partidasManager.getPartida().getOponentes()[1];
    }
    public int getCountPartidas(){
        return this.partidasManager.getPartida().getnPartidas();
    }
    public void updatePoints(VPartidaConsole vPartidaConsole){
        vPartidaConsole.setPuntajes(partidasManager.getPartida().getOponentes()[0].getPuntaje(),partidasManager.getPartida().getOponentes()[1].getPuntaje());
    }

    public void SaveAndExit(VPartidaConsole vPartidaConsole) {
        partidasManager.guardarPartida();
        new CPrincipal();
        vPartidaConsole.close();
    }
}
