package it.itis.cuneo;

public class Mp3 {
    private String nome;
    private String autore;
    private String durata;


    public Mp3(String nome, String autore, String durata) {
        this.nome = nome;
        this.autore = autore;
        this.durata = durata;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getDurata() {
        return durata;
    }

    public void setDurata(String durata) {
        this.durata = durata;
    }

    public String toString() {
        return "Mp3{" +
                "nome='" + nome + '\'' +
                ", autore='" + autore + '\'' +
                ", durata='" + durata + '\'' +
                '}';
    }
}
