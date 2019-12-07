package it.itis.cuneo;

import javax.sound.midi.SysexMessage;

/**
 * Created by inf.gondoloa1112 on 30/09/2019.
 */
public class EseguiConversioni {

    //metodi

    //esempio di conversione tra wrapper partenod da un prumitivo
    public static void main(String[] args) {

        //float: è un tipo primitivo, cioè una variabile semplice
        //Float: è una classe wrapper, contiene un primitivo dello steso tipo e i metodi che permettono di lavorarci sopra

        Float f;
        f = new Float(0.52d);

        // System.out.println(String s)

    /*
        la firma del metodo sopra richiede una stringa come parametro
        quindi il float viene convertito in stringa al momento della chiamata
     */

        //System.out.println(float fPrimitivo)

    /*
        conversione automatica / cast implicito, nel caso della firma sopra usiamo Float wrapper,
        ma il metodo si aspetta un float primitivo --> avviene un cast implicito
    */

        //firma del metodo: nome del metodo e i tipi degli attributi nell'ordine considerato

        System.out.println(f);

        int n;
        n = Integer.parseInt("6");
        System.out.println(n);

        String quanteMele = "8";
        n = Integer.parseInt("6");
        System.out.println(n);

        Float ogF;
        ogF = new Float(n);
        String s2;
        s2 = "" + ogF;
        System.out.println("s2 =\"\" + ogF: " +s2);
        s2 = new String("s2 = new String (\"\" + ogf)" +s2);
        s2 = ogF.toString();
        System.out.println("s2 = ogF.toString(): " + s2);

        //double --> Integer
        double dN = 6.5d;   //la "d" serve per definire il tipo della costante
        int intN = (int) dN; //intN = 6
        Integer iN = new Integer(intN);
        iN = intN;  //wrapper = primitivoDelloStessoTipo
    }
}