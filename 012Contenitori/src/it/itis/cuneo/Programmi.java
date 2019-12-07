package it.itis.cuneo;

public class Programmi {
    //attributi
    private String denominazione;
    private String produttore;
    private String versione;
    private String sistema;
    private int anno;

    //metodi
    public Programmi(String denominazione, String produttore, String versione, String sistema, int anno) {
        this.denominazione = denominazione;
        this.produttore = produttore;
        this.versione = versione;
        this.sistema = sistema;
        this.anno = anno;
    }

    public Programmi(Programmi programmi) {
        denominazione = programmi.getDenominazione();
        produttore = programmi.getProduttore();
        versione = programmi.getVersione();
        sistema = programmi.getSistema();
        anno = programmi.getAnno();
    }

    public Programmi() {

    }

    public String getDenominazione() {
        return denominazione;
    }

    public String getProduttore() {
        return produttore;
    }

    public String getVersione() {
        return versione;
    }

    public String getSistema() {
        return sistema;
    }

    public int getAnno() {
        return anno;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public void setVersione(String versione) {
        this.versione = versione;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public String toString() {
        return "{Denominazione:" + denominazione + ", Produttore:" + produttore + " , Verisone:" + versione + ", Sistema:" + sistema + ", Anno:" + anno + "}";
    }

    public String compareAnno(Programmi programmi){
        String anno = "Il programma " + this.denominazione;

        if(this.anno > programmi.getAnno()){
            anno += " è più recente ";
        }else{
            if(this.anno == programmi.getAnno()){
                anno += " è uguale ";
            }else{
                anno += " è più vecchio ";
            }
        }

        anno += " del programma " + programmi.getDenominazione();

        return anno;
    }

    public static void main(String[] args) {
        Programmi programmi = new Programmi("office","Microsoft","8.1","windows",2019);
        Programmi programmi1 = new Programmi("boh","casa","la più bella","qualsiasi tranne apple",2020);
        System.out.println("primo programma:" + programmi.toString());
        System.out.println("Secondo programa:" + programmi1.toString());

        System.out.println(programmi.compareAnno(programmi1));
    }
}