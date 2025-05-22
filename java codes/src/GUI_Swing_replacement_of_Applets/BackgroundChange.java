package GUI_Swing_replacement_of_Applets;

import java.awt.*; //awt for actionlistener, actionperformed etc.. they aren't present in swing package..
import java.awt.event.*;
import javax.swing.*;

public class BackgroundChange extends JFrame implements ActionListener {
    JButton red, green, blue;

    public BackgroundChange() {
        setLayout(new FlowLayout());

        red = new JButton("Red");
        green = new JButton("Green");
        blue = new JButton("Blue");

        add(red);
        add(green);
        add(blue);

        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);

        setTitle("Button in Action");
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        System.out.println("You clicked " + str + " button");

        if (str.equals("Red")) {
            getContentPane().setBackground(Color.RED);
        } 
        else if (str.equals("Green")) {
            getContentPane().setBackground(Color.GREEN);
        } 
        else if (str.equals("Blue")) {
            getContentPane().setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        new BackgroundChange();
    }
}
