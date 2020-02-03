package it.itis.cuneo;

import javax.xml.bind.annotation.XmlElement;
import java.util.Objects;

public class Camera {
    private String letto;
    private String bagno;
    private String vista;

    public Camera(){}

    public Camera(String letto, String bagno, String vista){
        super();
        this.letto = letto;
        this.bagno = bagno;
        this.vista = vista;
    }

    public String getLetto() {
        return letto;
    }

    @XmlElement
    public void setLetto(String letto) {
        this.letto = letto;
    }

    public String getBagno() {
        return bagno;
    }

    @XmlElement
    public void setBagno(String bagno) {
        this.bagno = bagno;
    }

    public String getVista() {
        return vista;
    }

    @XmlElement
    public void setVista(String vista) {
        this.vista = vista;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "letto='" + letto + '\'' +
                ", bagno='" + bagno + '\'' +
                ", vista='" + vista + '\'' +
                '}';
    }

    public String toXml() {
        return  "\t<camera nome=\""+ letto + "\">" +
                "\n\t\t<bagno>" + bagno + "</bagno>\n" +
                "\t\t<vista>" + vista + "</vista>\n"+
                "\t</camera>\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Camera camera = (Camera) o;
        return Objects.equals(letto, camera.letto) &&
                Objects.equals(bagno, camera.bagno) &&
                Objects.equals(vista, camera.vista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(letto, bagno, vista);
    }
}
