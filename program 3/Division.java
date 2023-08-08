import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.swing.*;

/*
<applet code="Division" width=400 height=250>
</applet>
*/

public class Division extends Applet impliments ActionListner{
    Label L1, L2, L3;
    TextFeild T1, T2, Result;
    Button B1;

    public void init(){
        L1 = new Lable("Number One");
        add(L1);
        L2 = new Label("Number Two");
        add(L2);
        L3 = new Label("Result");
        add(L3);

        Result = new TextFeild(10);
        add(Result);

        B1 = new Button("Divide");
        add(B1);

        B1.addActionListner(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == B1){
            try{
                int val1 = Integer.parseInt(T1.getText());
                int val2 = Integer.parseInt(T2.getText());
                int result = val1/val2;
                Result.setText(String.valueOf(result));
            }catch(NumberFormatException nfe){
                Joptionpane.showMessageDialogue(this, "Not a number");
            }catch(ArithmeticException ae){
                Joptionpane.showMessageDialogue(this, "Divide by zero")
            }
        }
    }

}