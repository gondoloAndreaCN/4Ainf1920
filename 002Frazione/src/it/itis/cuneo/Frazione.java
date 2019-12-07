package it.itis.cuneo;

public class Frazione {
    //attributi
    private int numero;

    //metodi
    public Frazione(int numero){
        this.numero = numero;
    }
    public void steNum(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return this.numero;
    }

    //metodo richiamante la classe
    public static void main(String[] args]){
        float nu;
        float de;

        Frazione numeratore = new Frazione(8);
        Frazione denominatore = new Frazione(2);

        nu = numeratore.getNumero();
        de = denominatore.getNumero();

        System.out.println(nu);
        System.out.println(de);

        float nu2;
        float de2;

        Frazione numeratoreDue = new Frazione(2);
        Frazione denominatoreDue = new Frazione(4);

        nu2 = numeratoreDue.getNumero();
        de2 = denominatoreDue.getNumero();

        System.out.println(nu2);
        System.out.println(de2);

        float somma = ((nu/de)+(nu2/de2));
        System.out.println("la somma vale:");
        System.out.println(somma);

        float sottrazione = ((nu/de)-(nu2/de2));
        System.out.println("la sottazione vale:");
        System.out.println(sottrazione);

        float moltiplicazione = ((nu/de)*(nu2/de2));
        System.out.println("la moltiplicazione vale:");
        System.out.println(moltiplicazione);

        float divisione = ((nu/de)/(nu2/de2));
        System.out.println("la divisione vale:");
        System.out.println(divisione);
    }
}
