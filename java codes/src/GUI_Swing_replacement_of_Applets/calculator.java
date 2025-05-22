package GUI_Swing_replacement_of_Applets;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator extends Frame implements ActionListener {

    Label l1;
    Label l2;
    Label l3;
    TextField t1;
    TextField t2;
    TextField t3;
    Button b1,b2,b3,b4,b5,b6,b7;

    public calculator() {

        l1 = new Label("Var 1");
        t1 = new TextField(10);
        l2 = new Label("Var 2");
        t2 = new TextField(10);
        l3 = new Label("Result");
        t3 = new TextField(10);
        t3.setEditable(false); // result field will only read 

        b1 = new Button("Add");
        b2 = new Button("Sub");
        b3 = new Button("Mul");
        b4 = new Button("Div");
        b5 = new Button("Mod (Remainder)");
        b6 = new Button("Reset");
        b7 = new Button("Close");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);

        setSize(400,100);
        setVisible(true);
        setTitle("Calculator");
        setLayout(new FlowLayout(FlowLayout.CENTER));

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        double a=0,b=0,c=0;

        try {
            a = Double.parseDouble(t1.getText());
        } catch (NumberFormatException e) {
            t1.setText("Invalid Input");
        }

        try {
            b = Double.parseDouble(t2.getText());
        } catch (NumberFormatException e) {
            t2.setText("Invalid Input");
        }

        if (ae.getSource() == b1) {
            c = a + b;
            t3.setText(String.valueOf(c));
        }

        if (ae.getSource() == b2) {
            c = a - b;
            t3.setText(String.valueOf(c));
        }

        if (ae.getSource() == b3) {
            c = a * b;
            t3.setText(String.valueOf(c));
        }

        if (ae.getSource() == b4) {
            c = a / b;
            t3.setText(String.valueOf(c));
        }

        if (ae.getSource() == b5) {
            c = a % b;
            t3.setText(String.valueOf(c));
        }

        if (ae.getSource() == b6) {
            t1.setText("0");
            t2.setText("0");
            t3.setText("0");
        }

        if (ae.getSource() == b7) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        calculator cal = new calculator();
        cal.setVisible(true);
        cal.setResizable(false);
        cal.setLocation(300,300);
}}
