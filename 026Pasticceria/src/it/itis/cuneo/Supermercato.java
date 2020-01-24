package it.itis.cuneo;

/**
 * Created by inf.gondoloa1112 on 21/12/2019.
 */
public class Supermercato implements Pasticciere{

    private int gradiForno;


    @Override
    public void accendiForno() {
        this.gradiForno = 180;
    }

    @Override
    public void riempiMagazzino() {

    }
}
