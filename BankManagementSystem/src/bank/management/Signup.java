package bank.management;
import java.awt.*;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.*;

public class Signup extends JFrame{
    
    Random rand = new Random();
    long num = rand.nextLong() % 9000L + 1000L;

    Signup(){

        super("Application Form");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(180,190,Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel formNo = new JLabel("Application Form No.");
        formNo.setBounds(160,20,600,40);


        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);  
        setLocation(360,40);
        setVisible(true);
    }
    
}
