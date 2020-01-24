package it.itis.cuneo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Playlist implements List<T> {
    List<Brano> lista;
    private static int cont= 0;

    public Playlist(List<String> lista) {
        this.lista = new ArrayList<>(20);
    }

    public Playlist() {
    }

    public List<Brano> getLista() {
        return lista;
    }

    public void setLista(List<Brano> lista) {
        this.lista = lista;
    }

    private void aggiungi(Brano brano)
    {
        lista.add(brano);
        cont++;
    }

    private void elimina(Brano brano)
    {
        lista.remove(brano);
    }


    @Override
    public String toString() {
        return "Playlist{" +
                "lista=" + lista +
                '}';
    }

    public static void main(String[] args) {
        List list = new ArrayList(20);
        Brano brano = new Brano("Prova", "Io", "20" );
        Brano brano2 = new Brano("Pro2va", "I2o", "220" );
        Playlist playlist = new Playlist(list);
        playlist.aggiungi(brano);
        playlist.aggiungi(brano2);
        playlist.elimina(brano);
        System.out.println(playlist.toString());
    }
}
