package it.itis.cuneo;

public class Quadrato implements Poligono{
    private double lato;

    public Quadrato(double lato) {
        this.lato = lato;
    }

    public double calcolaArea() {
        return lato*lato;
    }
}
