package AppControllers;

import AppModels.*;
import AppViews.VPartidaNuevaConsole;
import AppViews.VPrincipalConsole;

public class CPartidaNueva {
    private MPartidaNueva mPartidaNueva;
    private VPartidaNuevaConsole vPartidaNuevaView;


    public CPartidaNueva() {
        this.mPartidaNueva = new MPartidaNueva();
        this.vPartidaNuevaView = new VPartidaNuevaConsole(mPartidaNueva);
        this.vPartidaNuevaView.init();
    }

}
