import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class Box extends JPanel implements ActionListener {
    int boxX = 10;
    int boxY = 10;
    Box(){
        JButton button = new JButton("Move!!");
        button.addActionListener(this);
        add(button);
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.CYAN);
        g.fillRect(boxX, boxY,100,100);

        g.setColor(Color.PINK);
        g.fillRect(200,10,100,100);

        g.setColor(Color.YELLOW);
        g.fillRect(400,10,100,100);

        g.setColor(Color.PINK);
        g.fillRect(10,100,100,100);

        g.setColor(Color.YELLOW);
        g.fillRect(200,100,100,100);

        g.setColor(Color.CYAN);
        g.fillRect(400,100,100,100);

        g.setColor(Color.YELLOW);
        g.fillRect(10,200,100,100);

        g.setColor(Color.CYAN);
        g.fillRect(200,200,100,100);

        g.setColor(Color.PINK);
        g.fillRect(400,200,100,100);

        }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Clicked");
        boxX+=10;
        repaint();
    }
}
