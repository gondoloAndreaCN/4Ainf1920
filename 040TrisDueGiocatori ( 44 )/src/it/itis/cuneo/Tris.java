package it.itis.cuneo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by inf.gondoloa1112 on 20/02/2020.
 */
public class Tris extends JFrame implements ActionListener {

    public int giocatore = 1;

    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton buttonNuovaPartita;


    public Tris(){
        setTitle("Tris 2 giocatori");
        init();
        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void init(){
        Container container = this.getContentPane();
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,3));
        JPanel sPanel = new JPanel();
        sPanel.setLayout(new FlowLayout());
        button1 = new JButton();
        panel.add(button1);
        button1.addActionListener(this);
        button2 = new JButton();
        panel.add(button2);
        button2.addActionListener(this);
        button3 = new JButton();
        panel.add(button3);
        button3.addActionListener(this);
        button4 = new JButton();
        panel.add(button4);
        button4.addActionListener(this);
        button5 = new JButton();
        panel.add(button5);
        button5.addActionListener(this);
        button6 = new JButton();
        panel.add(button6);
        button6.addActionListener(this);
        button7 = new JButton();
        panel.add(button7);
        button7.addActionListener(this);
        button8 = new JButton();
        panel.add(button8);
        button8.addActionListener(this);
        button9 = new JButton();
        panel.add(button9);
        button9.addActionListener(this);
        buttonNuovaPartita = new JButton("Nuova Patita");
        sPanel.add(buttonNuovaPartita);
        buttonNuovaPartita.addActionListener(this);
        container.add(sPanel, BorderLayout.SOUTH);
        container.add(panel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent action){
        if (action.getSource() == button1){
            button1.setText(toggle(button1.getText()));
        }else if (action.getSource() == button2){
            button2.setText(toggle(button2.getText()));
        }else if (action.getSource() == button3){
            button3.setText(toggle(button3.getText()));
        }else if (action.getSource() == button4){
            button4.setText(toggle(button4.getText()));
        }else if (action.getSource() == button5){
            button5.setText(toggle(button5.getText()));
        }else if (action.getSource() == button6){
            button6.setText(toggle(button6.getText()));
        }else if (action.getSource() == button7){
            button7.setText(toggle(button7.getText()));
        }else if (action.getSource() == button8){
            button8.setText(toggle(button8.getText()));
        }else if (action.getSource() == button9){
            button9.setText(toggle(button9.getText()));
        }else if (action.getSource() == buttonNuovaPartita){
            nuovaPartita();
        }
    }

    public void nuovaPartita(){
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
    }

    public String toggle(String text){
        if(giocatore % 2 != 0){
            if (text == ""){
                text = "X";
            }

        }else if (giocatore % 2 == 0) {
            if (text == "") {
                text = "O";
            }
        }
        giocatore++;
        return text;
    }

    public static void main(String[] args) {
        Tris tris = new Tris();
    }




}
