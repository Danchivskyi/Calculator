import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AppGUI extends JFrame implements ActionListener {
    double number, answer;
    int calculation;

    JLabel label = new JLabel();
    JTextField display = new JTextField();
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton b0 = new JButton("0");
    JButton bdiv = new JButton("/");
    JButton bmul = new JButton("*");
    JButton bsub = new JButton("-");
    JButton badd = new JButton("+");
    JButton bdec = new JButton(".");
    JButton beq = new JButton("=");
    JButton bd = new JButton("Delete");
    JButton bc = new JButton("Clear");

    public AppGUI() {
        //Dla widok,edycja,pomoc
        JPanel p1 = new JPanel();
        p1.setBackground(Color.BLACK);
        JButton bw = new JButton("Exit");
        JButton be = new JButton("Save");
        JButton bp = new JButton("Pomóc");
        p1.setLayout(new GridLayout(1, 3));
        //


        //Dla
        JPanel p2 = new JPanel();
        p2.setBackground(Color.WHITE);
        JButton ee = new JButton("Copyright @ 2022 Oleh Danchivskyi");
        //


        // Kalkulator
        JPanel p3 = new JPanel();
        p3.setBackground(Color.BLACK);

        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.WHITE);
        display.setBounds(150, 50, 280, 30);

        b1.setBounds(150, 100, 50, 40);
        b2.setBounds(201, 100, 50, 40);
        b3.setBounds(252, 100, 50, 40);
        bdiv.setBounds(303, 100, 50, 40);

        b4.setBounds(150, 141, 50, 40);
        b5.setBounds(201, 141, 50, 40);
        b6.setBounds(252, 141, 50, 40);
        bmul.setBounds(303, 141, 50, 40);

        b7.setBounds(150, 182, 50, 40);
        b8.setBounds(201, 182, 50, 40);
        b9.setBounds(252, 182, 50, 40);
        bsub.setBounds(303, 182, 50, 40);

        bdec.setBounds(150, 223, 50, 40);
        b0.setBounds(201, 223, 50, 40);
        beq.setBounds(252, 223, 50, 40);
        badd.setBounds(303, 223, 50, 40);

        bd.setBounds(150, 264, 100, 40);
        bc.setBounds(252, 264, 100, 40);
        //


        //Dla widok,edycja,pomoc
        add(p1, BorderLayout.NORTH);
        p1.add(bw);
        p1.add(be);
        p1.add(bp);
        //

        //
        add(p2, BorderLayout.SOUTH);
        ee.setText("Copyright @ 2022 Oleh Danchivskyi");
        p2.add(ee);
        //

        //Calculator
        add(p3, BorderLayout.CENTER);
        p3.add(display);
        p3.add(b1);
        p3.add(b2);
        p3.add(b3);
        p3.add(b4);
        p3.add(b5);
        p3.add(b6);
        p3.add(b7);
        p3.add(b8);
        p3.add(b9);
        p3.add(b0);
        p3.add(bdiv);
        p3.add(bmul);
        p3.add(bsub);
        p3.add(badd);
        p3.add(bdec);
        p3.add(beq);
        p3.add(bd);
        p3.add(bc);


        p3.setLayout(null);
        p3.setVisible(true);
        //

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
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        bsub.addActionListener(this);
        badd.addActionListener(this);
        bdec.addActionListener(this);
        beq.addActionListener(this);
        bd.addActionListener(this);
        bc.addActionListener(this);


        setTitle("Calculator");
        setSize(600, 600);
        setVisible(true);

    }

    public static void main(String[] args) {
        AppGUI borderLayoutDemo = new AppGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == bc) {
            label.setText("");
            display.setText("");
        } else if (source == bd) {
            int length = bc.getText().length();
            int number = length - 1;

            if (length > 0) {
                StringBuilder back = new StringBuilder(display.getText());
                back.deleteCharAt(number);
                display.setText(back.toString());
            }
        }

        if (source == b0) {
            if (display.getText().equals("0")) {
                return;
            } else {
                display.setText(display.getText() + "0");
            }
        } else if (source == b1) {
            display.setText(display.getText() + "1");
        } else if (source == b2) {
            display.setText(display.getText() + "2");
        } else if (source == b3) {
            display.setText(display.getText() + "3");
        } else if (source == b4) {
            display.setText(display.getText() + "4");
        } else if (source == b5) {
            display.setText(display.getText() + "5");
        } else if (source == b6) {
            display.setText(display.getText() + "6");
        } else if (source == b7) {
            display.setText(display.getText() + "7");
        } else if (source == b8) {
            display.setText(display.getText() + "8");
        } else if (source == b9) {
            display.setText(display.getText() + "9");
        } else if (source == bdec) {
            if (display.getText().contains(".")) {
                return;
            } else {
                display.setText(display.getText() + ".");
            }
        } else if (source == badd) {
            String str = display.getText();
            number = Double.parseDouble(display.getText());
            display.setText("");
            label.setText(str + "+");
            calculation = 1;
        } else if (source == bsub) {
            String str = display.getText();
            number = Double.parseDouble(display.getText());
            display.setText("");
            label.setText(str + "-");
            calculation = 2;
        } else if (source == bmul) {
            String str = display.getText();
            number = Double.parseDouble(display.getText());
            display.setText("");
            label.setText(str + "X");
            calculation = 3;
        } else if (source == bdiv) {
            String str = display.getText();
            number = Double.parseDouble(display.getText());
            display.setText("");
            label.setText(str + "/");
            calculation = 4;
        } else if (source == beq) {
            switch (calculation) {
                case 1:
                    answer = number + Double.parseDouble(display.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        display.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        display.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 2:
                    answer = number - Double.parseDouble(display.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        display.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        display.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 3:
                    answer = number * Double.parseDouble(display.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        display.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        display.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 4:
                    answer = number / Double.parseDouble(display.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        display.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        display.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
            }
        }
    }
}


