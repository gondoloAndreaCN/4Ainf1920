package it.itis.cuneo;

import java.lang.String;

public class Persona {
    //attributi
    private int eta;
    private String nome;
    private String sesso;
    private String professione;

    //metodi
    public Persona(int eta, String nome, String sesso, String professione){
        this.eta = eta;
        this.nome = nome;
        this.sesso = sesso;
        this.professione = professione;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public int getEta() {
        return eta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public String getSesso() {
        return sesso;
    }

    public void setProfessione(String professione) {
        this.professione = professione;
    }

    public String getProfessione() {
        return professione;
    }

    public String chiSei(){return "<<Sono una persona di nome:" + nome + ", sesso:" + sesso +
            ", età:" + eta +", professione:" + professione + ">>";}

    public static void main(String[] args) {
        Persona persona = new Persona(25,"luca","maschio","impiegato");
        System.out.println(persona.chiSei());
    }
}
