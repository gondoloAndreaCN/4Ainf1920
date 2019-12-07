package it.itis.cuneo;

import java.util.Calendar;

public class Bottiglia {
    private String nome;
    private Double litri;
    private Calendar dataDIScadenza;

    public Bottiglia(String nome, int litri){

    }

    public Bottiglia(Bottiglia bottiglia){
        this.nome = bottiglia.getNome();
        this.litri = bottiglia.getLitri();
        this.dataDIScadenza = getDataDIScadenza();
    }

    public Bottiglia(String nome, double v) {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLitri(Double litri) {
        this.litri = litri;
    }

    public void setDataDIScadenza(Calendar dataDIScadenza) {
        this.dataDIScadenza = dataDIScadenza;
    }

    public Double getLitri() {
        return litri;
    }

    public String getNome() {
        return nome;
    }

    public Calendar getDataDIScadenza() {
        return dataDIScadenza;
    }


}
