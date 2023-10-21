import java.awt.*;
import java.awt.event.ActionListener;
import awt.event.*;
import javax.swing.*;
public class Bt extends JFrame{
  public static void main(String[] args){
    String a = "<|<|...HAR...HAR...MAHADEV...|>|>";
    System.out.println(a);

    JFrame f = new JFrame("login form");

    JLabel H = new JLabel("<|.HAR.HAR.MAHADEV.|>");
    H.setBounds(30,50,170,30);
    H.setForeground(Color.ORANGE);

    JLabel f1 = new JLabel("Username");
    TextField tf = new TextField();
    tf.setBounds(50,90,100,30);
    f1.setBounds(50, 70, 100, 30);

    JLabel f2 = new JLabel("Password");
    final JPasswordField t2f = new JPasswordField();
    t2f.setBounds(50,140,100,30);
    f2.setBounds(50, 120,  100, 30);

    JButton b = new JButton("LOGIN");
    b.setBounds(50, 180, 100, 30);
    b.setBorder(BorderFactory.createLineBorder(Color.ORANGE));

    f.add(H);
    f.add(tf);
    f.add(f1);
    f.add(t2f);
    f.add(f2);
    f.add(b);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
  }
}