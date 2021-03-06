package it.itis.cuneo;

import javax.xml.bind.*;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by inf.gondoloa1112 on 30/01/2020.
 */

@XmlRootElement
public class Classe {

    //public static final String PATH_FILE= "D:\\scuola\\4_AINF\\Informatica\\esercizi_intellij\\031ProgettoClasseScuola (35)\\xml\\classe.xml";
    public static final String PATH_FILE_WRITE= "D:\\scuola\\4_AINF\\Informatica\\esercizi_intellij\\031ProgettoClasseScuola (35)\\xml\\classeWrite.xml";

    private String name;
    private List<Allievo> lAllievo;
    //private ArrayList<Allievo> lAllievo;

    public void addAllievo(Allievo allievo){
        this.lAllievo.add(allievo);
    }

    //jaxb costruttori vuoti
    public Classe(){
        this.name="";
        this.lAllievo = new ArrayList<Allievo>();
    }

    public String getName() {
        return name;
    }

    @XmlAttribute
    public void setName(String name) {
        this.name = name;
    }

    public List<Allievo> getlAllievo() {
        return lAllievo;
    }

    //@XmlElement(name="Allievo")
    @XmlElement
    public void setlAllievo(List<Allievo> lAllievo) {
        this.lAllievo = lAllievo;
    }

    public void unMarshallXml(){
        File file = new File(PATH_FILE_WRITE);
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Classe.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Classe classe = (Classe)jaxbUnmarshaller.unmarshal(file);

            System.out.println(classe.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    private void simula() {
        Allievo allievo1 = new Allievo("Rossi","Mario","7","5","6");
        this.addAllievo(allievo1);
        Allievo allievo2 = new Allievo("Bianchi","Luca","7","5","6");
        this.addAllievo(allievo1);
        Allievo allievo3 = new Allievo("Neri","Paolo","7","5","6");
        this.addAllievo(allievo1);
        this.setName("4AINF");
    }

    public void MarshallXml(){
        try {
        File file = new File(PATH_FILE_WRITE);
        JAXBContext jaxbContext = JAXBContext.newInstance(Classe.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);

            /*this: riferimento alla classe*/
            jaxbMarshaller.marshal(this, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Classe{" +
                "name='" + name + '\'' +
                ", lAllievo=" + lAllievo +
                '}';
    }

    public static void main(String[] args) {
        Classe classe = new Classe();

        classe.simula();
        classe.MarshallXml();
    }



}
