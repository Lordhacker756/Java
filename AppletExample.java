import java.awt.*;
import javax.swing.*;

class App extends JFrame implements MouseListener{
    JFrame frame;
    JLabel message;

    App(){
        frame = new JFrame("Mouse Tracking");
        message = new JLabel("Mouse tracking");

        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.addMouseListener(this);

        frame.add(message);
    }

    public void mouseEntered(MouseEvent e)
    {
        message.setText("Mouse entered");
    }
    public void mouseExited(MouseEvent e)
    {
        message.setText("Mouse exited");
    }
}

class AppletExample{
    public static void main(String args[]){
        new App();
    }
}