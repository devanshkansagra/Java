import java.awt.*;
import java.applet.*;

/*
    <applet code=Banner width=500 height=500>
    </applet>
 */


public class Banner extends Applet implements Runnable {

    Thread t;
    String msg = "Hello world This is Devansh Kansagra From BVM Engineering college ";
    boolean flag;
    public void start() {
        t = new Thread(this);
        t.start();
        flag = false;
    }

    public void run() {
        char ch;
        while(true) {
            try {
                repaint();
                Thread.sleep(10);
                ch = msg.charAt(0);
                msg = msg.substring(1, msg.length());
                msg += ch;

                if(flag) {
                    break;
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public void stop() {
        flag = true;
        t = null;
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 50);
    }
}