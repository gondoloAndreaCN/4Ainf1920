package it.itis.cuneo;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by inf.gondoloa1112 on 23/11/2019.
 */
public class Fratoio {

    /* Liste è un ArrayList<E>
       ArrayList<E> implemena List<E>
     */
    private List<Oliva> listaOlive;

    public Fratoio(){super();}

    public Fratoio(List<Oliva> listaOlive) {
        this.listaOlive = new ArrayList<Oliva>();
    }
}
