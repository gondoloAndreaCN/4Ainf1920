package it.itis.cuneo;

import sun.util.resources.cldr.mas.CalendarData_mas_KE;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringJoiner;

/**
 * Created by inf.gondoloa1112 on 21/10/2019.
 */
public class Casello {

    //attributi
    //calendar ha data ore minutie secondi
    private Calendar dataEntrata;
    private Calendar dataUscita;
    private String id;

    //metodi
    public void setDataEntrata(Calendar dataEntrata) {
        this.dataEntrata = dataEntrata;
    }

    public Calendar getDataEntrata() {
        return dataEntrata;
    }

    public void setDataUscita(Calendar dataUscita) {
        this.dataUscita = dataUscita;
    }

    public Calendar getDataUscita() {
        return dataUscita;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public Casello(Calendar dataEntrata, Calendar dataUscita, String id) {
        this.dataEntrata = dataEntrata;
        this.dataUscita = dataUscita;
        this.id = id;
    }

    public Casello() {

    }

    public Casello(Casello casello) {
        this.id = casello.getId();

        Calendar cDataEntrata = Calendar.getInstance();
        cDataEntrata.setTime(casello.getDataEntrata().getTime());
        this.dataEntrata = casello.getDataEntrata();

        Calendar cDataUscita = Calendar.getInstance();
        cDataUscita.setTime(casello.getDataUscita().getTime());
        this.dataUscita = casello.getDataUscita();
    }

    public static void main(String[] args) {
        //Stringa -> Data (SimpleDataFormat)
        //es.        23/10/2019 9:45 09:25:43
        //pattern    dd/MM/yyyy hh24:mm:ss
        //pattern:   stringa che definisce il formato della data di input

        Casello casello1 = new Casello();
        Casello casello2 = new Casello();

        final String FORMATO_DMY_HMS = "dd/MM/yyyy HH:mm:ss";
        String strDataPartenza = "29/08/2002 13:30:40";

        //calendar non usa il costruttore, maub metodo di generazione
        Calendar cDataEntrata = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_DMY_HMS);

        //parsificare una stringa secondo un formato permette di otenere una variablie di altro tipo
        //eccezione anomala del software che si verifica quando il codice genera un errore in tempo di esecuzione
        //parseException: la stringa non rispetta il formato atteso

        Date dataPartenza = null;

        try {
            dataPartenza = sdf.parse(strDataPartenza);
        } catch (ParseException e) {

            //errore formato della atringa
            //viene stampato uno stackTrace: una traccia dello stack
            // è l'elenco delle chiamate ai metodi

            e.printStackTrace();
        }catch(Exception ex){
            //intercetta le eccezioni
        }

        //calendar mantiene il numero di secondi dal 01/01/1970

        cDataEntrata.setTime(dataPartenza);

        String strData = sdf.format(dataPartenza);

        System.out.println("cDataEntrata: " + cDataEntrata);

        //System.out.println("cDataEntrata: " + sdf.format(cDataEntrata));


    }


}
