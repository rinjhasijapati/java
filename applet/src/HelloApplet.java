import java.applet.Applet;
import java.awt.*;

public class HelloApplet extends Applet {
    public void paint(Graphics g){
        String message = getParameter("message");
        g.drawString(message, 20, 20);
    }
}



//difference between java application and applet
//difference between servlet and applet