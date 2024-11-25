import java.awt.*;
import java.applet.*;


/*
    <applet code="AppletDemo" width=600 height=600>
    </applet>
*/

public class AppletDemo extends Applet {
    String msg;
    public void init() {
        setBackground(Color.red);
        setForeground(Color.white);
        msg = "Init";
    }
    public void start() {
        setBackground(Color.blue);
        setForeground(Color.white);
        msg += " Start";
    }
    public void restart() {
        setForeground(Color.green);
        msg += " Restarted";
    }
    public void stop() {
        setForeground(Color.green);
        msg += " Stop";
    }
    public void paint(Graphics g) {
        g.setColor(getForeground());
        g.drawString(msg, 50, 60);
    }

    public void destroy() {
        setBackground(Color.cyan);
        msg += "Destroy";
    }
}