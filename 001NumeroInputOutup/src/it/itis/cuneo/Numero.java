package it.itis.cuneo;



/**
 * Created by inf.gondoloa1112 on 21/09/2019.
 */
public class Numero {
    //attributi
    private int valore;

    //metodi
    public Numero(int valore){
        this.valore = valore;
    }
    public void setValore(int valore){
        this.valore = valore;
    }
    public int getValore(){
        return this.valore;
    }

    //metodo che richiama la classe come se fosse esterno
    public static void main(String args[]){
        int x;
        Numero numero = new Numero(5);
        x = numero.getValore();
        System.out.println(x);
    }
}

