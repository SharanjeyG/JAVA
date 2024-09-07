import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JRadioButton;

class Awt2 extends Frame {
    Awt2(){
        Frame f=new Frame();
        Label l=new Label("Username");
        TextField t=new TextField();
        Button b=new Button("Log in");
        l.setBounds(20,80,70,10);
        t.setBounds(20,100,80,30);
        b.setBounds(20,130,80,30);
        f.add(l);
        f.add(t);
        f.add(b);
        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
/*class Radi{
    Radi(){
        JFrame f=new JFrame();
        JRadioButton r1=new JRadioButton("Male");
        JRadioButton r2=new JRadioButton("Female");
        r1.setBounds(80,180,100,30);
        r2.setBounds(85,180,100,30);
        f.add(r1);
        f.add(r2);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}*/
class Run{
    public static void main(String args[]){
        Awt2 d=new Awt2();
        //Radi v=new Radi();
    }
}
