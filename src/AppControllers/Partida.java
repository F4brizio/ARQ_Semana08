package AppControllers;

import AppModels.Elemento;

public class Partida {
    AppViews.Partida partidaView;
    AppModels.Partidas partidasManager = AppModels.Partidas.getInstance();
    public Partida() {
        this.partidaView = new AppViews.Partida(this);
        this.partidaView.setVisible(true);
        this.updatePoints();
    }

    public void evalularJugada(Elemento a, Elemento b) {
        System.out.println("evalularPartida " + a + " - " + b);
        partidasManager.getPartida().getOponentes()[0].JugadaTurno(a);
        partidasManager.getPartida().getOponentes()[1].JugadaTurno(b);
        partidasManager.getPartida().EvaluarJugada();
        updatePoints();
        this.partidaView.lblpersonavspersona.setText(Integer.toString(partidasManager.getPartida().getnPartidas()));
        if (partidasManager.getPartida().EvalularPartidad()){
            this.partidaView.setVisible(false);
            new AppControllers.Principal();
        }
    }

    public void updatePoints(){
        this.partidaView.setPuntajes(partidasManager.getPartida().getOponentes()[0].getPuntaje(),partidasManager.getPartida().getOponentes()[1].getPuntaje());
    }
}
