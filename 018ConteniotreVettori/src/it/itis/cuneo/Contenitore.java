package it.itis.cuneo;

/**
 * Created by inf.gondoloa1112 on 07/11/2019.
 */
public class Contenitore {

    //attributi
    public static final int maxProgramma = 3;
    private Programmi[] vprogramma;
    private int cntprogramma;

    //metodi
    public Contenitore(){
        vprogramma = new Programmi[maxProgramma];
        cntprogramma = 0;
    }

    public void setCntprogramma(int cntprogramma) {
        this.cntprogramma = cntprogramma;
    }

    public void setVprogramma(Programmi[] vprogramma) {
        this.vprogramma = vprogramma;
    }

    public int getCntprogramma() {
        return cntprogramma;
    }

    public Programmi[] getVprogramma() {
        return vprogramma;
    }

    public Programmi getProgramma(int posizione){
        return this.vprogramma[posizione];
    }

    public void setProgramma(Programmi programma){

    }
}
