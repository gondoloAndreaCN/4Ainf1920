package it.itis.cuneo;

public class Barca {
    private String nome;
    private String nazionalita;
    private int lunghezza;
    private int stazza;

    public Barca(String nome, String nazionalita, int lunghezza, int stazza) {
        this.nome = nome;
        this.nazionalita = nazionalita;
        this.lunghezza = lunghezza;
        this.stazza = stazza;
    }

    public Barca() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNazionalita() {
        return nazionalita;
    }

    public void setNazionalita(String nazionalita) {
        this.nazionalita = nazionalita;
    }

    public int getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(int lunghezza) {
        this.lunghezza = lunghezza;
    }

    public int getStazza() {
        return stazza;
    }

    public void setStazza(int stazza) {
        this.stazza = stazza;
    }


    @Override
    public String toString() {
        return "Barca{" +
                "nome='" + nome + '\'' +
                ", nazionalita='" + nazionalita + '\'' +
                ", lunghezza=" + lunghezza +
                ", stazza=" + stazza +
                '}';
    }
}