package app;

public interface IJugador {

    public  int Puntaje=0;
    public  int getPuntaje();
    public  void setPuntaje(int p);
    public void JugadaTurno();
    public Elemento getJugada();

}
