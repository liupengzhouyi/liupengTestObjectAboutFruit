package JDBCObject;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class newWindow implements WindowListener {
    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        Window tempWindow = e.getWindow();
        tempWindow.setVisible(false);
        tempWindow.dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}