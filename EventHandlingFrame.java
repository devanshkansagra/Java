import java.awt.*;
import java.awt.event.*;

public class EventHandlingFrame extends Frame implements MouseListener, KeyListener {
    private String message = "";

    public EventHandlingFrame() {
        setTitle("Event Handling Frame");
        setSize(400, 400);
        addMouseListener(this);
        addKeyListener(this);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawString(message, 50, 50);
    }

    public void mouseClicked(MouseEvent e) {
        message = "Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void keyTyped(KeyEvent e) {
        message = "Key Typed: " + e.getKeyChar();
        repaint();
    }

    public void keyPressed(KeyEvent e) {}

    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        new EventHandlingFrame();
    }
}