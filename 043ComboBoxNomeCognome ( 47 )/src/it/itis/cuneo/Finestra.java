package it.itis.cuneo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Finestra extends JFrame implements ActionListener {

    JLabel lnome;
    JLabel lcognome;
    JTextField tnome;
    JTextField tcognome;
    JButton bAggiungi;

    JList listaDiNomi;
    DefaultListModel listModel;

    ArrayList<String> aNomi;

    JComboBox comboBox;
    DefaultComboBoxModel comboBoxModel;

    public Finestra(){
        setTitle("Lista nomi e cognomi");
        initComponent();
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initComponent() {
        setLayout(new FlowLayout());

        lnome = new JLabel("nome");
        this.add(lnome);

        lcognome = new JLabel("cognome");
        this.add(lcognome);

        tnome = new JTextField(20);
        this.add(tnome);

        tcognome = new JTextField(20);
        this.add(tcognome);

        listaDiNomi = new JList();
        this.add(listaDiNomi);

        bAggiungi = new JButton("inserisci");
        this.add(bAggiungi);
        bAggiungi.addActionListener(this);

        listModel = new DefaultListModel();
        listaDiNomi = new JList(listModel);
        JScrollPane jScrollPane = new JScrollPane(listaDiNomi);
        this.add(jScrollPane);

        comboBoxModel = new DefaultComboBoxModel();
        JComboBox comboText = new JComboBox(comboBoxModel);
        JScrollPane jScrollPane2 = new JScrollPane(comboText);
        this.add(jScrollPane2);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource().equals(bAggiungi)){
            if (tnome.getText().equals(" ") || tcognome.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Parametri non validi");
            }else{
                String stringa = tcognome.getText() + " " + tnome.getText();
                listModel.addElement(stringa);
                comboBoxModel.addElement(stringa);
                tcognome.setText("");
                tnome.setText("");
                aNomi.add(stringa);
            }
        }
    }

    public static void main(String[] args) {
        Finestra finestra = new Finestra();
    }
}
