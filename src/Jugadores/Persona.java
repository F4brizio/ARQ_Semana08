package Jugadores;

import app.Elemento;
import app.IJugador;

public class Persona implements IJugador {
    Elemento JugadaActual = null;
    int puntaje = 0;
    public boolean tipo =false;

    @Override
    public int getPuntaje() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPuntaje(int p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void JugadaTurno(Elemento e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Elemento getJugada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
