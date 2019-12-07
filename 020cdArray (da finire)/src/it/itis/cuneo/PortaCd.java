package it.itis.cuneo;

/**
 * Created by inf.gondoloa1112 on 13/11/2019.
 */
public class PortaCd {

    //attributi
    public static final int MAX_CD = 3;
    private  Cd[] portacd;
    private int nCD;
    private int conttatoreCd;

    public PortaCd(){}

    public PortaCd(Cd[] portacd, int nCD, int conttatoreCd) {
        this.portacd = portacd;
        this.nCD = nCD;
        this.conttatoreCd = conttatoreCd;
    }

    public Cd getCd(){
        return cd;
    }
}
