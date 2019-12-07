package it.itis.cuneo;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by inf.gondoloa1112 on 21/10/2019.
 */
public class TrattoAutostradale {

    //attributi
    private Casello caselloEntrata;
    private Casello caselloUscita;
    private int distanza;

    public TrattoAutostradale() {
    }

    public TrattoAutostradale(Casello caselloUscita, Casello caselloEntrata, int distanza) {
        this.caselloUscita = caselloUscita;
        this.caselloEntrata = caselloEntrata;
        this.distanza = distanza;
    }

    public TrattoAutostradale(TrattoAutostradale trattoAutostradale) {
        this.caselloUscita = new Casello(caselloUscita);
        this.caselloEntrata = new Casello (caselloEntrata);
        this.distanza = trattoAutostradale.getDistanza();
    }

    public double velocitaMedia(){
        double velocitaMedia =0;
        long nMilliSecondiUscita = caselloUscita.getDataUscita().getTimeInMillis();
        long nMilliSecondiEntrata = caselloEntrata.getDataEntrata().getTimeInMillis();

        velocitaMedia = (nMilliSecondiUscita -nMilliSecondiEntrata) / (distanza*1000);

        return velocitaMedia;
    }

    //metodi

    public Casello getCaselloEntrata() {
        return caselloEntrata;
    }

    public void setCaselloEntrata(Casello caselloEntrata) {
        this.caselloEntrata = caselloEntrata;
    }

    public Casello getCaselloUscita() {
        return caselloUscita;
    }

    public void setCaselloUscita(Casello caselloUscita) {
        this.caselloUscita = caselloUscita;
    }

    public int getDistanza() {
        return distanza;
    }

    public void setDistanza(int distanza) {
        this.distanza = distanza;
    }

    @Override
    public String toString() {
        return "TrattoAutostradale{" +
                "caselloEntrata=" + caselloEntrata +
                ", caselloUscita=" + caselloUscita +
                ", distanza=" + distanza +
                '}';
    }

    public static void main(String[] args) {

        Casello caselloIngresso  = new Casello();
        Calendar cdataIngresso =  InputOutputUtility.leggiDataOraCalendar("inserisci data d'ingresso (\"dd/MM/yyyy HH:mm:ss\")",InputOutputUtility.dfDayHour);
        caselloIngresso.setDataEntrata(cdataIngresso);

        Casello caselloUscita = new Casello();
        Calendar cdataUscita =  InputOutputUtility.leggiDataOraCalendar("inserisci data d'ingresso (\"dd/MM/yyyy HH:mm:ss\")",InputOutputUtility.dfDayHour);
        caselloIngresso.setDataEntrata(cdataUscita);

        TrattoAutostradale trattoAutostradale = new TrattoAutostradale(caselloUscita, caselloIngresso,50);

        double velocitaMedia = trattoAutostradale.velocitaMedia();
        System.out.println("velocita media: " + velocitaMedia);

    }
}
