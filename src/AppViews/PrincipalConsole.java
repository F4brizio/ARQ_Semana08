package AppViews;

import AppModels.Partida;

import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalConsole {
    private AppControllers.Principal controller;
    private Scanner teclado = new Scanner(System.in);
    public PrincipalConsole(AppControllers.Principal controller) {
        this.controller = controller;
    }
    public void init(){
        System.out.println("=====> Jan Ken Po <=====");

        boolean opcLoop = true;
        while (opcLoop){
            System.out.println("¿Que desea hacer?");
            System.out.println("(1) Nueva Partida");
            System.out.println("(2) Cargar Partida");

            int opc;
            opc = teclado.nextInt();

            if (opc == 1){
                System.out.println("<- =============== ->");
                System.out.println("<-  Nueva Partida  ->");
                System.out.println("<- =============== ->\n");
                opcLoop = false;
                this.controller.newGame();
            }else if (opc == 2){
                opcLoop = false;
                System.out.println("<- =============== ->");
                System.out.println("<- Cargar Partida  ->");
                System.out.println("<- =============== ->\n");
                //get List Partidas Guardadas
                //set ID Load Partida
                //Load View Partida
                ArrayList<Partida> list = this.controller.getListPartidas();
                for (int i = 0; i < list.size(); i++) {
                    System.out.println("("+list.get(i).getId()+") Nombre: "+list.get(i).getNombre());
                }

                boolean opcLoopPart = true;
                while (opcLoopPart){
                    int opcPart;
                    System.out.println("Ingrese el ID de la partida:");
                    opcPart = teclado.nextInt();
                    if (opcPart >= 0 && opcPart <= list.size()){
                        this.controller.loadGame(list.get(opcPart));
                    }else{
                        System.out.println("<- =============== ->");
                        System.out.println("<- Opcion Invalida ->");
                        System.out.println("<- =============== ->\n");
                    }
                }
            }else{
                System.out.println("<- =============== ->");
                System.out.println("<- Opcion Invalida ->");
                System.out.println("<- =============== ->\n");
            }
        }
    }
    public void close(){
    }
}
