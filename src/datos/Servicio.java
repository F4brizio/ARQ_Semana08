package datos;
import AppModels.Partida;
import AppModels.Partidas;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Servicio {

    public void guardar(Partida p) {
        try {
            BufferedWriter bw = Files.newBufferedWriter(Paths.get("D:/files/partidas.txt"), StandardOpenOption.APPEND);
            String line= String.valueOf(p.getId()) + "," + p.getNombre();
            bw.write(line);
            bw.newLine();
            bw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }     
    }

    public Partidas getPartidas() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
