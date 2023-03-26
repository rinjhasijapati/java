import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI implements ActionListener {
    JFrame frame = new JFrame();
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    JButton button = new JButton("Add");

    void render() {

        t1.setBounds(10,10,100,40);
      //  t1.setText("Rinjha");   //adds the text in the textfield
      //  System.out.println(t1.getText());   //returns the text written in the textfield
        frame.add(t1);

        t2.setBounds(10,70,100,40);
        frame.add(t2);

        t3.setBounds(10,130,100,40);
        frame.add(t3);

        button.setBounds(25,190,60,20);
        button.addActionListener(this);
        frame.add(button);

        frame.setSize(400,400);
        frame.setTitle("Calculator");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);  //places the frame on the center
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    //    t1.setText("Enter");
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int sum = num1+num2;
        System.out.println("Sum is " + sum);
        t3.setText(String.valueOf(sum));
    }
}
