package it.itis.cuneo;

import java.lang.String;

public class Angolo {

    //attributi
    private int g;
    private int p;
    private int s;

    //metodi
    public Angolo(int g, int p, int s){
        this.g = g;
        this.p = p;
        this.s = s;
    }

    public void setG(int g){this.g = g;}

    public int getG(){return g;}

    public void setP(int p){this.p = p;}

    public int getP(){return p;}

    public void setS(int s){this.s = s;}

    public int getS(){return s;}

    public String visualizzaAngolo(){
        return "gradi:" + g + ", primi:" + p + ", secondi:" + s;
    }

    public int aggiungiGradi(int aggGradi){
        if(this.g + aggGradi > 360){
            return 0;
        }else{
            this.g = this.g + aggGradi;
            return 1;
        }
    }

    public int aggiungiPrimi(int aggPrimi) {
        if (this.p + aggPrimi > 60) {
            return 0;
        } else {
            this.p = this.p + aggPrimi;
            return 1;
        }
    }

    public int aggiunngiSecondi(int aggSecondi){
        if(this.s + aggSecondi > 60){
            return 0;
        }else{
            this.s = this.s + aggSecondi;
            return 1;
        }
    }

    public int angoloSecondi(){
        return this.g * 3600 + this.p * 60 + this.s;
    }

    /*
    public int secondiAngolo(int sec){
        int secondi, int gradi,int primi;
        //% /
        secondi = sec / 60;
    }
    */

    public int differerenzaSecondi(Angolo angoloa){
        int differenza;
        if(angoloa.getS() > this.s){
            differenza = angoloa.getS() - this.s;
        }else{
            differenza = this.s - angoloa.getS();
        }
        return differenza;
    }

    public String sommaAngolo(Angolo angoloa) {
        int gradi = 0;
        int primi = 0;
        int secondi = 0;
        secondi = secondi + (this.s + angoloa.getS());
        if (secondi > 60) {
            primi = secondi - 60;
            secondi = 60;
        }
        primi = primi + (this.p + angoloa.getP());
        if (primi > 60) {
            gradi = primi - 60;
            primi = 60;
        }
        gradi = gradi + (this.g + angoloa.getG());
        if (gradi > 360) {
            return "la somma dei sue angoli supera i 360 gradi";
        } else {
            return "la somma dei due angoli avra gradi:" + gradi + ", primi:" + primi + ", secondi:" + secondi;
        }
    }

    public static void main(String[] args){
        Angolo angolo = new Angolo (30,20,50);
        Angolo angoloa = new Angolo (32,12,2);

        int valoreConferma;
        int aggGradi = 12;
        int aggPrimi = 20;
        int aggSecondi = 10;
        int differenza;

        System.out.println(angolo.visualizzaAngolo());

        valoreConferma = angolo.aggiungiGradi(aggGradi);
        if(valoreConferma == 0){
            System.out.println("errore: superati i 360 gradi");
        }
        valoreConferma = angolo.aggiungiPrimi(aggPrimi);
        if(valoreConferma == 0){
            System.out.println("errore: superati i 60 primi");
        }
        valoreConferma = angolo.aggiunngiSecondi(aggSecondi);
        if(valoreConferma == 0){
            System.out.println("errore: superati i 60 secondi");
        }

        System.out.println("l'angolo espresso in secondi risulta:" + angolo.angoloSecondi());

        differenza = angolo.differerenzaSecondi(angoloa);
        System.out.println("la differenza di secondi dei 2 angoli e':" + differenza);

        System.out.println(angolo.sommaAngolo(angoloa));
    }
}
