package it.itis.cuneo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Finestra extends JFrame implements ActionListener {

    JLabel Squadra1;
    JLabel Squadra2;
    JLabel Squadra3;
    JLabel Squadra4;
    JTextField TSquadra1;
    JTextField TSquadra2;
    JTextField TSquadra3;
    JTextField TSquadra4;
    JButton bInvia;
    JLabel lCompleto;

    public Finestra()
    {
        setSize(800,600);
        setLocation(200, 200);
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
        Squadra1 = new JLabel("cognome: ");
        this.add(Squadra1);
        TSquadra2 = new JTextField(20);
        this.add(TSquadra2);
        Squadra2 = new JLabel("nome: ");
        this.add(Squadra2);
        TSquadra1 = new JTextField(20);
        this.add(TSquadra1);
        bInvia= new JButton("Invia");
        this.add(bInvia);
        lCompleto = new JLabel("Cognome+Nome");
        this.add(lCompleto);
        //Squadra3 = new JLabel("cognome: ");
        //this.add(Squadra3);
        //TSquadra3 = new JTextField(20);
        //this.add(TSquadra3);
        //Squadra4 = new JLabel("cognome: ");
        //this.add(Squadra4);
        //TSquadra4 = new JTextField(20);
        //this.add(TSquadra4);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bInvia)
        {
            lCompleto.setText(TSquadra2.getText()+" "+ TSquadra1.getText());
        }
    }

    public static void main(String[] args) {
        Finestra finestra = new Finestra();
    }
}
