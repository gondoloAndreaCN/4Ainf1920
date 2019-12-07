package it.itis.cuneo;

public class BarcaVela extends Barca{

    public BarcaVela(String nome, String nazionalita, int lunghezza, int stazza) {
        super(nome, nazionalita, lunghezza, stazza);
    }

    public BarcaVela() {
        super();
    }

    @Override
    public String toString() {
        return "BarcaVela{}" + super.toString();
    }

}