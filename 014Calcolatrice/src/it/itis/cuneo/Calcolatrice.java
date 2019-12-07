package it.itis.cuneo;

import java.lang.Double;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.ToDoubleBiFunction;

public class Calcolatrice {

    //attributi
    private static InputStreamReader r = new InputStreamReader(System.in);
    private static BufferedReader br = new BufferedReader(r);

    //metodi
    public static String input(){
        String n = null;

        System.out.println("inserisci il valore:");
        try {
            n = br.readLine();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return n;
    }

    public static Double som(double a,double b){
        Double somm = 0.0d;
        somm = a + b;
        return somm;
    }
    public static Double sot(double a,double b){
        Double sot = 0.0d;
        sot = a - b;
        return sot;
    }
    public static Double mol(double a,double b){
        Double mol = 0.0d;
        mol = a * b;
        return mol;
    }
    public static Double div(double a,double b){
        Double div = 0.0d;
        div = a / b;
        return div;
    }


    public static void main(String[] args) {
        Double a = 0.0d,b = 0.0d;
        Double somma,sottrazione,moltiplicazione,divisione;

        a = Double.parseDouble(input());
        b = Double.parseDouble(input());

        try{
            double c = a/b;
        }catch(AbstractMethodError e){
            System.out.println("Divisione non possibile");
            b = Double.parseDouble(input());
        }finally {

        }

        somma = Calcolatrice.som(Double a, Double b);
        sottrazione = Calcolatrice.som(Double a, Double b);
        moltiplicazione = Calcolatrice.som(Double a, Double b);
        divisione = Calcolatrice.som(Double a, Double b);

        System.out.println("somma dei valori: " + somma);
        System.out.println("diferenza dei valori" + sottrazione);
        System.out.println("moltilpicazione dei valori" + moltiplicazione);
        System.out.println("divisione dei valori" + divisione);

    }

}
