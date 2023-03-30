import javax.swing.*;
import java.awt.*;

public class Practice {
    JFrame frame = new JFrame();
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    JPanel p5 = new JPanel();

    void render() {
        p1.setBackground(Color.ORANGE);
        frame.setLayout(new BorderLayout());
        frame.add(p1, BorderLayout.NORTH);

        p1.setLayout(new FlowLayout(FlowLayout.LEFT));  //the buttons start from the left side

        //adding buttons in p1
        p1.add(new JButton("Click Me"));
        p1.add(new JButton("Click Me"));
        p1.add(new JButton("Click Me"));


        p2.setBackground(Color.BLUE);
        frame.add(p2, BorderLayout.EAST);

        p3.setBackground(Color.RED);
        frame.add(p3, BorderLayout.WEST);

        p3.setLayout(new BoxLayout(p3, BoxLayout.Y_AXIS));
        p3.add(new JButton("Click Me"));
        p3.add(new JButton("Click Me"));
        p3.add(new JButton("Click Me"));
        p3.add(new JButton("Click Me"));

        p4.setBackground(Color.GREEN);
        frame.add(p4, BorderLayout.SOUTH);

        p5.setBackground(Color.PINK);
        frame.add(p5, BorderLayout.CENTER);

        p5.setLayout(new GridLayout(2,2,5,5));
        p5.add(new JButton("Click Me"));
        p5.add(new JButton("Click Me"));
        p5.add(new JButton("Click Me"));


        frame.setSize(500, 500);
        frame.setTitle("Practice");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);  //places the frame on the center
        frame.setVisible(true);
    }
}
