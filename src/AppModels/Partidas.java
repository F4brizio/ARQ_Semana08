package AppModels;
import com.sun.xml.internal.ws.wsdl.writer.document.Part;
import datos.Servicio;

import java.util.ArrayList;
import java.util.UUID;

public class Partidas {
    Servicio srv = new Servicio();

    private final ArrayList<Partida>listaPartidas = new ArrayList();
    private Partida partida;

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public static Partidas _this;
    private Partidas() {
        this.ObtenerListaPartidas();
    }
    public static Partidas getInstance(){
        if (_this == null){
            _this = new Partidas();
        }
        return _this;
    }

    public Partida CrearPartida(String name){
        String id = UUID.randomUUID().toString();
        AppModels.Partida partida = new Partida();
        partida.setNombre(name);
        partida.setId(id);
        this.listaPartidas.add(partida);
        this.partida = partida;
        return partida;
    }

    public void cargarPartida(Partida p){
        this.listaPartidas.add(p);
    }
    public ArrayList ObtenerListaPartidas(){
        this.listaPartidas.clear();
        srv.obtenerDatos(this);
        return this.listaPartidas;
    }

    public void delReg(String id) {
        System.out.println("delReg: "+id);
        srv.eliminarRegistro(id);
        this.listaPartidas.clear();
        srv.obtenerDatos(this);
    }
}
