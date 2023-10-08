package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{

    JLabel label1, label2, label3;
    JTextField textField;
    JPasswordField passField;
    JButton signInButton, clearButton, signUpButton;

    Login(){
        super("Bank Management System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(180,190,Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,5,130,130);
        add(image);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630,320,100,100);
        add(iimage);

        
        label1 = new JLabel("WELCOME TO THE BANK");
        label1.setForeground(Color.DARK_GRAY);
        label1.setFont(new Font("AvantGarde",Font.BOLD,30));
        label1.setBounds(210,115,450,40);
        add(label1);

        label2 = new JLabel("Card No:");
        label2.setFont(new Font("Ralway", Font.BOLD,25));
        label2.setForeground(Color.RED);
        label2.setBounds(150,190,375,30);
        add(label2);

        textField = new JTextField(15);
        textField.setBounds(325,190,230,30);
        textField.setFont(new Font("Arial", Font.BOLD,14));
        add(textField);

        label3 = new JLabel("PIN:");
        label3.setFont(new Font("Ralway", Font.BOLD,25));
        label3.setForeground(Color.RED);
        label3.setBounds(150,250,375,30);
        add(label3);

        passField = new JPasswordField(15);
        passField.setBounds(325,250,230,30);
        passField.setFont(new Font("Arial", Font.BOLD,14));
        add(passField);

        signInButton = new JButton("SIGN IN");
        signInButton.setBounds(280,300,100,30);
        signInButton.setFont(new Font("Arial", Font.BOLD,14));
        signInButton.setForeground(Color.WHITE);
        signInButton.setBackground(Color.BLACK);
        signInButton.addActionListener(this);
        add(signInButton);

        clearButton = new JButton("CLEAR");
        clearButton.setBounds(480,300,100,30);
        clearButton.setFont(new Font("Arial", Font.BOLD,14));
        clearButton.setForeground(Color.WHITE);
        clearButton.setBackground(Color.BLACK);
        clearButton.addActionListener(this);
        add(clearButton);

        signUpButton = new JButton("SIGN UP");
        signUpButton.setBounds(380,350,100,30);
        signUpButton.setFont(new Font("Arial", Font.BOLD,14));
        signUpButton.setForeground(Color.WHITE);
        signUpButton.addActionListener(this);
        signUpButton.setBackground(Color.BLUE);
        add(signUpButton);





        getContentPane().setBackground(new Color(100,255,255));



        setLayout(null);
        setSize(850,480);  
        setLocation(450,200);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(e.getSource() == signInButton){

            }else if(e.getSource() == clearButton){
                textField.setText("");
                passField.setText("");
                


            }else if(e.getSource() == signUpButton){

            }
        } catch (Exception E) {
            E.printStackTrace();
        }
        
    }
    
    
    public static void main(String[] args) {
        new Login();
    }
}