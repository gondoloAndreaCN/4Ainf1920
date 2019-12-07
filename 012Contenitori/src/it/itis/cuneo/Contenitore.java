package it.itis.cuneo;

import java.rmi.server.ExportException;

public class Contenitore {

    //attributi
    private Programmi oggetto1;
    private Programmi oggetto2;
    private Programmi oggetto3;
    private int n;

    //metodi

    //setter
    public void setOggetto1(Programmi oggetto1) {
        this.oggetto1 = oggetto1;
    }

    public void setOggetto2(Programmi oggetto2) {
        this.oggetto2 = oggetto2;
    }

    public void setOggetto3(Programmi oggetto3) {
        this.oggetto3 = oggetto3;
    }

    public void setN(int n) {
        this.n = n;
    }

    //getter

    public Programmi getOggetto1() {
        return oggetto1;
    }

    public Programmi getOggetto2() {
        return oggetto2;
    }

    public Programmi getOggetto3() {
        return oggetto3;
    }

    public int getN() {
        return n;
    }

    public Contenitore(Programmi oggetto1, Programmi oggetto2, Programmi oggetto3, int n) {
        this.oggetto1 = new Programmi(oggetto1);
        this.oggetto2 = new Programmi(oggetto2);
        this.oggetto3 = new Programmi(oggetto3);
        this.n = n;
    }

    public Contenitore(Contenitore contenitore){
        this.oggetto1 = getOggetto1();
        this.oggetto2 = getOggetto2();
        this.oggetto3 = getOggetto3();
        this.n = contenitore.getN();
    }

    public Programmi getProgamma(int pos) throws Exception{
        switch (pos){
            case 1:
                return new Programmi(this.oggetto1);
            case 2:
                return new Programmi(this.oggetto2);
            case 3:
                return new Programmi(this.oggetto3);
            default:
                throw new Exception("-1");
        }
    }

    public void setProgramma(Programmi programma){
        this.oggetto3 = new Programmi(programma);
    }

    public void killProgramma(int pos) throws Exception{
        switch (pos){
            case 1:
                this.oggetto1 = new Programmi();
                break;
            case 2:
                this.oggetto2 = new Programmi();
                break;
            case 3:
                this.oggetto3 = new Programmi();
                break;
            default:
                throw new Exception("-1");
        }
    }

    public int cercaProgramma(String cerca)throws Exception {
        if(this.oggetto1.getDenominazione().equals(cerca)) return 1;
        if(this.oggetto2.getDenominazione().equals(cerca)) return 2;
        if(this.oggetto3.getDenominazione().equals(cerca)) return 3;
        throw new Exception("-1");
    }

    public String toString(){
        return "{" + this.oggetto1.getDenominazione() + "," + this.oggetto3.getDenominazione() + "," + this.oggetto2.getDenominazione() + "," + this.oggetto3.getDenominazione() + "}";
    }



    public static void main(String[] args) {
        Programmi programmi1 = new Programmi("gta","rockstar","last version","windows",2013);
        Programmi programmi2 = new Programmi("battlefield 5","electronic arts","last version","windows",2018);
        Programmi programmi3 = new Programmi("war thunder", "gaijin","last version","windows",2012);
        int n = 3;

        Contenitore contenitore1 = new Contenitore(programmi1,programmi2,programmi3,n);

        int pos = 1;

        try{
            Programmi programmiRet = new Programmi(contenitore1.getProgamma(pos));
            System.out.println("Posizione del programma: " + pos);
        } catch (Exception e) {
            System.out.println("il programma non c'è");
            e.printStackTrace();
        }

        Programmi programmiIn = new Programmi("gioco","produttore","version","all", 2018);
        contenitore1.setProgramma(programmiIn);
        System.out.println("Programma creato: " + contenitore1.getOggetto1().toString());

        pos = 3;
        try {
            contenitore1.killProgramma(pos);
            System.out.println("Posizione del programma: " + pos);
        } catch (Exception e) {
            System.out.println("il programma non c'è");
            e.printStackTrace();
        }

        System.out.println("il contenitore contiene "+ contenitore1.getN() + " programi");

    }
}