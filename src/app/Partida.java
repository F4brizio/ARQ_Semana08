package app;

public class Partida {

    private IJugador[] oponentes = new IJugador[2];



    public void setOponentes(IJugador a, IJugador b) {
        oponentes[0] = a;
        oponentes[1] = b;
    }

    /*
    - Obtiene la jugada de los dos jugadores
    - Farro crea logica de quien gana a quien
    - Aumenta el puntaje al jugadoor.
     */
    public void EvaluarJugada(){

    }
}
