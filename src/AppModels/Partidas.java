package AppModels;
import com.sun.xml.internal.ws.wsdl.writer.document.Part;

import java.util.ArrayList;
import java.util.UUID;

public class Partidas {
    private final ArrayList<Partida>listaPartidas =new ArrayList();
    private Partida partida;

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public static Partidas _this;
    private Partidas() {}
    public static Partidas getInstance(){
        if (_this == null){
            _this = new Partidas();
        }
        return _this;
    }

    public Partida CrearPartida(String name){
        int id = this.listaPartidas.size();
        AppModels.Partida partida = new Partida();
        partida.setNombre(name);
        partida.setId(id);
        this.listaPartidas.add(partida);
        this.partida = partida;
        return partida;
    }

    private boolean GuardarPartida(){
        //Coneccion con presentador a la logica de negocio
        return false;
    }

    private boolean CancelarPartida(){
        try{
            this.partida = null;
            return true;
        }catch(Exception e){        
            return false;
        }
    }

    private Partida ObtenerPartida(Integer id){
        for (Partida p : listaPartidas) {
            if (p.getId()== id) {
                return p;
            }
        }
        return null;
    }
    public ArrayList ObtenerListaPartidas(){
        return this.listaPartidas;
    }

}