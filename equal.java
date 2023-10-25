import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

abstract class equal extends JFrame implements ActionListener{
    public static void main(String[] args){
        JFrame f = new JFrame("Ansh & Shivansh..... Calculator");

        Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,Remove,Cls;
        Button A,S,M,D,E ;

        JLabel H = new JLabel("<|<|...HAR.HAR.MAHADEV...|>|>");
        H.setBounds(180,50,300,50);
        H.setForeground(Color.ORANGE);

        JLabel f1 = new JLabel(" PLEASE ENTER A NUMBER :-");
        JTextField tf = new JTextField();
        tf.setBounds(50,150,400,30);
        f1.setBounds(50,110,300,30);
        
        //Numbers 1 to 10
         b1 = new Button("1");
         b1.setBounds(50,200,100,45);
         b1.setBackground(Color.YELLOW);

         b2 = new Button("2");
         b2.setBackground(Color.YELLOW);
         b2.setBounds(150, 200,100,45);

         b3 = new Button("3");
         b3.setBackground(Color.YELLOW);
         b3.setBounds(250, 200,100,45);

         b4 = new Button("4");
         b4.setBackground(Color.YELLOW);
         b4.setBounds(50,250,100,45);

         b5 = new Button("5");
         b5.setBackground(Color.YELLOW);
         b5.setBounds(150, 250,100,45);

         b6 = new Button("6");
         b6.setBackground(Color.YELLOW);
         b6.setBounds(250, 250,100,45);

         b7 = new Button("7");
         b7.setBackground(Color.YELLOW);
         b7.setBounds(50,300,100,45);

         b8 = new Button("8");
         b8.setBackground(Color.YELLOW);
         b8.setBounds(150,300,100,45);

         b9 = new Button("9");
         b9.setBackground(Color.YELLOW);
         b9.setBounds(250,300,100,45); 

         b0 = new Button("0");
         b0.setBackground(Color.YELLOW);
         b0.setBounds(150,350,100,45);

         //Operators & Function Button
         S = new Button("-");
         S.setBounds(350,250,100,45);
         S.setBackground(Color.YELLOW);

         A = new Button("+");
         A.setBounds(350,200,100,45);
         A.setBackground(Color.YELLOW);

         M = new Button("*");
         M.setBounds(350,300,100,45);
         M.setBackground(Color.YELLOW);

         D = new Button("/");
         D.setBounds(350,350,100,45);
         D.setBackground(Color.YELLOW);

         E = new Button("=");
         E.setBounds(50,400,400,45);
         E.setBackground(Color.YELLOW);

         Remove = new Button("Remove");
         Remove.setBackground(Color.YELLOW);
         Remove.setBounds(50,350,100,45);

         Cls = new Button("Cls");
         Cls.setBackground(Color.YELLOW);
         Cls.setBounds(250,350,100,45);

         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);
         b4.addActionListener(this);
         b5.addActionListener(this);
         b6.addActionListener(this);
         b7.addActionListener(this);
         b8.addActionListener(this);
         b9.addActionListener(this);
         b0.addActionListener(this);

         S.addActionListener(this);
         A.addActionListener(this);
         M.addActionListener(this);
         D.addActionListener(this);
         E.addActionListener(this);
         Cls.addActionListener(this);
         Remove.addActionListener(this);
     
        //ADDING TO FRAME
        f.add(H);
        f.add(tf);
        f.add(f1);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(A);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(S);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(M);
        f.add(Remove);
        f.add(b0);
        f.add(Cls);
        f.add(D);
        f.add(E);

        f.setSize(540,540);
        f.setLayout(null);
        f.setVisible(true);
    }
}
