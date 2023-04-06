import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Notepad implements ActionListener {
    JFrame frame = new JFrame();
    JTextArea textArea = new JTextArea();
    JButton button = new JButton("Add Text");



    public void read() {
        textArea.setBounds(0, 0, 400, 400);
        frame.add(textArea);

        button.setBounds(150, 410, 100, 30);
        button.addActionListener(this);
        frame.add(button);

        frame.setSize(500, 500);
        frame.setTitle("Notepad");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textArea.getText();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(new File("notes.txt"));
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(text);
            printWriter.close();
            frame.dispose();   //closes the window once the button is clicked
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
