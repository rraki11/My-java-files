package GUI_Swing_replacement_of_Applets;

//import java.awt.FlowLayout; enable it when you use flowlayout
import javax.swing.*;

public class LabelExample { // Renamed to follow Java naming conventions

    public LabelExample() {
        JFrame f1 = new JFrame(); // Acts as a window to hold GUI components
        JLabel l1 = new JLabel(); // Used to display static text or image

        f1.setSize(500, 500);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //f1.setLayout(new FlowLayout()); //flowlayout enabled 
        f1.setLayout(null); //flowlayout disabled cause we are using Bounds

        l1.setText("Hi Rakesh");
        //l1.setBounds(100,100,50,50); //will print upto "Hi Rak.."
        l1.setBounds(225,225,100,50); //will print completely due to adjustment of the width & height
        f1.add(l1);

        f1.setVisible(true); // Make the frame visible
    }

    public static void main(String[] args) {
        new LabelExample(); // Calls the constructor
    }
}


// below code is related to the same code as above but for older java versions using "awt"
/*package GUI_Swing_replacement_of_Applets;

import java.awt.*;
import java.awt.event.*;

public class LabelExampleAWT { // Renamed for clarity

    public LabelExampleAWT() {
        Frame f1 = new Frame(); // Acts as a window to hold GUI components
        Label l1 = new Label("Hi Rakesh"); // Used to display static text

        f1.setSize(500, 500);
        f1.setLayout(null); // Disable layout to use absolute positioning

        l1.setBounds(225, 225, 100, 50); // Positioning and size
        f1.add(l1); // Add label to frame

        // Handle window closing since AWT does not support setDefaultCloseOperation()
        f1.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f1.dispose(); // Close the window
            }
        });

        f1.setVisible(true); // Make the frame visible
    }

    public static void main(String[] args) {
        new LabelExampleAWT(); // Calls the constructor
    }
}
*/