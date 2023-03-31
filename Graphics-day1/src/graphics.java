import javax.swing.*;

public class graphics {
    JFrame frame = new JFrame();
    Box box = new Box();

        graphics(){
            frame.add(box);
            frame.setSize(600,600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }
}