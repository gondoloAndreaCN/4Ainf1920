package it.itis.cuneo.backend;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement (name ="Playlist")//elemento radce dell'albero
public class Lettore {

    //Da modificare con il percorso ed il nome del file
	public static final String FILE_NAME = "D:\\scuola\\4_AINF\\Informatica\\esercizi_intellij\\030PlaylistXml2 (34 x)\\punti3.xml";
	private List<Playlist> percorso;

	public Lettore() {
		super();
        //inizializzazione di arreyList
		percorso = new ArrayList<Playlist>();
	}

	public void addPunto(Playlist playlist){
        //this.addPunto(Punto punto)
	    percorso.add(playlist);
    }

	public List<Playlist> getPercorso() {
		return percorso;
	}

	@XmlElement(name = "brani")
	public void setPercorso(List<Playlist> percorso) {
        this.percorso = percorso;
    }

    @Override
	public String toString() {
		return "Percorso [percorso=" + percorso + "]";
	}

	public String toXml() {
        String xml="";
        for(Playlist playlist : this.percorso){
            xml += playlist.toXml();
        }
        xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"+"\n"+"<percorso>\n" + xml + "</percorso>";
        return xml;
    }

    //scrivi xml
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
	
    //https://www.mkyong.com/java/jaxb-hello-world-example/
    public void marshallingXml(){
        try {
            //nome del file di uscita
            File file = new File(Lettore.FILE_NAME);
            //classe di cui è fatta la lista, per capire come specchiare l'oggetto
            //crea il contesto da cui nasce tutto, nuovo ambiente adatto alla classe percorso
            JAXBContext jaxbContext = JAXBContext.newInstance(Lettore.class);
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
            File file = new File(Lettore.FILE_NAME);
            JAXBContext jaxbContext = JAXBContext.newInstance(Lettore.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Lettore lettore = (Lettore) jaxbUnmarshaller.unmarshal(file);
            System.out.println(lettore);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

    //crea percorso
    private void simulaPercorso() {

        Playlist playlist1 = new Playlist("p1", song1 , song2);
        this.addPunto(playlist1);
        Playlist playlist2 = new Playlist("p2", song3, son4);
        this.addPunto(playlist2);
        Playlist playlist3 = new Playlist("p3", song5, son6);
        this.addPunto(playlist3);
        Playlist playlist4 = new Playlist("p4", song7, song8);
        this.addPunto(playlist4);

    }

    public static void main(String[] args) {
        Lettore lettore = new Lettore();

        lettore.simulaPercorso();
        //Metodo di scrittura basato sulle api dei file di testo già conosciuti
        //percorso.scriviXml();
        //Metodo di scrittura basato su jaxb
        lettore.marshallingXml();

        //Metodo di lettura e parser basato su jaxb
        //percorso.unmarshallingXml();
    }

	public void caricaTabella(DefaultTableModel tableModelPunti) {
		for(Playlist playlist : this.percorso) {
			tableModelPunti.addRow(new Object[] {playlist.getNome(), playlist.getBrano1(), playlist.getBrano2() });
		}
	}

}
