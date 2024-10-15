
package bank.management.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.*;

public class Fastcash extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin ;
    Fastcash(String pin){
        this.pin = pin ;
        ImageIcon  i1= new ImageIcon(ClassLoader.getSystemResource("icon/atm2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label = new JLabel("SELECT WITHDRAWL AMOUNT");
        label.setBounds(520,370,700,35);
        label.setForeground(Color.BLACK);
        label.setFont(new Font("System",Font.BOLD,20));
        l3.add(label);
        
        b1 = new JButton("Rs. 100");
        b1.setBounds(470,418,100,25);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("Rs. 500");
        b2.setBounds(760,418,100,25);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("Rs. 1000");
        b3.setBounds(470,445,100,25);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("Rs. 2000");
        b4.setBounds(760,445,100,25);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.addActionListener(this);
        l3.add(b4);
         
        b5 = new JButton("Rs. 5000");
        b5.setBounds(470,473,100,25);
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("Rs. 10000");
        b6.setBounds(760,473,100,25);
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b6.addActionListener(this);
        l3.add(b6);

        b7 = new JButton("BACK");
        b7.setBounds(760,500,80,25);
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        b7.addActionListener(this);
        l3.add(b7);
        




        setLayout(null);
        setSize(1550,830);
        setLocation(0,0);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==b7){
        setVisible(false);
        new main_Class(pin);
      } else {
        String amount = ((JButton)e.getSource()).getText().substring(4);
        Con1 c = new  Con1();
        Date date = new Date();
        try {
           ResultSet resultSet = c.statement.executeQuery("select * from bank where pin='"+pin+"'"); 
           int balance = 0;
           while(resultSet.next()) {
            if(resultSet.getString("type").equals("Deposit")){
              balance += Integer.parseInt(resultSet.getString("amount"));
           } else {
            balance -= Integer.parseInt(resultSet.getString("amount"));
           }
           }String num = "17";

           if(e.getSource() !=b7 && balance <Integer.parseInt(amount)){
            JOptionPane.showMessageDialog(null, "Insuffient balance");
            return;
           }  
           c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','withdrawl','"+amount+"')");
           JOptionPane.showMessageDialog(null,"Rs. "+amount+" Debited Successfully" );

        } catch (Exception E) {
            E.printStackTrace();
        }
        new main_Class(pin);
        setVisible(false);
      }




    }
    public static void main(String[] args) {
        new Fastcash("");
    }
}

