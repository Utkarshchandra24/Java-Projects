import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void converter() {
        JFrame f = new JFrame("CURRENCY CONVERTER");
        JLabel l1, l2;
        JTextField t1, t2;
        JButton b1, b2, b3;

        // Naming the labels and setting the bounds
        l1 = new JLabel("Rupees: ");
        l1.setBounds(20, 40, 60, 30);
        l2 = new JLabel("Dollars: ");
        l2.setBounds(170, 40, 80, 30);

        // Creating text field
        t1 = new JTextField("0");
        t1.setBounds(80, 40, 50, 30);
        t2 = new JTextField("0");
        t2.setBounds(240, 40, 50, 30);

        // Creating INR and Dollars buttons
        b1 = new JButton("INR");
        b1.setBounds(50, 80, 80, 30);
        b2 = new JButton("Dollar");
        b2.setBounds(190, 80, 80, 30);
        b3 = new JButton("Close");
        b3.setBounds(150, 150, 80, 30);

        // Adding a listener
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Converting to double
                double d = Double.parseDouble(t1.getText());
                // Converting Rupees to Dollars
                double d1 = (d / 65.25);
                String str1 = String.format("%.2f",d1);
                t2.setText(str1);
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Converting to double
                double d2 = Double.parseDouble(t2.getText());
                double d3 = (d2 * 80.95);
                String str2 = String.format("%.2f",d3);

                // Placing it in the text box
                t1.setText(str2);
            }
        });

        // Action Listener to close the form
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });

        // Default method for closing the frame
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Adding the created objects to the form
        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.setLayout(null);
        f.setSize(400, 300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        converter();
    }
}
