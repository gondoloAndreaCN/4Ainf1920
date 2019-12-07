package it.itis.cuneo;

import java.util.Date;

/**
 * Created by inf.gondoloa1112 on 04/11/2019.
 */
public class Calendar {

    public Calendar(){}

    public static void main(String[] args) {
        System.out.println("oggi: " + new Date());

        Date doggi = new Date();
        System.out.println("oggi2: " + doggi);

        String strData = InputOutputUtility.leggiNome("inserisci la data (dd/mm/yyyy: ");

        /*strData -> dataTastiera(String ->date in che formato)*/
        Date dateTastiera = null;

        Date dataTastiera = InputOutputUtility.convertiDataOraToCalendar(strData, InputOutputUtility);

        Calendar cData = Calendar.getInstance();
        cdata.setTime(dataTastiera);

        Calendar cData2 = InputOutputUtility.convertiDataOraToCalendar(strData,InputOutputUtility.dfDay);
    }

}
