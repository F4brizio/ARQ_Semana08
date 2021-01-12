package AppControllers;

public class Partida {
    AppViews.Partida partidaView;
    AppModels.Partidas partidasManager = AppModels.Partidas.getInstance();
    public Partida() {

        this.partidaView = new AppViews.Partida();
        this.partidaView.setVisible(true);

        this.partidaView.lblpersonavspersona.setText(partidasManager.getPartida().getNombre());
        this.partidaView.setPuntajes(partidasManager.getPartida().getOponentes()[0].getPuntaje(),partidasManager.getPartida().getOponentes()[1].getPuntaje());
    }

}
