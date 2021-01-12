package AppViews;

import AppControllers.CPartida;
import AppModels.Elemento;
import AppModels.MPartida;

import java.util.Scanner;

public class VPartidaConsole {
    MPartida model;
    private Scanner teclado = new Scanner(System.in);
    public VPartidaConsole(MPartida model) {
        this.model = model;
    }
    public void init(){
        this.model.updatePoints(this);
        boolean e = true;
        while (e){
            System.out.println("Partidas "+(this.model.getCountPartidas()+1)+"/5");
            Integer opcA;
            Elemento jugadaA = null;
            Boolean jugadaAok = true;
            if (model.getOponenteA().issetJugada() == false){
                while (jugadaAok){
                    System.out.println("Turno del jugador 1: ");
                    System.out.println("1) Piedra \n2) Papel \n3) Tijera");
                    opcA = teclado.nextInt();
                    if(opcA == 1){
                        jugadaA = Elemento.PIEDRA;
                    }else if(opcA == 2){
                        jugadaA = Elemento.PAPEL;
                    }else if(opcA == 3){
                        jugadaA = Elemento.TIJERA;
                    }
                    if (jugadaA != null){
                        jugadaAok = false;
                    }else{
                        System.out.println("Opcion Invalida, vuelve a intentarlo");
                    }
                }
            }else{
                jugadaA = model.getOponenteA().getJugada();
            }

            Integer opcB;
            Elemento jugadaB = null;
            Boolean jugadaBok = true;
            if (model.getOponenteB().issetJugada() == false){
                while (jugadaBok){
                    System.out.println("Turno del jugador 2: ");
                    System.out.println("1) Piedra \n2) Papel \n3) Tijera");
                    opcB = teclado.nextInt();
                    if(opcB == 1){
                        jugadaB = Elemento.PIEDRA;
                    }else if(opcB == 2){
                        jugadaB = Elemento.PAPEL;
                    }else if(opcB == 3){
                        jugadaB = Elemento.TIJERA;
                    }
                    if (jugadaB != null){
                        jugadaBok = false;
                    }else{
                        System.out.println("Opcion Invalida, vuelve a intentarlo");
                    }
                }
            }else{
                jugadaB = model.getOponenteB().getJugada();
            }
            String r = this.model.evalularJugada(this, jugadaA, jugadaB);
            System.out.println("<- =============== ->");
            System.out.println("<- "+r+" ->");
            System.out.println("<- =============== ->\n");
            this.model.evaluar(this);
            System.out.println("1) Seguir jugando \n2) Guardar partida y salir");
            Integer opcSave = teclado.nextInt();
            if (opcSave == 2){
                model.SaveAndExit(this);
            }

        }
    }
    public void close(){
    }

    public void setPuntajes(int puntaje, int puntaje1) {
        System.out.println("<- ============================= ->");
        System.out.println("<- Jugador 1: "+puntaje+" puntos ->");
        System.out.println("<- Jugador 2: "+puntaje1+" puntos ->");
        System.out.println("<- ============================= ->\n");
    }
}
