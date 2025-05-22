package GUI_Swing_replacement_of_Applets;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonExample extends JFrame implements ActionListener {
    private JLabel label;
    private JButton btnOk, btnCancel;

    public ButtonExample() {
        setTitle("Button Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout()); // Using FlowLayout for automatic positioning

        // Creating buttons
        btnOk = new JButton("Ok");
        btnCancel = new JButton("Cancel");

        // Creating a label to display messages
        label = new JLabel("Click a button");

        // Adding action listeners
        btnOk.addActionListener(this);
        btnCancel.addActionListener(this);

        // Adding components to the frame
        add(btnOk);
        add(btnCancel);
        add(label);

        setVisible(true); // Make the frame visible
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String action = ae.getActionCommand(); // Get the text of the button clicked

        if (action.equals("Ok")) {
            label.setText("Ok button pressed");
        } else if (action.equals("Cancel")) {
            label.setText("Cancel button pressed");
        }
    }

    public static void main(String[] args) {
        new ButtonExample(); // Create and display the GUI
    }
}
