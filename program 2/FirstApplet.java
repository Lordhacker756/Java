import java.awt.*;
import java.applet.*;

/*
<applet code="FirstApplet" width=400 height=300>
</applet>
*/

public class FirstApplet{
    public void paint(Graphics g){
        g.setColor(Colour.blue);
        Font font = new Font("Arial", Font.bold, 16);
        g.setFont(font);
        g.drawString("This is my first applet", 60, 110);
    }
}