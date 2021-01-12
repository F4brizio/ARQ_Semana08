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
        this.oponentes[0] = a;
        this.oponentes[1] = b;
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
    public String EvaluarJugada(){

        String r = null;

    System.out.println(getOponentes()[0].getJugada() + " vs " + getOponentes()[1].getJugada());

    Elemento j1 = getOponentes()[0].getJugada();
    Elemento j2 = getOponentes()[1].getJugada();

    Elemento pi = Elemento.PIEDRA;
    Elemento pa = Elemento.PAPEL;
    Elemento ti = Elemento.TIJERA;

        if (j1 == pi && j2 == ti){
            r = ("Oponente 1 Gana Jugada");
            oponentes[0].setPuntaje(oponentes[0].getPuntaje()+1);
        }
        if (j1 == ti && j2 == pa){
            r = ("Oponente 1 Gana Jugada");
            oponentes[0].setPuntaje(oponentes[0].getPuntaje()+1);
        }
        if (j1 == pa && j2 == pi){
            r = ("Oponente 1 Gana Jugada");
            oponentes[0].setPuntaje(oponentes[0].getPuntaje()+1);
        }
        if (j2 == pi && j1 == ti){
            r = ("Oponente 2 Gana Jugada");
            oponentes[1].setPuntaje(oponentes[1].getPuntaje()+1);
        }
        if (j2 == ti && j1 == pa){
            r = ("Oponente 2 Gana Jugada");
            oponentes[1].setPuntaje(oponentes[1].getPuntaje()+1);
        }
        if (j2 == pa && j1 == pi){
            r = ("Oponente 2 Gana Jugada");
            oponentes[1].setPuntaje(oponentes[1].getPuntaje()+1);
        }
        if (j1 == j2){
            r = ("Empate en Jugada");
        }
        this.getOponentes()[0].JugadaTurno(null);
        this.getOponentes()[1].JugadaTurno(null);
         this.nPartidas++;
         return r;
    }
    /*
    Analiza puntaje de oponentes
    Determina si hay ganador
    Evalua nPartidas
     */
    public String EvalularPartidad(){
        if (this.nPartidas == 5){
            if(oponentes[0].getPuntaje() == oponentes[1].getPuntaje()){
                return "La partida termino en empate";
            }else if (oponentes[0].getPuntaje() > oponentes[1].getPuntaje()){
                return "Oponente 1 gana la partida!";
            }else {
                return "Oponente 2 gana la partida!";
            }
        }
        return null;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
