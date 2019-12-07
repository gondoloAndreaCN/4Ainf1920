package it.itis.cuneo;

public class Vettore {

    //attributi
    private double x;
    private double y;
    private double x1;
    private double y1;

    //metodi
    public Vettore(){

    }

    public Vettore(double x,double y,double x1,double y1){
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
    }

    public Vettore(Vettore vettoreV){

    }

    public void setX(double x){
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setX1(double x1){
        this.x1 = x1;
    }

    public double getX1() {
        return x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY1(){
        return y1;
    }

    public boolean equals(Vettore vettore){
        boolean uguali = false;

        if(this.x == vettore.getX1() && this.y == vettore.getY1()){
            uguali = true;
        }
        return uguali;
    }

    /*public double lenght(){

    }*/

    public String toString(){
        return ;
    }

    public static void main(String[] args){
        Vettore vtettore = new Vettore();
        Vettore vettoreV = new Vettore();

    }
}
