package AppControllers;

import AppModels.MPrincipal;
import AppViews.VPrincipalConsole;

public class CPrincipal {
    private MPrincipal mPrincipal;
    private VPrincipalConsole vPrincipalView;

    public CPrincipal() {
        this.mPrincipal = new MPrincipal();
        this.vPrincipalView = new VPrincipalConsole(mPrincipal);
        this.vPrincipalView.init();
    }


}
