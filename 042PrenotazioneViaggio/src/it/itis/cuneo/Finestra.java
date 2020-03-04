package it.itis.cuneo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Finestra extends JFrame implements ActionListener {

    public static final String path = "E:\\scuola\\4_AINF\\Informatica\\esercizi_intellij\\042PrenotazioneViaggio\\src\\it\\itis\\cuneo\\prenotazioni.csv";

    JLabel lCognome;
    JLabel lNome;
    JLabel lTelefono;
    JLabel lCittaPartenza;
    JLabel lCittaArrivo;
    JLabel lData;

    JTextField tCognome;
    JTextField tNome;
    JTextField tTelefono;
    JTextField tCittaPartenza;
    JTextField tCittaArrivo;
    JTextField tData;

    JButton bConferma;
    JButton bAnnulla;
    JButton bStampa;

    ElencoPrenotazione elencoPrenotazione = new ElencoPrenotazione();

    public Finestra(){
        setLocation(100,100);
        setTitle("Prenotazione biglietto");
        setResizable(false);
        init();
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void init(){
        Container container =  this.getContentPane();

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7,2));

        JPanel spanel = new JPanel();
        spanel.setLayout(new FlowLayout());

        lCognome = new JLabel("cognome:");
        panel.add(lCognome);
        tCognome = new JTextField(15);
        panel.add(tCognome);
        lNome = new JLabel("nome:");
        panel.add(lNome);
        tNome = new JTextField(15);
        panel.add(tNome);
        lTelefono = new JLabel("telefono:");
        panel.add(lTelefono);
        tTelefono = new JTextField(15);
        panel.add(tTelefono);
        lCittaPartenza = new JLabel("città di partenza:");
        panel.add(lCittaPartenza);
        tCittaPartenza = new JTextField(15);
        panel.add(tCittaPartenza);
        lCittaArrivo = new JLabel("città d'arrivo:");
        panel.add(lCittaArrivo);
        tCittaArrivo = new JTextField(15);
        panel.add(tCittaArrivo);
        lData = new JLabel("data:");
        panel.add(lData);
        tData = new JTextField(15);
        panel.add(tData);

        bConferma = new JButton("conferma");
        spanel.add(bConferma);
        bConferma.addActionListener(this);
        bAnnulla = new JButton("annulla");
        spanel.add(bAnnulla);
        bAnnulla.addActionListener(this);
        bStampa = new JButton("stampa");
        spanel.add(bStampa);
        bStampa.addActionListener(this);

        container.add(panel,BorderLayout.CENTER);
        container.add(spanel,BorderLayout.SOUTH);


    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == bConferma){
            String cognome =  tCognome.getText();
            String nome = tNome.getText();
            String telefono = tTelefono.getText();
            String cittaDiPartenza = tCittaPartenza.getText();
            String cittaDiArrivo = tCittaArrivo.getText();
            String data = tData.getText();
            Prenotazione prenotazione = new Prenotazione(cognome,nome,telefono,cittaDiPartenza,cittaDiArrivo,data);
            elencoPrenotazione.add(prenotazione);
            clear();
            File file = new File(path);
            try {
                scriviCsv(elencoPrenotazione,file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else if (actionEvent.getSource() == bAnnulla){
            clear();
        }else if(actionEvent.getSource() == bStampa){
            JOptionPane.showMessageDialog(null,elencoPrenotazione.toString());
            //stampa();
        }
    }

    /*public void stampa(){
        for (int i = 0 ;i< elencoPrenotazione.size(); i++){
            System.out.println(elencoPrenotazione.get(i).toString());
        }
    }

     */

    public void clear(){
        tCognome.setText("");
        tNome.setText("");
        tTelefono.setText("");
        tCittaPartenza.setText("");
        tCittaArrivo.setText("");
        tData.setText("");
    }

    public void scriviCsv(ElencoPrenotazione elencoPrenotazione, File file) throws IOException {
        FileWriter fw = null;
        try{
            fw = new FileWriter(file);
            for (int i = 0; i < elencoPrenotazione.size(); i++){
                fw.write(elencoPrenotazione.get(i).toCSVString());
                fw.write('\r');
                fw.write('\n');
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            assert fw != null;
            fw.close();
        }
    }

    public static void main(String[] args) {
        Finestra finestra = new Finestra();
    }

}
