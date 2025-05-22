package GUI_Swing_replacement_of_Applets; // Package name

import javax.swing.*; // Import Swing components
import java.awt.*; // Import AWT layout managers
import java.awt.event.*; // Import event listeners

// CheckboxExampleSwing class extends JFrame and implements ItemListener
public class CheckboxExampleSwing extends JFrame implements ItemListener {
    // Declare JCheckBox components
    JCheckBox c1, c2, c3;
    
    // Label to display selected options
    JLabel statusLabel;

    // Constructor to set up the GUI
    public CheckboxExampleSwing() {
        // Set layout to FlowLayout (components are arranged in a row)
        setLayout(new FlowLayout());
        
        // Set the window size
        setSize(250, 200);
        
        // Set the title of the window
        setTitle("Checkbox Example");

        // Create three checkboxes with labels
        c1 = new JCheckBox("Option 1");
        //c1.setText("Hlo"); you can even add the text like this
        c1.setFocusable(false); //will disable the border line outside that checkbox
        c2 = new JCheckBox("Option 2");
        c2.setFocusable(false); //will disable the border line outside that checkbox
        c3 = new JCheckBox("Option 3");
        c3.setFocusable(false); //will disable the border line outside that checkbox

        // Create a label to display status
        statusLabel = new JLabel("Select an option");

        // Add checkboxes and label to the frame
        add(c1);
        add(c2);
        add(c3);
        add(statusLabel);

        // Add ItemListener to each checkbox
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        // Set default close operation (exit when window is closed)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Make the GUI visible
        setVisible(true);
    }

    // This method is called whenever a checkbox is selected/deselected
    public void itemStateChanged(ItemEvent e) {
        // Create a string to store selected options
        String status = "Selected: ";

        // Check if each checkbox is selected and update the status string
        if (c1.isSelected()) status += "Option 1 ";
        if (c2.isSelected()) status += "Option 2 ";
        if (c3.isSelected()) status += "Option 3 ";

        // If no checkboxes are selected, update the status accordingly
        if (status.equals("Selected: ")) status = "No option selected";

        // Update the label with the selected options
        statusLabel.setText(status);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create an instance of CheckboxExampleSwing to display the GUI
        new CheckboxExampleSwing();
    }
}
