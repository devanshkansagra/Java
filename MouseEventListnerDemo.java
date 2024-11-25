import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
    <applet code="MouseEventListnerDemo" width=500 height=500>
    </applet>
 */

public class MouseEventListnerDemo extends Applet implements MouseListener, MouseMotionListener {
    String msg = "Hello";
    int mouseX = 0, mouseY = 0;

    public void paint(Graphics g) {
        g.drawString(msg, 70, 70);
    }

    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mouseClicked(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();

        msg = "Mouse Clicked: X: " + mouseX + " Y: " + mouseY;
        repaint();
    }

    public void mousePressed(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();

        msg = "Mouse Pressed: X: " + mouseX + " Y: " + mouseY;
        repaint();
    }

    public void mouseReleased(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();

        msg = "Mouse Released: X: " + mouseX + " Y: " + mouseY;
        repaint();
    }

    public void mouseEntered(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();

        msg = "Mouse Entered: X: " + mouseX + " Y: " + mouseY;
        repaint();
    }

    public void mouseExited(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();

        msg = "Mouse Exited: X: " + mouseX + " Y: " + mouseY;
        repaint();
    }

    public void mouseMoved(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();

        msg = "Mouse Moved: X: " + mouseX + " Y: " + mouseY;
        repaint();
    }

    public void mouseDragged(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();

        msg = "Mouse Dragged: X: " + mouseX + " Y: " + mouseY;
        repaint();
    }
}
