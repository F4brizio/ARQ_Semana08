package AppModels;

import AppModels.Elemento;
import AppModels.IJugador;

public class Maquina implements IJugador {
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
        int numero = (int)(Math.random()*3);
        if (numero == 1){
            this.JugadaActual =Elemento.PIEDRA;
        }else if (numero == 2){
            this.JugadaActual =Elemento.PAPEL;
        }else if (numero == 3){
            this.JugadaActual =Elemento.TIJERA;
        }
    }

    @Override
    public Elemento getJugada() {
        return this.JugadaActual;
    }
   
}
