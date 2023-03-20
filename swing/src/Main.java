import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Hello World");
        JTextField textField = new JTextField("Enter your name");
        JButton button = new JButton("Click me!!");
        textField.setBounds(50, 50, 150, 50);
        frame.add(textField);
        frame.getContentPane().setBackground(Color.ORANGE);
        button.setBounds(100,100,100,50);
        frame.add(button);

        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}