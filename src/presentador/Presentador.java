
package presentador;

import app.LogicaNegocio;
import app.Partida;

public class Presentador {
    private LogicaNegocio logic = new LogicaNegocio();
    
    public void guardar(Partida p){
        logic.iniciarAdminPartidas(p);
    }
}
