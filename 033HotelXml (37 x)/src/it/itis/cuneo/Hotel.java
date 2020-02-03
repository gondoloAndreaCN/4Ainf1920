package it.itis.cuneo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Hotel {
    public static final String FILE_NAME = "E:\\scuola\\4_AINF\\Informatica\\esercizi_intellij\\033Hotel\\src\\hotel.xml";
    public List<Camera> hotel;

    public Hotel(){}

    public Hotel(Hotel hotel){
        super();
        this.hotel = new ArrayList<Camera>();
    }

    public void addCamera(Camera camera){
        this.hotel.add(camera);
    }

    public List<Camera> getHotel() {
        return hotel;
    }

    @XmlElement
    public void setHotel(List<Camera> hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotel=" + hotel +
                '}';
    }

    public String toXml() {
        String xml="";
        for(Camera camera : this.hotel){
            xml += camera.toXml();
        }
        xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"+"\n"+"<percorso>\n" + xml + "</percorso>";
        return xml;
    }

    public void scriviXml(){
        BufferedWriter bw = null;
        try {
            //simulaPercorso();
            bw = new BufferedWriter(new FileWriter(FILE_NAME));
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
            //nome del file di uscita
            File file = new File(Hotel.FILE_NAME);
            //classe di cui è fatta la lista, per capire come specchiare l'oggetto
            //crea il contesto da cui nasce tutto, nuovo ambiente adatto alla classe percorso
            JAXBContext jaxbContext = JAXBContext.newInstance(Hotel.class);
            //crea marshaller tramite jaxbcontext(con singletone), marshaller = proprietà del context
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            //marshaller creato dal contesto, fare un output formattato
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            //fa il marshall sia sul file che sull'output in console
            jaxbMarshaller.marshal(this, file);
            jaxbMarshaller.marshal(this, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public void unmarshallingXml() {
        try {
            File file = new File(Hotel.FILE_NAME);
            JAXBContext jaxbContext = JAXBContext.newInstance(Hotel.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Hotel hotel = (Hotel) jaxbUnmarshaller.unmarshal(file);
            System.out.println(hotel);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

    public void simula(){
        Hotel hotel = new Hotel();
        Camera camera = new Camera("letto","bagno","vista");
        hotel.addCamera(camera);
        Camera camera1 = new Camera("letto","bagno","vista");
        hotel.addCamera(camera1);
        Camera camera2 = new Camera("letto","bagno","vista");
        hotel.addCamera(camera2);
    }

    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.simula();
        hotel.marshallingXml();
    }
}
