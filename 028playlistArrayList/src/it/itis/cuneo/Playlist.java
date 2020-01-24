package it.itis.cuneo;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private List<Brani> brani;

    public Playlist(List<Brani> brani) {
        super();
        this.brani = brani;
    }

    public Playlist() {
        super();
        brani = new ArrayList<>();
    }

    public void song(List<Brani> brani){this.brani = brani;}

    public void simula(){
        Brani song1 = new Brani(titolo,autore,2.5);
        Brani song2 = new Brani(titolo2,autore,1.5);
        System.out.println(song1);
        System.out.println(song2);
    }

    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.simula();
    }


}
