package bank.management.system;
import java.sql.*;


public class Con1 {
    Connection connection ;
    Statement statement;
     public Con1(){
        try {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "Visionary@13");
        statement = connection.createStatement();
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
}