package it.itis.cuneo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calcolatrice extends JFrame implements ActionListener{

    JLabel Fattore1;
    JLabel Fattore2;
    JTextField TFattore1;
    JTextField TFattore2;
    JButton bUguale;
    JButton bSomma;
    JButton bSottrazione;
    JButton bMoltiplicazione;
    JButton bDivisione;
    JLabel lCompleto;


    public Calcolatrice()
    {
        setSize(2000,1000);
        setLocation(300, 300);
        setTitle("Squadre di calcio");
        initComponets();
        pack();
        JPanel myPanel = new JPanel();
        myPanel.setBackground(Color.BLUE);
        Container container = this.getContentPane();
        container.add(myPanel);
        setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void initComponets() {
        this.setLayout(new FlowLayout());
        Fattore1 = new JLabel("numero1: ");
        this.add(Fattore1);
        TFattore2 = new JTextField(20);
        this.add(TFattore2);
        Fattore2 = new JLabel("numero2: ");
        this.add(Fattore2);
        TFattore1 = new JTextField(20);
        this.add(TFattore1);
        bSomma = new JButton("Somma");
        this.add(bSomma);
        bSottrazione = new JButton("Sottrazione");
        this.add(bSottrazione);
        bMoltiplicazione = new JButton("Moltiplicazione");
        this.add(bMoltiplicazione);
        bDivisione = new JButton("Divisione");
        this.add(bDivisione);
        bUguale = new JButton("Uguale");
        this.add(bUguale);
        lCompleto = new JLabel("numero1 - numero2");
        this.add(lCompleto);
        bUguale.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bUguale)
        {
            lCompleto.setText("i numero inseriti sono:" + TFattore1.getText()+" "+ TFattore2.getText());
        }
    }

    public static void main(String[] args) {
        Calcolatrice finestra = new Calcolatrice();
    }

}
