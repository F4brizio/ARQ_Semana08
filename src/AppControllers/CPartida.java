package AppControllers;

import AppModels.Elemento;
import AppModels.IJugador;
import AppModels.LogicaNegocio;
import AppModels.MPartida;
import AppViews.VPartidaConsole;

public class CPartida {

    private MPartida mPartida;
    private VPartidaConsole vPartidaView;

    public CPartida() {
        this.mPartida = new MPartida();
        this.vPartidaView = new VPartidaConsole(mPartida);
        this.vPartidaView.init();

    }


}
