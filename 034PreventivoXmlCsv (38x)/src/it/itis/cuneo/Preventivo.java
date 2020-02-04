package it.itis.cuneo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@XmlRootElement
public class Preventivo {
    public static final String FILE_NAME = "E:\\scuola\\4_AINF\\Informatica\\esercizi_intellij\\034PreventivoXmlCsv (38)\\src\\Preventivo.csv";
    public static final String SEPARATOR = ";";
    public List<Preventivo> preventivo;
    public List<Cliente> cliente;

    public Preventivo() {
    }

    public Preventivo(List<Preventivo> preventivo, List<Cliente> cliente) {
        super();
        this.preventivo = new ArrayList<Preventivo>();
        this.cliente =new ArrayList<Cliente>();
    }

    public void add(Cliente cliente) {
        preventivo.add((Preventivo) preventivo);
    }

    public void aggiungiCliente(Cliente cliente) {
        this.cliente.add(cliente);
    }

    public List<Cliente> getCliente() {
        return cliente;
    }

    @XmlElement
    public void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }

    public List<Preventivo> getPreventivo() {
        return preventivo;
    }

    @XmlElement
    public void setPreventivo(List<Preventivo> preventivo) {
        this.preventivo = preventivo;
    }

    @Override
    public String toString() {
        return "Preventivo{" +
                "preventivo=" + preventivo +
                '}';
    }

    public String toXml() {
        String xml="";
        for(Preventivo preventivo : this.preventivo){
            xml += preventivo.toXml();
        }
        xml = "<preventivo>\n" + xml + "</preventico>";
        return xml;
    }

    public void scriviXml(){
        BufferedWriter bw = null;
        try {
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
            File file = new File(Preventivo.FILE_NAME);
            JAXBContext jaxbContext = JAXBContext.newInstance(Preventivo.class);
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
        Cliente cliente1= new Cliente("MARIO", "ROSSI", "VIA SOLE");
        Articolo articolo1= new Articolo("sz1", "domestico", 100, 20, 2);
        Articolo articolo2= new Articolo("sz2", "domestica", 15, 10, 1);
        cliente1.aggiungiArticolo(articolo1);
        cliente1.aggiungiArticolo(articolo2);
        this.aggiungiCliente(cliente1);
        Cliente cliente2= new Cliente("MARIO", "ROSSI", "VIA SOLE");
        Articolo articolo3= new Articolo("sz1", "domestico", 100, 20, 2);
        Articolo articolo4= new Articolo("sz2", "domestica", 15, 10, 1);
        cliente1.aggiungiArticolo(articolo3);
        cliente1.aggiungiArticolo(articolo4);
        this.aggiungiCliente(cliente2);
        Preventivo preventivo1 = new Preventivo();
    }

    public void caricaClienti(Preventivo preventivo) {
        int numeroClienti=Tastiera.leggiNumero("Inserisci la quantita di clienti: ");

        Cliente cliente= new Cliente();
        for(int cntClienti=0;cntClienti<numeroClienti;cntClienti++) {
            cliente.caricaCliente(preventivo);
        }
    }

    public void stampa() {
        System.out.println( this.toString() );
    }

    public void stampConFor() {
        float sumPreventivo=0;
        for(int cntCliente = 0; cntCliente<this.cliente.size(); cntCliente++) {
            Cliente cliente = this.getCliente().get(cntCliente);
            System.out.println("Cliente: " + cliente.toString());
            double totaleIvato = cliente.calcolaPrezzoTotale();
            System.out.println("Totale ivato: " + totaleIvato);

            sumPreventivo += totaleIvato;
        }
        System.out.println("Totale Preventivo: " + sumPreventivo);

    }

    public void ordinaPreventivoByCognomeCliente() {
        //richiama in automatico il metodo sort(Object) dell' elemento della lista,
        //   che implementa il metodo sort(Object) dell'interfaccia Comparable
        Collections.sort( this.cliente );
    }

    public Cliente ricercaClienteByCognomeAndNome(String cognome, String nome) {
        Cliente cliente=null;
        boolean foundCliente=false;

        for(int cntCliente = 0; cntCliente<this.cliente.size() && !foundCliente; cntCliente++) {
            cliente=this.cliente.get(cntCliente);
            if(cliente.getCognome().equalsIgnoreCase(cognome)
                    && cliente.getNome().equalsIgnoreCase(nome)) {
                foundCliente=true;
            }
            else {
                cliente=null;
            }
        }

        return cliente;
    }

    public void salvaCSV() {
        String str ="";
        BufferedWriter bw;
        try {
            bw= new BufferedWriter(new FileWriter(FILE_NAME));

            for(int cntCliente=0; cntCliente<this.cliente.size(); cntCliente++)
            {
                Cliente cliente = this.cliente.get(cntCliente);
                bw.write(cliente.toRowCSV());

                for(int cntArticolo=0; cntArticolo<cliente.getaArticolo().size(); cntArticolo++) {
                    Articolo articolo = cliente.getaArticolo().get(cntArticolo);
                    bw.write(articolo.toRowCsv());
                }
            }

            //obbligatorio oppure il file rimane vuoto
            //forza lo svuotamento del buffer nel file, dopo di che lo chiude
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void apriCSV() {
        BufferedReader br;
        String rowLine;
        Cliente cliente= null;

        try {
            br = new BufferedReader(new FileReader(FILE_NAME));

            while((rowLine = br.readLine()) != null) {
                String[] campi = rowLine.split(Preventivo.SEPARATOR);
                if(campi[0].equalsIgnoreCase("Cliente")) {
                    cliente = new Cliente(campi[1], campi[2], campi[3]);
                    this.aggiungiCliente(cliente);
                }
                if(campi[0].equalsIgnoreCase("Articolo")) {
                    //public Articolo(String codice, String descrizione, double importoSenzaIVA, int scontoPercentuale, int quantita)
                    Articolo articolo = new Articolo(campi[1], campi[2], Double.parseDouble(campi[3]),
                            Integer.parseInt(campi[4]), Integer.parseInt(campi[5]));
                    cliente.aggiungiArticolo(articolo);
                }

            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        Preventivo preventivo = new Preventivo();
        preventivo.simula();
        preventivo.scriviXml();

        System.out.println("\n\n\n*********<stampa preventivo..");
        preventivo.stampa();

        System.out.println("\n\n\n*********stampa preventivo con for..");
        preventivo.stampConFor();

        System.out.println("\n\n\n*********stampa preventivo ordinato..");
        preventivo.ordinaPreventivoByCognomeCliente();
        preventivo.stampa();

        System.out.println("\n\n\n*********stampa preventivo dopo rimuovi..");
        Cliente cliente = preventivo.ricercaClienteByCognomeAndNome("Rossi", "Mario");
        if(cliente!= null) {
            cliente.eliminaArticolo("A1");
        }
        preventivo.stampa();

        preventivo.salvaCSV();

        Preventivo preventivo2 = new Preventivo();
        preventivo2.apriCSV();
        System.out.println("\n\n\n*********stampa preventivo dopo caricamento da CSV..");
        preventivo2.stampa();
    }
}