import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("Login");

        JTextField textField1 = new JTextField("Enter Username");
        textField1.setBounds(170,70,150,30);
        frame.add(textField1);

        JTextField textField2 = new JTextField("Enter Password");
        textField2.setBounds(170,110,150,30);
        frame.add(textField2);

        String[] fruits = {"Apple", "Banana", "Durian", "Grapes", "Orange"};
        JComboBox comboBox = new JComboBox(fruits);
        comboBox.setBounds(190,200,100,30);
        frame.add(comboBox);

        JButton button = new JButton("Login");
        button.setBounds(190,150,100,30);
        button.setBackground(Color.WHITE);

        frame.setSize(500,500);
        frame.setLayout(null);
        frame.add(button);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.PINK);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}