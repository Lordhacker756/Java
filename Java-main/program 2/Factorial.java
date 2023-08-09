import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="AppletExample" width="400" height="300"></applet>
*/

public class AppletExample extends Applet implements ActionListener {
    Label l1, l2;
    TextField T1, T2;
    Button B1;

    public void init() {
        l1 = new Label("Enter number");
        add(l1);
        l2 = new Label("Factorial");
        add(l2);

        T1 = new TextField(10);
        add(T1);
        T2 = new TextField(10);
        add(T2);

        B1 = new Button("Compute");
        B1.addActionListener(this); // Fixed typo addActionListner -> addActionListener
        add(B1);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == B1) {
            int value = Integer.parseInt(T1.getText());
            int factorial = fact(value);
            T2.setText(String.valueOf(factorial));
        }
    }

    int fact(int n) { // Changed return type from void to int
        if (n == 0)
            return 1;
        else
            return n * fact(n - 1); // Added return keyword
    }
}
