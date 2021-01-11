package Principal;

import app.Partida;
import app.Partidas;
import java.util.ArrayList;
import presentador.Presentador;

public class PruebaMain {
    public static void main(String[] args) {
        Partidas lista = new Partidas();
        Presentador p = new Presentador();
        Partida p1 =lista.CrearPartida("primeraPartida");
        Partida p2 =lista.CrearPartida("segundaPartida");
        Partida p3 =lista.CrearPartida("terceraPartida");
        p.guardar(p1);
        p.guardar(p2);
        p.guardar(p3);
        Partida p4 =lista.CrearPartida("cuartaPartida");
        p.guardar(p4);
    }
    
}
