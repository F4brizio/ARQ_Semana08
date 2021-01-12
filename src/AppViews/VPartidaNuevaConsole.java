package AppViews;

import AppControllers.CPartidaNueva;

import java.util.Scanner;

public class VPartidaNuevaConsole {
    CPartidaNueva controller;
    private Scanner teclado = new Scanner(System.in);
    public VPartidaNuevaConsole(CPartidaNueva controller) {
        this.controller = controller;
    }
    public void init(){

        boolean opcLoop = true;
        while (opcLoop){
            System.out.println("¿Seguro que quiere crear una partida?");
            System.out.println("(1) Si, crear Partida");
            System.out.println("(2) Cancelar");
            int opc;
            opc = teclado.nextInt();
            if (opc == 1){
                opcLoop = false;
                System.out.println("<- =============== ->");
                System.out.println("<-  Crear Partida  ->");
                System.out.println("<- =============== ->\n");


                boolean opcLoopName = true;
                String namep = null;
                while (opcLoopName){
                    System.out.println("Asignar un nombre a la partida:");
                    namep = teclado.next();
                    if (namep != null){
                        opcLoopName = false;
                    }
                }
                boolean opcLoopType = true;
                String Modalidad = null;
                while (opcLoopType){
                    System.out.println("Modalidad de juego:");
                    System.out.println("(1) Persona vs Persona");
                    System.out.println("(2) Persona vs Maquina");
                    Integer opcModalidad;
                    opcModalidad = teclado.nextInt();
                    if (opcModalidad == 1){
                        Modalidad = "PvsP";
                        opcLoopType = false;
                    }else if(opcModalidad == 2){
                        Modalidad = "PvsM";
                        opcLoopType = false;
                    }else{
                        System.out.println("<- =============== ->");
                        System.out.println("<- Opcion Invalida ->");
                        System.out.println("<- =============== ->\n");
                    }
                }
                this.controller.create(namep, Modalidad);

            }else if (opc == 2){
                opcLoop = false;
                System.out.println("<- =============== ->");
                System.out.println("<- Cancelar  ->");
                System.out.println("<- =============== ->\n");
                this.controller.cancel();
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
