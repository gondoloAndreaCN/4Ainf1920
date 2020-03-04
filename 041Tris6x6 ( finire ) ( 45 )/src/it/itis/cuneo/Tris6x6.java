package it.itis.cuneo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tris6x6 extends JFrame implements ActionListener {

    private int giocatore = 1;

    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton button10;
    JButton button11;
    JButton button12;
    JButton button13;
    JButton button14;
    JButton button15;
    JButton button16;
    JButton button17;
    JButton button18;
    JButton button19;
    JButton button20;
    JButton button21;
    JButton button22;
    JButton button23;
    JButton button24;
    JButton button25;
    JButton button26;
    JButton button27;
    JButton button28;
    JButton button29;
    JButton button30;
    JButton button31;
    JButton button32;
    JButton button33;
    JButton button34;
    JButton button35;
    JButton button36;
    JButton colonna1;
    JButton colonna2;
    JButton colonna3;
    JButton colonna4;
    JButton colonna5;
    JButton colonna6;
    JButton buttonNuovaPartita;


    public Tris6x6() {
        setTitle("Tris 6 x 6");
        init();
        nuovaPartita();
        setSize(580, 450);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void init() {
        Container container = this.getContentPane();
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 6));
        JPanel sPanel = new JPanel();
        sPanel.setLayout(new FlowLayout());
        JPanel nPanel = new JPanel();
        nPanel.setLayout(new FlowLayout());
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
        button10 = new JButton();
        panel.add(button10);
        button10.addActionListener(this);
        button11 = new JButton();
        panel.add(button11);
        button11.addActionListener(this);
        button12 = new JButton();
        panel.add(button12);
        button12.addActionListener(this);
        button13 = new JButton();
        panel.add(button13);
        button13.addActionListener(this);
        button14 = new JButton();
        panel.add(button14);
        button14.addActionListener(this);
        button15 = new JButton();
        panel.add(button15);
        button15.addActionListener(this);
        button16 = new JButton();
        panel.add(button16);
        button16.addActionListener(this);
        button17 = new JButton();
        panel.add(button17);
        button17.addActionListener(this);
        button18 = new JButton();
        panel.add(button18);
        button18.addActionListener(this);
        button19 = new JButton();
        panel.add(button19);
        button19.addActionListener(this);
        button20 = new JButton();
        panel.add(button20);
        button20.addActionListener(this);
        button21 = new JButton();
        panel.add(button21);
        button21.addActionListener(this);
        button22 = new JButton();
        panel.add(button22);
        button22.addActionListener(this);
        button23 = new JButton();
        panel.add(button23);
        button23.addActionListener(this);
        button24 = new JButton();
        panel.add(button24);
        button24.addActionListener(this);
        button25 = new JButton();
        panel.add(button25);
        button25.addActionListener(this);
        button26 = new JButton();
        panel.add(button26);
        button26.addActionListener(this);
        button27 = new JButton();
        panel.add(button27);
        button27.addActionListener(this);
        button28 = new JButton();
        panel.add(button28);
        button28.addActionListener(this);
        button29 = new JButton();
        panel.add(button29);
        button29.addActionListener(this);
        button30 = new JButton();
        panel.add(button30);
        button30.addActionListener(this);
        button31 = new JButton();
        panel.add(button31);
        button31.addActionListener(this);
        button32 = new JButton();
        panel.add(button32);
        button32.addActionListener(this);
        button33 = new JButton();
        panel.add(button33);
        button33.addActionListener(this);
        button34 = new JButton();
        panel.add(button34);
        button34.addActionListener(this);
        button35 = new JButton();
        panel.add(button35);
        button35.addActionListener(this);
        button36 = new JButton();
        panel.add(button36);
        button36.addActionListener(this);
        buttonNuovaPartita = new JButton("Nuova Patita");
        sPanel.add(buttonNuovaPartita);
        buttonNuovaPartita.addActionListener(this);

        colonna1 = new JButton("colonna 1");
        nPanel.add(colonna1);
        colonna1.addActionListener(this);
        colonna2 = new JButton("colonna 2");
        nPanel.add(colonna2);
        colonna2.addActionListener(this);
        colonna3 = new JButton("colonna 3");
        nPanel.add(colonna3);
        colonna3.addActionListener(this);
        colonna4 = new JButton("colonna 4");
        nPanel.add(colonna4);
        colonna4.addActionListener(this);
        colonna5 = new JButton("colonna 5");
        nPanel.add(colonna5);
        colonna5.addActionListener(this);
        colonna6 = new JButton("colonna 6");
        nPanel.add(colonna6);
        colonna6.addActionListener(this);

        container.add(nPanel, BorderLayout.NORTH);
        container.add(sPanel, BorderLayout.SOUTH);
        container.add(panel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent action) {
        if (action.getSource() == buttonNuovaPartita) {
            nuovaPartita();
        } else if (action.getSource() == colonna1) {
            settingColor1(button1.getBackground(), button7.getBackground(), button13.getBackground(), button19.getBackground(), button25.getBackground(), button31.getBackground());
        }
    }

    private void nuovaPartita() {
        button1.setBackground(Color.white);
        button2.setBackground(Color.white);
        button3.setBackground(Color.white);
        button4.setBackground(Color.white);
        button5.setBackground(Color.white);
        button6.setBackground(Color.white);
        button7.setBackground(Color.white);
        button8.setBackground(Color.white);
        button9.setBackground(Color.white);
        button10.setBackground(Color.white);
        button11.setBackground(Color.white);
        button12.setBackground(Color.white);
        button13.setBackground(Color.white);
        button14.setBackground(Color.white);
        button15.setBackground(Color.white);
        button16.setBackground(Color.white);
        button17.setBackground(Color.white);
        button18.setBackground(Color.white);
        button19.setBackground(Color.white);
        button20.setBackground(Color.white);
        button21.setBackground(Color.white);
        button22.setBackground(Color.white);
        button23.setBackground(Color.white);
        button24.setBackground(Color.white);
        button25.setBackground(Color.white);
        button26.setBackground(Color.white);
        button27.setBackground(Color.white);
        button28.setBackground(Color.white);
        button29.setBackground(Color.white);
        button30.setBackground(Color.white);
        button31.setBackground(Color.white);
        button32.setBackground(Color.white);
        button33.setBackground(Color.white);
        button34.setBackground(Color.white);
        button35.setBackground(Color.white);
        button36.setBackground(Color.white);
    }


    public void settingColor1(Color button1, Color button7, Color button13, Color button19, Color button25, Color button31) {
        if (giocatore % 2 == 0) {
            if (button31 == Color.white || button31 != Color.yellow) {
                setBackground(Color.red);
            } else if (button25 == Color.white || button25 != Color.yellow) {
                setBackground(Color.red);
            } else if (button19 == Color.white || button19 != Color.yellow) {
                setBackground(Color.red);
            } else if (button13 == Color.white || button13 != Color.yellow) {
                setBackground(Color.red);
            } else if (button7 == Color.white || button7 != Color.yellow) {
                setBackground(Color.red);
            } else if (button1 == Color.white || button1 != Color.yellow) {
                setBackground(Color.red);
                giocatore++;
            }
        }
            if (giocatore % 2 == 1) {
                if (button31 == Color.white || button31 == Color.red) {
                    setBackground(Color.yellow);
                } else if (button25 == Color.white || button25 == Color.red) {
                    setBackground(Color.yellow);
                } else if (button19 == Color.white || button19 == Color.red) {
                    setBackground(Color.yellow);
                } else if (button13 == Color.white || button13 == Color.red) {
                    setBackground(Color.yellow);
                } else if (button7 == Color.white || button7 == Color.red) {
                    setBackground(Color.yellow);
                } else if (button1 == Color.white || button1 == Color.red) {
                    setBackground(Color.yellow);
                    giocatore++;
                }
            }

    }

    public static void main(String[] args) {
        Tris6x6 tris6x6 = new Tris6x6();
    }


    }


