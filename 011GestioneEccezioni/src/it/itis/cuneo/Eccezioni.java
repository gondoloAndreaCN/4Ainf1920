package it.itis.cuneo;
import java.lang.Exception;

public class Eccezioni {

    public Eccezioni() {

    }

    public void metodo() throws Exception{

    }

    public static void main(String[] args) throws Exception {
        Eccezioni eccezioni = new Eccezioni();
        int divisore = 0;
        int quoziente = 0;
        int i;
        for (i=0;i<5;i++){
            int dividendo = i++;
            try{
                quoziente = dividendo / divisore;
                System.out.println("Quoziente: " + quoziente);
            }catch (Exception ex){
                System.out.println("Eccezione");
            }finally {
                System.out.println("fine");
            }
        }



        eccezioni.metodo();
    }
}
