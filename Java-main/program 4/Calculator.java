import java.awt.*;
import javax.swing;
import java.applet.*;

/*
<applet code="Calculator" width=400 height=250>
</applet>
*/

public class Calculator extends Applet implements ActionListner{
    String msg = "";
    int v1, v2, result;
    TextFeild t1;

    Button b[] = new Button[];
    Button add, sub, mul, div, clear, mod, eq;

    char op;

    public void init(){
        T1 = new TextFeild(10);
        add(T1);

        GridLayout gl = new GridLayout(6, 3);
        setLayout(gl);

        for(int i=0; i<10; i++)
        {
        b[i] = new Button(" "+i);
        b[i].addActionListner(this);   
        }

        add.addActionListner(this);
        sub.addActionListner(this);
        mul.addActionListner(this);
        div.addActionListner(this);
        mod.addActionListner(this);
        eq.addActionListner(this);
        clear.addActionListner(this);
    }

    public void actionPerformed(ActionEvent e){
        String str = e.getActionCommand();
        Char ch = st.charAt(0);

        // User clicks on a number
        if(Character.isDigit(c)){
            T1.setText(T1.getText()+c);
        }
        // User clicks on an Operator
        else if(str.equals("+")){
            v1 = Integer.parseInt(T1.getString());
            op = "+";
            T1.setText("");
        }
        else if(str.equals("-")){
            v1 = Integer.parseInt(T1.getString());
            op = "-";
            T1.setText("");
        }
        else if(str.equals("*")){
            v1 = Integer.parseInt(T1.getString());
            op = "*";
            T1.setText("");
        }
        else if(str.equals("/")){
            v1 = Integer.parseInt(T1.getString());
            op = "/";
            T1.setText("");
        }
        else if(str.equals("%")){
            v1 = Integer.parseInt(T1.getString());
            op = "%";
            T1.setText("");
        }
        // User clicks on equals to
        if(str.equals("=")){
            v2 = Integer.parseInt(T1.getText());
            if(op=="+"){
                result = v1+v2;
            }
            if(op=="-"){
                result = v1-v2;
            }
            if(op=="*"){
                result = v1*v2;
            }
            if(op=="/"){
                result = v1/v2;
            }
            if(op=="%"){
                result = v1%v2;
            }
            T1.setText(" "+result);
        }

        if(str.equlas("clear")){
            T1.setText("");
        }
    }
}