package AppModels;

public interface IJugador {
    public int getPuntaje();
    public void setPuntaje(int p);
    public void JugadaTurno(Elemento e);
    public Elemento getJugada();
    public Boolean issetJugada();
    public String getTipo();
}
