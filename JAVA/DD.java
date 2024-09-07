import javax.swing.*;

class DD {
    JFrame f;
    DD(){
        f = new JFrame("Dropdown");
        String anime[]={"Hunter X Hunter","Naruto","Death Note","Attack On Titan"};
        JComboBox cb=new JComboBox(anime);
        cb.setBounds(50,50,150,30);
        f.add(cb);
        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[]){
        new DD();
    } 
}
