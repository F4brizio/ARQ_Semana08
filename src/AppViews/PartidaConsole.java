package AppViews;

import AppModels.Elemento;

import java.util.Scanner;

public class PartidaConsole {
    AppControllers.Partida controller;
    private Scanner teclado = new Scanner(System.in);
    public PartidaConsole(AppControllers.Partida controller) {
        this.controller = controller;
    }
    public void init(){
        boolean e = true;
        while (e){
            System.out.println("Partidas "+(this.controller.getCountPartidas()+1)+"/5");
            Integer opcA;
            Elemento jugadaA = null;
            Boolean jugadaAok = true;
            if (controller.getOponenteA().issetJugada() == false){
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
                jugadaA = controller.getOponenteA().getJugada();
            }

            Integer opcB;
            Elemento jugadaB = null;
            Boolean jugadaBok = true;
            if (controller.getOponenteB().issetJugada() == false){
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
                jugadaB = controller.getOponenteB().getJugada();
            }
            String r = this.controller.evalularJugada(jugadaA, jugadaB);
            System.out.println("<- =============== ->");
            System.out.println("<- "+r+" ->");
            System.out.println("<- =============== ->\n");
            this.controller.evaluar();
            System.out.println("1) Seguir jugando \n2) Guardar partida y salir");
            Integer opcSave = teclado.nextInt();
            if (opcSave == 2){
                controller.SaveAndExit();
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
