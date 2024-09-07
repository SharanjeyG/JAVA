import javax.swing.*;
class Chec {
        Chec(){
            JFrame f=new JFrame();
            JCheckBox r1=new JCheckBox("Java");
            JCheckBox r2=new JCheckBox("Python");
            r1.setBounds(75,50,100,30);
            r2.setBounds(75,100,100,30);
            /*ButtonGroup bg=new ButtonGroup();
            bg.add(r1);
            bg.add(r2);*/
            f.add(r1);
            f.add(r2);
            f.setSize(400, 300);
            f.setLayout(null);
            f.setVisible(true);
        }
        public static void main(String args[]){
            Chec v=new Chec();
        }
}

