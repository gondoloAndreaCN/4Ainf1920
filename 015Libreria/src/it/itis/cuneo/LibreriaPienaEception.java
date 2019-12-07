package it.itis.cuneo;

/**
 * Created by inf.gondoloa1112 on 30/10/2019.
 */
public class LibreriaPienaEception extends Exception {
    private int codice;
    private String descrizione;

    public LibreriaPienaEception(int codice, String descrizione) {
        this.codice = codice;
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "LibreriaPienaEception{" +
                "codice=" + codice +
                ", descrizione='" + descrizione + '\'' +
                '}';
    }
}
