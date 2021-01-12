package AppModels;

public class Partida {

    private IJugador[] oponentes = new IJugador[2];
    private int nPartidas = 0;
    private  Integer  id;
    private String nombre;

    public int getnPartidas() {
        return nPartidas;
    }

    public void setnPartidas(int nPartidas) {
        this.nPartidas = nPartidas;
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

    public IJugador[] getOponentes(){
        return this.oponentes;
    }

    /*
    - Obtiene la jugada de los dos jugadores
    - crea logica de quien gana a quien
    - Aumenta el puntaje al jugadoor.
    - aumenta nPartida
     */
    public void EvaluarJugada(){
    System.out.println(oponentes[0].getJugada() + " - " + oponentes[1].getJugada());
     if ((oponentes[0].getJugada() == Elemento.PIEDRA) && (oponentes[1].getJugada() == Elemento.PAPEL)){
         System.out.println(" oponente [1] gana ");
         oponentes[1].setPuntaje(oponentes[1].getPuntaje()+1);
     }else if (oponentes[0].getJugada() == Elemento.PAPEL && oponentes[1].getJugada() == Elemento.PIEDRA){
         System.out.println(" oponente [0] gana ");
         oponentes[0].setPuntaje(oponentes[0].getPuntaje()+1);
     }

        if (oponentes[0].getJugada() == Elemento.PAPEL && oponentes[1].getJugada() == Elemento.TIJERA){
            System.out.println(" oponente [1] gana ");
            oponentes[1].setPuntaje(oponentes[1].getPuntaje()+1);
        }else if (oponentes[0].getJugada() == Elemento.TIJERA && oponentes[1].getJugada() == Elemento.PAPEL){
            System.out.println(" oponente [0] gana ");
            oponentes[0].setPuntaje(oponentes[0].getPuntaje()+1);
        }

        if (oponentes[0].getJugada() == Elemento.PIEDRA && oponentes[1].getJugada() == Elemento.TIJERA){
            System.out.println(" oponente [1] gana ");
            oponentes[1].setPuntaje(oponentes[1].getPuntaje()+1);
        }else if (oponentes[0].getJugada() == Elemento.TIJERA && oponentes[1].getJugada() == Elemento.PIEDRA){
            System.out.println(" oponente [0] gana ");
            oponentes[0].setPuntaje(oponentes[0].getPuntaje()+1);
        }
         this.nPartidas++;
    }
    /*
    Analiza puntaje de oponentes
    Determina si hay ganador
    Evalua nPartidas
     */
    public boolean EvalularPartidad(){
        if (this.nPartidas == 5){
            if(oponentes[0].getPuntaje() == oponentes[1].getPuntaje()){
             System.out.println("empate");
            }else if (oponentes[0].getPuntaje() > oponentes[1].getPuntaje()){
             System.out.println("oponente[0] gana");
            }else {
             System.out.println("oponente[1] gana");
            }
            return true;
        }
        return false;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
