package app;

public class Partida {

    private IJugador[] oponentes = new IJugador[2];
    private int nPartidas = 0;
    private  int  id;
    private String nombre;

    public Partida(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    public void setOponentes(IJugador a, IJugador b) {
        oponentes[0] = a;
        oponentes[1] = b;

    }
    /*
    - Obtiene la jugada de los dos jugadores
    - crea logica de quien gana a quien
    - Aumenta el puntaje al jugadoor.
    - aumenta nPartida
     */
    public void EvaluarJugada(){
     if (oponentes[0].getJugada().equals("PIEDRA") && oponentes[1].equals("PAPEL")){
         // oponente [1] gana
         oponentes[1].setPuntaje(oponentes[1].getPuntaje()+1);
     }else if (oponentes[0].getJugada().equals("PAPEL") && oponentes[1].equals("PIDRA")){
         // oponente [0] gana
         oponentes[0].setPuntaje(oponentes[0].getPuntaje()+1);
     }

        if (oponentes[0].getJugada().equals("PAPEL") && oponentes[1].equals("TIJERA")){
            // oponente [1] gana
            oponentes[1].setPuntaje(oponentes[1].getPuntaje()+1);
        }else if (oponentes[0].getJugada().equals("TIJERA") && oponentes[1].equals("PAPEL")){
            // oponente [0] gana
            oponentes[0].setPuntaje(oponentes[0].getPuntaje()+1);
        }

        if (oponentes[0].getJugada().equals("PIEDRA") && oponentes[1].equals("TIJERA")){
            // oponente [1] gana
            oponentes[1].setPuntaje(oponentes[1].getPuntaje()+1);
        }else if (oponentes[0].getJugada().equals("TIJERA") && oponentes[1].equals("PIEDRA")){
            // oponente [0] gana
            oponentes[0].setPuntaje(oponentes[0].getPuntaje()+1);
        }
         this.nPartidas++;
    }
    /*
    Analiza puntaje de oponentes
    Determina si hay ganador
    Evalua nPartidas
     */
    public void EvalularPartidad(){
     if (this.nPartidas == 5){
                 if(oponentes[0].getPuntaje() == oponentes[1].getPuntaje()){
                     // empate
                 }else if (oponentes[0].getPuntaje() > oponentes[1].getPuntaje()){
                     // oponente[0] gana
                 }else {
                     // oponente[1] gana
                 }


     }



    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
