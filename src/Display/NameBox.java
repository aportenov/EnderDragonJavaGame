package Display;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Niki on 12.6.2016 г..
 */
public class NameBox extends JFrame {
    final JFrame frame = new JFrame();
    public static String playerName = "NoName";

    public NameBox() {
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Please Enter Your Name");
        JTextField textField = new JTextField("", 30);
        JButton enterButt = new JButton("Enter");

        frame.setUndecorated(true);
        frame.setTitle("Enter you name");
        frame.setVisible(true);
        frame.setLocation(480, 280);
        frame.requestFocus();
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        Font fnt = new Font("Calibri", Font.BOLD, 20);
        label.setFont(fnt);

        panel.add(label, 0);
        panel.add(textField, 1);
        panel.add(enterButt, 2);
        frame.add(panel);

        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                playerName = input;
                frame.dispose();
            }
        });

        enterButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                playerName = input;
                frame.dispose();
            }
        });
    }
}