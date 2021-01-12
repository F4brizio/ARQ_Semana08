package AppControllers;

import AppModels.Elemento;
import AppModels.IJugador;
import AppModels.LogicaNegocio;
import datos.Servicio;

public class Partida {
    LogicaNegocio ldn = new LogicaNegocio();

    AppViews.PartidaConsole partidaView;
    AppModels.Partidas partidasManager = AppModels.Partidas.getInstance();
    public Partida() {
        this.partidaView = new AppViews.PartidaConsole(this);
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
            new AppControllers.Principal();
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
        new AppControllers.Principal();
        this.partidaView.close();
    }
}
