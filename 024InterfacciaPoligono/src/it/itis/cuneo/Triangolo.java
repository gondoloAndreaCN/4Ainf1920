package it.itis.cuneo;

public class Triangolo implements Poligono{
    private double base;
    public double altezza;

    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double calcolaArea() {
        return (base*altezza)/2;
    }
}
