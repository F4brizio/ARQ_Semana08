package AppControllers;

public class Principal {
    AppViews.Principal PrincipalView;
    public Principal() {
        this.PrincipalView = new AppViews.Principal(this);
        this.PrincipalView.setVisible(true);
    }
    public void newGame(){
        PartidaNueva newGameView = new PartidaNueva();
        this.PrincipalView.setVisible(false);
    }
}
