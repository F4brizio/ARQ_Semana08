package datos;

import AppModels.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.xml.bind.ParseConversionEvent;

public class Servicio {

    public void guardar(Partida p) {
        try {
            BufferedWriter bw = Files.newBufferedWriter(Paths.get(System.getProperty("user.dir")+"/partidas.txt"), StandardOpenOption.APPEND);
            IJugador opA =p.getOponentes()[0];
            IJugador opB =p.getOponentes()[1];
            String line= String.valueOf(p.getId()) + "," + p.getNombre()+","+String.valueOf(p.getnPartidas())+","+String.valueOf(opA.getTipo())+","+String.valueOf(opA.getPuntaje())+","+String.valueOf(opB.getTipo())+","+String.valueOf(opB.getPuntaje());
            System.out.println(line);
            bw.write(line);
            bw.newLine();
            bw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void obtenerDatos(Partidas c) {
        File archivo = new File(System.getProperty("user.dir")+"/partidas.txt");
        Scanner s = null;
        try {
            s = new Scanner(archivo);
            String[] datos = new String[7];
            while (s.hasNextLine()) {
                int i = 0;
                String linea = s.nextLine();
                StringTokenizer st = new StringTokenizer(linea, ",");
                while (st.hasMoreTokens()) {
                    datos[i] = st.nextToken();
                    i++;
                }
                int id = Integer.parseInt(datos[0]);
                Partida p = new Partida();
                p.setId(id);
                p.setNombre(datos[1]);
                int nPartidas = Integer.parseInt(datos[2]);
                p.setnPartidas(nPartidas);

                int pA = Integer.parseInt(datos[4]);
                int pB = Integer.parseInt(datos[6]);
                IJugador opA,opB;
                if("1".equals(datos[3])){opA = new Maquina();
                }else{opA = new Persona();}
                if("0".equals(datos[5])){opB = new Persona();
                }else{opB = new Maquina();}
                opA.setPuntaje(pA);
                opB.setPuntaje(pB);
                p.setOponentes(opA, opB);
                c.cargarPartida(p);
            }
            s.close();
        } catch (Exception e) {
            System.out.println("Error");
            System.out.println("Este "+ e.getMessage());
        }
    }

}
