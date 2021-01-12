package AppModels;

public interface IJugador {

    public int Puntaje=0;
    public boolean tipo =false;
    public int getPuntaje();
    public void setPuntaje(int p);
    public void JugadaTurno(Elemento e);
    public Elemento getJugada();

}
