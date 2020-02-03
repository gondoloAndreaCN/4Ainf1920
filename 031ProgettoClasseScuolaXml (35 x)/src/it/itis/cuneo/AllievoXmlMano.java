package it.itis.cuneo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by inf.gondoloa1112 on 30/01/2020.
 */
public class AllievoXmlMano {
    private String cognome;
    private String nome;
    private String Informatica;
    private String Matematica;
    private String Storia;

    private AllievoXmlMano(){
    }

    public AllievoXmlMano(String cognome, String nome, String informatica, String matematica, String storia) {
        this.cognome = cognome;
        this.nome = nome;
        Informatica = informatica;
        Matematica = matematica;
        Storia = storia;
    }

    public String getCognome() {
        return cognome;
    }

    @XmlAttribute
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    @XmlAttribute
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInformatica() {
        return Informatica;
    }

    @XmlElement
    public void setInformatica(String informatica) {
        Informatica = informatica;
    }

    public String getMatematica() {
        return Matematica;
    }

    @XmlElement
    public void setMatematica(String matematica) {
        Matematica = matematica;
    }

    public String getStoria() {
        return Storia;
    }

    @XmlElement
    public void setStoria(String storia) {
        Storia = storia;
    }

    @Override
    public String toString() {
        return "Allievo{" +
                "cognome='" + cognome + '\'' +
                ", nome='" + nome + '\'' +
                ", Informatica='" + Informatica + '\'' +
                ", Matematica='" + Matematica + '\'' +
                ", Storia='" + Storia + '\'' +
                '}';
    }
}
