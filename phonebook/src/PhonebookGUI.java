import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;

public class PhonebookGUI implements ActionListener {

    JFrame frame = new JFrame();
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    JButton btn1 = new JButton("Insert");
    JButton btn2 = new JButton("Reset");
    JLabel label1 = new JLabel("Name:");
    JLabel label2 = new JLabel("City:");
    JLabel label3 = new JLabel("Phone:");


    void render(){
        label1.setBounds(100, 30, 110, 25);
        frame.add(label1);

        t1.setBounds(150,30,110,25);
        frame.add(t1);

        label2.setBounds(100, 70, 110, 25);
        frame.add(label2);

        t2.setBounds(150,70,110,25);
        frame.add(t2);

        label3.setBounds(100, 110, 110, 25);
        frame.add(label3);

        t3.setBounds(150,110,110,25);
        frame.add(t3);

        btn1.setBounds(100,150,75,20);
        btn1.addActionListener(this);
        frame.add(btn1);

        btn2.setBounds(190,150,75,20);
        btn2.addActionListener(this);
        frame.add(btn2);

        frame.setSize(400,400);
        frame.setTitle("Phonebook");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);  //places the frame on the center
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
