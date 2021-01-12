package AppModels;

import AppModels.Elemento;
import AppModels.IJugador;

public class Maquina implements IJugador {
    Elemento JugadaActual = null;
    int puntaje = 0;
    public String tipo = "1";

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

    @Override
    public Boolean issetJugada() {
        int e = getRandomNumber(0, 300);
        if (e >= 0 && e < 100){
            this.JugadaTurno(Elemento.PIEDRA);
        }else if(e >= 100 && e < 200){
            this.JugadaTurno(Elemento.PAPEL);
        }else if(e >= 200 && e <= 300){
            this.JugadaTurno(Elemento.TIJERA);
        }else{
            this.JugadaTurno(Elemento.PIEDRA);
        }
        return true;
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }

    private int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
