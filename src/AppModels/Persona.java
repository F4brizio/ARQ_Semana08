package AppModels;

import AppModels.Elemento;
import AppModels.IJugador;

public class Persona implements IJugador {
    Elemento JugadaActual = null;
    int puntaje = 0;
    public boolean tipo =false;

    @Override
    public int getPuntaje() {
        return this.puntaje;
    }

    @Override
    public void setPuntaje(int p) {
        this.puntaje = p;
    }

    @Override
    public void JugadaTurno(Elemento e) {
        this.JugadaActual = e;
    }

    @Override
    public Elemento getJugada() {
        return this.JugadaActual;
    }
 
}