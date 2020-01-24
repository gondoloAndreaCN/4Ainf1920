package it.itis.cuneo;

/**
 * Created by inf.gondoloa1112 on 21/12/2019.
 */
public class Fornaio implements Pasticciere {

    private boolean isfornoFuocoAcceso;

    @Override
    public void accendiForno() {
        isfornoFuocoAcceso = true;
    }

    @Override
    public void riempiMagazzino() {

    }
}
