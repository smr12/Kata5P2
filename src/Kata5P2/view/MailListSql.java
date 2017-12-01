package Kata5P2.view;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MailListSql {
    public static ArrayList<String> readDDBB() throws ClassNotFoundException,
            SQLException{
        ArrayList<String> mailList = new ArrayList<>();
        
        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Entrar\\Desktop\\KATA.sDB");
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT mail FROM MAIL;");
        
        while(rs.next()){
            String mail = rs.getString("mail");
            if(!mail.contains("@")) continue;
            mailList.add(mail);
        }
       
        rs.close();
        statement.close();
        connection.close();
        return mailList;
    }
}
