//AWT - Abstract Window Toolkit
import java.awt.*;
class button extends Frame{
    button(){
        //Label b1=new Label("Click Me");
        //Button b1=new Button("Click Me");
        TextField b1=new TextField();
        b1.setBounds(30,100,50,30);
        add(b1);
        b1.setSize(400,300);
        setLayout(null);
        setVisible(true);
    }
}
class Awt{
    public static void main(String args[]){
        button f=new button();
    }
}