package it.itis.cuneo;

public class BarcaMotore extends Barca {

    public BarcaMotore(String nome, String nazionalita, int lunghezza, int stazza) {
        super(nome, nazionalita, lunghezza, stazza);
    }

    public BarcaMotore() {
        super();
    }

    @Override
    public String toString() {
        return "BarcaMotore{}" + super.toString();
    }

}
