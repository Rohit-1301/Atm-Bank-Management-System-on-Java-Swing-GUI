package bank.management.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class main_Class extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin ;
    main_Class(String pin ){
        this.pin = pin ;
        ImageIcon  i1= new ImageIcon(ClassLoader.getSystemResource("icon/atm2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label = new JLabel("Please Select Your Transaction");
        label.setBounds(480,370,700,35);
        label.setForeground(Color.BLACK);
        label.setFont(new Font("System",Font.BOLD,25));
        l3.add(label);
        
        b1 = new JButton("DEPOSIT");
        b1.setBounds(470,418,100,25);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("CASH WITHDRAWL");
        b2.setBounds(720,418,150,25);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("FAST CASH");
        b3.setBounds(470,445,100,25);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("MINI STATMENT");
        b4.setBounds(720,445,150,25);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.addActionListener(this);
        l3.add(b4);
         
        b5 = new JButton("PIN CHANGE");
        b5.setBounds(470,473,120,25);
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("BALANCE ENQUIRY");
        b6.setBounds(720,473,150,25);
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b6.addActionListener(this);
        l3.add(b6);

        b7 = new JButton("EXIST");
        b7.setBounds(720,500,80,25);
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
    public void actionPerformed(ActionEvent e){
     if(e.getSource()==b1){
       new Deposit(pin);
       setVisible(false);
     } else if(e.getSource()==b7){
        System.exit(0);
     } else if(e.getSource()==b2){
        new Withdrawl(pin);
        setVisible(false);
     } else if(e.getSource()==b6){
        new BalanceEnquriy(pin);
        setVisible(false);
     } else if(e.getSource()==b3){
        new Fastcash(pin);
        setVisible(false);
     } else if (e.getSource()==b5){
      new Pin(pin);
      setVisible(false);
     } else if(e.getSource()==b4){
      new Mini(pin);
      setVisible(false);
     }
    }
    public static void main(String[] args) {
        new main_Class("");
    }
}