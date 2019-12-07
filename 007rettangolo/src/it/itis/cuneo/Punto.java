package it.itis.cuneo;


/**
 * Created by inf.gondoloa1112 on 07/10/2019.
 */
public class Punto {

    //attributo
    private int x;
    private int y;

    //metodi
    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Punto(Punto p){
        x = p.getX();
        y = p.getY();
    }

    public Punto(){super();}

    public void setX(int x){
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getY(){
        return y;
    }

    public boolean equals(Punto punto){
        boolean equals = false;
    }

    public String toString(){
        return "Punro{\"x\":" + x + "," + "\"y\": " + y + "}";
    }

    public static void main(String[] args){
        //punto a e punto b referenziano due aree di memoria diverse
        Punto puntoA = new Punto(4,6);
        Punto puntoB = new Punto(puntoA);
        //punto b è una copia di punota per il suo stato ma sonon fisicamente in due aree di memoria diverse

        //punto a e punto c referenziano come handler alla stessa area di memoria
        Punto puntoC = puntoA;

        Punto puntoD = new Punto();
        // se il richiamo al costruttore non viene svolto ho il null pointer
        Punto puntoE = new Punto();

        System.out.println(puntoE.toString());

        System.out.println(puntoD.toString());
    }


}
