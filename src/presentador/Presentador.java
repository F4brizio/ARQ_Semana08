
package presentador;

import AppModels.LogicaNegocio;
import AppModels.Partida;

public class Presentador {
    private LogicaNegocio logic = new LogicaNegocio();
    
    public void guardar(Partida p){
        logic.iniciarAdminPartidas(p);
    }
}
