package it.itis.cuneo;

import java.lang.Math;

public class Punto {

    //attributi
    private float x;
    private float y;

    //metodi
    public Punto(float x, float y){
        this.x = x;
        this.y = y;
    }

    public void setX(float x){
        this.x = x;
    }

    public float getX(){
        return x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY(){
        return y;
    }

    public float distanza(Punto punto2){
        float distanza;
        distanza = (float) Math.sqrt(((punto2.getX() - this.x) * (punto2.getX() - this.x)) + ((punto2.getY() - this.y) * (punto2.getY() - this.y)));
        return distanza;
    }

    public boolean equals(Punto punto2){
        boolean uguale = false;
        if(this.x == punto2.getX() && this.y == punto2.getY()){
            uguale = true;
        }
        return uguale;
    }
    public String toString(){
        return "punto x:" + x + ", punto y:" + y;
    }

    public int quadrante(){
        int quadrante = 0;
        if(this.x > 0 && this.y > 0)
            quadrante = 1;
        else if(this.x < 0 && this.y > 0)
            quadrante = 2;
        else if(this.x < 0 && this.y < 0)
            quadrante = 3;
        else if(this.x > 0 && this.y < 0)
            quadrante = 4;
        return quadrante;
    }

    public static void main(String[] args){
        Punto punto = new Punto (3,4);
        Punto punto2 = new Punto (4,-6);

        float distanza;
        boolean uguale;
        int num;

        System.out.println("punto 1: " + punto.toString());
        System.out.println("punto 2: " + punto2.toString());

        distanza = punto.distanza(punto2);
        System.out.println("i due punti distano:" + distanza);
        uguale = punto.equals(punto2);
        if(uguale)
        {
            System.out.println("i due punti sono: uguali");
        }
        else
        {
            System.out.println("i due punti sono: diversi");
        }
        num = punto.quadrante();
        System.out.println("il punto A di trova nel quadrante: " + num);
        num = punto2.quadrante();
        System.out.println("il punto B di trova nel quadrante: " + num);
    }
}

