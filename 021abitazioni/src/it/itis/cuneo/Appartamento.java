package it.itis.cuneo;

public class Appartamento extends Abitazione{

    private int piano;
    private boolean ascensore;
    private int nTerrazzi;

    public Appartamento(){}

    public Appartamento(int piano, boolean ascensore, int nTerrazzi) {
        this.piano = piano;
        this.ascensore = ascensore;
        this.nTerrazzi = nTerrazzi;
    }

    public Appartamento(int nStanze, float superficie, String indirizzo, String citta, int piano, boolean ascensore, int nTerrazzi) {
        super(nStanze, superficie, indirizzo, citta);
        this.piano = piano;
        this.ascensore = ascensore;
        this.nTerrazzi = nTerrazzi;
    }

    public Appartamento(Abitazione abitazione, int piano, boolean ascensore, int nTerrazzi) {
        super(abitazione);
        this.piano = piano;
        this.ascensore = ascensore;
        this.nTerrazzi = nTerrazzi;
    }

    public int getPiano() {
        return piano;
    }

    public void setPiano(int piano) {
        this.piano = piano;
    }

    public boolean isAscensore() {
        return ascensore;
    }

    public void setAscensore(boolean ascensore) {
        this.ascensore = ascensore;
    }

    public int getnTerrazzi() {
        return nTerrazzi;
    }

    public void setnTerrazzi(int nTerrazzi) {
        this.nTerrazzi = nTerrazzi;
    }

    public String toString(){
        return  "Appartamento" + super.toString()+
                ", piano=" + piano +
                ", ascensore=" + ascensore +
                ", nTerrazzi=" + nTerrazzi +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        boolean ret = true;
        if (o == null || getClass() != o.getClass())
            ret = false;
        if (!super.equals(o))
            ret = false;

        Appartamento that = (Appartamento) o;


        if(ret) {

            if (piano != that.piano)
                ret = false;
            if (ascensore != that.ascensore)
                ret = false;
            if (nTerrazzi != that.nTerrazzi)
                ret = false;
        }
        return ret;

    }


}
