package com.patrones;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.patrones.factory.SongFactory;
import com.patrones.playlist.Playlist;

public class App {

    private static final String[] songNames = new String[1000];
    private static final String[] artistNames = new String[1000];
    private static final String[] playListNames = new String[4100000];
    private static final List<Playlist> lists = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println(""
            + "Proceso de creación de listas de reproducción iniciado,\n"
            + "este proceso puede ser muy retrasado debido a la gran cantidad de objetos\n"
            + "que se creará, por favor espere un momento hasta que \n"
            + "sea notificado de que el proceso ha terminado..");

        Runtime runtime = Runtime.getRuntime();
        System.out.println("MaxMemory > " + (runtime.maxMemory()/1000000));
        SongFactory.enableFlyweight = true;
        InicializarArreglos();
        CrearListaDinamica();
        System.out.println("Total Listas > " + lists.size());
        
        long memoryUsed = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memoria Usada => " + (memoryUsed / 1000000));//
    }

    private static void CrearListaDinamica() {
        Random random = new Random();
        int p = 0;
        for (int c = 0; c < playListNames.length; c++) {
            Playlist playList = new Playlist(playListNames[c]);
            for (int i = 0; i < 10; i++) {
                int song = random.nextInt(songNames.length);
                playList.addSong(songNames[song], artistNames[song]);
            }
            lists.add(playList);
            if(c!=0 && (c+1)%(playListNames.length/10)==0){
                p+=10;
                System.out.println("Finalizado "+ p +"%");
                System.out.println("Listas Creadas " + lists.size());
            }
        }
    }
        
    private static void InicializarArreglos() {
        for (int c = 0; c < songNames.length; c++) {
            songNames[c] = "Song " + (c + 1);
            artistNames[c] = "Valentina " + (c+1);
        }

        for (int c = 0; c < playListNames.length; c++) {
            playListNames[c] = "PlayList " + (c + 1);
        }
    }
}
