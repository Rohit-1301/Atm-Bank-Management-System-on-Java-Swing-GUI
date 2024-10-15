
package bank.management.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import java.awt.*;

public class Pin extends JFrame implements ActionListener {
     JButton b1,b2;
    JPasswordField p1,p2;
    String pin ;
    Pin(String pin ){
        this.pin = pin ;
     ImageIcon  i1= new ImageIcon(ClassLoader.getSystemResource("icon/atm2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("CHANGE YOUR PIN");
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(590,370,400,35);
        l3.add(label1); 

        JLabel label2 = new JLabel("NEW PIN ");
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(480,395,400,35);
        l3.add(label2); 

        p1 = new JPasswordField();
        p1.setBounds(650,400,150,22);
        p1.setFont(new Font("Raleway",Font.BOLD,22));
        l3.add(p1);

        JLabel label3 = new JLabel("RE-ENTER THE PIN");
        label3.setForeground(Color.BLACK);
        label3.setFont(new Font("System",Font.BOLD,16));
        label3.setBounds(480,425,400,35);
        l3.add(label3); 

        p2 = new JPasswordField();
        p2.setBounds(650,430,150,22);
        p2.setFont(new Font("Raleway",Font.BOLD,22));
        l3.add(p2);
        
        b1 = new JButton("CHANGE");
        b1.setBounds(740,455,100,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(740,490,100,30);
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
        @SuppressWarnings("deprecation")
        String pin1 = p1.getText();
        String pin2 = p2.getText();
        if(!pin1.equals(pin2)){
         JOptionPane.showMessageDialog(null, "Entered PIN does not match");
         return;
        }
        if(e.getSource()==b1){
            if(p1.getText().equals("")){
             JOptionPane.showMessageDialog(null, "Enter New PIN");
             return ;
            } 
            if(p2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Re-Enter New PIN");
             return;
        }
        Con1 c = new Con1();
        String q1 = "update bank set pin='"+pin1+"' where pin='"+pin+"'";
        String q2 = "update login set pin='"+pin1+"' where pin='"+pin+"'";
        String q3 = "update signupthree set pin='"+pin1+"' where pin='"+pin+"'";

        c.statement.executeUpdate(q1);
        c.statement.executeUpdate(q2);
        c.statement.executeUpdate(q3);
        JOptionPane.showMessageDialog(null, "PIN change successfully");
        setVisible(false);
        new main_Class(pin);
    } 
        else if(e.getSource()==b2){
            new main_Class(pin);
            setVisible(false);
        } 
    } catch (Exception E) {
        

    }
        
    }
    public static void main(String[] args) {
        new Pin("new pin");
    }
}
