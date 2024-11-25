import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
    <applet code="KeyBoardEventListnerDemo" width=500 height=500>
    </applet>
 */
public class KeyBoardEventListnerDemo extends Applet implements KeyListener {
    String msg = "";
    char c;
    public void paint(Graphics g) {
        g.drawString(msg, 70, 70);
    }

    public void init() {
        addKeyListener(this);
    }

    public void keyPressed(KeyEvent ke) {
        // c = ke.getKeyChar();
        // msg = "Key pressed: " + c;
        // repaint();

    }

    public void keyTyped(KeyEvent ke) {
        c = ke.getKeyChar();
        msg += c;
        repaint();
    }

    public void keyReleased(KeyEvent ke) {
        // c = ke.getKeyChar();
        // msg = "Key Released: " + c;
        // repaint();
    }
}
