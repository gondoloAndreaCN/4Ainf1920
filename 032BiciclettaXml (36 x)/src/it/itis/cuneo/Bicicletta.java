package it.itis.cuneo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Bicicletta {
    public static final String FILE_PATH = "E:\\scuola\\4_AINF\\Informatica\\esercizi_intellij\\032Bicicletta (36)\\src\\Bicicletta.xml";
    public String telaio;
    public String cambio;
    public String freno;
    private List<Bicicletta> bicicletta;

    public Bicicletta(){}

    public Bicicletta(String telaio, String cambio, String freno){
        super();
        this.telaio = telaio;
        this.cambio = cambio;
        this.freno = freno;
        this.bicicletta = new ArrayList<Bicicletta>();
    }

    public void add(Ruota ruota){
        bicicletta.add((Bicicletta) bicicletta);
    }


    public String getTelaio() {
        return telaio;
    }

    @XmlElement(name = "Telaio")
    public void setTelaio(String telaio) {
        this.telaio = telaio;
    }

    public String getCambio() {
        return cambio;
    }

    @XmlElement(name = "Cambio")
    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public String getFreno() {
        return freno;
    }

    @XmlElement(name = "Freno")
    public void setFreno(String freno) {
        this.freno = freno;
    }

    public List<Bicicletta> getBicicletta() {
        return bicicletta;
    }

    @XmlElement
    public void setBicicletta(List<Bicicletta> bicicletta) {
        this.bicicletta = bicicletta;
    }

    @Override
    public String toString() {
        return "Bicicletta{" +
                "telaio='" + telaio + '\'' +
                ", cambio='" + cambio + '\'' +
                ", freno='" + freno + '\'' +
                ", bicicletta=" + bicicletta +
                '}';
    }

    public String toXml() {
        String xml="";
        for(Bicicletta bicicletta : this.bicicletta){
            xml += bicicletta.toXml();
        }
        xml = "<bicicletta>\n" + xml + "</bicicletta>";
        return xml;
    }

    public void scriviXml(){
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(FILE_PATH));
            bw.write(this.toXml());
            System.out.println(this.toXml());
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void marshallingXml(){
        try {
            File file = new File(Bicicletta.FILE_PATH);
            JAXBContext jaxbContext = JAXBContext.newInstance(Bicicletta.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(this, file);
            jaxbMarshaller.marshal(this, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    private void simula(){
        Bicicletta bicicletta1 = new Bicicletta("telaio","cambio", "freno");
        Ruota ruota1 = new Ruota("anteriore", "posteriore");
        Bicicletta bicicletta2 = new Bicicletta("telaio","cambio", "freno");
        Ruota ruota2 = new Ruota("anteriore", "posteriore");
        Bicicletta bicicletta3 = new Bicicletta("telaio","cambio", "freno");
        Ruota ruota3 = new Ruota("anteriore", "posteriore");
    }

    public static void main(String[] args) {
        Bicicletta bicicletta = new Bicicletta();

        bicicletta.simula();
        bicicletta.scriviXml();
    }
}
