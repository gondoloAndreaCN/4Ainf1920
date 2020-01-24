package it.itis.cuneo;

public class Brani {
    private String titolo;
    private String autore;
    private double durata;

    public Brani() {
    }

    public Brani(Brani brani){
        brani.titolo = titolo;
        brani.autore = autore;
        brani.durata = durata;
    }

    public Brani(String titolo, String autore, double durata) {
        super();
        this.titolo = titolo;
        this.autore = autore;
        this.durata = durata;
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

    public double getDurata() {
        return durata;
    }

    public void setDurata(double durata) {
        this.durata = durata;
    }

    @Override
    public String toString() {
        return "Brani{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", durata=" + durata +
                '}';
    }
}
