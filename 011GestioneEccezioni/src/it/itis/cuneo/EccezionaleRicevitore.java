package it.itis.cuneo;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by inf.gondoloa1112 on 24/10/2019.
 */
public class EccezionaleRicevitore {

    public int divisione (int numeratore, int denominatore)throws ArithmeticException{
        int quoto = 0;

        quoto = numeratore / denominatore;

        return quoto;
    }

    public static void main(String[] args) {
        EccezionaleRicevitore eccezionaleRievitore = new EccezionaleRicevitore();

        try {

            eccezionaleRievitore.divisione(5,0);

        }catch(ArithmeticException aEx){

            System.out.println("catch(ArithmeticException aEx)");
            //aEx.printStackTrace();

        }catch(Exception ex){

            System.out.println("catch(Exception ex");
            ex.printStackTrace();

        }finally {

            System.out.println("NO, esco sempre bene");
        }

    }
}
