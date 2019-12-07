package it.itis.cuneo;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by inf.gondoloa1112 on 07/10/2019.
 */
public class PianoCartesiano {

    //costanti
    public final static int MAX_X = 1000;
    public final static int MAX_Y = 1500;

    //attributo statico
    private static int ox = 0;
    private static int oy = 0;
    //attributi
    private Rettangolo rettangolo1;
    private Rettangolo rettangolo2;

    //metodi
    public boolean equals(PianoCartesiano pianoCartesiano){
        //@@// TODO: 09/10/2019
        return false;
    }

    public String toString(){
        String str="";
        str = "pianocartesiano{\"rettangolo\":" + rettangolo1 + "" + "\"rettangolo2\":" + rettangolo2 + "}";
        return str;
    }

    public PianoCartesiano(Rettangolo rettangolo1, Rettangolo rettangolo2){
        this.rettangolo1 = new Rettangolo(rettangolo1);
        this.rettangolo1 = new Rettangolo(rettangolo2);
    }

    public static void main(String[] args) {
        //static definisce una variabile condivisa tra tutte le istanze.
        //alle variabili statiche, tipo ox pianocartesiano si accede con il nome della classe, senza costruttore
        int Max = PianoCartesiano.MAX_X ; //costante solo in lettura (non modificabile)
        // se l'attributo private, occorre avere un setOx

        System.out.println("questa è la mia" + ox);
    }

}
