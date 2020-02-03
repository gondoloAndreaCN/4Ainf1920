package it.itis.cuneo;

import javax.xml.bind.annotation.XmlElement;
import java.util.Objects;

public class Ruota {
    private String anterionre;
    private String posteriore;

    public Ruota(){}

    public Ruota(String anterionre, String posteriore){
        this.anterionre = anterionre;
        this.posteriore = posteriore;
    }

    public String getAnterionre() {
        return anterionre;
    }

    @XmlElement(name = "ruota1")
    public void setAnterionre(String anterionre) {
        this.anterionre = anterionre;
    }

    public String getPosteriore() {
        return posteriore;
    }

    @XmlElement(name = "ruota2")
    public void setPosteriore(String posteriore) {
        this.posteriore = posteriore;
    }

    @Override
    public String toString() {
        return "Ruota{" +
                "anterionre='" + anterionre + '\'' +
                ", posteriore='" + posteriore + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ruota ruota = (Ruota) o;
        return anterionre.equals(ruota.anterionre) &&
                posteriore.equals(ruota.posteriore);
    }

    public String toXml() {
        return "\t<ruote\">" +
                "\t\t<ruota>" + anterionre + "</ruota>\n" +
                "\t\t<ruota>" + posteriore + "</ruota>\n"+
                "\t</ruote>\n";
    }


}
