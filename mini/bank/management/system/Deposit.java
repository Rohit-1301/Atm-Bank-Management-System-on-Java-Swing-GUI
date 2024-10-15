package bank.management.system;

//import java.awt.Color;
//import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.*;

import javax.swing.*;

public class Deposit extends JFrame implements ActionListener  {
     String pin ;
    TextField textField;
    JButton b1,b2;
       Deposit(String pin){
        this.pin = pin ;
        ImageIcon  i1= new ImageIcon(ClassLoader.getSystemResource("icon/atm2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("ENTER THE AMOUNT YOU WANT DO DEPOSIT");
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(490,370,400,35);
        l3.add(label1); 
        
        textField = new TextField();
        textField.setBounds(490,400,320,25);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        l3.add(textField);

        b1 = new JButton("DEPOSIT");
        b1.setBounds(740,455,125,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(740,490,125,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2); 



       setLayout(null);
       setSize(1550,1080);
       setLocation(0,0);
       setVisible(true);
       }
    @Override
    public void actionPerformed(ActionEvent e) {
    try {
        String amount = textField.getText();
        Date date = new Date() ;
        if(e.getSource()==b1){
            if(textField.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposit");
            } else{
                Con1 c = new Con1();
                c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");
                JOptionPane.showMessageDialog(null,"Rs. "+amount+"Deposited Successfully");
                setVisible(false);
                new main_Class(pin);
            }
        } else if (e.getSource()==b2){
            
          setVisible(false);
          new main_Class(pin);
        }
        
    } catch (Exception E) {
        E.printStackTrace();
    }
        
    }
       
    public static void main(String[] args) {
        new Deposit("");
    }
}