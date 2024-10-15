package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
public class BalanceEnquriy extends JFrame implements ActionListener{
    JLabel label2 ;
    String pin ;
    JButton b1 ;
    BalanceEnquriy(String pin){
        this.pin = pin ;
        ImageIcon  i1= new ImageIcon(ClassLoader.getSystemResource("icon/atm2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("Your Current Balance is Rs");
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(490,370,400,35);
        l3.add(label1); 

        label2 = new JLabel();
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(490,390,400,35);
        l3.add(label2); 
         
        b1 = new JButton("BACK");
        b1.setBounds(740,490,80,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true); 
        int balance= 0;
        try {
            Con1 c = new Con1();
            ResultSet resultSet = c.statement.executeQuery("Select * from bank where pin='"+pin+"'");
            while (resultSet.next()) {
                if(resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                    } else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));   
                    }
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
        label2.setText(""+balance);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new main_Class(pin);
    }
    public static void main(String[] args) {
      new BalanceEnquriy("");  
    }
}