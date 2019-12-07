package it.itis.cuneo;

public class Villa extends Abitazione{

    private int nPiani;
    private double supGiardino;
    private boolean piscina;

    public Villa(){}

    public Villa(int nPiani, double supGiardino, boolean piscina) {
        this.nPiani = nPiani;
        this.supGiardino = supGiardino;
        this.piscina = piscina;
    }

    public Villa(int nStanze, float superficie, String indirizzo, String citta, int nPiani, double supGiardino, boolean piscina) {
        super(nStanze, superficie, indirizzo, citta);
        this.nPiani = nPiani;
        this.supGiardino = supGiardino;
        this.piscina = piscina;
    }

    public Villa(Abitazione abitazione, int nPiani, double supGiardino, boolean piscina) {
        super(abitazione);
        this.nPiani = nPiani;
        this.supGiardino = supGiardino;
        this.piscina = piscina;
    }

    public int getnPiani() {
        return nPiani;
    }

    public void setnPiani(int nPiani) {
        this.nPiani = nPiani;
    }

    public double getSupGiardino() {
        return supGiardino;
    }

    public void setSupGiardino(float supGiardino) {
        this.supGiardino = supGiardino;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public String toString(){
        return "Villa" + super.toString() +
                "nPiani=" + nPiani +
                ", supGiardino=" + supGiardino +
                ", piscina=" + piscina +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        boolean ret = true;
        if (o == null || getClass() != o.getClass())
            ret = false;
        if (!super.equals(o))
            ret = false;

        Villa villa = (Villa) o;

        if(ret) {

            if (nPiani != villa.nPiani)
                ret = false;
            if (Double.compare(villa.supGiardino, supGiardino) != 0)
                ret = false;
            if (piscina != villa.piscina)
                ret = false;
        }
        return ret;
    }


}
