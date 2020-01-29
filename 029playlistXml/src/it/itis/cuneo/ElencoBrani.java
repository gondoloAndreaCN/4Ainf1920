package it.itis.cuneo;

import javafx.fxml.FXML;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

/*import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
 */

@XmlRootElement(name = "ElencoBrani")
public class ElencoBrani extends ArrayList<Brano> {

    public List<Brano> getLista(){return this;}

    @XmlElement(name = "Brano")
    public void setLsta(List<Brano> lista){
        this.clear();
        this.addAll(lista);
    }
}
