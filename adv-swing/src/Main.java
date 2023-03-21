import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("Hello World!!");
        frame.setResizable(false); //disable resizing the window
        JButton button = new JButton("Click me!!");
        button.setBounds(140,150,100,50);
        frame.add(button);
        frame.setSize(400,400);
        frame.getContentPane().setBackground(Color.GREEN);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //stops the program when closed
        frame.setVisible(true); //toggle visibility

    }
}