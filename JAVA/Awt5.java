import java.awt.*;
import javax.swing.*;

class Awt5 extends Frame{
    Awt5(){
        Frame f=new Frame();
        
        Label l1=new Label("Name: ");
        TextField t1=new TextField();
        
        Label l2=new Label("Age: ");
        TextField t2=new TextField();
        
        Label l3=new Label("DOB: ");
        TextField t3=new TextField();
        
        Label l4=new Label("Father's Name: ");
        TextField t4=new TextField();
        
        Label l5=new Label("Mother's Name: ");
        TextField t5=new TextField();
        
        Label l6=new Label("Gender: ");
        JRadioButton r1=new JRadioButton("Male");
        JRadioButton r2=new JRadioButton("Female");
        r1.setBounds(75,240,100,30);
        r2.setBounds(200,240,100,30);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        f.add(r1);
        f.add(r2);
        
        Label l7=new Label("Skills: ");
        JCheckBox c1=new JCheckBox("Java");
        JCheckBox c2=new JCheckBox("Python");
        c1.setBounds(75,280,100,30);
        c2.setBounds(200,280,100,30);
        f.add(c1);
        f.add(c2);
        
        Label l8=new Label("Feedback: ");
        TextField t8=new TextField();
        
        Button b1=new Button("Submit");
        Button b2=new Button("Clear");
        
        l1.setBounds(20, 40, 100, 30);
        t1.setBounds(150, 40, 80, 30);
        
        l2.setBounds(20, 80, 100, 30);
        t2.setBounds(150, 80, 80, 30);
        
        l3.setBounds(20, 120, 100, 30);
        t3.setBounds(150, 120, 80, 30);
        
        l4.setBounds(20, 160, 100, 30);
        t4.setBounds(150, 160, 80, 30);
        
        l5.setBounds(20, 200, 100, 30);
        t5.setBounds(150, 200, 80, 30);
        
        l6.setBounds(20, 240, 100, 30);
        l7.setBounds(20, 280, 100, 30);
        
        l8.setBounds(20,320,100,30);
        t8.setBounds(150, 320, 200, 100);

        b1.setBounds(20, 450, 80, 30);
        b2.setBounds(120, 450, 80, 30);
        
        f.add(b1);
        f.add(b2);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(l4);
        f.add(t4);
        f.add(l5);
        f.add(t5);
        f.add(l6);
        f.add(l7);
        f.add(l8);
        f.add(t8);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    } 
    public static void main(String args[]){
        Awt5 v=new Awt5();
    }
}