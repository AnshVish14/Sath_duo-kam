import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListner;
class equal extends JFrame implements ActionListener{
    public static void main(String[] args){
        JFrame f = new JFrame("Calculator");

        Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,Remove,Cls;



        JLabel H = new JLabel("<|.HAR.HAR.MAHADEV.|>");
        H.setBounds(50,40,150,50);

        JLabel f1 = new JLabel(" * pls enter the number :");
        JTextField tf = new JTextField();
        tf.setBounds(50,100,150,30);
        f1.setBounds(50,70,150,30);
        
         b1 = new Button("1");
         b1.setBounds(50,200,100,30);
         b1.setBackground(Color.YELLOW);

         b2 = new Button("2");
         b2.setBackground(Color.YELLOW);
         b2.setBounds(150, 200,100,30);

         b3 = new Button("3");
         b3.setBackground(Color.YELLOW);
         b3.setBounds(250, 200,100,30);

         b4 = new Button("4");
         b4.setBackground(Color.YELLOW);
         b4.setBounds(50,250,100,30);

         b5 = new Button("5");
         b5.setBackground(Color.YELLOW);
         b5.setBounds(150, 250,100,30);

         b6 = new Button("6");
         b6.setBackground(Color.YELLOW);
         b6.setBounds(250, 250,100,30);

         b7 = new Button("7");
         b7.setBackground(Color.YELLOW);
         b7.setBounds(50,300,100,30);

         b8 = new Button("8");
         b8.setBackground(Color.YELLOW);
         b8.setBounds(150,300,100,30);

         b9 = new Button("9");
         b9.setBackground(Color.YELLOW);
         b9.setBounds(250,300,100,30); 

         Remove = new Button("Remove");
         Remove.setBackground(Color.YELLOW);
         Remove.setBounds(50,350,100,30);

         b0 = new Button("0");
         b0.setBackground(Color.YELLOW);
         b0.setBounds(150,350,100,30);

         Cls = new Button("Cls");
         Cls.setBackground(Color.YELLOW);
         Cls.setBounds(250,350,100,30);




        f.add(H);
        f.add(tf);
        f.add(f1);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(Remove);
        f.add(b0);
        f.add(Cls);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
