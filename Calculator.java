import java.awt.event.*;
import javax.swing.JFrame;
import java.awt.*;

public class Calculator extends JFrame implements ActionListener {
    JFrame f;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, Remove, Cls;
    Button A, S, M, D, E;
    Button DOT, MOD;
    double R, n1, n2, check;
    Label H, dl;
    String op;

    Calculator() {
        f = new JFrame("Ansh & Shivansh..... Calculator");

        H = new Label("<|<|...HAR.HAR.MAHADEV...|>|>");
        H.setBounds(180, 100, 200, 40);
        H.setForeground(Color.ORANGE);

        dl = new Label();
        dl.setBackground(Color.BLUE);
        dl.setBounds(50, 150, 400, 40);
        dl.setForeground(Color.YELLOW);

        // Numbers 1 to 10

        b1 = new Button("1");
        b1.setBounds(50, 200, 100, 45);
        b1.setBackground(Color.YELLOW);

        b2 = new Button("2");
        b2.setBackground(Color.YELLOW);
        b2.setBounds(150, 200, 100, 45);

        b3 = new Button("3");
        b3.setBackground(Color.YELLOW);
        b3.setBounds(250, 200, 100, 45);

        b4 = new Button("4");
        b4.setBackground(Color.YELLOW);
        b4.setBounds(50, 250, 100, 45);

        b5 = new Button("5");
        b5.setBackground(Color.YELLOW);
        b5.setBounds(150, 250, 100, 45);

        b6 = new Button("6");
        b6.setBackground(Color.YELLOW);
        b6.setBounds(250, 250, 100, 45);

        b7 = new Button("7");
        b7.setBackground(Color.YELLOW);
        b7.setBounds(50, 300, 100, 45);

        b8 = new Button("8");
        b8.setBackground(Color.YELLOW);
        b8.setBounds(150, 300, 100, 45);

        b9 = new Button("9");
        b9.setBackground(Color.YELLOW);
        b9.setBounds(250, 300, 100, 45);

        b0 = new Button("0");
        b0.setBackground(Color.YELLOW);
        b0.setBounds(150, 350, 100, 45);

        // Operators & Function Button

        S = new Button("-");
        S.setBounds(350, 250, 100, 45);
        S.setBackground(Color.YELLOW);

        A = new Button("+");
        A.setBounds(350, 200, 100, 45);
        A.setBackground(Color.YELLOW);

        M = new Button("*");
        M.setBounds(350, 300, 100, 45);
        M.setBackground(Color.YELLOW);

        D = new Button("/");
        D.setBounds(350, 350, 100, 45);
        D.setBackground(Color.YELLOW);

        E = new Button("=");
        E.setBounds(50, 450, 400, 45);
        E.setBackground(Color.YELLOW);

        DOT = new Button("DECIMAL");
        DOT.setBounds(50, 350, 100, 45);
        DOT.setBackground(Color.YELLOW);

        MOD = new Button("%");
        MOD.setBounds(250, 350, 100, 45);
        MOD.setBackground(Color.YELLOW);

        Remove = new Button("REMOVE");
        Remove.setBackground(Color.YELLOW);
        Remove.setBounds(50, 400, 200, 45);

        Cls = new Button("CLEAR");
        Cls.setBackground(Color.YELLOW);
        Cls.setForeground(Color.RED);
        Cls.setBounds(250, 400, 200, 45);

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

        DOT.addActionListener(this);
        MOD.addActionListener(this);

        // ADDING TO FRAME

        f.add(H);
        f.add(dl);
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
        f.add(DOT);
        f.add(MOD);
        f.add(E);

        f.setSize(540, 590);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String z = "", zt = "";

        // NUMBER BUTTON

        if (e.getSource() == b1) {
            zt = dl.getText();
            z = zt + "1";
            dl.setText(z);
        }
        if (e.getSource() == b2) {
            zt = dl.getText();
            z = zt + "2";
            dl.setText(z);
        }
        if (e.getSource() == b3) {
            zt = dl.getText();
            z = zt + "3";
            dl.setText(z);
        }
        if (e.getSource() == b4) {
            zt = dl.getText();
            z = zt + "4";
            dl.setText(z);
        }
        if (e.getSource() == b5) {
            zt = dl.getText();
            z = zt + "5";
            dl.setText(z);
        }
        if (e.getSource() == b6) {
            zt = dl.getText();
            z = zt + "6";
            dl.setText(z);
        }
        if (e.getSource() == b7) {
            zt = dl.getText();
            z = zt + "7";
            dl.setText(z);
        }
        if (e.getSource() == b8) {
            zt = dl.getText();
            z = zt + "8";
            dl.setText(z);
        }
        if (e.getSource() == b9) {
            zt = dl.getText();
            z = zt + "9";
            dl.setText(z);
        }
        if (e.getSource() == b0) {
            zt = dl.getText();
            z = zt + "0";
            dl.setText(z);
        }

        // FOR BACKSPACE

        if (e.getSource() == Remove) {
            zt = dl.getText();
            try {
                z = zt.substring(0, zt.length() - 1);
            } catch (StringIndexOutOfBoundsException f) {
                return;
            }
            dl.setText(z);
        }

        // ADDITION BUTTON

        if (e.getSource() == A) {
            try {
                n1 = Double.parseDouble(dl.getText());
            } catch (NumberFormatException f) {
                dl.setText("Invalid Format");
                return;
            }
            z = "";
            dl.setText(z);
            check = 1;
        }

        // SUBSTRACTION BUTTON

        if (e.getSource() == S) {
            try {
                n1 = Double.parseDouble(dl.getText());
            } catch (NumberFormatException f) {
                dl.setText("Invalid Format");
                return;
            }
            z = "";
            dl.setText(z);
            check = 2;
        }

        // MULTIPICATION BUTTON

        if (e.getSource() == M) {
            try {
                n1 = Double.parseDouble(dl.getText());
            } catch (NumberFormatException f) {
                dl.setText("Invalid Format");
                return;
            }
            z = "";
            dl.setText(z);
            check = 3;
        }

        // DIVIDE BUTTON

        if (e.getSource() == D) {
            try {
                n1 = Double.parseDouble(dl.getText());
            } catch (NumberFormatException f) {
                dl.setText("Invalid Format");
                return;
            }
            z = "";
            dl.setText(z);
            check = 4;
        }

        // FOR MOD OPERATOR

        if (e.getSource() == MOD) {
            try {
                n1 = Double.parseDouble(dl.getText());
            } catch (NumberFormatException f) {
                dl.setText("Invalid Format");
                return;
            }
            z = "";
            dl.setText(z);
            check = 5;
        }

        // FOR DOT OPERATOR

        if (e.getSource() == DOT) {
            zt = dl.getText();
            z = zt + ".";
            dl.setText(z);
        }

        // CLEAR SCREEN

        if (e.getSource() == Cls) {
            n1 = 0;
            n2 = 0;
            check = 0;
            R = 0;
            z = "";
            dl.setText(z);
        }
        // TO CALCULATE THE VALUE GIVEN

        if (e.getSource() == E) {
            try {
                n2 = Double.parseDouble(dl.getText());
            } catch (Exception f) {
                dl.setText("ENTER NUMBER FIRST ");
                return;
            }
            if (check == 1) {
                R = n1 + n2;
                op = " + ";
            }
            if (check == 2) {
                R = n1 - n2;
                op = " - ";
            }
            if (check == 3) {
                R = n1 * n2;
                op = " * ";
            }
            if (check == 4) {
                R = n1 / n2;
                op = " / ";
            }
            if (check == 5) {
                R = n1 % n2;
                op = " % ";
            }
            dl.setText(String.valueOf(n1 + op + n2 + " = " + R));
        }
    }

    public static void main(String args[]) {
        new Calculator();
    }
}