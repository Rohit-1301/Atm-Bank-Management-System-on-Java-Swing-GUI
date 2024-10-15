package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
//import java.awt.event.ActionListener;
import java.sql.*;
public class Withdrawl extends JFrame implements ActionListener {
    String pin ;
    TextField textField;
    JButton b1,b2;
    Withdrawl(String pin){
        this.pin= pin;
        ImageIcon  i1= new ImageIcon(ClassLoader.getSystemResource("icon/atm2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("MAXIMUM AMOUNT WITHDRAWL IS Rs.10,000");
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(490,370,400,35);
        l3.add(label1); 

        JLabel label2 = new JLabel("PLEASE ENTER THE AMOUNT TO WITHDRAWL");
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(490,390,400,35);
        l3.add(label2); 
        
        textField = new TextField();
        textField.setBounds(490,420,320,25);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        l3.add(textField);

        b1 = new JButton("WITHDRAW");
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
        if(e.getSource()==b1){
        try {
            String amount = textField.getText();
            Date date = new Date();
            if( textField.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter The Amount You Want To Withdraw");
            } else {
               Con1 c = new Con1();
               ResultSet resultSet = c.statement.executeQuery("select * from bank where  pin = '"+pin+"'");
               int balance = 0;
               while (resultSet.next()) {
                if(resultSet.getString("type").equals("Deposit")){
                balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));   
                }
               }
               if(balance<Integer.parseInt(amount)){
                JOptionPane.showMessageDialog(null,"Insuffient Balance");
                return ;
               }
               c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Withdrawl','"+amount+"')");
               JOptionPane.showMessageDialog(null, "Rs."+amount+" Debited Succesfully");
               setVisible(false);
               new main_Class(pin);
            } 
        } catch (Exception E) {
         E.printStackTrace();
        }
    }else if(e.getSource()==b2){
        setVisible(false);
        new main_Class(pin);
    }
        
    }
    public static void main(String[] args) {
        new Withdrawl("");
    }
}
