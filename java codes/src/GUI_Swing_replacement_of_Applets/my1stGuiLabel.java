package GUI_Swing_replacement_of_Applets;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class my1stGuiLabel {
    public static void main(String[] args) {

        // Create a label and set properties
        // JLabel = a GUI display area for string text, an image or both
        JLabel firstJLabel = new JLabel();
        ImageIcon image = new ImageIcon("/home/Downloads/HD_Golden Shivbaba Logo.png"); // Load an image icon
        firstJLabel.setIcon(image); // Set image on label

        JLabel tl = new JLabel();
        tl.setText("Hi My name is Rakesh"); // Set text
        tl.setFont(new Font("SF Pro", Font.BOLD, 20)); // Set font
        tl.setForeground(Color.white); // Set text color
        tl.setHorizontalAlignment(JLabel.CENTER); // Align text center
        tl.setVerticalAlignment(JLabel.TOP);


        // Create a JFrame (window)
        JFrame secondFrame = new JFrame("MY 1ST GUI LABEL (LABEL1)");
        secondFrame.setSize(1920, 1080); // Set frame size
        secondFrame.getContentPane().setBackground(Color.black); // Set background color
        secondFrame.setResizable(true); // Disable resizing
        secondFrame.add(firstJLabel); // Add label to frame
        secondFrame.add(tl);
        secondFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close on exit
        secondFrame.setVisible(true); // Show frame
    }
}
