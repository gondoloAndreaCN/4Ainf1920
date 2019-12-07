package it.itis.cuneo;

import java.util.Calendar;

/**
 * Created by inf.gondoloa1112 on 30/10/2019.
 */
public class Libro {
    private String titolo;
    private String autore;
    private String isbn;
    private Calendar dataPubblicazione;

    public Libro(String pinochio, String s, String s1, Calendar calendar){

    }

    public Libro(Libro libro) {
        this.titolo = libro.getTitolo();
        this.isbn = libro.getIsbn();
        this.autore = libro.getAutore();
        this.dataPubblicazione = getDataPubblicazione();
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Calendar getDataPubblicazione() {
        return dataPubblicazione;
    }

    public void setDataPubblicazione(Calendar dataPubblicazione) {
        this.dataPubblicazione = dataPubblicazione;
    }

    public boolean equals(Libro libro){
        boolean bEquals = false;
        if(titolo.equals(libro.getTitolo())
                && autore.equals(libro.getAutore())
                && isbn.equals(libro.getAutore())
                &&this.dataPubblicazione.equals(libro.getDataPubblicazione()))
        {
            bEquals = true;
        }
        return bEquals;
    }
}
