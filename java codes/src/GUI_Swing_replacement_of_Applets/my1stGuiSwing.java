package GUI_Swing_replacement_of_Applets;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class my1stGuiSwing {
    public static void main (String[] args) {

//Syntax: JFrame frame_name = new JFrame(); it will create a Frame
        JFrame firstFrame = new JFrame();

//Syntax: frame_name.setTitle("YOUR_TITLE"); it will display the title for the frame
    firstFrame.setTitle("MY 1ST GUI SWING (FRAME1)"); //sets the title for the frame/window

//Syntax: frame_name.setSize(width,height); it will set the size of the frame
    firstFrame.setSize(500,500); //sets x and y dimensions of the frame 

//Syntax: frame_name.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); it will close the application/frame totally when we press "X" to close a tab or frame.
//Syntax: frame_name.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); it will just hide the application/frame after clicking "X" and then the application will hide but will run in background.
//Syntax: frame_name.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); it will prevent us to not close even though when we press "X" to close the application or frame.
    firstFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//Syntax: frame_name.setResizable(true); it will permit the user to resize the frame
//Syntax: frame_name.setResizable(false); it will not permit the user to resize the frame
    firstFrame.setResizable(false);

//Syntax: ImageIcon image_name = new ImageIcon("imagefile_name"); creates an image icon
//Syntax: frame.setIconImage(image.getImage()); change the image icon
    ImageIcon Image = new ImageIcon("home/Wallpapers/wallapaper11.jpg"); //creates an image icon
    firstFrame.setIconImage(Image.getImage()); //changes the image icon

    firstFrame.getContentPane().setBackground(Color.gray); //changes the background color
//frame_name.getContentPane().setBackground(new Color(rgb values or hexa decimal values of colors));
//frame_name.getContentPane().setBackground(new Color(255,255,255)); //rgb color values
//frame_name.getContentPane().setBackground(new Color(0x000000)); //hexa decimal color values


//Syntax: frame_name.setVisible(true); it will make the Frame visible
//Syntax: frame_name.setVisible(false); it will make the Frame unvisible
        firstFrame.setVisible(true); //usually declared at the last
    }
}
