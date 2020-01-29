package it.itis.cuneo;

import javax.xml.bind.annotation.XmlAttribute;

public class Brano {

    private String titolo;
    private String autore;
    private double durata;

    @XmlAttribute
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public String getAutore() {
        return autore;
    }

    @XmlAttribute
    public void setAutore(String autore) {
        this.autore = autore;
    }
    public double getDurata() {
        return durata;
    }

    @XmlAttribute
    public void setDurata(float durata) {
        this.durata = durata;
    }


}
