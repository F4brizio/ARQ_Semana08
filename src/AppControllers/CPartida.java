package AppControllers;

import AppModels.Elemento;
import AppModels.IJugador;
import AppModels.LogicaNegocio;
import AppViews.VPartidaConsole;

public class CPartida {
    LogicaNegocio ldn = new LogicaNegocio();

    VPartidaConsole partidaView;
    AppModels.Partidas partidasManager = AppModels.Partidas.getInstance();
    public CPartida() {
        this.partidaView = new VPartidaConsole(this);
        this.partidaView.init();
        this.updatePoints();
    }

    public String evalularJugada(Elemento a, Elemento b) {
        partidasManager.getPartida().getOponentes()[0].JugadaTurno(a);
        partidasManager.getPartida().getOponentes()[1].JugadaTurno(b);
        String r = partidasManager.getPartida().EvaluarJugada();
        updatePoints();
        String e = partidasManager.getPartida().EvalularPartidad();
        if (e != null){
            r = e;
        }
        return r;
    }
    public void evaluar(){
        String e = partidasManager.getPartida().EvalularPartidad();
        if (e != null){
            this.partidaView.close();
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
    public void updatePoints(){
        this.partidaView.setPuntajes(partidasManager.getPartida().getOponentes()[0].getPuntaje(),partidasManager.getPartida().getOponentes()[1].getPuntaje());
    }

    public void SaveAndExit() {
        ldn.guardarPartida(partidasManager.getPartida());
        new CPrincipal();
        this.partidaView.close();
    }
}
