// package bank.management.system;

// import java.awt.*;
// import java.awt.event.*;
// import java.text.SimpleDateFormat;
// import java.util.Date;
// import java.util.Random;
// import javax.swing.*;
// import com.toedter.calendar.JDateChooser;

// public class Signup extends JFrame implements ActionListener {
//     JTextField textName, textFname, textEmail, textAdd, textCity, textPin, textState;
//     JDateChooser dateChooser;
//     JRadioButton r1, r2, M1, M2, M3;
//     JButton next;
//     Random ran = new Random();
//     long first4 = (ran.nextLong() % 9000L) + 1000L;
//     String first = " " + Math.abs(first4);

//     public Signup() {
//         super("APPLICATION FORM");
        
//         // Adding bank logo
//         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank1.jpg"));
//         Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
//         ImageIcon i3 = new ImageIcon(i2);
//         JLabel image = new JLabel(i3);
//         image.setBounds(25, 10, 100, 100);
//         add(image);

//         // Application form number
//         JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
//         label1.setBounds(160, 20, 600, 40);
//         label1.setFont(new Font("Raleway", Font.BOLD, 38));
//         add(label1);

//         // Page details
//         JLabel label2 = new JLabel("Page 1");
//         label2.setBounds(330, 70, 600, 30);
//         label2.setFont(new Font("Raleway", Font.BOLD, 22));
//         add(label2);

//         JLabel label3 = new JLabel("Personal Details");
//         label3.setBounds(290, 90, 600, 30);
//         label3.setFont(new Font("Raleway", Font.BOLD, 22));
//         add(label3);

//         // Form fields
//         JLabel labelName = new JLabel("Name :");
//         labelName.setBounds(100, 190, 100, 30);
//         labelName.setFont(new Font("Raleway", Font.BOLD, 20));
//         add(labelName);

//         textName = new JTextField();
//         textName.setBounds(300, 190, 400, 30);
//         textName.setFont(new Font("Raleway", Font.BOLD, 14));
//         add(textName);

//         JLabel labelfName = new JLabel("Father's Name :");
//         labelfName.setBounds(100, 240, 200, 30);
//         labelfName.setFont(new Font("Raleway", Font.BOLD, 20));
//         add(labelfName);

//         textFname = new JTextField();
//         textFname.setBounds(300, 240, 400, 30);
//         textFname.setFont(new Font("Raleway", Font.BOLD, 14));
//         add(textFname);

//         JLabel DOB = new JLabel("Date of Birth :");
//         DOB.setBounds(100, 340, 200, 30);
//         DOB.setFont(new Font("Raleway", Font.BOLD, 20));
//         add(DOB);

//         dateChooser = new JDateChooser();
//         dateChooser.setForeground(new Color(105, 105, 105));
//         dateChooser.setBounds(300, 340, 400, 30);
//         add(dateChooser);

//         JLabel labelG = new JLabel("Gender :");
//         labelG.setBounds(100, 290, 200, 30);
//         labelG.setFont(new Font("Raleway", Font.BOLD, 20));
//         add(labelG);

//         r1 = new JRadioButton("Male");
//         r1.setBounds(300, 290, 60, 30);
//         r1.setBackground(new Color(222, 255, 228));
//         r1.setFont(new Font("Raleway", Font.BOLD, 14));
//         add(r1);

//         r2 = new JRadioButton("Female");
//         r2.setBounds(400, 290, 90, 30);
//         r2.setBackground(new Color(222, 255, 228));
//         r2.setFont(new Font("Raleway", Font.BOLD, 14));
//         add(r2);

//         ButtonGroup genderGroup = new ButtonGroup();
//         genderGroup.add(r1);
//         genderGroup.add(r2);

//         JLabel labelEmail = new JLabel("Email :");
//         labelEmail.setBounds(100, 390, 200, 30);
//         labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
//         add(labelEmail);

//         textEmail = new JTextField();
//         textEmail.setBounds(300, 390, 400, 30);
//         textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
//         add(textEmail);

//         JLabel labelMs = new JLabel("Marital Status :");
//         labelMs.setBounds(100, 440, 200, 30);
//         labelMs.setFont(new Font("Raleway", Font.BOLD, 20));
//         add(labelMs);

//         M1 = new JRadioButton("Married");
//         M1.setBounds(300, 440, 100, 30);
//         M1.setBackground(new Color(222, 255, 228));
//         M1.setFont(new Font("Raleway", Font.BOLD, 14));
//         add(M1);

//         M2 = new JRadioButton("Unmarried");
//         M2.setBounds(450, 440, 100, 30);
//         M2.setBackground(new Color(222, 255, 228));
//         M2.setFont(new Font("Raleway", Font.BOLD, 14));
//         add(M2);

//         M3 = new JRadioButton("Other");
//         M3.setBounds(635, 440, 100, 30);
//         M3.setBackground(new Color(222, 255, 228));
//         M3.setFont(new Font("Raleway", Font.BOLD, 14));
//         add(M3);

//         ButtonGroup maritalGroup = new ButtonGroup();
//         maritalGroup.add(M1);
//         maritalGroup.add(M2);
//         maritalGroup.add(M3);

//         JLabel labelAdd = new JLabel("Address :");
//         labelAdd.setBounds(100, 490, 200, 30);
//         labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
//         add(labelAdd);

//         textAdd = new JTextField();
//         textAdd.setBounds(300, 490, 400, 30);
//         textAdd.setFont(new Font("Raleway", Font.BOLD, 14));
//         add(textAdd);

//         JLabel labelCity = new JLabel("City :");
//         labelCity.setBounds(100, 540, 200, 30);
//         labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
//         add(labelCity);

//         textCity = new JTextField();
//         textCity.setBounds(300, 540, 400, 30);
//         textCity.setFont(new Font("Raleway", Font.BOLD, 14));
//         add(textCity);

//         JLabel labelPin = new JLabel("Pin :");
//         labelPin.setBounds(100, 590, 200, 30);
//         labelPin.setFont(new Font("Raleway", Font.BOLD, 20));
//         add(labelPin);

//         textPin = new JTextField();
//         textPin.setBounds(300, 590, 400, 30);
//         textPin.setFont(new Font("Raleway", Font.BOLD, 14));
//         add(textPin);

//         JLabel labelState = new JLabel("State :");
//         labelState.setBounds(100, 640, 200, 30);
//         labelState.setFont(new Font("Raleway", Font.BOLD, 20));
//         add(labelState);

//         textState = new JTextField();
//         textState.setBounds(300, 640, 400, 30);
//         textState.setFont(new Font("Raleway", Font.BOLD, 14));
//         add(textState);

//         next = new JButton("Next");
//         next.setBounds(635, 720, 80, 30);
//         next.setBackground(Color.BLACK);
//         next.setForeground(Color.WHITE);
//         next.setFont(new Font("Raleway", Font.BOLD, 14));
//         next.addActionListener(this);
//         add(next);

//         // Setting background and layout
//         getContentPane().setBackground(new Color(222, 255, 228));
//         setLayout(null);
//         setSize(850, 800);
//         setLocation(360, 40);
//         setVisible(true);
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         String formno = first;
//         String name = textName.getText();
//         String fname = textFname.getText();

//         // Retrieve and format date of birth
//         String dob = null;
//         Date selectedDate = dateChooser.getDate();
//         if (selectedDate != null) {
//             SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//             dob = dateFormat.format(selectedDate);
//         }

//         String gender = null;
//         if (r1.isSelected()) {
//             gender = "male";
//         } else if (r2.isSelected()) {
//             gender = "female";
//         }

//         String email = textEmail.getText();
//         String marital = null;
//         if (M1.isSelected()) {
//             marital = "married";
//         } else if (M2.isSelected()) {
//             marital = "unmarried";
//         } else if (M3.isSelected()) {
//             marital = "other";
//         }

//         String address = textAdd.getText();
//         String city = textCity.getText();
//         String pin = textPin.getText();
//         String state = textState.getText();

//         try {
//             if (textName.getText().equals("")) {
//                 JOptionPane.showMessageDialog(null, "Please fill all fields");
//             } else {
//                 Con1 con1 = new Con1();
//                 String q = "insert into signup values('" + formno + "','" + name + "','" + fname + "','" + dob + "','" + gender + "','" + email + "','" + marital + "','" + address + "','" + city + "','" + pin + "','" + state + "')";
//                 con1.statement.executeUpdate(q);
//                 new Signup2(formno);
//                 setVisible(false);
//             }
//         } catch (Exception ex) {
//             ex.printStackTrace();
//         }
//     }

//     public static void main(String[] args) {
//         new Signup();
//     }

//     private void add(JDateChooser dateChooser) {
//         throw new UnsupportedOperationException("Not supported yet.");
//     }
// }

// //////////////////////////////////////////


// package bank.management.system;

// import java.awt.*;
// import java.awt.event.*;
// import java.text.SimpleDateFormat;
// import java.util.Date;
// import java.util.Random;
// import javax.swing.*;

// public class Signup extends JFrame implements ActionListener {
//     JTextField textName, textFname, textEmail, textAdd, textCity, textPin, textState;
//     JSpinner dateSpinner;  // Replacing JDateChooser with JSpinner
//     JRadioButton r1, r2, M1, M2, M3;
//     JButton next;
//     Random ran = new Random();
//     long first4 = (ran.nextLong() % 9000L) + 1000L;
//     String first = " " + Math.abs(first4);

//     public Signup() {
//         super("APPLICATION FORM");
        
//         // Adding bank logo
//         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank1.jpg"));
//         Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
//         ImageIcon i3 = new ImageIcon(i2);
//         JLabel image = new JLabel(i3);
//         image.setBounds(25, 10, 100, 100);
//         add(image);

//         // Application form number
//         JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
//         label1.setBounds(160, 20, 600, 40);
//         label1.setFont(new Font("Raleway", Font.BOLD, 38));
//         add(label1);

//         // Page details
//         JLabel label2 = new JLabel("Page 1");
//         label2.setBounds(330, 70, 600, 30);
//         label2.setFont(new Font("Raleway", Font.BOLD, 22));
//         add(label2);

//         JLabel label3 = new JLabel("Personal Details");
//         label3.setBounds(290, 90, 600, 30);
//         label3.setFont(new Font("Raleway", Font.BOLD, 22));
//         add(label3);

//         // Form fields
//         JLabel labelName = new JLabel("Name :");
//         labelName.setBounds(100, 190, 100, 30);
//         labelName.setFont(new Font("Raleway", Font.BOLD, 20));
//         add(labelName);

//         textName = new JTextField();
//         textName.setBounds(300, 190, 400, 30);
//         textName.setFont(new Font("Raleway", Font.BOLD, 14));
//         add(textName);

//         JLabel labelfName = new JLabel("Father's Name :");
//         labelfName.setBounds(100, 240, 200, 30);
//         labelfName.setFont(new Font("Raleway", Font.BOLD, 20));
//         add(labelfName);

//         textFname = new JTextField();
//         textFname.setBounds(300, 240, 400, 30);
//         textFname.setFont(new Font("Raleway", Font.BOLD, 14));
//         add(textFname);

//         JLabel DOB = new JLabel("Date of Birth :");
//         DOB.setBounds(100, 340, 200, 30);
//         DOB.setFont(new Font("Raleway", Font.BOLD, 20));
//         add(DOB);

//         // Date picker using JSpinner
//         SpinnerDateModel dateModel = new SpinnerDateModel();
//         dateSpinner = new JSpinner(dateModel);
//         JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(dateSpinner, "yyyy-MM-dd");
//         dateSpinner.setEditor(dateEditor);
//         dateSpinner.setBounds(300, 340, 400, 30);
//         add(dateSpinner);

//         JLabel labelG = new JLabel("Gender :");
//         labelG.setBounds(100, 290, 200, 30);
//         labelG.setFont(new Font("Raleway", Font.BOLD, 20));
//         add(labelG);

//         r1 = new JRadioButton("Male");
//         r1.setBounds(300, 290, 60, 30);
//         r1.setBackground(new Color(222, 255, 228));
//         r1.setFont(new Font("Raleway", Font.BOLD, 14));
//         add(r1);

//         r2 = new JRadioButton("Female");
//         r2.setBounds(400, 290, 90, 30);
//         r2.setBackground(new Color(222, 255, 228));
//         r2.setFont(new Font("Raleway", Font.BOLD, 14));
//         add(r2);

//         ButtonGroup genderGroup = new ButtonGroup();
//         genderGroup.add(r1);
//         genderGroup.add(r2);

//         JLabel labelEmail = new JLabel("Email :");
//         labelEmail.setBounds(100, 390, 200, 30);
//         labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
//         add(labelEmail);

//         textEmail = new JTextField();
//         textEmail.setBounds(300, 390, 400, 30);
//         textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
//         add(textEmail);

//         JLabel labelMs = new JLabel("Marital Status :");
//         labelMs.setBounds(100, 440, 200, 30);
//         labelMs.setFont(new Font("Raleway", Font.BOLD, 20));
//         add(labelMs);

//         M1 = new JRadioButton("Married");
//         M1.setBounds(300, 440, 100, 30);
//         M1.setBackground(new Color(222, 255, 228));
//         M1.setFont(new Font("Raleway", Font.BOLD, 14));
//         add(M1);

//         M2 = new JRadioButton("Unmarried");
//         M2.setBounds(450, 440, 100, 30);
//         M2.setBackground(new Color(222, 255, 228));
//         M2.setFont(new Font("Raleway", Font.BOLD, 14));
//         add(M2);

//         M3 = new JRadioButton("Other");
//         M3.setBounds(635, 440, 100, 30);
//         M3.setBackground(new Color(222, 255, 228));
//         M3.setFont(new Font("Raleway", Font.BOLD, 14));
//         add(M3);

//         ButtonGroup maritalGroup = new ButtonGroup();
//         maritalGroup.add(M1);
//         maritalGroup.add(M2);
//         maritalGroup.add(M3);

//         JLabel labelAdd = new JLabel("Address :");
//         labelAdd.setBounds(100, 490, 200, 30);
//         labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
//         add(labelAdd);

//         textAdd = new JTextField();
//         textAdd.setBounds(300, 490, 400, 30);
//         textAdd.setFont(new Font("Raleway", Font.BOLD, 14));
//         add(textAdd);

//         JLabel labelCity = new JLabel("City :");
//         labelCity.setBounds(100, 540, 200, 30);
//         labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
//         add(labelCity);

//         textCity = new JTextField();
//         textCity.setBounds(300, 540, 400, 30);
//         textCity.setFont(new Font("Raleway", Font.BOLD, 14));
//         add(textCity);

//         JLabel labelPin = new JLabel("Pin :");
//         labelPin.setBounds(100, 590, 200, 30);
//         labelPin.setFont(new Font("Raleway", Font.BOLD, 20));
//         add(labelPin);

//         textPin = new JTextField();
//         textPin.setBounds(300, 590, 400, 30);
//         textPin.setFont(new Font("Raleway", Font.BOLD, 14));
//         add(textPin);

//         JLabel labelState = new JLabel("State :");
//         labelState.setBounds(100, 640, 200, 30);
//         labelState.setFont(new Font("Raleway", Font.BOLD, 20));
//         add(labelState);

//         textState = new JTextField();
//         textState.setBounds(300, 640, 400, 30);
//         textState.setFont(new Font("Raleway", Font.BOLD, 14));
//         add(textState);

//         next = new JButton("Next");
//         next.setBounds(635, 720, 80, 30);
//         next.setBackground(Color.BLACK);
//         next.setForeground(Color.WHITE);
//         next.setFont(new Font("Raleway", Font.BOLD, 14));
//         next.addActionListener(this);
//         add(next);

//         // Setting background and layout
//         getContentPane().setBackground(new Color(222, 255, 228));
//         setLayout(null);
//         setSize(850, 800);
//         setLocation(360, 40);
//         setVisible(true);
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         String formno = first;
//         String name = textName.getText();
//         String fname = textFname.getText();

//         // Retrieve and format date of birth
//         String dob = null;
//         Date selectedDate = (Date) dateSpinner.getValue();
//         if (selectedDate != null) {
//             SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//             dob = dateFormat.format(selectedDate);
//         }

//         String gender = null;
//         if (r1.isSelected()) {
//             gender = "male";
//         } else if (r2.isSelected()) {
//             gender = "female";
//         }

//         String email = textEmail.getText();
//         String marital = null;
//         if (M1.isSelected()) {
//             marital = "married";
//         } else if (M2.isSelected()) {
//             marital = "unmarried";
//         } else if (M3.isSelected()) {
//             marital = "other";
//         }

//         String address = textAdd.getText();
//         String city = textCity.getText();
//         String pin = textPin.getText();
//         String state = textState.getText();

//         try {
//             if (textName.getText().equals("")) {
//                 JOptionPane.showMessageDialog(null, "Please fill all fields");
//             } else {
//                 Con1 con1 = new Con1();
//                 String q = "insert into signup values('" + formno + "','" + name + "','" + fname + "','" + dob + "','" + gender + "','" + email + "','" + marital + "','" + address + "','" + city + "','" + pin + "','" + state + "')";
//                 con1.statement.executeUpdate(q);
//                 new Signup2(formno);
//                 setVisible(false);
//             }
//         } catch (Exception ex) {
//             ex.printStackTrace();
//         }
//     }

//     public static void main(String[] args) {
//         new Signup();
//     }
// }

// //////////////////////////////////////


package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.*;
import java.util.Calendar;

public class Signup extends JFrame implements ActionListener {
    JTextField textName, textFname, textEmail, textAdd, textCity, textPin;
    JComboBox<String> stateComboBox; // JComboBox for state selection
    JRadioButton r1, r2, M1, M2, M3;
    JButton next;
    JSpinner datePicker; // JSpinner replaced with a drop-down calendar for Date of Birth selection
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    // List of Indian states for JComboBox
    String[] states = {"Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", 
        "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jharkhand", "Karnataka", 
        "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", 
        "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", 
        "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal"};

    public Signup() {
        super("APPLICATION FORM");

        // Adding bank logo
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        // Application form number
        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        // Page details
        JLabel label2 = new JLabel("Page 1");
        label2.setBounds(330, 70, 600, 30);
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setBounds(290, 90, 600, 30);
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label3);

        // Form fields
        JLabel labelName = new JLabel("Name :");
        labelName.setBounds(100, 190, 100, 30);
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelName);

        textName = new JTextField();
        textName.setBounds(300, 190, 400, 30);
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textName);

        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setBounds(100, 240, 200, 30);
        labelfName.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelfName);

        textFname = new JTextField();
        textFname.setBounds(300, 240, 400, 30);
        textFname.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textFname);

        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setBounds(100, 340, 200, 30);
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        add(DOB);

        // Using JSpinner with date selection for Date of Birth
        datePicker = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(datePicker, "yyyy-MM-dd");
        datePicker.setEditor(dateEditor);
        datePicker.setBounds(300, 340, 400, 30);
        add(datePicker);

        JLabel labelG = new JLabel("Gender :");
        labelG.setBounds(100, 290, 200, 30);
        labelG.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setBounds(300, 290, 60, 30);
        r1.setBackground(new Color(222, 255, 228));
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBounds(400, 290, 90, 30);
        r2.setBackground(new Color(222, 255, 228));
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        add(r2);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(r1);
        genderGroup.add(r2);

        JLabel labelEmail = new JLabel("Email :");
        labelEmail.setBounds(100, 390, 200, 30);
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setBounds(300, 390, 400, 30);
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textEmail);

        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setBounds(100, 440, 200, 30);
        labelMs.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelMs);

        M1 = new JRadioButton("Married");
        M1.setBounds(300, 440, 100, 30);
        M1.setBackground(new Color(222, 255, 228));
        M1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(M1);

        M2 = new JRadioButton("Unmarried");
        M2.setBounds(450, 440, 100, 30);
        M2.setBackground(new Color(222, 255, 228));
        M2.setFont(new Font("Raleway", Font.BOLD, 14));
        add(M2);

        M3 = new JRadioButton("Other");
        M3.setBounds(635, 440, 100, 30);
        M3.setBackground(new Color(222, 255, 228));
        M3.setFont(new Font("Raleway", Font.BOLD, 14));
        add(M3);

        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(M1);
        maritalGroup.add(M2);
        maritalGroup.add(M3);

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setBounds(100, 490, 200, 30);
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setBounds(300, 490, 400, 30);
        textAdd.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textAdd);

        JLabel labelCity = new JLabel("City :");
        labelCity.setBounds(100, 540, 200, 30);
        labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelCity);

        textCity = new JTextField();
        textCity.setBounds(300, 540, 400, 30);
        textCity.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textCity);

        JLabel labelPin = new JLabel("Pin :");
        labelPin.setBounds(100, 590, 200, 30);
        labelPin.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelPin);

        textPin = new JTextField();
        textPin.setBounds(300, 590, 400, 30);
        textPin.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textPin);

        JLabel labelState = new JLabel("State :");
        labelState.setBounds(100, 640, 200, 30);
        labelState.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelState);

        // JComboBox for selecting the state
        stateComboBox = new JComboBox<>(states);
        stateComboBox.setBounds(300, 640, 400, 30);
        add(stateComboBox);

        next = new JButton("Next");
        next.setBounds(635, 720, 80, 30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.addActionListener(this);
        add(next);

        // Setting background and layout
        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();

        // Retrieve and format date of birth
        String dob = null;
        Date selectedDate = (Date) datePicker.getValue();
        if (selectedDate != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dob = dateFormat.format(selectedDate);
        }

        String gender = null;
        if (r1.isSelected()) {
            gender = "male";
        } else if (r2.isSelected()) {
            gender = "female";
        }

        String email = textEmail.getText();
        String marital = null;
        if (M1.isSelected()) {
            marital = "married";
        } else if (M2.isSelected()) {
            marital = "unmarried";
        } else if (M3.isSelected()) {
            marital = "other";
        }

        String address = textAdd.getText();
        String city = textCity.getText();
        String pin = textPin.getText();
        String state = (String) stateComboBox.getSelectedItem(); // Get selected state

        try {
            if (textName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill all fields");
            } else {
                Con1 con1 = new Con1();
                String q = "insert into signup values('" + formno + "','" + name + "','" + fname + "','" + dob + "','" + gender + "','" + email + "','" + marital + "','" + address + "','" + city + "','" + pin + "','" + state + "')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
